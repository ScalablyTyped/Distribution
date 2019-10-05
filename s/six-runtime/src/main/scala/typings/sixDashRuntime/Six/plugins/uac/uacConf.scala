package typings.sixDashRuntime.Six.plugins.uac

import typings.sixDashRuntime.Six.next
import typings.sixDashRuntime.Six.plugins.whiteList
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uacConf extends js.Object {
  var client_id: String
  var client_secret: String
  var enableMock: Boolean
  var skipOffline: Boolean
  var whiteList: String | RegExp | js.Array[String] | typings.sixDashRuntime.Six.plugins.whiteList
  def failHook(err: Error, ctx: js.Object, next: next): js.Any
  def getPath(ctx: js.Object): String
}

object uacConf {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    enableMock: Boolean,
    failHook: (Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    skipOffline: Boolean,
    whiteList: String | RegExp | js.Array[String] | whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, enableMock = enableMock, failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[uacConf]
  }
}


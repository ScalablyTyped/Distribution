package typings.sixRuntime.Six_.plugins.uac

import typings.sixRuntime.Six_.next
import typings.sixRuntime.Six_.plugins.whiteList
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
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six_.plugins.whiteList
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
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[uacConf]
  }
}


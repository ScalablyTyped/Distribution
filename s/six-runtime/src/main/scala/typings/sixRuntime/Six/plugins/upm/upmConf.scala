package typings.sixRuntime.Six.plugins.upm

import typings.sixRuntime.Six.next
import typings.sixRuntime.Six.plugins.whiteList
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait upmConf extends js.Object {
  var clientId: String
  var clientSecret: String
  var domain: String
  var enableMock: Boolean
  var path: String
  var skipOffline: Boolean
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList
  def failHook(err: Error, ctx: js.Object, next: next): js.Any
  def getPath(ctx: js.Object): String
}

object upmConf {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    domain: String,
    enableMock: Boolean,
    failHook: (Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    path: String,
    skipOffline: Boolean,
    whiteList: String | RegExp | js.Array[String] | whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[upmConf]
  }
}


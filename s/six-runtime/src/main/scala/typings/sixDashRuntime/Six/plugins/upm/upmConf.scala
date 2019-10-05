package typings.sixDashRuntime.Six.plugins.upm

import typings.sixDashRuntime.Six.next
import typings.sixDashRuntime.Six.plugins.whiteList
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
  var whiteList: String | RegExp | js.Array[String] | typings.sixDashRuntime.Six.plugins.whiteList
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
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, domain = domain, enableMock = enableMock, failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path, skipOffline = skipOffline, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[upmConf]
  }
}


package typings
package sixDashRuntimeLib.SixNs.pluginsNs.upmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait upmConf extends js.Object {
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var domain: java.lang.String
  var enableMock: scala.Boolean
  var path: java.lang.String
  var skipOffline: scala.Boolean
  var whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  def failHook(err: stdLib.Error, ctx: js.Object, next: sixDashRuntimeLib.SixNs.next): js.Any
  def getPath(ctx: js.Object): java.lang.String
}

object upmConf {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    domain: java.lang.String,
    enableMock: scala.Boolean,
    failHook: js.Function3[stdLib.Error, js.Object, sixDashRuntimeLib.SixNs.next, js.Any],
    getPath: js.Function1[js.Object, java.lang.String],
    path: java.lang.String,
    skipOffline: scala.Boolean,
    whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("enableMock")(enableMock)
    __obj.updateDynamic("failHook")(failHook)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("skipOffline")(skipOffline)
    __obj.updateDynamic("whiteList")(whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[upmConf]
  }
}


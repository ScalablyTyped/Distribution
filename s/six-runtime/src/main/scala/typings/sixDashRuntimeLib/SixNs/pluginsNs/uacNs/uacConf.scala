package typings
package sixDashRuntimeLib.SixNs.pluginsNs.uacNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uacConf extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var enableMock: scala.Boolean
  var skipOffline: scala.Boolean
  var whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  def failHook(err: stdLib.Error, ctx: js.Object, next: sixDashRuntimeLib.SixNs.next): js.Any
  def getPath(ctx: js.Object): java.lang.String
}

object uacConf {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    enableMock: scala.Boolean,
    failHook: js.Function3[stdLib.Error, js.Object, sixDashRuntimeLib.SixNs.next, js.Any],
    getPath: js.Function1[js.Object, java.lang.String],
    skipOffline: scala.Boolean,
    whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("client_secret")(client_secret)
    __obj.updateDynamic("enableMock")(enableMock)
    __obj.updateDynamic("failHook")(failHook)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("skipOffline")(skipOffline)
    __obj.updateDynamic("whiteList")(whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[uacConf]
  }
}


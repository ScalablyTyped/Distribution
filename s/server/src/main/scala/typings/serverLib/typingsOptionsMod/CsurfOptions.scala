package typings
package serverLib.typingsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CsurfOptions extends js.Object {
  var cookie: js.UndefOr[csurfLib.csurfMod.csurfNs.CookieOptions | scala.Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]] = js.undefined
}


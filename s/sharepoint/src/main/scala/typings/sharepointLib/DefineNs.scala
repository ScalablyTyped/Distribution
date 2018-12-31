package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("Define")
@js.native
object DefineNs extends js.Object {
  def define(
    name: java.lang.String,
    deps: js.Array[java.lang.String],
    `def`: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def loadScript(
    url: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Loads script from _layouts/15/[req].js */
  def require(req: java.lang.String, callback: js.Function1[/* arg */ js.Array[_], scala.Unit]): scala.Unit = js.native
  /** Loads script from _layouts/15/[req].js */
  def require(req: js.Array[java.lang.String], callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
}


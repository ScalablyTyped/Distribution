package typings.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("Define")
@js.native
object Define extends js.Object {
  def define(name: String, deps: js.Array[String], `def`: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def loadScript(url: String, successCallback: js.Function0[Unit], errCallback: js.Function0[Unit]): Unit = js.native
  /** Loads script from _layouts/15/[req].js */
  def require(req: String, callback: js.Function1[/* arg */ js.Array[_], Unit]): Unit = js.native
  /** Loads script from _layouts/15/[req].js */
  def require(req: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}


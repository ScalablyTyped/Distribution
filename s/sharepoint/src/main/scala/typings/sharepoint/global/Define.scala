package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object Define {
  
  @JSGlobal("Define.define")
  @js.native
  def define(name: String, deps: js.Array[String], `def`: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSGlobal("Define.loadScript")
  @js.native
  def loadScript(url: String, successCallback: js.Function0[Unit], errCallback: js.Function0[Unit]): Unit = js.native
  
  /** Loads script from _layouts/15/[req].js */
  @JSGlobal("Define.require")
  @js.native
  def require(req: String, callback: js.Function1[/* arg */ js.Array[_], Unit]): Unit = js.native
  /** Loads script from _layouts/15/[req].js */
  @JSGlobal("Define.require")
  @js.native
  def require(req: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object Define {
  
  @JSGlobal("Define")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def define(name: String, deps: js.Array[String], `def`: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def loadScript(url: String, successCallback: js.Function0[Unit], errCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Loads script from _layouts/15/[req].js */
  @scala.inline
  def require(req: String, callback: js.Function1[/* arg */ js.Array[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(req.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Loads script from _layouts/15/[req].js */
  @scala.inline
  def require(req: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(req.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

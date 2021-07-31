package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Workspace {
  
  @JSGlobal("SP.UI.Workspace")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addResized(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_resized")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeResized(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_resized")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

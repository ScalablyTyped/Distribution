package typings.prosemirrorDevTools

import typings.prosemirrorDevTools.mod.ApplyDevToolsOptions
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Wraps the EditorView instance in the applyDevTools.
    */
  inline def applyDevTools(view: EditorView[js.Any]): Unit = js.Dynamic.global.applyDynamic("applyDevTools")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyDevTools(view: EditorView[js.Any], options: ApplyDevToolsOptions): Unit = (js.Dynamic.global.applyDynamic("applyDevTools")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

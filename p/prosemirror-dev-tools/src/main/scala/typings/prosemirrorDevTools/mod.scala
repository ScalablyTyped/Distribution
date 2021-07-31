package typings.prosemirrorDevTools

import typings.prosemirrorDevTools.anon.TypeofEditorState
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-dev-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Wraps the EditorView instance in the applyDevTools.
    */
  @scala.inline
  def default(view: EditorView[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(view: EditorView[js.Any], options: ApplyDevToolsOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ApplyDevToolsOptions extends StObject {
    
    /**
      * From version 1.3.1 it's required for UMD build to provide EditorState
      * class (not instance).
      *
      * Previously it was causing different artifacts when working with state
      * e.g. rolling back to some history checkpoint or when restoring from
      * snapshot due to EditorState classes were different in UMD bundle and in
      * actual client code.
      */
    var EditorState: TypeofEditorState
  }
  object ApplyDevToolsOptions {
    
    @scala.inline
    def apply(EditorState: TypeofEditorState): ApplyDevToolsOptions = {
      val __obj = js.Dynamic.literal(EditorState = EditorState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyDevToolsOptions]
    }
    
    @scala.inline
    implicit class ApplyDevToolsOptionsMutableBuilder[Self <: ApplyDevToolsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditorState(value: TypeofEditorState): Self = StObject.set(x, "EditorState", value.asInstanceOf[js.Any])
    }
  }
}

package typings.slateReact

import typings.react.mod.RefObject
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsRestoreDomRestoreDomManagerMod {
  
  @JSImport("slate-react/dist/components/restore-dom/restore-dom-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRestoreDomManager(editor: ReactEditor, receivedUserInput: RefObject[Boolean]): RestoreDOMManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestoreDomManager")(editor.asInstanceOf[js.Any], receivedUserInput.asInstanceOf[js.Any])).asInstanceOf[RestoreDOMManager]
  
  trait RestoreDOMManager extends StObject {
    
    def clear(): Unit
    
    def registerMutations(mutations: js.Array[MutationRecord]): Unit
    
    def restoreDOM(): Unit
  }
  object RestoreDOMManager {
    
    inline def apply(clear: () => Unit, registerMutations: js.Array[MutationRecord] => Unit, restoreDOM: () => Unit): RestoreDOMManager = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), registerMutations = js.Any.fromFunction1(registerMutations), restoreDOM = js.Any.fromFunction0(restoreDOM))
      __obj.asInstanceOf[RestoreDOMManager]
    }
    
    extension [Self <: RestoreDOMManager](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setRegisterMutations(value: js.Array[MutationRecord] => Unit): Self = StObject.set(x, "registerMutations", js.Any.fromFunction1(value))
      
      inline def setRestoreDOM(value: () => Unit): Self = StObject.set(x, "restoreDOM", js.Any.fromFunction0(value))
    }
  }
}

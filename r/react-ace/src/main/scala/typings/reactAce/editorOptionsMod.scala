package typings.reactAce

import typings.reactAce.anon.TypeofAceBuilds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorOptionsMod {
  
  @JSImport("react-ace/lib/editorOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(fn: js.Function1[/* repeated */ Any, Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("react-ace/lib/editorOptions", "editorEvents")
  @js.native
  val editorEvents: js.Array[EditorEvent] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorOptions")
  @js.native
  val editorOptions: js.Array[EditorOption] = js.native
  
  inline def getAceInstance(): TypeofAceBuilds = ^.asInstanceOf[js.Dynamic].applyDynamic("getAceInstance")().asInstanceOf[TypeofAceBuilds]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAce.reactAceStrings.onChange
    - typings.reactAce.reactAceStrings.onFocus
    - typings.reactAce.reactAceStrings.onInput
    - typings.reactAce.reactAceStrings.onBlur
    - typings.reactAce.reactAceStrings.onCopy
    - typings.reactAce.reactAceStrings.onPaste
    - typings.reactAce.reactAceStrings.onSelectionChange
    - typings.reactAce.reactAceStrings.onCursorChange
    - typings.reactAce.reactAceStrings.onScroll
    - typings.reactAce.reactAceStrings.handleOptions
    - typings.reactAce.reactAceStrings.updateRef
  */
  trait EditorEvent extends StObject
  object EditorEvent {
    
    inline def handleOptions: typings.reactAce.reactAceStrings.handleOptions = "handleOptions".asInstanceOf[typings.reactAce.reactAceStrings.handleOptions]
    
    inline def onBlur: typings.reactAce.reactAceStrings.onBlur = "onBlur".asInstanceOf[typings.reactAce.reactAceStrings.onBlur]
    
    inline def onChange: typings.reactAce.reactAceStrings.onChange = "onChange".asInstanceOf[typings.reactAce.reactAceStrings.onChange]
    
    inline def onCopy: typings.reactAce.reactAceStrings.onCopy = "onCopy".asInstanceOf[typings.reactAce.reactAceStrings.onCopy]
    
    inline def onCursorChange: typings.reactAce.reactAceStrings.onCursorChange = "onCursorChange".asInstanceOf[typings.reactAce.reactAceStrings.onCursorChange]
    
    inline def onFocus: typings.reactAce.reactAceStrings.onFocus = "onFocus".asInstanceOf[typings.reactAce.reactAceStrings.onFocus]
    
    inline def onInput: typings.reactAce.reactAceStrings.onInput = "onInput".asInstanceOf[typings.reactAce.reactAceStrings.onInput]
    
    inline def onPaste: typings.reactAce.reactAceStrings.onPaste = "onPaste".asInstanceOf[typings.reactAce.reactAceStrings.onPaste]
    
    inline def onScroll: typings.reactAce.reactAceStrings.onScroll = "onScroll".asInstanceOf[typings.reactAce.reactAceStrings.onScroll]
    
    inline def onSelectionChange: typings.reactAce.reactAceStrings.onSelectionChange = "onSelectionChange".asInstanceOf[typings.reactAce.reactAceStrings.onSelectionChange]
    
    inline def updateRef: typings.reactAce.reactAceStrings.updateRef = "updateRef".asInstanceOf[typings.reactAce.reactAceStrings.updateRef]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAce.reactAceStrings.minLines
    - typings.reactAce.reactAceStrings.maxLines
    - typings.reactAce.reactAceStrings.readOnly
    - typings.reactAce.reactAceStrings.highlightActiveLine
    - typings.reactAce.reactAceStrings.tabSize
    - typings.reactAce.reactAceStrings.enableBasicAutocompletion
    - typings.reactAce.reactAceStrings.enableLiveAutocompletion
    - typings.reactAce.reactAceStrings.enableSnippets
  */
  trait EditorOption extends StObject
  object EditorOption {
    
    inline def enableBasicAutocompletion: typings.reactAce.reactAceStrings.enableBasicAutocompletion = "enableBasicAutocompletion".asInstanceOf[typings.reactAce.reactAceStrings.enableBasicAutocompletion]
    
    inline def enableLiveAutocompletion: typings.reactAce.reactAceStrings.enableLiveAutocompletion = "enableLiveAutocompletion".asInstanceOf[typings.reactAce.reactAceStrings.enableLiveAutocompletion]
    
    inline def enableSnippets: typings.reactAce.reactAceStrings.enableSnippets = "enableSnippets".asInstanceOf[typings.reactAce.reactAceStrings.enableSnippets]
    
    inline def highlightActiveLine: typings.reactAce.reactAceStrings.highlightActiveLine = "highlightActiveLine".asInstanceOf[typings.reactAce.reactAceStrings.highlightActiveLine]
    
    inline def maxLines: typings.reactAce.reactAceStrings.maxLines = "maxLines".asInstanceOf[typings.reactAce.reactAceStrings.maxLines]
    
    inline def minLines: typings.reactAce.reactAceStrings.minLines = "minLines".asInstanceOf[typings.reactAce.reactAceStrings.minLines]
    
    inline def readOnly: typings.reactAce.reactAceStrings.readOnly = "readOnly".asInstanceOf[typings.reactAce.reactAceStrings.readOnly]
    
    inline def tabSize: typings.reactAce.reactAceStrings.tabSize = "tabSize".asInstanceOf[typings.reactAce.reactAceStrings.tabSize]
  }
  
  object global {
    
    object NodeJS {
      
      trait Global extends StObject {
        
        var window: Any
      }
      object Global {
        
        inline def apply(window: Any): Global = {
          val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        extension [Self <: Global](x: Self) {
          
          inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}

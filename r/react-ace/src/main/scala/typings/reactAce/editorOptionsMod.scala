package typings.reactAce

import typings.reactAce.anon.TypeofAceBuilds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorOptionsMod {
  
  @JSImport("react-ace/lib/editorOptions", "debounce")
  @js.native
  def debounce(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function0[Unit] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorEvents")
  @js.native
  val editorEvents: js.Array[EditorEvent] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorOptions")
  @js.native
  val editorOptions: js.Array[EditorOption] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "getAceInstance")
  @js.native
  def getAceInstance(): TypeofAceBuilds = js.native
  
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
    
    @scala.inline
    def handleOptions: typings.reactAce.reactAceStrings.handleOptions = "handleOptions".asInstanceOf[typings.reactAce.reactAceStrings.handleOptions]
    
    @scala.inline
    def onBlur: typings.reactAce.reactAceStrings.onBlur = "onBlur".asInstanceOf[typings.reactAce.reactAceStrings.onBlur]
    
    @scala.inline
    def onChange: typings.reactAce.reactAceStrings.onChange = "onChange".asInstanceOf[typings.reactAce.reactAceStrings.onChange]
    
    @scala.inline
    def onCopy: typings.reactAce.reactAceStrings.onCopy = "onCopy".asInstanceOf[typings.reactAce.reactAceStrings.onCopy]
    
    @scala.inline
    def onCursorChange: typings.reactAce.reactAceStrings.onCursorChange = "onCursorChange".asInstanceOf[typings.reactAce.reactAceStrings.onCursorChange]
    
    @scala.inline
    def onFocus: typings.reactAce.reactAceStrings.onFocus = "onFocus".asInstanceOf[typings.reactAce.reactAceStrings.onFocus]
    
    @scala.inline
    def onInput: typings.reactAce.reactAceStrings.onInput = "onInput".asInstanceOf[typings.reactAce.reactAceStrings.onInput]
    
    @scala.inline
    def onPaste: typings.reactAce.reactAceStrings.onPaste = "onPaste".asInstanceOf[typings.reactAce.reactAceStrings.onPaste]
    
    @scala.inline
    def onScroll: typings.reactAce.reactAceStrings.onScroll = "onScroll".asInstanceOf[typings.reactAce.reactAceStrings.onScroll]
    
    @scala.inline
    def onSelectionChange: typings.reactAce.reactAceStrings.onSelectionChange = "onSelectionChange".asInstanceOf[typings.reactAce.reactAceStrings.onSelectionChange]
    
    @scala.inline
    def updateRef: typings.reactAce.reactAceStrings.updateRef = "updateRef".asInstanceOf[typings.reactAce.reactAceStrings.updateRef]
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
    
    @scala.inline
    def enableBasicAutocompletion: typings.reactAce.reactAceStrings.enableBasicAutocompletion = "enableBasicAutocompletion".asInstanceOf[typings.reactAce.reactAceStrings.enableBasicAutocompletion]
    
    @scala.inline
    def enableLiveAutocompletion: typings.reactAce.reactAceStrings.enableLiveAutocompletion = "enableLiveAutocompletion".asInstanceOf[typings.reactAce.reactAceStrings.enableLiveAutocompletion]
    
    @scala.inline
    def enableSnippets: typings.reactAce.reactAceStrings.enableSnippets = "enableSnippets".asInstanceOf[typings.reactAce.reactAceStrings.enableSnippets]
    
    @scala.inline
    def highlightActiveLine: typings.reactAce.reactAceStrings.highlightActiveLine = "highlightActiveLine".asInstanceOf[typings.reactAce.reactAceStrings.highlightActiveLine]
    
    @scala.inline
    def maxLines: typings.reactAce.reactAceStrings.maxLines = "maxLines".asInstanceOf[typings.reactAce.reactAceStrings.maxLines]
    
    @scala.inline
    def minLines: typings.reactAce.reactAceStrings.minLines = "minLines".asInstanceOf[typings.reactAce.reactAceStrings.minLines]
    
    @scala.inline
    def readOnly: typings.reactAce.reactAceStrings.readOnly = "readOnly".asInstanceOf[typings.reactAce.reactAceStrings.readOnly]
    
    @scala.inline
    def tabSize: typings.reactAce.reactAceStrings.tabSize = "tabSize".asInstanceOf[typings.reactAce.reactAceStrings.tabSize]
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Global extends StObject {
        
        var window: js.Any = js.native
      }
      object Global {
        
        @scala.inline
        def apply(window: js.Any): Global = {
          val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}

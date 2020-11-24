package typings.reactMonacoEditor

import typings.reactMonacoEditor.anon.DefaultValue
import typings.reactMonacoEditor.anon.EditorDidMount
import typings.reactMonacoEditor.anon.EditorWillMount
import typings.reactMonacoEditor.anon.Height
import typings.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import typings.reactMonacoEditor.typesMod.MonacoEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MonacoDiffEditor protected ()
    extends typings.reactMonacoEditor.diffMod.default {
    def this(props: MonacoDiffEditorProps) = this()
  }
  /* static members */
  @js.native
  object MonacoDiffEditor extends js.Object {
    
    var defaultProps: EditorDidMount = js.native
    
    var propTypes: DefaultValue = js.native
  }
  
  @js.native
  class default protected ()
    extends typings.reactMonacoEditor.editorMod.default {
    def this(props: MonacoEditorProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Height = js.native
    
    var propTypes: EditorWillMount = js.native
  }
}

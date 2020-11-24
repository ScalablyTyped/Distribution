package typings.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.monacoEditor.mod.CancellationTokenSource
import typings.monacoEditor.mod.Emitter
import typings.monacoEditor.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmonacoEditor extends js.Object {
  
  var CancellationTokenSource: Instantiable0[typings.monacoEditor.mod.CancellationTokenSource] = js.native
  
  var Emitter: Instantiable0[typings.monacoEditor.mod.Emitter[js.Object]] = js.native
  
  var KeyMod: TypeofKeyMod = js.native
  
  var Position: TypeofPosition = js.native
  
  var Range: TypeofRange = js.native
  
  var Selection: TypeofSelection = js.native
  
  var Token: Instantiable3[
    /* offset */ Double, 
    /* type */ String, 
    /* language */ String, 
    typings.monacoEditor.mod.Token
  ] = js.native
  
  var Uri: TypeofUri = js.native
  
  val editor: Typeofeditor = js.native
  
  val languages: Typeoflanguages = js.native
  
  val worker: js.Any = js.native
}
object TypeofmonacoEditor {
  
  @scala.inline
  def apply(
    CancellationTokenSource: Instantiable0[CancellationTokenSource],
    Emitter: Instantiable0[Emitter[js.Object]],
    KeyMod: TypeofKeyMod,
    Position: TypeofPosition,
    Range: TypeofRange,
    Selection: TypeofSelection,
    Token: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token],
    Uri: TypeofUri,
    editor: Typeofeditor,
    languages: Typeoflanguages,
    worker: js.Any
  ): TypeofmonacoEditor = {
    val __obj = js.Dynamic.literal(CancellationTokenSource = CancellationTokenSource.asInstanceOf[js.Any], Emitter = Emitter.asInstanceOf[js.Any], KeyMod = KeyMod.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofmonacoEditor]
  }
  
  @scala.inline
  implicit class TypeofmonacoEditorOps[Self <: TypeofmonacoEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancellationTokenSource(value: Instantiable0[CancellationTokenSource]): Self = this.set("CancellationTokenSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitter(value: Instantiable0[Emitter[js.Object]]): Self = this.set("Emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMod(value: TypeofKeyMod): Self = this.set("KeyMod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: TypeofPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: TypeofRange): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: TypeofSelection): Self = this.set("Selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token]): Self = this.set("Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: TypeofUri): Self = this.set("Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: Typeofeditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: Typeoflanguages): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorker(value: js.Any): Self = this.set("worker", value.asInstanceOf[js.Any])
  }
}

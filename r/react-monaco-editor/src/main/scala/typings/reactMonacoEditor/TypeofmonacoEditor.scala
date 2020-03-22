package typings.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.monacoEditor.mod.CancellationTokenSource
import typings.monacoEditor.mod.Emitter
import typings.monacoEditor.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofmonacoEditor extends js.Object {
  var CancellationTokenSource: Instantiable0[typings.monacoEditor.mod.CancellationTokenSource]
  var Emitter: Instantiable0[typings.monacoEditor.mod.Emitter[js.Object]]
  var KeyMod: TypeofKeyMod
  var Position: TypeofPosition
  var Range: TypeofRange
  var Selection: TypeofSelection
  var Token: Instantiable3[
    /* offset */ Double, 
    /* type */ String, 
    /* language */ String, 
    typings.monacoEditor.mod.Token
  ]
  var Uri: TypeofUri
  val editor: Typeofeditor
  val languages: Typeoflanguages
  val worker: js.Any
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
}


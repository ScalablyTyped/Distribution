package typings.reactDashMonacoDashEditor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.monacoDashEditor.monacoDashEditorMod.CancellationTokenSource
import typings.monacoDashEditor.monacoDashEditorMod.Emitter
import typings.monacoDashEditor.monacoDashEditorMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofmonacoEditor extends js.Object {
  var CancellationTokenSource: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.CancellationTokenSource]
  var Emitter: Instantiable0[typings.monacoDashEditor.monacoDashEditorMod.Emitter[js.Object]]
  var KeyMod: TypeofClassKeyMod
  var Position: TypeofClassPosition
  var Range: TypeofClassRange
  var Selection: TypeofClassSelection
  var Token: Instantiable3[
    /* offset */ Double, 
    /* type */ String, 
    /* language */ String, 
    typings.monacoDashEditor.monacoDashEditorMod.Token
  ]
  var Uri: TypeofClassUri
  val editor: Typeofeditor
  val languages: Typeoflanguages
  val worker: js.Any
}

object TypeofmonacoEditor {
  @scala.inline
  def apply(
    CancellationTokenSource: Instantiable0[CancellationTokenSource],
    Emitter: Instantiable0[Emitter[js.Object]],
    KeyMod: TypeofClassKeyMod,
    Position: TypeofClassPosition,
    Range: TypeofClassRange,
    Selection: TypeofClassSelection,
    Token: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token],
    Uri: TypeofClassUri,
    editor: Typeofeditor,
    languages: Typeoflanguages,
    worker: js.Any
  ): TypeofmonacoEditor = {
    val __obj = js.Dynamic.literal(CancellationTokenSource = CancellationTokenSource.asInstanceOf[js.Any], Emitter = Emitter.asInstanceOf[js.Any], KeyMod = KeyMod.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofmonacoEditor]
  }
}


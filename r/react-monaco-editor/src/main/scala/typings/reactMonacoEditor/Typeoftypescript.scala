package typings.reactMonacoEditor

import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
import typings.monacoEditor.mod.languages.typescript.TypeScriptWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftypescript extends js.Object {
  val javascriptDefaults: LanguageServiceDefaults
  val typescriptDefaults: LanguageServiceDefaults
  val typescriptVersion: String
  def getJavaScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]
  def getTypeScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]
}

object Typeoftypescript {
  @scala.inline
  def apply(
    getJavaScriptWorker: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]],
    getTypeScriptWorker: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]],
    javascriptDefaults: LanguageServiceDefaults,
    typescriptDefaults: LanguageServiceDefaults,
    typescriptVersion: String
  ): Typeoftypescript = {
    val __obj = js.Dynamic.literal(getJavaScriptWorker = js.Any.fromFunction0(getJavaScriptWorker), getTypeScriptWorker = js.Any.fromFunction0(getTypeScriptWorker), javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoftypescript]
  }
}


package typings.reactDashMonacoDashEditor

import typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftypescript extends js.Object {
  var getJavaScriptWorker: js.Function0[js.Promise[_]]
  var getTypeScriptWorker: js.Function0[js.Promise[_]]
  var javascriptDefaults: LanguageServiceDefaults
  var typescriptDefaults: LanguageServiceDefaults
  var typescriptVersion: String
}

object Typeoftypescript {
  @scala.inline
  def apply(
    getJavaScriptWorker: () => js.Promise[_],
    getTypeScriptWorker: () => js.Promise[_],
    javascriptDefaults: LanguageServiceDefaults,
    typescriptDefaults: LanguageServiceDefaults,
    typescriptVersion: String
  ): Typeoftypescript = {
    val __obj = js.Dynamic.literal(getJavaScriptWorker = js.Any.fromFunction0(getJavaScriptWorker), getTypeScriptWorker = js.Any.fromFunction0(getTypeScriptWorker), javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoftypescript]
  }
}


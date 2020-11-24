package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
import typings.monacoEditor.mod.languages.typescript.TypeScriptWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftypescript extends js.Object {
  
  def getJavaScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = js.native
  
  def getTypeScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = js.native
  
  val javascriptDefaults: LanguageServiceDefaults = js.native
  
  val typescriptDefaults: LanguageServiceDefaults = js.native
  
  val typescriptVersion: String = js.native
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
  
  @scala.inline
  implicit class TypeoftypescriptOps[Self <: Typeoftypescript] (val x: Self) extends AnyVal {
    
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
    def setGetJavaScriptWorker(value: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]): Self = this.set("getJavaScriptWorker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeScriptWorker(value: () => js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]): Self = this.set("getTypeScriptWorker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJavascriptDefaults(value: LanguageServiceDefaults): Self = this.set("javascriptDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypescriptDefaults(value: LanguageServiceDefaults): Self = this.set("typescriptDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypescriptVersion(value: String): Self = this.set("typescriptVersion", value.asInstanceOf[js.Any])
  }
}

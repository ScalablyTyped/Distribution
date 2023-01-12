package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.CommonJS
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSourceFileOptions extends StObject {
  
  /**
    * Controls the format the file is detected as - this can be derived from only the path
    * and files on disk, but needs to be done with a module resolution cache in scope to be performant.
    * This is usually `undefined` for compilations that do not have `moduleResolution` values of `node16` or `nodenext`.
    */
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.undefined
  
  var languageVersion: ScriptTarget
  
  /**
    * Controls how module-y-ness is set for the given file. Usually the result of calling
    * `getSetExternalModuleIndicator` on a valid `CompilerOptions` object. If not present, the default
    * check specified by `isFileProbablyExternalModule` will be used to set the field.
    */
  var setExternalModuleIndicator: js.UndefOr[js.Function1[/* file */ SourceFile, Unit]] = js.undefined
}
object CreateSourceFileOptions {
  
  inline def apply(languageVersion: ScriptTarget): CreateSourceFileOptions = {
    val __obj = js.Dynamic.literal(languageVersion = languageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSourceFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSourceFileOptions] (val x: Self) extends AnyVal {
    
    inline def setImpliedNodeFormat(value: ESNext | CommonJS): Self = StObject.set(x, "impliedNodeFormat", value.asInstanceOf[js.Any])
    
    inline def setImpliedNodeFormatUndefined: Self = StObject.set(x, "impliedNodeFormat", js.undefined)
    
    inline def setLanguageVersion(value: ScriptTarget): Self = StObject.set(x, "languageVersion", value.asInstanceOf[js.Any])
    
    inline def setSetExternalModuleIndicator(value: /* file */ SourceFile => Unit): Self = StObject.set(x, "setExternalModuleIndicator", js.Any.fromFunction1(value))
    
    inline def setSetExternalModuleIndicatorUndefined: Self = StObject.set(x, "setExternalModuleIndicator", js.undefined)
  }
}

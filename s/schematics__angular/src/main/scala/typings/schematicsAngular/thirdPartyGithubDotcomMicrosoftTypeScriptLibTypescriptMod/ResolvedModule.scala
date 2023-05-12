package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of module resolution.
  * Module resolution will pick up tsx/jsx/js files even if '--jsx' and '--allowJs' are turned off.
  * The Program will then filter results based on these flags.
  *
  * Prefer to return a `ResolvedModuleFull` so that the file type does not have to be inferred.
  */
trait ResolvedModule extends StObject {
  
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  
  /** Path of the file the module was resolved to. */
  var resolvedFileName: java.lang.String
  
  /**
    * True if the original module reference used a .ts extension to refer directly to a .ts file,
    * which should produce an error during checking if emit is enabled.
    */
  var resolvedUsingTsExtension: js.UndefOr[Boolean] = js.undefined
}
object ResolvedModule {
  
  inline def apply(resolvedFileName: java.lang.String): ResolvedModule = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedModule] (val x: Self) extends AnyVal {
    
    inline def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    inline def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
    
    inline def setResolvedFileName(value: java.lang.String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
    
    inline def setResolvedUsingTsExtension(value: Boolean): Self = StObject.set(x, "resolvedUsingTsExtension", value.asInstanceOf[js.Any])
    
    inline def setResolvedUsingTsExtensionUndefined: Self = StObject.set(x, "resolvedUsingTsExtension", js.undefined)
  }
}

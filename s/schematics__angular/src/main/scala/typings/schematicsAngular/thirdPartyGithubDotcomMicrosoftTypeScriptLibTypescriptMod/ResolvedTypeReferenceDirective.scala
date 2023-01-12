package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedTypeReferenceDirective extends StObject {
  
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  
  var packageId: js.UndefOr[PackageId] = js.undefined
  
  var primary: Boolean
  
  var resolvedFileName: js.UndefOr[java.lang.String] = js.undefined
}
object ResolvedTypeReferenceDirective {
  
  inline def apply(primary: Boolean): ResolvedTypeReferenceDirective = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedTypeReferenceDirective] (val x: Self) extends AnyVal {
    
    inline def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    inline def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
    
    inline def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setResolvedFileName(value: java.lang.String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
    
    inline def setResolvedFileNameUndefined: Self = StObject.set(x, "resolvedFileName", js.undefined)
  }
}

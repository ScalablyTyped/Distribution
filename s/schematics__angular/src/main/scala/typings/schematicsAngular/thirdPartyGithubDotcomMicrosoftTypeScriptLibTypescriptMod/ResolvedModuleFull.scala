package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResolvedModule with an explicitly provided `extension` property.
  * Prefer this over `ResolvedModule`.
  * If changing this, remember to change `moduleResolutionIsEqualTo`.
  */
trait ResolvedModuleFull
  extends StObject
     with ResolvedModule {
  
  /**
    * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
    * This is optional for backwards-compatibility, but will be added if not provided.
    */
  var `extension`: java.lang.String
  
  var packageId: js.UndefOr[PackageId] = js.undefined
}
object ResolvedModuleFull {
  
  inline def apply(`extension`: java.lang.String, resolvedFileName: java.lang.String): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModuleFull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedModuleFull] (val x: Self) extends AnyVal {
    
    inline def setExtension(value: java.lang.String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}

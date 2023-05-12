package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeReferenceDirectiveResolutionCache
  extends StObject
     with PerDirectoryResolutionCache[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
     with NonRelativeNameResolutionCache[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
     with PackageJsonInfoCache {
  
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  /* InferMemberOverrides */
  override def update(options: CompilerOptions): Unit = js.native
}

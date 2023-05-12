package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionCache
  extends StObject
     with PerDirectoryResolutionCache[ResolvedModuleWithFailedLookupLocations]
     with NonRelativeModuleNameResolutionCache {
  
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  def getPackageJsonInfoCache(): PackageJsonInfoCache = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  /* InferMemberOverrides */
  override def update(options: CompilerOptions): Unit = js.native
}

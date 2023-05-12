package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stored map from non-relative module name to a table: directory -> result of module lookup in this directory
  * We support only non-relative module names because resolution of relative module names is usually more deterministic and thus less expensive.
  */
@js.native
trait NonRelativeModuleNameResolutionCache
  extends StObject
     with NonRelativeNameResolutionCache[ResolvedModuleWithFailedLookupLocations]
     with PackageJsonInfoCache {
  
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  /** @deprecated Use getOrCreateCacheForNonRelativeName */
  def getOrCreateCacheForModuleName(nonRelativeModuleName: java.lang.String, mode: ResolutionMode): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(
    nonRelativeModuleName: java.lang.String,
    mode: ResolutionMode,
    redirectedReference: ResolvedProjectReference
  ): PerModuleNameCache = js.native
}

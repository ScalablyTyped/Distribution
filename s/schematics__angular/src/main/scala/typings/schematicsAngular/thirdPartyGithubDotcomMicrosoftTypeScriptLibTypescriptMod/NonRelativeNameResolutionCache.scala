package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonRelativeNameResolutionCache[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def getFromNonRelativeNameCache(nonRelativeName: java.lang.String, mode: ResolutionMode, directoryName: java.lang.String): js.UndefOr[T] = js.native
  def getFromNonRelativeNameCache(
    nonRelativeName: java.lang.String,
    mode: ResolutionMode,
    directoryName: java.lang.String,
    redirectedReference: ResolvedProjectReference
  ): js.UndefOr[T] = js.native
  
  def getOrCreateCacheForNonRelativeName(nonRelativeName: java.lang.String, mode: ResolutionMode): PerNonRelativeNameCache[T] = js.native
  def getOrCreateCacheForNonRelativeName(
    nonRelativeName: java.lang.String,
    mode: ResolutionMode,
    redirectedReference: ResolvedProjectReference
  ): PerNonRelativeNameCache[T] = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  def update(options: CompilerOptions): Unit = js.native
}

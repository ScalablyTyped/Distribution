package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cached resolutions per containing directory.
  * This assumes that any module id will have the same resolution for sibling files located in the same folder.
  */
@js.native
trait PerDirectoryResolutionCache[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def getFromDirectoryCache(name: java.lang.String, mode: ResolutionMode, directoryName: java.lang.String): js.UndefOr[T] = js.native
  def getFromDirectoryCache(
    name: java.lang.String,
    mode: ResolutionMode,
    directoryName: java.lang.String,
    redirectedReference: ResolvedProjectReference
  ): js.UndefOr[T] = js.native
  
  def getOrCreateCacheForDirectory(directoryName: java.lang.String): ModeAwareCache[T] = js.native
  def getOrCreateCacheForDirectory(directoryName: java.lang.String, redirectedReference: ResolvedProjectReference): ModeAwareCache[T] = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  def update(options: CompilerOptions): Unit = js.native
}

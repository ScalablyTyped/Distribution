package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharp", "cache")
@js.native
object cache extends js.Object {
  
  //#endregion
  //#region Utility functions
  /**
    * Gets or, when options are provided, sets the limits of libvips' operation cache.
    * Existing entries in the cache will be trimmed after any change in limits.
    * This method always returns cache statistics, useful for determining how much working memory is required for a particular task.
    * @param options Object with the following attributes, or Boolean where true uses default cache settings and false removes all caching (optional, default true)
    * @returns The cache results.
    */
  def apply(): CacheResult = js.native
  def apply(options: Boolean): CacheResult = js.native
  def apply(options: CacheOptions): CacheResult = js.native
}

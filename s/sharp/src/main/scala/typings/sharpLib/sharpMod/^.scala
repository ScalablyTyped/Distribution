package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val bool: sharpLib.sharpMod.sharpNs.BoolEnum = js.native
  val fit: sharpLib.sharpMod.sharpNs.FitEnum = js.native
  /** Object containing nested boolean values representing the available input and output formats/methods. */
  val format: sharpLib.sharpMod.sharpNs.FormatEnum = js.native
  //#endregion
  val gravity: sharpLib.sharpMod.sharpNs.GravityEnum = js.native
  val kernel: sharpLib.sharpMod.sharpNs.KernelEnum = js.native
  /** An EventEmitter that emits a change event when a task is either queued, waiting for libuv to provide a worker thread, complete */
  val queue: nodeLib.NodeJSNs.EventEmitter = js.native
  val strategy: sharpLib.sharpMod.sharpNs.StrategyEnum = js.native
  /** An Object containing the version numbers of libvips and its dependencies. */
  val versions: sharpLib.Anon_Cairo = js.native
  //#region Constructor functions
  /**
    * Creates a sharp instance from an image
    * @param input Buffer containing JPEG, PNG, WebP, GIF, SVG, TIFF or raw pixel image data, or String containing the path to an JPEG, PNG, WebP, GIF, SVG or TIFF image file.
    * @param options Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def apply(): sharpLib.sharpMod.sharpNs.Sharp = js.native
  def apply(input: java.lang.String | nodeLib.Buffer): sharpLib.sharpMod.sharpNs.Sharp = js.native
  def apply(input: java.lang.String | nodeLib.Buffer, options: sharpLib.sharpMod.sharpNs.SharpOptions): sharpLib.sharpMod.sharpNs.Sharp = js.native
  def apply(options: sharpLib.sharpMod.sharpNs.SharpOptions): sharpLib.sharpMod.sharpNs.Sharp = js.native
  //#endregion
  //#region Utility functions
  /**
    * Gets or, when options are provided, sets the limits of libvips' operation cache.
    * Existing entries in the cache will be trimmed after any change in limits.
    * This method always returns cache statistics, useful for determining how much working memory is required for a particular task.
    * @param options Object with the following attributes, or Boolean where true uses default cache settings and false removes all caching (optional, default true)
    * @returns The cache results.
    */
  def cache(): sharpLib.sharpMod.sharpNs.CacheResult = js.native
  def cache(options: scala.Boolean): sharpLib.sharpMod.sharpNs.CacheResult = js.native
  def cache(options: sharpLib.sharpMod.sharpNs.CacheOptions): sharpLib.sharpMod.sharpNs.CacheResult = js.native
  /**
    * Gets or sets the number of threads libvips' should create to process each image.
    * The default value is the number of CPU cores. A value of 0 will reset to this default.
    * The maximum number of images that can be processed in parallel is limited by libuv's UV_THREADPOOL_SIZE environment variable.
    * @param concurrency The new concurrency value.
    * @returns The current concurrency value.
    */
  def concurrency(): scala.Double = js.native
  def concurrency(concurrency: scala.Double): scala.Double = js.native
  /**
    * Provides access to internal task counters.
    * @returns Object containing task counters
    */
  def counters(): sharpLib.sharpMod.sharpNs.SharpCounters = js.native
  /**
    * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
    * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
    * @param enable enable or disable use of SIMD vector unit instructions
    * @returns true if usage of SIMD vector unit instructions is enabled
    */
  def simd(): scala.Boolean = js.native
  def simd(enable: scala.Boolean): scala.Boolean = js.native
}


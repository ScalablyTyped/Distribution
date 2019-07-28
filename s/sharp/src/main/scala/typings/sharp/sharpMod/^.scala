package typings.sharp.sharpMod

import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val bool: BoolEnum = js.native
  val fit: FitEnum = js.native
  /** Object containing nested boolean values representing the available input and output formats/methods. */
  val format: FormatEnum = js.native
  //#endregion
  val gravity: GravityEnum = js.native
  val kernel: KernelEnum = js.native
  /** An EventEmitter that emits a change event when a task is either queued, waiting for libuv to provide a worker thread, complete */
  val queue: EventEmitter = js.native
  val strategy: StrategyEnum = js.native
  //#region Constructor functions
  /**
    * Creates a sharp instance from an image
    * @param input Buffer containing JPEG, PNG, WebP, GIF, SVG, TIFF or raw pixel image data, or String containing the path to an JPEG, PNG, WebP, GIF, SVG or TIFF image file.
    * @param options Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def apply(): Sharp = js.native
  def apply(input: String | Buffer): Sharp = js.native
  def apply(input: String | Buffer, options: SharpOptions): Sharp = js.native
  def apply(options: SharpOptions): Sharp = js.native
  //#endregion
  //#region Utility functions
  /**
    * Gets or, when options are provided, sets the limits of libvips' operation cache.
    * Existing entries in the cache will be trimmed after any change in limits.
    * This method always returns cache statistics, useful for determining how much working memory is required for a particular task.
    * @param options Object with the following attributes, or Boolean where true uses default cache settings and false removes all caching (optional, default true)
    * @returns The cache results.
    */
  def cache(): CacheResult = js.native
  def cache(options: Boolean): CacheResult = js.native
  def cache(options: CacheOptions): CacheResult = js.native
  /**
    * Gets or sets the number of threads libvips' should create to process each image.
    * The default value is the number of CPU cores. A value of 0 will reset to this default.
    * The maximum number of images that can be processed in parallel is limited by libuv's UV_THREADPOOL_SIZE environment variable.
    * @param concurrency The new concurrency value.
    * @returns The current concurrency value.
    */
  def concurrency(): Double = js.native
  def concurrency(concurrency: Double): Double = js.native
  /**
    * Provides access to internal task counters.
    * @returns Object containing task counters
    */
  def counters(): SharpCounters = js.native
  /**
    * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
    * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
    * @param enable enable or disable use of SIMD vector unit instructions
    * @returns true if usage of SIMD vector unit instructions is enabled
    */
  def simd(): Boolean = js.native
  def simd(enable: Boolean): Boolean = js.native
}


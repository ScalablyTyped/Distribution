package typings.sharpie.mod

import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.sharp.mod.BoolEnum
import typings.sharp.mod.CacheOptions
import typings.sharp.mod.CacheResult
import typings.sharp.mod.FitEnum
import typings.sharp.mod.FormatEnum
import typings.sharp.mod.GravityEnum
import typings.sharp.mod.KernelEnum
import typings.sharp.mod.Sharp
import typings.sharp.mod.SharpCounters
import typings.sharp.mod.SharpOptions
import typings.sharp.mod.StrategyEnum
import typings.sharpie.anon.Cairo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharpie", "sharp")
@js.native
object sharp extends js.Object {
  
  def apply(): Sharp = js.native
  def apply(input: js.UndefOr[scala.Nothing], options: SharpOptions): Sharp = js.native
  def apply(input: String): Sharp = js.native
  def apply(input: String, options: SharpOptions): Sharp = js.native
  def apply(input: Buffer): Sharp = js.native
  def apply(input: Buffer, options: SharpOptions): Sharp = js.native
  def apply(options: SharpOptions): Sharp = js.native
  
  val bool: BoolEnum = js.native
  
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
  
  val fit: FitEnum = js.native
  
  /** Object containing nested boolean values representing the available input and output formats/methods. */
  val format: FormatEnum = js.native
  
  //#endregion
  val gravity: GravityEnum = js.native
  
  val kernel: KernelEnum = js.native
  
  /** An EventEmitter that emits a change event when a task is either queued, waiting for libuv to provide a worker thread, complete */
  val queue: EventEmitter = js.native
  
  /**
    * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
    * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
    * @param enable enable or disable use of SIMD vector unit instructions
    * @returns true if usage of SIMD vector unit instructions is enabled
    */
  def simd(): Boolean = js.native
  def simd(enable: Boolean): Boolean = js.native
  
  val strategy: StrategyEnum = js.native
  
  /** An Object containing the version numbers of libvips and its dependencies. */
  val versions: Cairo = js.native
}

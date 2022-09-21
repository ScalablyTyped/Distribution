package typings.sharp.mod

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.sharp.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//#region Constructor functions
/**
  * Creates a sharp instance from an image
  * @param input Buffer containing JPEG, PNG, WebP, AVIF, GIF, SVG, TIFF or raw pixel image data, or String containing the path to an JPEG, PNG, WebP, AVIF, GIF, SVG or TIFF image file.
  * @param options Object with optional attributes.
  * @throws {Error} Invalid parameters
  * @returns A sharp instance that can be used to chain operations
  */
inline def apply(): Sharp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sharp]
inline def apply(input: String): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: String, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Float32Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Float32Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Float64Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Float64Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int16Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int16Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int32Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int32Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int8Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Int8Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint16Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint16Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint32Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint32Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint8Array): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint8Array, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint8ClampedArray): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: js.typedarray.Uint8ClampedArray, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: Unit, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(input: Buffer): Sharp = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
inline def apply(input: Buffer, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
inline def apply(options: SharpOptions): Sharp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Sharp]

inline def bool: BoolEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[BoolEnum]

//#endregion
//#region Utility functions
/**
  * Gets or, when options are provided, sets the limits of libvips' operation cache.
  * Existing entries in the cache will be trimmed after any change in limits.
  * This method always returns cache statistics, useful for determining how much working memory is required for a particular task.
  * @param options Object with the following attributes, or Boolean where true uses default cache settings and false removes all caching (optional, default true)
  * @returns The cache results.
  */
inline def cache(): CacheResult = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")().asInstanceOf[CacheResult]
inline def cache(options: Boolean): CacheResult = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(options.asInstanceOf[js.Any]).asInstanceOf[CacheResult]
inline def cache(options: CacheOptions): CacheResult = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(options.asInstanceOf[js.Any]).asInstanceOf[CacheResult]

/**
  * Gets or sets the number of threads libvips' should create to process each image.
  * The default value is the number of CPU cores. A value of 0 will reset to this default.
  * The maximum number of images that can be processed in parallel is limited by libuv's UV_THREADPOOL_SIZE environment variable.
  * @param concurrency The new concurrency value.
  * @returns The current concurrency value.
  */
inline def concurrency(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("concurrency")().asInstanceOf[Double]
inline def concurrency(concurrency: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("concurrency")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Double]

/**
  * Provides access to internal task counters.
  * @returns Object containing task counters
  */
inline def counters(): SharpCounters = ^.asInstanceOf[js.Dynamic].applyDynamic("counters")().asInstanceOf[SharpCounters]

inline def fit: FitEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("fit").asInstanceOf[FitEnum]

/** Object containing nested boolean values representing the available input and output formats/methods. */
inline def format: FormatEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("format").asInstanceOf[FormatEnum]

//#endregion
inline def gravity: GravityEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("gravity").asInstanceOf[GravityEnum]

/** An Object containing the available interpolators and their proper values */
inline def interpolators: Interpolators_ = ^.asInstanceOf[js.Dynamic].selectDynamic("interpolators").asInstanceOf[Interpolators_]

inline def kernel: KernelEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("kernel").asInstanceOf[KernelEnum]

/** An EventEmitter that emits a change event when a task is either queued, waiting for libuv to provide a worker thread, complete */
inline def queue: EventEmitter = ^.asInstanceOf[js.Dynamic].selectDynamic("queue").asInstanceOf[EventEmitter]

/**
  * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
  * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
  * @param enable enable or disable use of SIMD vector unit instructions
  * @returns true if usage of SIMD vector unit instructions is enabled
  */
inline def simd(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("simd")().asInstanceOf[Boolean]
inline def simd(enable: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("simd")(enable.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def strategy: StrategyEnum = ^.asInstanceOf[js.Dynamic].selectDynamic("strategy").asInstanceOf[StrategyEnum]

type Color = String | RGBA

type Gravity_ = Double | String

type Matrix2x2 = js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]

type Matrix3x3 = js.Tuple3[
js.Tuple3[Double, Double, Double], 
js.Tuple3[Double, Double, Double], 
js.Tuple3[Double, Double, Double]]

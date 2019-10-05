package typings.atProtobufjsPool

import typings.atProtobufjsPool.atProtobufjsPoolMod.PoolAllocator
import typings.atProtobufjsPool.atProtobufjsPoolMod.PoolSlicer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/pool", JSImport.Namespace)
@js.native
object atProtobufjsPoolMod extends js.Object {
  /**
    * A general purpose buffer pool.
    * @memberof util
    * @function
    * @param {PoolAllocator} alloc Allocator
    * @param {PoolSlicer} slice Slicer
    * @param {number} [size=8192] Slab size
    * @returns {PoolAllocator} Pooled allocator
    */
  def apply(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  def apply(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
  /**
    * An allocator as used by {@link util.pool}.
    * @typedef PoolAllocator
    * @type {function}
    * @param {number} size Buffer size
    * @returns {Uint8Array} Buffer
    */
  type PoolAllocator = js.Function1[/* size */ Double, Uint8Array]
  /**
    * A slicer as used by {@link util.pool}.
    * @typedef PoolSlicer
    * @type {function}
    * @param {number} start Start offset
    * @param {number} end End offset
    * @returns {Uint8Array} Buffer slice
    * @this {Uint8Array}
    */
  type PoolSlicer = js.ThisFunction2[/* this */ Uint8Array, /* start */ Double, /* end */ Double, Uint8Array]
}


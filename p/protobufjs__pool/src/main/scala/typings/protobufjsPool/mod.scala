package typings.protobufjsPool

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A general purpose buffer pool.
    * @memberof util
    * @function
    * @param {PoolAllocator} alloc Allocator
    * @param {PoolSlicer} slice Slicer
    * @param {number} [size=8192] Slab size
    * @returns {PoolAllocator} Pooled allocator
    */
  @scala.inline
  def apply(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = (^.asInstanceOf[js.Dynamic].apply(alloc.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[PoolAllocator]
  @scala.inline
  def apply(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = (^.asInstanceOf[js.Dynamic].apply(alloc.asInstanceOf[js.Any], slice.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[PoolAllocator]
  
  @JSImport("@protobufjs/pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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

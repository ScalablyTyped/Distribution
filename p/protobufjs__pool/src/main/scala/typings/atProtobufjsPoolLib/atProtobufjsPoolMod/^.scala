package typings
package atProtobufjsPoolLib.atProtobufjsPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/pool", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(alloc: PoolAllocator, slice: PoolSlicer, size: scala.Double): PoolAllocator = js.native
}


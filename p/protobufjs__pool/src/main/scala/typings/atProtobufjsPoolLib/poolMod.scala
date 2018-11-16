package typings
package atProtobufjsPoolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/pool", JSImport.Namespace)
@js.native
object poolMod extends js.Object {
  /**
   * A general purpose buffer pool.
   * @memberof util
   * @function
   * @param {PoolAllocator} alloc Allocator
   * @param {PoolSlicer} slice Slicer
   * @param {number} [size=8192] Slab size
   * @returns {PoolAllocator} Pooled allocator
   */
  def apply(alloc: atProtobufjsPoolLib.PoolAllocator, slice: atProtobufjsPoolLib.PoolSlicer): atProtobufjsPoolLib.PoolAllocator = js.native
  /**
   * A general purpose buffer pool.
   * @memberof util
   * @function
   * @param {PoolAllocator} alloc Allocator
   * @param {PoolSlicer} slice Slicer
   * @param {number} [size=8192] Slab size
   * @returns {PoolAllocator} Pooled allocator
   */
  def apply(
    alloc: atProtobufjsPoolLib.PoolAllocator,
    slice: atProtobufjsPoolLib.PoolSlicer,
    size: scala.Double
  ): atProtobufjsPoolLib.PoolAllocator = js.native
}


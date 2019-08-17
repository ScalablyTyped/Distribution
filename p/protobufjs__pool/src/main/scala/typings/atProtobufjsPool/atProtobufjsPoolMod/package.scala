package typings.atProtobufjsPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atProtobufjsPoolMod {
  import typings.std.Uint8Array

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

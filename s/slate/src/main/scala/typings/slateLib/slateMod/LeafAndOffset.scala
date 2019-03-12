package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafAndOffset extends js.Object {
  var endOffset: scala.Double
  var index: scala.Double
  var leaf: Leaf
  var startOffset: scala.Double
}

object LeafAndOffset {
  @scala.inline
  def apply(endOffset: scala.Double, index: scala.Double, leaf: Leaf, startOffset: scala.Double): LeafAndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, index = index, leaf = leaf, startOffset = startOffset)
  
    __obj.asInstanceOf[LeafAndOffset]
  }
}


package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafAndOffset extends js.Object {
  var endOffset: Double
  var index: Double
  var leaf: Leaf
  var startOffset: Double
}

object LeafAndOffset {
  @scala.inline
  def apply(endOffset: Double, index: Double, leaf: Leaf, startOffset: Double): LeafAndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, index = index, leaf = leaf, startOffset = startOffset)
  
    __obj.asInstanceOf[LeafAndOffset]
  }
}


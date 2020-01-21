package typings.slate.mod

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
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeafAndOffset]
  }
}


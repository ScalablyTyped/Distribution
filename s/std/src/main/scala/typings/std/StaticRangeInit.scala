package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRangeInit extends js.Object {
  var endContainer: Node
  var endOffset: Double
  var startContainer: Node
  var startOffset: Double
}

object StaticRangeInit {
  @scala.inline
  def apply(endContainer: Node, endOffset: Double, startContainer: Node, startOffset: Double): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
}


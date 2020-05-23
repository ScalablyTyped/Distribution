package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractRange extends js.Object {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean
  /**
    * Returns range's end node.
    */
  val endContainer: Node
  /**
    * Returns range's end offset.
    */
  val endOffset: Double
  /**
    * Returns range's start node.
    */
  val startContainer: Node
  /**
    * Returns range's start offset.
    */
  val startOffset: Double
}

object AbstractRange {
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    endContainer: Node,
    endOffset: Double,
    startContainer: Node,
    startOffset: Double
  ): AbstractRange = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractRange]
  }
}


package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractRange extends js.Object {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  val endContainer: Node = js.native
  /**
    * Returns range's end offset.
    */
  val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  val startContainer: Node = js.native
  /**
    * Returns range's start offset.
    */
  val startOffset: Double = js.native
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
  @scala.inline
  implicit class AbstractRangeOps[Self <: AbstractRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollapsed(value: scala.Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndContainer(value: Node): Self = this.set("endContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartContainer(value: Node): Self = this.set("startContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}


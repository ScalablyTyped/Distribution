package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxPageTreeLevel extends js.Object {
  /**
    * Number of dimensions to include in the tree.
    */
  var qDepth: Double = js.native
  /**
    * The first dimension that is to be part of the tree, counted from the left.
    * For example, if qLeft is equal to 1, omit nodes from the first dimension in the current sort order.
    */
  var qLeft: Double = js.native
}

object INxPageTreeLevel {
  @scala.inline
  def apply(qDepth: Double, qLeft: Double): INxPageTreeLevel = {
    val __obj = js.Dynamic.literal(qDepth = qDepth.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPageTreeLevel]
  }
  @scala.inline
  implicit class INxPageTreeLevelOps[Self <: INxPageTreeLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQDepth(value: Double): Self = this.set("qDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLeft(value: Double): Self = this.set("qLeft", value.asInstanceOf[js.Any])
  }
  
}


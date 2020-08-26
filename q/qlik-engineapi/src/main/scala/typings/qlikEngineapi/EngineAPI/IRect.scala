package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rect...
  */
@js.native
trait IRect extends js.Object {
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: Double = js.native
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: Double = js.native
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: Double = js.native
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: Double = js.native
}

object IRect {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): IRect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRect]
  }
  @scala.inline
  implicit class IRectOps[Self <: IRect] (val x: Self) extends AnyVal {
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
    def setQHeight(value: Double): Self = this.set("qHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLeft(value: Double): Self = this.set("qLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTop(value: Double): Self = this.set("qTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setQWidth(value: Double): Self = this.set("qWidth", value.asInstanceOf[js.Any])
  }
  
}


package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDataAreaPage...
  */
@js.native
trait INxDataAreaPage extends js.Object {
  /**
    * Height of the page.
    * The difference between qTop and qHeight gives the lowest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qHeight: Double = js.native
  /**
    * Position from the left.
    * Corresponds to the lowest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qLeft: Double = js.native
  /**
    * Position from the top.
    * Corresponds to the highest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qTop: Double = js.native
  /**
    * Width of the page.
    * Corresponds to the highest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qWidth: Double = js.native
}

object INxDataAreaPage {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): INxDataAreaPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDataAreaPage]
  }
  @scala.inline
  implicit class INxDataAreaPageOps[Self <: INxDataAreaPage] (val x: Self) extends AnyVal {
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


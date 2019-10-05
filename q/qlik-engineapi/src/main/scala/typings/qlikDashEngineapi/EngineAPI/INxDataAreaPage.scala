package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDataAreaPage...
  */
trait INxDataAreaPage extends js.Object {
  /**
    * Height of the page.
    * The difference between qTop and qHeight gives the lowest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qHeight: Double
  /**
    * Position from the left.
    * Corresponds to the lowest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qLeft: Double
  /**
    * Position from the top.
    * Corresponds to the highest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qTop: Double
  /**
    * Width of the page.
    * Corresponds to the highest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qWidth: Double
}

object INxDataAreaPage {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): INxDataAreaPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight, qLeft = qLeft, qTop = qTop, qWidth = qWidth)
  
    __obj.asInstanceOf[INxDataAreaPage]
  }
}


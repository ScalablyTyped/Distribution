package typings
package reactDashMeasureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashMeasureLibStrings {
  @js.native
  sealed trait bounds
    extends reactDashMeasureLib.reactDashMeasureMod.MeasurementType
  
  @js.native
  sealed trait client
    extends reactDashMeasureLib.reactDashMeasureMod.MeasurementType
  
  @js.native
  sealed trait margin
    extends reactDashMeasureLib.reactDashMeasureMod.MeasurementType
  
  @js.native
  sealed trait offset
    extends reactDashMeasureLib.reactDashMeasureMod.MeasurementType
  
  @js.native
  sealed trait scroll
    extends reactDashMeasureLib.reactDashMeasureMod.MeasurementType
  
  @scala.inline
  def bounds: bounds = "bounds".asInstanceOf[bounds]
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  @scala.inline
  def margin: margin = "margin".asInstanceOf[margin]
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
}


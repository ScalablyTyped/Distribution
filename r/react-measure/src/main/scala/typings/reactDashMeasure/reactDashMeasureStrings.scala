package typings.reactDashMeasure

import typings.reactDashMeasure.reactDashMeasureMod.MeasurementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashMeasureStrings {
  @js.native
  sealed trait bounds extends MeasurementType
  
  @js.native
  sealed trait client extends MeasurementType
  
  @js.native
  sealed trait margin extends MeasurementType
  
  @js.native
  sealed trait offset extends MeasurementType
  
  @js.native
  sealed trait scroll extends MeasurementType
  
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


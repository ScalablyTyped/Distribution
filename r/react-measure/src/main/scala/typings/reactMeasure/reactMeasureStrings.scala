package typings.reactMeasure

import typings.reactMeasure.mod.MeasurementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeasureStrings {
  
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
}

package typings.reactMeasure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactMeasure.reactMeasureStrings.client
  - typings.reactMeasure.reactMeasureStrings.offset
  - typings.reactMeasure.reactMeasureStrings.scroll
  - typings.reactMeasure.reactMeasureStrings.bounds
  - typings.reactMeasure.reactMeasureStrings.margin
*/
trait MeasurementType extends js.Object

object MeasurementType {
  @scala.inline
  def bounds: typings.reactMeasure.reactMeasureStrings.bounds = this.cast("bounds")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client: typings.reactMeasure.reactMeasureStrings.client = this.cast("client")
  @scala.inline
  def margin: typings.reactMeasure.reactMeasureStrings.margin = this.cast("margin")
  @scala.inline
  def offset: typings.reactMeasure.reactMeasureStrings.offset = this.cast("offset")
  @scala.inline
  def scroll: typings.reactMeasure.reactMeasureStrings.scroll = this.cast("scroll")
}


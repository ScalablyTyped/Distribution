package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideDuration")
@js.native
class GlideDuration () extends js.Object {
  def this(value: String) = this()
  def this(value: Double) = this()
  def this(value: GlideDuration) = this()
  def add(value: GlideDuration): GlideDuration = js.native
  def getByFormat(format: String): String = js.native
  def getDayPart(): Double = js.native
  def getDisplayValue(): String = js.native
  def getDurationValue(): String = js.native
  def getNumericValue(): Double = js.native
  def getRoundedDayPart(): Double = js.native
  def getValue(): String = js.native
  def setDisplayValue(asDisplayed: String): Unit = js.native
  def setValue(o: js.Object): Unit = js.native
  def subtract(value: GlideDuration): GlideDuration = js.native
}


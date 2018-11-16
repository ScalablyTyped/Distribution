package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideDuration")
@js.native
class GlideDuration () extends js.Object {
  def this(value: java.lang.String) = this()
  def this(value: scala.Double) = this()
  def this(value: GlideDuration) = this()
  def add(value: GlideDuration): GlideDuration = js.native
  def getByFormat(format: java.lang.String): java.lang.String = js.native
  def getDayPart(): scala.Double = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDurationValue(): java.lang.String = js.native
  def getNumericValue(): scala.Double = js.native
  def getRoundedDayPart(): scala.Double = js.native
  def getValue(): java.lang.String = js.native
  def setDisplayValue(asDisplayed: java.lang.String): scala.Unit = js.native
  def setValue(o: js.Object): scala.Unit = js.native
  def subtract(value: GlideDuration): GlideDuration = js.native
}


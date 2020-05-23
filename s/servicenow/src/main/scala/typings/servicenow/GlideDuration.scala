package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideDuration extends js.Object {
  def add(value: GlideDuration): GlideDuration
  def getByFormat(format: String): String
  def getDayPart(): Double
  def getDisplayValue(): String
  def getDurationValue(): String
  def getNumericValue(): Double
  def getRoundedDayPart(): Double
  def getValue(): String
  def setDisplayValue(asDisplayed: String): Unit
  def setValue(o: js.Object): Unit
  def subtract(value: GlideDuration): GlideDuration
}

object GlideDuration {
  @scala.inline
  def apply(
    add: GlideDuration => GlideDuration,
    getByFormat: String => String,
    getDayPart: () => Double,
    getDisplayValue: () => String,
    getDurationValue: () => String,
    getNumericValue: () => Double,
    getRoundedDayPart: () => Double,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: js.Object => Unit,
    subtract: GlideDuration => GlideDuration
  ): GlideDuration = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getByFormat = js.Any.fromFunction1(getByFormat), getDayPart = js.Any.fromFunction0(getDayPart), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDurationValue = js.Any.fromFunction0(getDurationValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoundedDayPart = js.Any.fromFunction0(getRoundedDayPart), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[GlideDuration]
  }
}


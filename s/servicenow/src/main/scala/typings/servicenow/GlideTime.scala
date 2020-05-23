package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideTime extends js.Object {
  def getByFormat(format: String): String
  def getDisplayValue(): String
  def getDisplayValueinternal(): String
  def getValue(): String
  def setDisplayValue(asDisplayed: String): Unit
  def setValue(o: String): Unit
  def subtract(start: GlideTime, end: GlideTime): GlideDuration
}

object GlideTime {
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueinternal: () => String,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueinternal = js.Any.fromFunction0(getDisplayValueinternal), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
}


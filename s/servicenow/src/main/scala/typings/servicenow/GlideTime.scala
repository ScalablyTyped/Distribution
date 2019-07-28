package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideTime")
@js.native
class GlideTime protected () extends js.Object {
  def this(milliseconds: Double) = this()
  def getByFormat(format: String): String = js.native
  def getDisplayValue(): String = js.native
  def getDisplayValueinternal(): String = js.native
  def getValue(): String = js.native
  def setDisplayValue(asDisplayed: String): Unit = js.native
  def setValue(o: String): Unit = js.native
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}


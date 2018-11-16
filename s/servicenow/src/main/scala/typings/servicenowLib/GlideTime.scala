package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideTime")
@js.native
class GlideTime protected () extends js.Object {
  def this(milliseconds: scala.Double) = this()
  def getByFormat(format: java.lang.String): java.lang.String = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValueinternal(): java.lang.String = js.native
  def getValue(): java.lang.String = js.native
  def setDisplayValue(asDisplayed: java.lang.String): scala.Unit = js.native
  def setValue(o: java.lang.String): scala.Unit = js.native
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}


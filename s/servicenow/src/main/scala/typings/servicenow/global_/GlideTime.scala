package typings.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideTime")
@js.native
class GlideTime protected ()
  extends typings.servicenow.GlideTime {
  def this(milliseconds: Double) = this()
  /* CompleteClass */
  override def getByFormat(format: String): String = js.native
  /* CompleteClass */
  override def getDisplayValue(): String = js.native
  /* CompleteClass */
  override def getDisplayValueinternal(): String = js.native
  /* CompleteClass */
  override def getValue(): String = js.native
  /* CompleteClass */
  override def setDisplayValue(asDisplayed: String): Unit = js.native
  /* CompleteClass */
  override def setValue(o: String): Unit = js.native
  /* CompleteClass */
  override def subtract(start: typings.servicenow.GlideTime, end: typings.servicenow.GlideTime): typings.servicenow.GlideDuration = js.native
}


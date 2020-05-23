package typings.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideDuration")
@js.native
class GlideDuration ()
  extends typings.servicenow.GlideDuration {
  def this(value: String) = this()
  def this(value: Double) = this()
  def this(value: typings.servicenow.GlideDuration) = this()
  /* CompleteClass */
  override def add(value: typings.servicenow.GlideDuration): typings.servicenow.GlideDuration = js.native
  /* CompleteClass */
  override def getByFormat(format: String): String = js.native
  /* CompleteClass */
  override def getDayPart(): Double = js.native
  /* CompleteClass */
  override def getDisplayValue(): String = js.native
  /* CompleteClass */
  override def getDurationValue(): String = js.native
  /* CompleteClass */
  override def getNumericValue(): Double = js.native
  /* CompleteClass */
  override def getRoundedDayPart(): Double = js.native
  /* CompleteClass */
  override def getValue(): String = js.native
  /* CompleteClass */
  override def setDisplayValue(asDisplayed: String): Unit = js.native
  /* CompleteClass */
  override def setValue(o: js.Object): Unit = js.native
  /* CompleteClass */
  override def subtract(value: typings.servicenow.GlideDuration): typings.servicenow.GlideDuration = js.native
}


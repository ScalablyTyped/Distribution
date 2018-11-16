package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideElement extends js.Object {
  def canCreate(): scala.Boolean = js.native
  def canRead(): scala.Boolean = js.native
  def canWrite(): scala.Boolean = js.native
  def changes(): scala.Boolean = js.native
  def changesFrom(value: js.Object): scala.Boolean = js.native
  def changesTo(value: js.Object): scala.Boolean = js.native
  def getAttribute(attributeName: java.lang.String): java.lang.String = js.native
  def getChoices(): js.Array[_] = js.native
  def getChoices(name: java.lang.String): js.Array[_] = js.native
  def getDecryptedValue(): java.lang.String = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValue(maxCharacters: scala.Double): java.lang.String = js.native
  def getED(): GlideElementDescriptor = js.native
  def getRefRecord(): GlideRecord = js.native
  def getReferenceTable(): java.lang.String = js.native
  def nil(): scala.Boolean = js.native
  def setDisplayValue(value: js.Object): scala.Unit = js.native
  def setError(value: java.lang.String): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: js.Object): scala.Unit = js.native
}


package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideElement extends StObject {
  
  def canCreate(): Boolean = js.native
  
  def canRead(): Boolean = js.native
  
  def canWrite(): Boolean = js.native
  
  def changes(): Boolean = js.native
  
  def changesFrom(value: js.Object): Boolean = js.native
  
  def changesTo(value: js.Object): Boolean = js.native
  
  def getAttribute(attributeName: String): String = js.native
  
  def getChoices(): js.Array[Any] = js.native
  def getChoices(name: String): js.Array[Any] = js.native
  
  def getDecryptedValue(): String = js.native
  
  def getDisplayValue(): String = js.native
  def getDisplayValue(maxCharacters: Double): String = js.native
  
  def getED(): GlideElementDescriptor = js.native
  
  def getRefRecord(): GlideRecord = js.native
  
  def getReferenceTable(): String = js.native
  
  def nil(): Boolean = js.native
  
  def setDisplayValue(value: js.Object): Unit = js.native
  
  def setError(value: String): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: js.Object): Unit = js.native
}

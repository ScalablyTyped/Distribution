package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientObject extends StObject {
  
  def checkUninitializedProperty(propName: String): Unit = js.native
  
  def customFromJson(initValue: js.Any): Boolean = js.native
  
  def fromJson(initValue: js.Any): Unit = js.native
  
  def get_context(): ClientRuntimeContext = js.native
  
  def get_objectVersion(): String = js.native
  
  def get_path(): ObjectPath = js.native
  
  def get_serverObjectIsNull(): Boolean = js.native
  
  def get_typedObject(): ClientObject = js.native
  
  def initPropertiesFromJson(initValue: js.Any): Unit = js.native
  
  def isObjectPropertyInstantiated(propertyName: String): Boolean = js.native
  
  def isPropertyAvailable(propertyName: String): Boolean = js.native
  
  def refreshLoad(): Unit = js.native
  
  def retrieve(): Unit = js.native
  def retrieve(propertyNames: js.Array[String]): Unit = js.native
  
  def set_objectVersion(value: String): Unit = js.native
}

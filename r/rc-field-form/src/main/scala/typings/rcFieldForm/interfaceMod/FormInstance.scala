package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormInstance[Values] extends StObject {
  
  def getFieldError(name: NamePath): js.Array[String] = js.native
  
  def getFieldValue(name: NamePath): StoreValue = js.native
  
  def getFieldsError(): js.Array[FieldError] = js.native
  def getFieldsError(nameList: js.Array[NamePath]): js.Array[FieldError] = js.native
  
  def getFieldsValue(): Values = js.native
  def getFieldsValue(nameList: js.Array[NamePath]): js.Any = js.native
  def getFieldsValue(nameList: js.Array[NamePath], filterFunc: js.Function1[/* meta */ Meta, Boolean]): js.Any = js.native
  @JSName("getFieldsValue")
  def getFieldsValue_true(nameList: `true`): js.Any = js.native
  @JSName("getFieldsValue")
  def getFieldsValue_true(nameList: `true`, filterFunc: js.Function1[/* meta */ Meta, Boolean]): js.Any = js.native
  
  def isFieldTouched(name: NamePath): Boolean = js.native
  
  def isFieldValidating(name: NamePath): Boolean = js.native
  
  def isFieldsTouched(): Boolean = js.native
  def isFieldsTouched(allFieldsTouched: Boolean): Boolean = js.native
  def isFieldsTouched(nameList: js.Array[NamePath]): Boolean = js.native
  def isFieldsTouched(nameList: js.Array[NamePath], allFieldsTouched: Boolean): Boolean = js.native
  def isFieldsTouched(nameList: Unit, allFieldsTouched: Boolean): Boolean = js.native
  
  def isFieldsValidating(nameList: js.Array[NamePath]): Boolean = js.native
  
  def resetFields(): Unit = js.native
  def resetFields(fields: js.Array[NamePath]): Unit = js.native
  
  def setFields(fields: js.Array[FieldData]): Unit = js.native
  
  def setFieldsValue(value: RecursivePartial[Values]): Unit = js.native
  
  def submit(): Unit = js.native
  
  var validateFields: ValidateFields = js.native
}

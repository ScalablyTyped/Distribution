package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormInstance[Values] extends StObject {
  
  def getFieldError(name: NamePath): js.Array[String] = js.native
  
  def getFieldValue(name: NamePath): StoreValue = js.native
  
  def getFieldWarning(name: NamePath): js.Array[String] = js.native
  
  def getFieldsError(): js.Array[FieldError] = js.native
  def getFieldsError(nameList: js.Array[NamePath]): js.Array[FieldError] = js.native
  
  var getFieldsValue: js.Function0[Values] & (js.Function2[
    /* nameList */ js.Array[NamePath] | true, 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Any
  ]) = js.native
  
  def isFieldTouched(name: NamePath): Boolean = js.native
  
  def isFieldValidating(name: NamePath): Boolean = js.native
  
  var isFieldsTouched: (js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]) & (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean]) = js.native
  
  def isFieldsValidating(nameList: js.Array[NamePath]): Boolean = js.native
  
  def resetFields(): Unit = js.native
  def resetFields(fields: js.Array[NamePath]): Unit = js.native
  
  def setFieldValue(name: NamePath, value: Any): Unit = js.native
  
  def setFields(fields: js.Array[FieldData]): Unit = js.native
  
  def setFieldsValue(values: RecursivePartial[Values]): Unit = js.native
  
  def submit(): Unit = js.native
  
  var validateFields: ValidateFields[Values] = js.native
}

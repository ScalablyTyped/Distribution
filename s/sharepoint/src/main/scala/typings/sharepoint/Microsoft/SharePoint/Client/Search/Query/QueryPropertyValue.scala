package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryPropertyValue extends ClientValueObject {
  
  def get_boolVal(): Boolean = js.native
  
  def get_intVal(): Double = js.native
  
  def get_queryPropertyValueTypeIndex(): Double = js.native
  
  def get_strArray(): js.Array[String] = js.native
  
  def get_strVal(): String = js.native
  
  def set_boolVal(value: Boolean): Boolean = js.native
  
  def set_intVal(value: Double): Double = js.native
  
  def set_queryPropertyValueTypeIndex(value: Double): Unit = js.native
  
  def set_strArray(value: js.Array[String]): js.Array[String] = js.native
  
  def set_strVal(value: String): String = js.native
}
object QueryPropertyValue {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_boolVal: () => Boolean,
    get_intVal: () => Double,
    get_queryPropertyValueTypeIndex: () => Double,
    get_strArray: () => js.Array[String],
    get_strVal: () => String,
    get_typeId: () => String,
    set_boolVal: Boolean => Boolean,
    set_intVal: Double => Double,
    set_queryPropertyValueTypeIndex: Double => Unit,
    set_strArray: js.Array[String] => js.Array[String],
    set_strVal: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QueryPropertyValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_boolVal = js.Any.fromFunction0(get_boolVal), get_intVal = js.Any.fromFunction0(get_intVal), get_queryPropertyValueTypeIndex = js.Any.fromFunction0(get_queryPropertyValueTypeIndex), get_strArray = js.Any.fromFunction0(get_strArray), get_strVal = js.Any.fromFunction0(get_strVal), get_typeId = js.Any.fromFunction0(get_typeId), set_boolVal = js.Any.fromFunction1(set_boolVal), set_intVal = js.Any.fromFunction1(set_intVal), set_queryPropertyValueTypeIndex = js.Any.fromFunction1(set_queryPropertyValueTypeIndex), set_strArray = js.Any.fromFunction1(set_strArray), set_strVal = js.Any.fromFunction1(set_strVal), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QueryPropertyValue]
  }
  
  @scala.inline
  implicit class QueryPropertyValueOps[Self <: QueryPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_boolVal(value: () => Boolean): Self = this.set("get_boolVal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_intVal(value: () => Double): Self = this.set("get_intVal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryPropertyValueTypeIndex(value: () => Double): Self = this.set("get_queryPropertyValueTypeIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_strArray(value: () => js.Array[String]): Self = this.set("get_strArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_strVal(value: () => String): Self = this.set("get_strVal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_boolVal(value: Boolean => Boolean): Self = this.set("set_boolVal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_intVal(value: Double => Double): Self = this.set("set_intVal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryPropertyValueTypeIndex(value: Double => Unit): Self = this.set("set_queryPropertyValueTypeIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_strArray(value: js.Array[String] => js.Array[String]): Self = this.set("set_strArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_strVal(value: String => String): Self = this.set("set_strVal", js.Any.fromFunction1(value))
  }
}

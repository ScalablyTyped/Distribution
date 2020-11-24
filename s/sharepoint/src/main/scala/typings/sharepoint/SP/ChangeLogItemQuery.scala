package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLogItemQuery extends ClientValueObject {
  
  def get_changeToken(): String = js.native
  
  def get_contains(): String = js.native
  
  def get_query(): String = js.native
  
  def get_queryOptions(): String = js.native
  
  def get_rowLimit(): String = js.native
  
  def get_viewFields(): String = js.native
  
  def get_viewName(): String = js.native
  
  def set_changeToken(value: String): Unit = js.native
  
  def set_contains(value: String): Unit = js.native
  
  def set_query(value: String): Unit = js.native
  
  def set_queryOptions(value: String): Unit = js.native
  
  def set_rowLimit(value: String): Unit = js.native
  
  def set_viewFields(value: String): Unit = js.native
  
  def set_viewName(value: String): Unit = js.native
}
object ChangeLogItemQuery {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_changeToken: () => String,
    get_contains: () => String,
    get_query: () => String,
    get_queryOptions: () => String,
    get_rowLimit: () => String,
    get_typeId: () => String,
    get_viewFields: () => String,
    get_viewName: () => String,
    set_changeToken: String => Unit,
    set_contains: String => Unit,
    set_query: String => Unit,
    set_queryOptions: String => Unit,
    set_rowLimit: String => Unit,
    set_viewFields: String => Unit,
    set_viewName: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ChangeLogItemQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_changeToken = js.Any.fromFunction0(get_changeToken), get_contains = js.Any.fromFunction0(get_contains), get_query = js.Any.fromFunction0(get_query), get_queryOptions = js.Any.fromFunction0(get_queryOptions), get_rowLimit = js.Any.fromFunction0(get_rowLimit), get_typeId = js.Any.fromFunction0(get_typeId), get_viewFields = js.Any.fromFunction0(get_viewFields), get_viewName = js.Any.fromFunction0(get_viewName), set_changeToken = js.Any.fromFunction1(set_changeToken), set_contains = js.Any.fromFunction1(set_contains), set_query = js.Any.fromFunction1(set_query), set_queryOptions = js.Any.fromFunction1(set_queryOptions), set_rowLimit = js.Any.fromFunction1(set_rowLimit), set_viewFields = js.Any.fromFunction1(set_viewFields), set_viewName = js.Any.fromFunction1(set_viewName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ChangeLogItemQuery]
  }
  
  @scala.inline
  implicit class ChangeLogItemQueryOps[Self <: ChangeLogItemQuery] (val x: Self) extends AnyVal {
    
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
    def setGet_changeToken(value: () => String): Self = this.set("get_changeToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contains(value: () => String): Self = this.set("get_contains", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_query(value: () => String): Self = this.set("get_query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryOptions(value: () => String): Self = this.set("get_queryOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_rowLimit(value: () => String): Self = this.set("get_rowLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_viewFields(value: () => String): Self = this.set("get_viewFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_viewName(value: () => String): Self = this.set("get_viewName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_changeToken(value: String => Unit): Self = this.set("set_changeToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_contains(value: String => Unit): Self = this.set("set_contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_query(value: String => Unit): Self = this.set("set_query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryOptions(value: String => Unit): Self = this.set("set_queryOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_rowLimit(value: String => Unit): Self = this.set("set_rowLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_viewFields(value: String => Unit): Self = this.set("set_viewFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_viewName(value: String => Unit): Self = this.set("set_viewName", js.Any.fromFunction1(value))
  }
}

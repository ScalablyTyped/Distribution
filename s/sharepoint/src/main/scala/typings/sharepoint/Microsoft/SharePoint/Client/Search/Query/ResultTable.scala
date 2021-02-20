package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultTable extends ClientValueObject {
  
  def get_groupTemplateId(): String = js.native
  
  def get_itemTemplateId(): String = js.native
  
  def get_properties(): StringDictionary[js.Any] = js.native
  
  def get_queryId(): String = js.native
  
  def get_queryRuleId(): String = js.native
  
  def get_resultRows(): js.Array[StringDictionary[_]] = js.native
  
  def get_resultTitle(): String = js.native
  
  def get_resultTitleUrl(): String = js.native
  
  def get_rowCount(): Double = js.native
  
  def get_tableType(): String = js.native
  
  def get_totalRows(): Double = js.native
  
  def get_totalRowsIncludingDuplicates(): Double = js.native
  
  def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
}
object ResultTable {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_groupTemplateId: () => String,
    get_itemTemplateId: () => String,
    get_properties: () => StringDictionary[js.Any],
    get_queryId: () => String,
    get_queryRuleId: () => String,
    get_resultRows: () => js.Array[StringDictionary[_]],
    get_resultTitle: () => String,
    get_resultTitleUrl: () => String,
    get_rowCount: () => Double,
    get_tableType: () => String,
    get_totalRows: () => Double,
    get_totalRowsIncludingDuplicates: () => Double,
    get_typeId: () => String,
    initPropertiesFromJson: js.Any => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ResultTable = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_groupTemplateId = js.Any.fromFunction0(get_groupTemplateId), get_itemTemplateId = js.Any.fromFunction0(get_itemTemplateId), get_properties = js.Any.fromFunction0(get_properties), get_queryId = js.Any.fromFunction0(get_queryId), get_queryRuleId = js.Any.fromFunction0(get_queryRuleId), get_resultRows = js.Any.fromFunction0(get_resultRows), get_resultTitle = js.Any.fromFunction0(get_resultTitle), get_resultTitleUrl = js.Any.fromFunction0(get_resultTitleUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_tableType = js.Any.fromFunction0(get_tableType), get_totalRows = js.Any.fromFunction0(get_totalRows), get_totalRowsIncludingDuplicates = js.Any.fromFunction0(get_totalRowsIncludingDuplicates), get_typeId = js.Any.fromFunction0(get_typeId), initPropertiesFromJson = js.Any.fromFunction1(initPropertiesFromJson), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ResultTable]
  }
  
  @scala.inline
  implicit class ResultTableMutableBuilder[Self <: ResultTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_groupTemplateId(value: () => String): Self = StObject.set(x, "get_groupTemplateId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_itemTemplateId(value: () => String): Self = StObject.set(x, "get_itemTemplateId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_properties(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryId(value: () => String): Self = StObject.set(x, "get_queryId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryRuleId(value: () => String): Self = StObject.set(x, "get_queryRuleId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_resultRows(value: () => js.Array[StringDictionary[_]]): Self = StObject.set(x, "get_resultRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_resultTitle(value: () => String): Self = StObject.set(x, "get_resultTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_resultTitleUrl(value: () => String): Self = StObject.set(x, "get_resultTitleUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_rowCount(value: () => Double): Self = StObject.set(x, "get_rowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_tableType(value: () => String): Self = StObject.set(x, "get_tableType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_totalRows(value: () => Double): Self = StObject.set(x, "get_totalRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_totalRowsIncludingDuplicates(value: () => Double): Self = StObject.set(x, "get_totalRowsIncludingDuplicates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitPropertiesFromJson(value: js.Any => Unit): Self = StObject.set(x, "initPropertiesFromJson", js.Any.fromFunction1(value))
  }
}

package typings.sharepoint.global.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.IEnumerator
import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTableCollection")
@js.native
class ResultTableCollection ()
  extends typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable] = js.native
  /* CompleteClass */
  override def get_count(): Double = js.native
  /* CompleteClass */
  override def get_elapsedTime(): Double = js.native
  /* CompleteClass */
  override def get_item(index: Double): typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable = js.native
  /* CompleteClass */
  override def get_properties(): StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def get_queryErrors(): StringDictionary[ControlMessage] = js.native
  /* CompleteClass */
  override def get_queryId(): String = js.native
  /* CompleteClass */
  override def get_spellingSuggestion(): String = js.native
  /* CompleteClass */
  override def get_triggeredRules(): js.Array[Guid] = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def set_elapsedTime(value: Double): Unit = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


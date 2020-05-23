package typings.sharepoint.global.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults")
@js.native
class QuerySuggestionResults ()
  extends typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_peopleNames(): js.Array[String] = js.native
  /* CompleteClass */
  override def get_personalResults(): js.Array[
    typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion
  ] = js.native
  /* CompleteClass */
  override def get_queries(): js.Array[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery] = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_peopleNames(value: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def set_personalResults(
    value: js.Array[
      typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def set_queries(value: js.Array[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery]): Unit = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


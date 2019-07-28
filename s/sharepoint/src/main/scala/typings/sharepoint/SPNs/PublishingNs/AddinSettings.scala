package typings.sharepoint.SPNs.PublishingNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.AddinSettings")
@js.native
class AddinSettings protected () extends ClientObject {
  def this(ctx: ClientContext, id: Guid) = this()
  def get_description(): String = js.native
  def get_enabled(): Boolean = js.native
  def get_headScript(): String = js.native
  def get_htmlEndBody(): String = js.native
  def get_htmlStartBody(): String = js.native
  def get_id(): Guid = js.native
  def get_metaTagPagePropertyMappings(): StringDictionary[String] = js.native
  def get_namespace(): Boolean = js.native
  def get_title(): String = js.native
  def set_description(value: String): String = js.native
  def set_enabled(value: Boolean): Boolean = js.native
  def set_headScript(value: String): String = js.native
  def set_htmlEndBody(value: String): String = js.native
  def set_htmlStartBody(value: String): String = js.native
  def set_metaTagPagePropertyMappings(value: StringDictionary[String]): StringDictionary[String] = js.native
  def set_namespace(value: Boolean): Boolean = js.native
  def set_title(value: String): String = js.native
}


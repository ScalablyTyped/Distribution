package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.AddinSettings")
@js.native
class AddinSettings protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(ctx: sharepointLib.SPNs.ClientContext, id: sharepointLib.SPNs.Guid) = this()
  def get_description(): java.lang.String = js.native
  def get_enabled(): scala.Boolean = js.native
  def get_headScript(): java.lang.String = js.native
  def get_htmlEndBody(): java.lang.String = js.native
  def get_htmlStartBody(): java.lang.String = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_metaTagPagePropertyMappings(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def get_namespace(): scala.Boolean = js.native
  def get_title(): java.lang.String = js.native
  def set_description(value: java.lang.String): java.lang.String = js.native
  def set_enabled(value: scala.Boolean): scala.Boolean = js.native
  def set_headScript(value: java.lang.String): java.lang.String = js.native
  def set_htmlEndBody(value: java.lang.String): java.lang.String = js.native
  def set_htmlStartBody(value: java.lang.String): java.lang.String = js.native
  def set_metaTagPagePropertyMappings(value: org.scalablytyped.runtime.StringDictionary[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def set_namespace(value: scala.Boolean): scala.Boolean = js.native
  def set_title(value: java.lang.String): java.lang.String = js.native
}


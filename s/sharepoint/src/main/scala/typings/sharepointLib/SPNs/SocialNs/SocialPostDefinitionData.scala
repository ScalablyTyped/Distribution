package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about server-generated posts.
            This type can only be specified in a server-to-server call. */
@JSGlobal("SP.Social.SocialPostDefinitionData")
@js.native
class SocialPostDefinitionData ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_items(): js.Array[SocialPostDefinitionDataItem] = js.native
  def get_name(): java.lang.String = js.native
  def set_items(value: js.Array[SocialPostDefinitionDataItem]): js.Array[SocialPostDefinitionDataItem] = js.native
  def set_name(value: java.lang.String): java.lang.String = js.native
}


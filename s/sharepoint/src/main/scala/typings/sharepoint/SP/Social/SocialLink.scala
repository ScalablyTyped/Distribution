package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a link that includes a URI and text representation.
  This class is used to represent the location of a web site.  */
@JSGlobal("SP.Social.SocialLink")
@js.native
class SocialLink () extends ClientValueObject {
  def get_text(): String = js.native
  def get_uri(): String = js.native
  def set_text(value: String): String = js.native
  def set_uri(value: String): String = js.native
}


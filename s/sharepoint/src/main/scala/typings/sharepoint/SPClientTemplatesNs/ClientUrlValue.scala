package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUrlValue extends js.Object {
  var Description: String
  var URL: String
}

object ClientUrlValue {
  @scala.inline
  def apply(Description: String, URL: String): ClientUrlValue = {
    val __obj = js.Dynamic.literal(Description = Description, URL = URL)
  
    __obj.asInstanceOf[ClientUrlValue]
  }
}


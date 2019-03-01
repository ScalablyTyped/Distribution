package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUrlValue extends js.Object {
  var Description: java.lang.String
  var URL: java.lang.String
}

object ClientUrlValue {
  @scala.inline
  def apply(Description: java.lang.String, URL: java.lang.String): ClientUrlValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("URL")(URL)
    __obj.asInstanceOf[ClientUrlValue]
  }
}


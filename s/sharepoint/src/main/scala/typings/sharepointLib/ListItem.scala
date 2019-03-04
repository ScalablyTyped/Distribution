package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  var ContentTypeId: java.lang.String
  var ID: scala.Double
}

object ListItem {
  @scala.inline
  def apply(ContentTypeId: java.lang.String, ID: scala.Double): ListItem = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId, ID = ID)
  
    __obj.asInstanceOf[ListItem]
  }
}


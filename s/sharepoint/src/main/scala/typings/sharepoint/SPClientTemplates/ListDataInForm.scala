package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataInForm extends js.Object {
  var Items: js.Array[Item]
}

object ListDataInForm {
  @scala.inline
  def apply(Items: js.Array[Item]): ListDataInForm = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInForm]
  }
}


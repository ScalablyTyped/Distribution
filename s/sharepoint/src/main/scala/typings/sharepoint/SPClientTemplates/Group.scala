package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var Items: js.Array[Item]
}

object Group {
  @scala.inline
  def apply(Items: js.Array[Item]): Group = {
    val __obj = js.Dynamic.literal(Items = Items)
  
    __obj.asInstanceOf[Group]
  }
}


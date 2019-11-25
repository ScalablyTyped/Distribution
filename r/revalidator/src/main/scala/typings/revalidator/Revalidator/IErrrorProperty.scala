package typings.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrrorProperty extends js.Object {
  var message: String
  var property: String
}

object IErrrorProperty {
  @scala.inline
  def apply(message: String, property: String): IErrrorProperty = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IErrrorProperty]
  }
}


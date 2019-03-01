package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrrorProperty extends js.Object {
  var message: java.lang.String
  var property: java.lang.String
}

object IErrrorProperty {
  @scala.inline
  def apply(message: java.lang.String, property: java.lang.String): IErrrorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[IErrrorProperty]
  }
}


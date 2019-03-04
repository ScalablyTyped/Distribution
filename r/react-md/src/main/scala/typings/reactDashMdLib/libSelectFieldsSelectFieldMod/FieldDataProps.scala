package typings
package reactDashMdLib.libSelectFieldsSelectFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDataProps extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var value: scala.Double | java.lang.String
}

object FieldDataProps {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, value: scala.Double | java.lang.String): FieldDataProps = {
    val __obj = js.Dynamic.literal(id = id, name = name, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldDataProps]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mapping extends js.Object {
  var mapping: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var sqlType: java.lang.String
}

object Anon_Mapping {
  @scala.inline
  def apply(name: java.lang.String, sqlType: java.lang.String, mapping: java.lang.String = null): Anon_Mapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sqlType")(sqlType)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[Anon_Mapping]
  }
}


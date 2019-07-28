package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mapping extends js.Object {
  var mapping: js.UndefOr[String] = js.undefined
  var name: String
  var sqlType: String
}

object Anon_Mapping {
  @scala.inline
  def apply(name: String, sqlType: String, mapping: String = null): Anon_Mapping = {
    val __obj = js.Dynamic.literal(name = name, sqlType = sqlType)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[Anon_Mapping]
  }
}


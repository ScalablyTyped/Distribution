package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineGlobalFilter extends js.Object {
  var key: String
  var values: js.Array[String]
}

object PatchBaselineGlobalFilter {
  @scala.inline
  def apply(key: String, values: js.Array[String]): PatchBaselineGlobalFilter = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[PatchBaselineGlobalFilter]
  }
}


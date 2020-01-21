package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineGlobalFilter extends js.Object {
  var key: String = js.native
  var values: js.Array[String] = js.native
}

object PatchBaselineGlobalFilter {
  @scala.inline
  def apply(key: String, values: js.Array[String]): PatchBaselineGlobalFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchBaselineGlobalFilter]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Functions extends js.Object {
  var functions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Functions {
  @scala.inline
  def apply(functions: js.Array[java.lang.String] = null): Anon_Functions = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    __obj.asInstanceOf[Anon_Functions]
  }
}


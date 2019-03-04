package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclusions extends js.Object {
  var exclusions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var path: java.lang.String
}

object Anon_Exclusions {
  @scala.inline
  def apply(path: java.lang.String, exclusions: js.Array[java.lang.String] = null): Anon_Exclusions = {
    val __obj = js.Dynamic.literal(path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[Anon_Exclusions]
  }
}


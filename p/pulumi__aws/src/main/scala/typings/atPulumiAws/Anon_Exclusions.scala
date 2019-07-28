package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclusions extends js.Object {
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  var path: String
}

object Anon_Exclusions {
  @scala.inline
  def apply(path: String, exclusions: js.Array[String] = null): Anon_Exclusions = {
    val __obj = js.Dynamic.literal(path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[Anon_Exclusions]
  }
}


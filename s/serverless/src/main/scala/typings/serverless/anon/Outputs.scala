package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outputs extends js.Object {
  var Outputs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var Resources: StringDictionary[js.Any]
}

object Outputs {
  @scala.inline
  def apply(Resources: StringDictionary[js.Any], Outputs: StringDictionary[js.Any] = null): Outputs = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
}


package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var Outputs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var Resources: StringDictionary[js.Any]
}

object Anon_Key {
  @scala.inline
  def apply(Resources: StringDictionary[js.Any], Outputs: StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}


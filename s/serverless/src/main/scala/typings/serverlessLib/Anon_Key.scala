package typings
package serverlessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var Outputs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var Resources: js.Array[_]
}

object Anon_Key {
  @scala.inline
  def apply(Resources: js.Array[_], Outputs: org.scalablytyped.runtime.StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(Resources = Resources)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    __obj.asInstanceOf[Anon_Key]
  }
}


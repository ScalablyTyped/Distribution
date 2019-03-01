package typings
package atPulumiAwsLib.simpledbDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainState extends js.Object {
  /**
    * The name of the SimpleDB domain
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DomainState {
  @scala.inline
  def apply(name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): DomainState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}


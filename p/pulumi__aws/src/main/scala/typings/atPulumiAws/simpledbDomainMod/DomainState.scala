package typings.atPulumiAws.simpledbDomainMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainState extends js.Object {
  /**
    * The name of the SimpleDB domain
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object DomainState {
  @scala.inline
  def apply(name: Input[String] = null): DomainState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}


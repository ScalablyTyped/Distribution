package typings.pulumiAws.simpledbDomainMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * The name of the SimpleDB domain
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object DomainState {
  @scala.inline
  def apply(name: Input[String] = null): DomainState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}


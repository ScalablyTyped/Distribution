package typings.atPulumiAws.inspectorResourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupArgs extends js.Object {
  /**
    * The tags on your EC2 Instance.
    */
  val tags: Input[StringDictionary[_]] = js.native
}

object ResourceGroupArgs {
  @scala.inline
  def apply(tags: Input[StringDictionary[_]]): ResourceGroupArgs = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceGroupArgs]
  }
}


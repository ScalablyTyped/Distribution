package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerScope extends js.Object {
  /**
    * The scope description.
    */
  var scopeDescription: Input[String] = js.native
  /**
    * The scope name.
    */
  var scopeName: Input[String] = js.native
}

object ResourceServerScope {
  @scala.inline
  def apply(scopeDescription: Input[String], scopeName: Input[String]): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
}


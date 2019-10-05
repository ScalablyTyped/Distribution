package typings.atPulumiAws.typesInputMod.cognito

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerScope extends js.Object {
  /**
    * The scope description.
    */
  var scopeDescription: Input[String]
  /**
    * The scope name.
    */
  var scopeName: Input[String]
}

object ResourceServerScope {
  @scala.inline
  def apply(scopeDescription: Input[String], scopeName: Input[String]): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceServerScope]
  }
}


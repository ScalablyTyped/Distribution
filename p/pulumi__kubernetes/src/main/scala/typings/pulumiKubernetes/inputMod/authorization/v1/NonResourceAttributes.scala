package typings.pulumiKubernetes.inputMod.authorization.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource
  * requests to the Authorizer interface
  */
trait NonResourceAttributes extends js.Object {
  /**
    * Path is the URL path of the request
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  /**
    * Verb is the standard HTTP verb
    */
  var verb: js.UndefOr[Input[String]] = js.undefined
}

object NonResourceAttributes {
  @scala.inline
  def apply(path: Input[String] = null, verb: Input[String] = null): NonResourceAttributes = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceAttributes]
  }
}


package typings.atPulumiAws.cognitoResourceServerMod

import typings.atPulumiAws.typesInputMod.cognito.ResourceServerScope
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerArgs extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: Input[String] = js.native
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[ResourceServerScope]]]] = js.native
  val userPoolId: Input[String] = js.native
}

object ResourceServerArgs {
  @scala.inline
  def apply(
    identifier: Input[String],
    userPoolId: Input[String],
    name: Input[String] = null,
    scopes: Input[js.Array[Input[ResourceServerScope]]] = null
  ): ResourceServerArgs = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
}


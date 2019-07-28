package typings.atPulumiAws.cognitoResourceServerMod

import typings.atPulumiAws.Anon_ScopeDescriptionScopeName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerArgs extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: Input[String]
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[Anon_ScopeDescriptionScopeName]]]] = js.undefined
  val userPoolId: Input[String]
}

object ResourceServerArgs {
  @scala.inline
  def apply(
    identifier: Input[String],
    userPoolId: Input[String],
    name: Input[String] = null,
    scopes: Input[js.Array[Input[Anon_ScopeDescriptionScopeName]]] = null
  ): ResourceServerArgs = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
}


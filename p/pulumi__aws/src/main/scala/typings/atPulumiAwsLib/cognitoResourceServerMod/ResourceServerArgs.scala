package typings
package atPulumiAwsLib.cognitoResourceServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerArgs extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ScopeDescriptionScopeName]]
    ]
  ] = js.undefined
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ResourceServerArgs {
  @scala.inline
  def apply(
    identifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scopes: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ScopeDescriptionScopeName]]
    ] = null
  ): ResourceServerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
}


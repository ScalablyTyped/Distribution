package typings.atPulumiAws.cognitoResourceServerMod

import typings.atPulumiAws.Anon_ScopeDescriptionScopeName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerState extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of all scopes configured for this resource server in the format identifier/scope_name.
    */
  val scopeIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[Anon_ScopeDescriptionScopeName]]]] = js.undefined
  val userPoolId: js.UndefOr[Input[String]] = js.undefined
}

object ResourceServerState {
  @scala.inline
  def apply(
    identifier: Input[String] = null,
    name: Input[String] = null,
    scopeIdentifiers: Input[js.Array[Input[String]]] = null,
    scopes: Input[js.Array[Input[Anon_ScopeDescriptionScopeName]]] = null,
    userPoolId: Input[String] = null
  ): ResourceServerState = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopeIdentifiers != null) __obj.updateDynamic("scopeIdentifiers")(scopeIdentifiers.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (userPoolId != null) __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerState]
  }
}


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


package typings
package atPulumiAwsLib.cognitoIdentityPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolState extends js.Object {
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the identity pool.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ClientIdProviderName]]
    ]
  ] = js.undefined
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}


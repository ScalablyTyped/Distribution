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

object IdentityPoolState {
  @scala.inline
  def apply(
    allowUnauthenticatedIdentities: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cognitoIdentityProviders: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ClientIdProviderName]]
    ] = null,
    developerProviderName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    identityPoolName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    openidConnectProviderArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    samlProviderArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    supportedLoginProviders: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): IdentityPoolState = {
    val __obj = js.Dynamic.literal()
    if (allowUnauthenticatedIdentities != null) __obj.updateDynamic("allowUnauthenticatedIdentities")(allowUnauthenticatedIdentities.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cognitoIdentityProviders != null) __obj.updateDynamic("cognitoIdentityProviders")(cognitoIdentityProviders.asInstanceOf[js.Any])
    if (developerProviderName != null) __obj.updateDynamic("developerProviderName")(developerProviderName.asInstanceOf[js.Any])
    if (identityPoolName != null) __obj.updateDynamic("identityPoolName")(identityPoolName.asInstanceOf[js.Any])
    if (openidConnectProviderArns != null) __obj.updateDynamic("openidConnectProviderArns")(openidConnectProviderArns.asInstanceOf[js.Any])
    if (samlProviderArns != null) __obj.updateDynamic("samlProviderArns")(samlProviderArns.asInstanceOf[js.Any])
    if (supportedLoginProviders != null) __obj.updateDynamic("supportedLoginProviders")(supportedLoginProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolState]
  }
}


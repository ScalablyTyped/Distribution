package typings.atPulumiAws.cognitoIdentityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ClientIdProviderName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolState extends js.Object {
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The ARN of the identity pool.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[Input[js.Array[Input[Anon_ClientIdProviderName]]]] = js.undefined
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the Identity Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object IdentityPoolState {
  @scala.inline
  def apply(
    allowUnauthenticatedIdentities: Input[Boolean] = null,
    arn: Input[String] = null,
    cognitoIdentityProviders: Input[js.Array[Input[Anon_ClientIdProviderName]]] = null,
    developerProviderName: Input[String] = null,
    identityPoolName: Input[String] = null,
    openidConnectProviderArns: Input[js.Array[Input[String]]] = null,
    samlProviderArns: Input[js.Array[Input[String]]] = null,
    supportedLoginProviders: Input[StringDictionary[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
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
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolState]
  }
}


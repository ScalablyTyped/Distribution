package typings.pulumiAws.awsMixinsMod.pulumiAwsAugmentingMod.sdk

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "sdk.CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typings.awsSdk.mod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: typings.awsSdk.configBaseMod.ConfigurationOptions) = this()
}

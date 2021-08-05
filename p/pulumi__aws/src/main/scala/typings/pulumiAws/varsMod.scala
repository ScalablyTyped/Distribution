package typings.pulumiAws

import typings.pulumiAws.enumsMod.Region
import typings.pulumiAws.outputMod.config.AssumeRole
import typings.pulumiAws.outputMod.config.Endpoints
import typings.pulumiAws.outputMod.config.IgnoreTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varsMod {
  
  @JSImport("@pulumi/aws/config/vars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/config/vars", "accessKey")
  @js.native
  def accessKey: js.UndefOr[String] = js.native
  inline def accessKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "allowedAccountIds")
  @js.native
  def allowedAccountIds: js.UndefOr[js.Array[String]] = js.native
  inline def allowedAccountIds_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedAccountIds")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "assumeRole")
  @js.native
  def assumeRole: js.UndefOr[AssumeRole] = js.native
  inline def assumeRole_=(x: js.UndefOr[AssumeRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assumeRole")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "endpoints")
  @js.native
  def endpoints: js.UndefOr[js.Array[Endpoints]] = js.native
  inline def endpoints_=(x: js.UndefOr[js.Array[Endpoints]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "forbiddenAccountIds")
  @js.native
  def forbiddenAccountIds: js.UndefOr[js.Array[String]] = js.native
  inline def forbiddenAccountIds_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forbiddenAccountIds")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "ignoreTags")
  @js.native
  def ignoreTags: js.UndefOr[IgnoreTags] = js.native
  inline def ignoreTags_=(x: js.UndefOr[IgnoreTags]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "insecure")
  @js.native
  def insecure: js.UndefOr[Boolean] = js.native
  inline def insecure_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insecure")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "maxRetries")
  @js.native
  def maxRetries: js.UndefOr[Double] = js.native
  inline def maxRetries_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "profile")
  @js.native
  def profile: js.UndefOr[String] = js.native
  inline def profile_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "region")
  @js.native
  def region: js.UndefOr[Region] = js.native
  inline def region_=(x: js.UndefOr[Region]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("region")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "s3ForcePathStyle")
  @js.native
  def s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  inline def s3ForcePathStyle_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "secretKey")
  @js.native
  def secretKey: js.UndefOr[String] = js.native
  inline def secretKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "sharedCredentialsFile")
  @js.native
  def sharedCredentialsFile: js.UndefOr[String] = js.native
  inline def sharedCredentialsFile_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sharedCredentialsFile")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "skipCredentialsValidation")
  @js.native
  def skipCredentialsValidation: js.UndefOr[Boolean] = js.native
  inline def skipCredentialsValidation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipCredentialsValidation")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "skipGetEc2Platforms")
  @js.native
  def skipGetEc2Platforms: js.UndefOr[Boolean] = js.native
  inline def skipGetEc2Platforms_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipGetEc2Platforms")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "skipMetadataApiCheck")
  @js.native
  def skipMetadataApiCheck: js.UndefOr[Boolean] = js.native
  inline def skipMetadataApiCheck_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipMetadataApiCheck")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "skipRegionValidation")
  @js.native
  def skipRegionValidation: js.UndefOr[Boolean] = js.native
  inline def skipRegionValidation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRegionValidation")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "skipRequestingAccountId")
  @js.native
  def skipRequestingAccountId: js.UndefOr[Boolean] = js.native
  inline def skipRequestingAccountId_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRequestingAccountId")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/config/vars", "token")
  @js.native
  def token: js.UndefOr[String] = js.native
  inline def token_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token")(x.asInstanceOf[js.Any])
}

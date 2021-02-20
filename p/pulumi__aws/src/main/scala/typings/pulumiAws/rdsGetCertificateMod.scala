package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetCertificateMod {
  
  @JSImport("@pulumi/aws/rds/getCertificate", "getCertificate")
  @js.native
  def getCertificate(): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds/getCertificate", "getCertificate")
  @js.native
  def getCertificate(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds/getCertificate", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/rds/getCertificate", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  
  @js.native
  trait GetCertificateArgs extends StObject {
    
    /**
      * Certificate identifier. For example, `rds-ca-2019`.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * When enabled, returns the certificate with the latest `ValidTill`.
      */
    val latestValidTill: js.UndefOr[Boolean] = js.native
  }
  object GetCertificateArgs {
    
    @scala.inline
    def apply(): GetCertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateArgs]
    }
    
    @scala.inline
    implicit class GetCertificateArgsMutableBuilder[Self <: GetCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLatestValidTill(value: Boolean): Self = StObject.set(x, "latestValidTill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestValidTillUndefined: Self = StObject.set(x, "latestValidTill", js.undefined)
    }
  }
  
  @js.native
  trait GetCertificateResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the certificate.
      */
    val arn: String = js.native
    
    /**
      * Type of certificate. For example, `CA`.
      */
    val certificateType: String = js.native
    
    /**
      * Boolean whether there is an override for the default certificate identifier.
      */
    val customerOverride: Boolean = js.native
    
    /**
      * If there is an override for the default certificate identifier, when the override expires.
      */
    val customerOverrideValidTill: String = js.native
    
    val id: String = js.native
    
    val latestValidTill: js.UndefOr[Boolean] = js.native
    
    /**
      * Thumbprint of the certificate.
      */
    val thumbprint: String = js.native
    
    /**
      * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate starting validity date.
      */
    val validFrom: String = js.native
    
    /**
      * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate ending validity date.
      */
    val validTill: String = js.native
  }
  object GetCertificateResult {
    
    @scala.inline
    def apply(
      arn: String,
      certificateType: String,
      customerOverride: Boolean,
      customerOverrideValidTill: String,
      id: String,
      thumbprint: String,
      validFrom: String,
      validTill: String
    ): GetCertificateResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateType = certificateType.asInstanceOf[js.Any], customerOverride = customerOverride.asInstanceOf[js.Any], customerOverrideValidTill = customerOverrideValidTill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validTill = validTill.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateResult]
    }
    
    @scala.inline
    implicit class GetCertificateResultMutableBuilder[Self <: GetCertificateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateType(value: String): Self = StObject.set(x, "certificateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerOverride(value: Boolean): Self = StObject.set(x, "customerOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerOverrideValidTill(value: String): Self = StObject.set(x, "customerOverrideValidTill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestValidTill(value: Boolean): Self = StObject.set(x, "latestValidTill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestValidTillUndefined: Self = StObject.set(x, "latestValidTill", js.undefined)
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidFrom(value: String): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidTill(value: String): Self = StObject.set(x, "validTill", value.asInstanceOf[js.Any])
    }
  }
}

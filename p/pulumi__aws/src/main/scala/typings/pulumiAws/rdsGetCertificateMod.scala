package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetCertificateMod {
  
  @JSImport("@pulumi/aws/rds/getCertificate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCertificate(): js.Promise[GetCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")().asInstanceOf[js.Promise[GetCertificateResult]]
  inline def getCertificate(args: Unit, opts: InvokeOptions): js.Promise[GetCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateResult]]
  inline def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCertificateResult]]
  inline def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateResult]]
  
  trait GetCertificateArgs extends StObject {
    
    /**
      * Certificate identifier. For example, `rds-ca-2019`.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled, returns the certificate with the latest `ValidTill`.
      */
    val latestValidTill: js.UndefOr[Boolean] = js.undefined
  }
  object GetCertificateArgs {
    
    inline def apply(): GetCertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateArgs]
    }
    
    extension [Self <: GetCertificateArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLatestValidTill(value: Boolean): Self = StObject.set(x, "latestValidTill", value.asInstanceOf[js.Any])
      
      inline def setLatestValidTillUndefined: Self = StObject.set(x, "latestValidTill", js.undefined)
    }
  }
  
  trait GetCertificateResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the certificate.
      */
    val arn: String
    
    /**
      * Type of certificate. For example, `CA`.
      */
    val certificateType: String
    
    /**
      * Boolean whether there is an override for the default certificate identifier.
      */
    val customerOverride: Boolean
    
    /**
      * If there is an override for the default certificate identifier, when the override expires.
      */
    val customerOverrideValidTill: String
    
    val id: String
    
    val latestValidTill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Thumbprint of the certificate.
      */
    val thumbprint: String
    
    /**
      * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate starting validity date.
      */
    val validFrom: String
    
    /**
      * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate ending validity date.
      */
    val validTill: String
  }
  object GetCertificateResult {
    
    inline def apply(
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
    
    extension [Self <: GetCertificateResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCertificateType(value: String): Self = StObject.set(x, "certificateType", value.asInstanceOf[js.Any])
      
      inline def setCustomerOverride(value: Boolean): Self = StObject.set(x, "customerOverride", value.asInstanceOf[js.Any])
      
      inline def setCustomerOverrideValidTill(value: String): Self = StObject.set(x, "customerOverrideValidTill", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatestValidTill(value: Boolean): Self = StObject.set(x, "latestValidTill", value.asInstanceOf[js.Any])
      
      inline def setLatestValidTillUndefined: Self = StObject.set(x, "latestValidTill", js.undefined)
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setValidFrom(value: String): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      inline def setValidTill(value: String): Self = StObject.set(x, "validTill", value.asInstanceOf[js.Any])
    }
  }
}

package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCertificateMod {
  
  @JSImport("@pulumi/aws/acm/getCertificate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCertificateResult]]
  @scala.inline
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateResult]]
  
  trait GetCertificateArgs extends StObject {
    
    /**
      * The domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
      */
    val domain: String
    
    /**
      * A list of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. Valid values are `RSA_1024`, `RSA_2048`, `RSA_4096`, `EC_prime256v1`, `EC_secp384r1`, and `EC_secp521r1`.
      */
    val keyTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
      */
    val mostRecent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
      * `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
      * are returned.
      */
    val statuses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A mapping of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * A list of types on which to filter the returned list. Valid values are `AMAZON_ISSUED` and `IMPORTED`.
      */
    val types: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetCertificateArgs {
    
    @scala.inline
    def apply(domain: String): GetCertificateArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateArgs]
    }
    
    @scala.inline
    implicit class GetCertificateArgsMutableBuilder[Self <: GetCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypes(value: js.Array[String]): Self = StObject.set(x, "keyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypesUndefined: Self = StObject.set(x, "keyTypes", js.undefined)
      
      @scala.inline
      def setKeyTypesVarargs(value: String*): Self = StObject.set(x, "keyTypes", js.Array(value :_*))
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setStatuses(value: js.Array[String]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      @scala.inline
      def setStatusesVarargs(value: String*): Self = StObject.set(x, "statuses", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  trait GetCertificateResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the found certificate, suitable for referencing in other resources that support ACM certificates.
      */
    val arn: String
    
    val domain: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val keyTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    val mostRecent: js.UndefOr[Boolean] = js.undefined
    
    val statuses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A mapping of tags for the resource.
      */
    val tags: StringDictionary[String]
    
    val types: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetCertificateResult {
    
    @scala.inline
    def apply(arn: String, domain: String, id: String, tags: StringDictionary[String]): GetCertificateResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateResult]
    }
    
    @scala.inline
    implicit class GetCertificateResultMutableBuilder[Self <: GetCertificateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypes(value: js.Array[String]): Self = StObject.set(x, "keyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypesUndefined: Self = StObject.set(x, "keyTypes", js.undefined)
      
      @scala.inline
      def setKeyTypesVarargs(value: String*): Self = StObject.set(x, "keyTypes", js.Array(value :_*))
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setStatuses(value: js.Array[String]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      @scala.inline
      def setStatusesVarargs(value: String*): Self = StObject.set(x, "statuses", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}

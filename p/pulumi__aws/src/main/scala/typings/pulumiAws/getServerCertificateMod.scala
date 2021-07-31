package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerCertificateMod {
  
  @JSImport("@pulumi/aws/iam/getServerCertificate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getServerCertificate(): js.Promise[GetServerCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")().asInstanceOf[js.Promise[GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: Unit, opts: InvokeOptions): js.Promise[GetServerCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServerCertificateResult]]
  
  trait GetServerCertificateArgs extends StObject {
    
    /**
      * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
      */
    val latest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * exact name of the cert to lookup
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * prefix of cert to filter by
      */
    val namePrefix: js.UndefOr[String] = js.undefined
    
    /**
      * prefix of path to filter by
      */
    val pathPrefix: js.UndefOr[String] = js.undefined
  }
  object GetServerCertificateArgs {
    
    @scala.inline
    def apply(): GetServerCertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerCertificateArgs]
    }
    
    @scala.inline
    implicit class GetServerCertificateArgsMutableBuilder[Self <: GetServerCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
    }
  }
  
  trait GetServerCertificateResult extends StObject {
    
    val arn: String
    
    val certificateBody: String
    
    val certificateChain: String
    
    val expirationDate: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val latest: js.UndefOr[Boolean] = js.undefined
    
    val name: String
    
    val namePrefix: js.UndefOr[String] = js.undefined
    
    val path: String
    
    val pathPrefix: js.UndefOr[String] = js.undefined
    
    val uploadDate: String
  }
  object GetServerCertificateResult {
    
    @scala.inline
    def apply(
      arn: String,
      certificateBody: String,
      certificateChain: String,
      expirationDate: String,
      id: String,
      name: String,
      path: String,
      uploadDate: String
    ): GetServerCertificateResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerCertificateResult]
    }
    
    @scala.inline
    implicit class GetServerCertificateResultMutableBuilder[Self <: GetServerCertificateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBody(value: String): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
    }
  }
}

package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRepositoryMod {
  
  @JSImport("@pulumi/aws/codecommit/getRepository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRepositoryResult]]
  @scala.inline
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRepositoryResult]]
  
  trait GetRepositoryArgs extends StObject {
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: String
  }
  object GetRepositoryArgs {
    
    @scala.inline
    def apply(repositoryName: String): GetRepositoryArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryArgs]
    }
    
    @scala.inline
    implicit class GetRepositoryArgsMutableBuilder[Self <: GetRepositoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRepositoryResult extends StObject {
    
    /**
      * The ARN of the repository
      */
    val arn: String
    
    /**
      * The URL to use for cloning the repository over HTTPS.
      */
    val cloneUrlHttp: String
    
    /**
      * The URL to use for cloning the repository over SSH.
      */
    val cloneUrlSsh: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ID of the repository
      */
    val repositoryId: String
    
    val repositoryName: String
  }
  object GetRepositoryResult {
    
    @scala.inline
    def apply(
      arn: String,
      cloneUrlHttp: String,
      cloneUrlSsh: String,
      id: String,
      repositoryId: String,
      repositoryName: String
    ): GetRepositoryResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cloneUrlHttp = cloneUrlHttp.asInstanceOf[js.Any], cloneUrlSsh = cloneUrlSsh.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryResult]
    }
    
    @scala.inline
    implicit class GetRepositoryResultMutableBuilder[Self <: GetRepositoryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlHttp(value: String): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlSsh(value: String): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}

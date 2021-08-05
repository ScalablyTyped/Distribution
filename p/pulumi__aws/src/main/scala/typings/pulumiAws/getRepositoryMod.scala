package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRepositoryMod {
  
  @JSImport("@pulumi/aws/codecommit/getRepository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRepositoryResult]]
  inline def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRepositoryResult]]
  
  trait GetRepositoryArgs extends StObject {
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: String
  }
  object GetRepositoryArgs {
    
    inline def apply(repositoryName: String): GetRepositoryArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryArgs]
    }
    
    extension [Self <: GetRepositoryArgs](x: Self) {
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
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
    
    inline def apply(
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
    
    extension [Self <: GetRepositoryResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCloneUrlHttp(value: String): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
      
      inline def setCloneUrlSsh(value: String): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}

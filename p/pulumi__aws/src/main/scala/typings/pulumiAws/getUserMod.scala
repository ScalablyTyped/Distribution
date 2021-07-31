package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUserMod {
  
  @JSImport("@pulumi/aws/iam/getUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getUser(args: GetUserArgs): js.Promise[GetUserResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUserResult]]
  @scala.inline
  def getUser(args: GetUserArgs, opts: InvokeOptions): js.Promise[GetUserResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUserResult]]
  
  trait GetUserArgs extends StObject {
    
    /**
      * The friendly IAM user name to match.
      */
    val userName: String
  }
  object GetUserArgs {
    
    @scala.inline
    def apply(userName: String): GetUserArgs = {
      val __obj = js.Dynamic.literal(userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserArgs]
    }
    
    @scala.inline
    implicit class GetUserArgsMutableBuilder[Self <: GetUserArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUserResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS for this user.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Path in which this user was created.
      */
    val path: String
    
    /**
      * The ARN of the policy that is used to set the permissions boundary for the user.
      */
    val permissionsBoundary: String
    
    /**
      * The unique ID assigned by AWS for this user.
      */
    val userId: String
    
    /**
      * The name associated to this User
      */
    val userName: String
  }
  object GetUserResult {
    
    @scala.inline
    def apply(
      arn: String,
      id: String,
      path: String,
      permissionsBoundary: String,
      userId: String,
      userName: String
    ): GetUserResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permissionsBoundary = permissionsBoundary.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUserResult]
    }
    
    @scala.inline
    implicit class GetUserResultMutableBuilder[Self <: GetUserResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsBoundary(value: String): Self = StObject.set(x, "permissionsBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
}

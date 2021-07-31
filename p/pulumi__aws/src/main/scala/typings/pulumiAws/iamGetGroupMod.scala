package typings.pulumiAws

import typings.pulumiAws.outputMod.iam.GetGroupUser
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamGetGroupMod {
  
  @JSImport("@pulumi/aws/iam/getGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetGroupResult]]
  @scala.inline
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetGroupResult]]
  
  trait GetGroupArgs extends StObject {
    
    /**
      * The friendly IAM group name to match.
      */
    val groupName: String
  }
  object GetGroupArgs {
    
    @scala.inline
    def apply(groupName: String): GetGroupArgs = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroupArgs]
    }
    
    @scala.inline
    implicit class GetGroupArgsMutableBuilder[Self <: GetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetGroupResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the iam user.
      */
    val arn: String
    
    /**
      * The stable and unique string identifying the group.
      */
    val groupId: String
    
    val groupName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The path to the iam user.
      */
    val path: String
    
    /**
      * List of objects containing group member information. See supported fields below.
      */
    val users: js.Array[GetGroupUser]
  }
  object GetGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      groupId: String,
      groupName: String,
      id: String,
      path: String,
      users: js.Array[GetGroupUser]
    ): GetGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroupResult]
    }
    
    @scala.inline
    implicit class GetGroupResultMutableBuilder[Self <: GetGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[GetGroupUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: GetGroupUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}

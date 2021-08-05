package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceProfileMod {
  
  @JSImport("@pulumi/aws/iam/getInstanceProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstanceProfile(args: GetInstanceProfileArgs): js.Promise[GetInstanceProfileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceProfileResult]]
  inline def getInstanceProfile(args: GetInstanceProfileArgs, opts: InvokeOptions): js.Promise[GetInstanceProfileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceProfileResult]]
  
  trait GetInstanceProfileArgs extends StObject {
    
    /**
      * The friendly IAM instance profile name to match.
      */
    val name: String
  }
  object GetInstanceProfileArgs {
    
    inline def apply(name: String): GetInstanceProfileArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceProfileArgs]
    }
    
    extension [Self <: GetInstanceProfileArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetInstanceProfileResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the instance profile.
      */
    val arn: String
    
    /**
      * The string representation of the date the instance profile
      * was created.
      */
    val createDate: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * The path to the instance profile.
      */
    val path: String
    
    /**
      * The role arn associated with this instance profile.
      */
    val roleArn: String
    
    /**
      * The role id associated with this instance profile.
      */
    val roleId: String
    
    /**
      * The role name associated with this instance profile.
      */
    val roleName: String
  }
  object GetInstanceProfileResult {
    
    inline def apply(
      arn: String,
      createDate: String,
      id: String,
      name: String,
      path: String,
      roleArn: String,
      roleId: String,
      roleName: String
    ): GetInstanceProfileResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceProfileResult]
    }
    
    extension [Self <: GetInstanceProfileResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
      
      inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    }
  }
}

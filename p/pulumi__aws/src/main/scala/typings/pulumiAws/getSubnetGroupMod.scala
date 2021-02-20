package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubnetGroupMod {
  
  @JSImport("@pulumi/aws/rds/getSubnetGroup", "getSubnetGroup")
  @js.native
  def getSubnetGroup(args: GetSubnetGroupArgs): js.Promise[GetSubnetGroupResult] = js.native
  @JSImport("@pulumi/aws/rds/getSubnetGroup", "getSubnetGroup")
  @js.native
  def getSubnetGroup(args: GetSubnetGroupArgs, opts: InvokeOptions): js.Promise[GetSubnetGroupResult] = js.native
  
  @js.native
  trait GetSubnetGroupArgs extends StObject {
    
    /**
      * The name of the RDS database subnet group.
      */
    val name: String = js.native
  }
  object GetSubnetGroupArgs {
    
    @scala.inline
    def apply(name: String): GetSubnetGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubnetGroupArgs]
    }
    
    @scala.inline
    implicit class GetSubnetGroupArgsMutableBuilder[Self <: GetSubnetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSubnetGroupResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the DB subnet group.
      */
    val arn: String = js.native
    
    /**
      * Provides the description of the DB subnet group.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * Provides the status of the DB subnet group.
      */
    val status: String = js.native
    
    /**
      * Contains a list of subnet identifiers.
      */
    val subnetIds: js.Array[String] = js.native
    
    /**
      * Provides the VPC ID of the subnet group.
      */
    val vpcId: String = js.native
  }
  object GetSubnetGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      description: String,
      id: String,
      name: String,
      status: String,
      subnetIds: js.Array[String],
      vpcId: String
    ): GetSubnetGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubnetGroupResult]
    }
    
    @scala.inline
    implicit class GetSubnetGroupResultMutableBuilder[Self <: GetSubnetGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}

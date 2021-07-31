package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSecurityGroupFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecurityGroupMod {
  
  @JSImport("@pulumi/aws/ec2/getSecurityGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSecurityGroup(): js.Promise[GetSecurityGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")().asInstanceOf[js.Promise[GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(args: Unit, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecurityGroupResult]]
  
  trait GetSecurityGroupArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetSecurityGroupFilter]] = js.undefined
    
    /**
      * The id of the specific security group to retrieve.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired security group.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The id of the VPC that the desired security group belongs to.
      */
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetSecurityGroupArgs {
    
    @scala.inline
    def apply(): GetSecurityGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSecurityGroupArgs]
    }
    
    @scala.inline
    implicit class GetSecurityGroupArgsMutableBuilder[Self <: GetSecurityGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSecurityGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSecurityGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait GetSecurityGroupResult extends StObject {
    
    /**
      * The computed ARN of the security group.
      */
    val arn: String
    
    /**
      * The description of the security group.
      */
    val description: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSecurityGroupFilter]] = js.undefined
    
    val id: String
    
    val name: String
    
    val tags: StringDictionary[String]
    
    val vpcId: String
  }
  object GetSecurityGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      description: String,
      id: String,
      name: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetSecurityGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecurityGroupResult]
    }
    
    @scala.inline
    implicit class GetSecurityGroupResultMutableBuilder[Self <: GetSecurityGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSecurityGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSecurityGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}

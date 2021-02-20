package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetRouteTableFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  
  @js.native
  trait GetRouteTableArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
    
    /**
      * Identifier of the EC2 Transit Gateway Route Table.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetRouteTableArgs {
    
    @scala.inline
    def apply(): GetRouteTableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRouteTableArgs]
    }
    
    @scala.inline
    implicit class GetRouteTableArgsMutableBuilder[Self <: GetRouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetRouteTableResult extends StObject {
    
    /**
      * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
      */
    val arn: String = js.native
    
    /**
      * Boolean whether this is the default association route table for the EC2 Transit Gateway
      */
    val defaultAssociationRouteTable: Boolean = js.native
    
    /**
      * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
      */
    val defaultPropagationRouteTable: Boolean = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter]] = js.native
    
    /**
      * EC2 Transit Gateway Route Table identifier
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * EC2 Transit Gateway identifier
      */
    val transitGatewayId: String = js.native
  }
  object GetRouteTableResult {
    
    @scala.inline
    def apply(
      arn: String,
      defaultAssociationRouteTable: Boolean,
      defaultPropagationRouteTable: Boolean,
      tags: StringDictionary[String],
      transitGatewayId: String
    ): GetRouteTableResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], defaultAssociationRouteTable = defaultAssociationRouteTable.asInstanceOf[js.Any], defaultPropagationRouteTable = defaultPropagationRouteTable.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteTableResult]
    }
    
    @scala.inline
    implicit class GetRouteTableResultMutableBuilder[Self <: GetRouteTableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAssociationRouteTable(value: Boolean): Self = StObject.set(x, "defaultAssociationRouteTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPropagationRouteTable(value: Boolean): Self = StObject.set(x, "defaultPropagationRouteTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
}

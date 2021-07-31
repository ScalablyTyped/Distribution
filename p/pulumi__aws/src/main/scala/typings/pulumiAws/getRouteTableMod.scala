package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetRouteTableFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getRouteTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRouteTable(): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")().asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: Unit, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  
  trait GetRouteTableArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.undefined
    
    /**
      * Identifier of the EC2 Transit Gateway Route Table.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
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
  
  trait GetRouteTableResult extends StObject {
    
    /**
      * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
      */
    val arn: String
    
    /**
      * Boolean whether this is the default association route table for the EC2 Transit Gateway
      */
    val defaultAssociationRouteTable: Boolean
    
    /**
      * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
      */
    val defaultPropagationRouteTable: Boolean
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter]] = js.undefined
    
    /**
      * EC2 Transit Gateway Route Table identifier
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table
      */
    val tags: StringDictionary[String]
    
    /**
      * EC2 Transit Gateway identifier
      */
    val transitGatewayId: String
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

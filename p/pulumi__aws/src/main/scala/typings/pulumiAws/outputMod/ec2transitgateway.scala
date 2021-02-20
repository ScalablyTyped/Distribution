package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2transitgateway {
  
  @js.native
  trait GetDirectConnectGatewayAttachmentFilter extends StObject {
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
      */
    var name: String = js.native
    
    /**
      * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
      */
    var values: js.Array[String] = js.native
  }
  object GetDirectConnectGatewayAttachmentFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetDirectConnectGatewayAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectConnectGatewayAttachmentFilter]
    }
    
    @scala.inline
    implicit class GetDirectConnectGatewayAttachmentFilterMutableBuilder[Self <: GetDirectConnectGatewayAttachmentFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetPeeringAttachmentFilter extends StObject {
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayPeeringAttachments.html).
      */
    var name: String = js.native
    
    /**
      * Set of values that are accepted for the given field.
      * An EC2 Transit Gateway Peering Attachment be selected if any one of the given values matches.
      */
    var values: js.Array[String] = js.native
  }
  object GetPeeringAttachmentFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetPeeringAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPeeringAttachmentFilter]
    }
    
    @scala.inline
    implicit class GetPeeringAttachmentFilterMutableBuilder[Self <: GetPeeringAttachmentFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetRouteTableFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String = js.native
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String] = js.native
  }
  object GetRouteTableFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetRouteTableFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteTableFilter]
    }
    
    @scala.inline
    implicit class GetRouteTableFilterMutableBuilder[Self <: GetRouteTableFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetTransitGatewayFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String = js.native
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String] = js.native
  }
  object GetTransitGatewayFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetTransitGatewayFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTransitGatewayFilter]
    }
    
    @scala.inline
    implicit class GetTransitGatewayFilterMutableBuilder[Self <: GetTransitGatewayFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetVpcAttachmentFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String = js.native
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String] = js.native
  }
  object GetVpcAttachmentFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetVpcAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcAttachmentFilter]
    }
    
    @scala.inline
    implicit class GetVpcAttachmentFilterMutableBuilder[Self <: GetVpcAttachmentFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetVpnAttachmentFilter extends StObject {
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
      */
    var name: String = js.native
    
    /**
      * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
      */
    var values: js.Array[String] = js.native
  }
  object GetVpnAttachmentFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetVpnAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpnAttachmentFilter]
    }
    
    @scala.inline
    implicit class GetVpnAttachmentFilterMutableBuilder[Self <: GetVpnAttachmentFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}

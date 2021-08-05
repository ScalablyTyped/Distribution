package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2transitgateway {
  
  trait GetDirectConnectGatewayAttachmentFilter extends StObject {
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
      */
    var name: String
    
    /**
      * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
      */
    var values: js.Array[String]
  }
  object GetDirectConnectGatewayAttachmentFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetDirectConnectGatewayAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectConnectGatewayAttachmentFilter]
    }
    
    extension [Self <: GetDirectConnectGatewayAttachmentFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetPeeringAttachmentFilter extends StObject {
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayPeeringAttachments.html).
      */
    var name: String
    
    /**
      * Set of values that are accepted for the given field.
      * An EC2 Transit Gateway Peering Attachment be selected if any one of the given values matches.
      */
    var values: js.Array[String]
  }
  object GetPeeringAttachmentFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetPeeringAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPeeringAttachmentFilter]
    }
    
    extension [Self <: GetPeeringAttachmentFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetRouteTableFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String]
  }
  object GetRouteTableFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetRouteTableFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteTableFilter]
    }
    
    extension [Self <: GetRouteTableFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetTransitGatewayFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String]
  }
  object GetTransitGatewayFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetTransitGatewayFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTransitGatewayFilter]
    }
    
    extension [Self <: GetTransitGatewayFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetVpcAttachmentFilter extends StObject {
    
    /**
      * Name of the filter.
      */
    var name: String
    
    /**
      * List of one or more values for the filter.
      */
    var values: js.Array[String]
  }
  object GetVpcAttachmentFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetVpcAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcAttachmentFilter]
    }
    
    extension [Self <: GetVpcAttachmentFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetVpnAttachmentFilter extends StObject {
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
      */
    var name: String
    
    /**
      * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
      */
    var values: js.Array[String]
  }
  object GetVpnAttachmentFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetVpnAttachmentFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpnAttachmentFilter]
    }
    
    extension [Self <: GetVpnAttachmentFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}

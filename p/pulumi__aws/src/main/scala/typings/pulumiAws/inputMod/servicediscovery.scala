package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicediscovery {
  
  trait ServiceDnsConfig extends StObject {
    
    /**
      * An array that contains one DnsRecord object for each resource record set.
      */
    var dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]]
    
    /**
      * The ID of the namespace to use for DNS configuration.
      */
    var namespaceId: Input[String]
    
    /**
      * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
      */
    var routingPolicy: js.UndefOr[Input[String]] = js.undefined
  }
  object ServiceDnsConfig {
    
    inline def apply(dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]], namespaceId: Input[String]): ServiceDnsConfig = {
      val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDnsConfig]
    }
    
    extension [Self <: ServiceDnsConfig](x: Self) {
      
      inline def setDnsRecords(value: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]]): Self = StObject.set(x, "dnsRecords", value.asInstanceOf[js.Any])
      
      inline def setDnsRecordsVarargs(value: Input[ServiceDnsConfigDnsRecord]*): Self = StObject.set(x, "dnsRecords", js.Array(value :_*))
      
      inline def setNamespaceId(value: Input[String]): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
      
      inline def setRoutingPolicy(value: Input[String]): Self = StObject.set(x, "routingPolicy", value.asInstanceOf[js.Any])
      
      inline def setRoutingPolicyUndefined: Self = StObject.set(x, "routingPolicy", js.undefined)
    }
  }
  
  trait ServiceDnsConfigDnsRecord extends StObject {
    
    /**
      * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
      */
    var ttl: Input[Double]
    
    /**
      * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
      */
    var `type`: Input[String]
  }
  object ServiceDnsConfigDnsRecord {
    
    inline def apply(ttl: Input[Double], `type`: Input[String]): ServiceDnsConfigDnsRecord = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDnsConfigDnsRecord]
    }
    
    extension [Self <: ServiceDnsConfigDnsRecord](x: Self) {
      
      inline def setTtl(value: Input[Double]): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceHealthCheckConfig extends StObject {
    
    /**
      * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
      */
    var failureThreshold: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don't specify a value, the default value is /.
      */
    var resourcePath: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
      */
    var `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object ServiceHealthCheckConfig {
    
    inline def apply(): ServiceHealthCheckConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceHealthCheckConfig]
    }
    
    extension [Self <: ServiceHealthCheckConfig](x: Self) {
      
      inline def setFailureThreshold(value: Input[Double]): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      inline def setResourcePath(value: Input[String]): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      inline def setResourcePathUndefined: Self = StObject.set(x, "resourcePath", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ServiceHealthCheckCustomConfig extends StObject {
    
    /**
      * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
      */
    var failureThreshold: js.UndefOr[Input[Double]] = js.undefined
  }
  object ServiceHealthCheckCustomConfig {
    
    inline def apply(): ServiceHealthCheckCustomConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceHealthCheckCustomConfig]
    }
    
    extension [Self <: ServiceHealthCheckCustomConfig](x: Self) {
      
      inline def setFailureThreshold(value: Input[Double]): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    }
  }
}

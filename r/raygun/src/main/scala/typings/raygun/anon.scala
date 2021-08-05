package typings.raygun

import typings.raygun.typesMod.BuiltError
import typings.raygun.typesMod.CustomData
import typings.raygun.typesMod.Environment
import typings.raygun.typesMod.HTTPOptions
import typings.raygun.typesMod.RequestDetails
import typings.raygun.typesMod.Tag
import typings.raygun.typesMod.UserDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Host extends StObject {
    
    var host: String
  }
  object Host {
    
    inline def apply(host: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hostname extends StObject {
    
    var hostname: String
  }
  object Hostname {
    
    inline def apply(hostname: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    extension [Self <: Hostname](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpOptions extends StObject {
    
    var httpOptions: HTTPOptions
    
    var interval: Double
  }
  object HttpOptions {
    
    inline def apply(httpOptions: HTTPOptions, interval: Double): HttpOptions = {
      val __obj = js.Dynamic.literal(httpOptions = httpOptions.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOptions]
    }
    
    extension [Self <: HttpOptions](x: Self) {
      
      inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<raygun.raygun/build/types.MessageDetails> */
  trait PartialMessageDetails extends StObject {
    
    var client: js.UndefOr[Name] = js.undefined
    
    var correlationId: js.UndefOr[String | Null] = js.undefined
    
    var environment: js.UndefOr[Environment] = js.undefined
    
    var error: js.UndefOr[BuiltError] = js.undefined
    
    var groupingKey: js.UndefOr[String | Null] = js.undefined
    
    var machineName: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[RequestDetails] = js.undefined
    
    var tags: js.UndefOr[js.Array[Tag]] = js.undefined
    
    var user: js.UndefOr[UserDetails] = js.undefined
    
    var userCustomData: js.UndefOr[CustomData] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PartialMessageDetails {
    
    inline def apply(): PartialMessageDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessageDetails]
    }
    
    extension [Self <: PartialMessageDetails](x: Self) {
      
      inline def setClient(value: Name): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setError(value: BuiltError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGroupingKey(value: String): Self = StObject.set(x, "groupingKey", value.asInstanceOf[js.Any])
      
      inline def setGroupingKeyNull: Self = StObject.set(x, "groupingKey", null)
      
      inline def setGroupingKeyUndefined: Self = StObject.set(x, "groupingKey", js.undefined)
      
      inline def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
      
      inline def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
      
      inline def setRequest(value: RequestDetails): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setUser(value: UserDetails): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserCustomData(value: CustomData): Self = StObject.set(x, "userCustomData", value.asInstanceOf[js.Any])
      
      inline def setUserCustomDataUndefined: Self = StObject.set(x, "userCustomData", js.undefined)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}

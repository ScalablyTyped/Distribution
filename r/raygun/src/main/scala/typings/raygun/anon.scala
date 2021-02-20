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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hostname extends StObject {
    
    var hostname: String = js.native
  }
  object Hostname {
    
    @scala.inline
    def apply(hostname: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpOptions extends StObject {
    
    var httpOptions: HTTPOptions = js.native
    
    var interval: Double = js.native
  }
  object HttpOptions {
    
    @scala.inline
    def apply(httpOptions: HTTPOptions, interval: Double): HttpOptions = {
      val __obj = js.Dynamic.literal(httpOptions = httpOptions.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit class HttpOptionsMutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<raygun.raygun/build/types.MessageDetails> */
  @js.native
  trait PartialMessageDetails extends StObject {
    
    var client: js.UndefOr[Name] = js.native
    
    var correlationId: js.UndefOr[String | Null] = js.native
    
    var environment: js.UndefOr[Environment] = js.native
    
    var error: js.UndefOr[BuiltError] = js.native
    
    var groupingKey: js.UndefOr[String | Null] = js.native
    
    var machineName: js.UndefOr[String] = js.native
    
    var request: js.UndefOr[RequestDetails] = js.native
    
    var tags: js.UndefOr[js.Array[Tag]] = js.native
    
    var user: js.UndefOr[UserDetails] = js.native
    
    var userCustomData: js.UndefOr[CustomData] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object PartialMessageDetails {
    
    @scala.inline
    def apply(): PartialMessageDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessageDetails]
    }
    
    @scala.inline
    implicit class PartialMessageDetailsMutableBuilder[Self <: PartialMessageDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Name): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setError(value: BuiltError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setGroupingKey(value: String): Self = StObject.set(x, "groupingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingKeyNull: Self = StObject.set(x, "groupingKey", null)
      
      @scala.inline
      def setGroupingKeyUndefined: Self = StObject.set(x, "groupingKey", js.undefined)
      
      @scala.inline
      def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestDetails): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: UserDetails): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCustomData(value: CustomData): Self = StObject.set(x, "userCustomData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCustomDataUndefined: Self = StObject.set(x, "userCustomData", js.undefined)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}

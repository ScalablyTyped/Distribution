package typings.sapXsenv

import org.scalablytyped.runtime.StringDictionary
import typings.sapXsenv.anon.DisableCache
import typings.sapXsenv.anon.Label
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sap/xsenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cfServiceCredentials(filter: ServiceQuery): ServiceCredentials_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cfServiceCredentials")(filter.asInstanceOf[js.Any]).asInstanceOf[ServiceCredentials_]
  
  inline def filterCFServices(filter: ServiceQuery): js.Array[ServiceBinding[ServiceCredentials_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterCFServices")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[ServiceBinding[ServiceCredentials_]]]
  
  inline def filterServices(filter: ServiceQuery): js.Array[ServiceBinding[ServiceCredentials_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterServices")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[ServiceBinding[ServiceCredentials_]]]
  inline def filterServices(path: String, filter: ServiceQuery): js.Array[ServiceBinding[ServiceCredentials_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterServices")(path.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[ServiceBinding[ServiceCredentials_]]]
  
  inline def getServices[T /* <: Record[String, Any] */](path: String, query: Record[/* keyof T */ String, ServiceQuery]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(path.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getServices[T /* <: Record[String, Any] */](path: String, query: Record[/* keyof T */ String, ServiceQuery], servicesFile: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(path.asInstanceOf[js.Any], query.asInstanceOf[js.Any], servicesFile.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getServices[T /* <: Record[String, Any] */](query: Record[/* keyof T */ String, ServiceQuery]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(query.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def getServices[T /* <: Record[String, Any] */](query: Record[/* keyof T */ String, ServiceQuery], servicesFile: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(query.asInstanceOf[js.Any], servicesFile.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def loadCertificates(): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCertificates")().asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def loadCertificates(certPath: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCertificates")(certPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def loadEnv(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")().asInstanceOf[Unit]
  inline def loadEnv(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readCFServices(): Record[String, ServiceBinding[ServiceCredentials_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readCFServices")().asInstanceOf[Record[String, ServiceBinding[ServiceCredentials_]]]
  
  inline def readServices(): Record[String, ServiceBinding[ServiceCredentials_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readServices")().asInstanceOf[Record[String, ServiceBinding[ServiceCredentials_]]]
  inline def readServices(path: String): Record[String, ServiceBinding[ServiceCredentials_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readServices")(path.asInstanceOf[js.Any]).asInstanceOf[Record[String, ServiceBinding[ServiceCredentials_]]]
  inline def readServices(path: String, options: DisableCache): Record[String, ServiceBinding[ServiceCredentials_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readServices")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, ServiceBinding[ServiceCredentials_]]]
  inline def readServices(path: Unit, options: DisableCache): Record[String, ServiceBinding[ServiceCredentials_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readServices")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, ServiceBinding[ServiceCredentials_]]]
  
  inline def serviceCredentials(filter: ServiceQuery): ServiceCredentials_ = ^.asInstanceOf[js.Dynamic].applyDynamic("serviceCredentials")(filter.asInstanceOf[js.Any]).asInstanceOf[ServiceCredentials_]
  inline def serviceCredentials(path: String, filter: ServiceQuery): ServiceCredentials_ = (^.asInstanceOf[js.Dynamic].applyDynamic("serviceCredentials")(path.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[ServiceCredentials_]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = string | number | boolean | null | {[k: string] : @sap/xsenv.@sap/xsenv.JSONValue} | std.Array<@sap/xsenv.@sap/xsenv.JSONValue>
  }}}
  to avoid circular code involving: 
  - @sap/xsenv.@sap/xsenv.JSONValue
  */
  type JSONValue = String | Double | Boolean | Null | StringDictionary[Any] | js.Array[Any]
  
  trait ServiceBinding[T] extends StObject {
    
    var binding_guid: js.UndefOr[String] = js.undefined
    
    var binding_name: js.UndefOr[String] = js.undefined
    
    var credentials: T
    
    var instance_guid: js.UndefOr[String] = js.undefined
    
    var instance_name: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var name: String
    
    var plan: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ServiceBinding {
    
    inline def apply[T](credentials: T, label: String, name: String): ServiceBinding[T] = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceBinding[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceBinding[?], T] (val x: Self & ServiceBinding[T]) extends AnyVal {
      
      inline def setBinding_guid(value: String): Self = StObject.set(x, "binding_guid", value.asInstanceOf[js.Any])
      
      inline def setBinding_guidUndefined: Self = StObject.set(x, "binding_guid", js.undefined)
      
      inline def setBinding_name(value: String): Self = StObject.set(x, "binding_name", value.asInstanceOf[js.Any])
      
      inline def setBinding_nameUndefined: Self = StObject.set(x, "binding_name", js.undefined)
      
      inline def setCredentials(value: T): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setInstance_guid(value: String): Self = StObject.set(x, "instance_guid", value.asInstanceOf[js.Any])
      
      inline def setInstance_guidUndefined: Self = StObject.set(x, "instance_guid", js.undefined)
      
      inline def setInstance_name(value: String): Self = StObject.set(x, "instance_name", value.asInstanceOf[js.Any])
      
      inline def setInstance_nameUndefined: Self = StObject.set(x, "instance_name", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ServiceCredentials = std.Record<string, @sap/xsenv.@sap/xsenv.JSONValue>
  }}}
  to avoid circular code involving: 
  - @sap/xsenv.@sap/xsenv.JSONValue
  - @sap/xsenv.@sap/xsenv.ServiceCredentials
  */
  @js.native
  trait ServiceCredentials_ extends StObject
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ServiceQuery = string | {  name :string | undefined,   label :string | undefined,   tag :string | undefined,   plan :string | undefined} | (service : @sap/xsenv.@sap/xsenv.ServiceBinding<@sap/xsenv.@sap/xsenv.ServiceCredentials>): boolean
  }}}
  to avoid circular code involving: 
  - @sap/xsenv.@sap/xsenv.JSONValue
  - @sap/xsenv.@sap/xsenv.ServiceCredentials
  - @sap/xsenv.@sap/xsenv.ServiceQuery
  */
  type ServiceQuery = String | Label | (js.Function1[/* service */ ServiceBinding[Any], Boolean])
}

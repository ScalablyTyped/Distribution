package typings.schemaRegistry

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schema-registry", "LivingAvroSchema")
  @js.native
  open class LivingAvroSchema protected () extends RegistryClient {
    def this(subject: String, version: String, config: RegistryClientConfig) = this()
    
    def fetch(): js.Promise[AvroSchemaResponseInterface] = js.native
    def fetch(poll: Boolean): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def fromBuffer(buffer: Buffer): Any = js.native
    
    def on(args: Any*): Unit = js.native
    
    def removeListener(args: Any*): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toBuffer(`object`: js.Object): Buffer = js.native
  }
  
  @JSImport("schema-registry", "RegistryClient")
  @js.native
  open class RegistryClient protected () extends StObject {
    def this(config: RegistryClientConfig) = this()
    
    def checkSubjectRegistration(subject: String, schema: js.Object): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getConfig(): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getLatestSubjectSchema(subject: String): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getSchemaById(id: Double): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getSubjectConfig(subject: String): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getSubjectSchemaForVersion(subject: String, version: Double): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getSubjects(): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def getVersionsForSubject(subject: String): js.Promise[AvroSchemaResponseInterface] = js.native
    
    var host: String = js.native
    
    def isAlive(): js.Promise[AvroSchemaResponseInterface] = js.native
    
    var logger: js.Object = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
    
    def registerSubjectVersion(subject: String, schema: js.Object): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def request(options: js.Object, expectedStatusCode: Double): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def setConfig(config: js.Object): js.Promise[AvroSchemaResponseInterface] = js.native
    
    def setSubjectConfig(subject: String, config: js.Object): js.Promise[AvroSchemaResponseInterface] = js.native
    
    var `type`: String = js.native
  }
  
  trait AvroSchemaResponseInterface extends StObject {
    
    var id: Double
    
    var schema: Any
    
    var subject: String
    
    var version: Double
  }
  object AvroSchemaResponseInterface {
    
    inline def apply(id: Double, schema: Any, subject: String, version: Double): AvroSchemaResponseInterface = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvroSchemaResponseInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvroSchemaResponseInterface] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegistryClientConfig extends StObject {
    
    var host: String
    
    var logger: js.UndefOr[js.Object] = js.undefined
    
    var port: Double
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RegistryClientConfig {
    
    inline def apply(host: String, port: Double): RegistryClientConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryClientConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistryClientConfig] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: js.Object): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type RegistryRequest = js.Promise[AvroSchemaResponseInterface]
}

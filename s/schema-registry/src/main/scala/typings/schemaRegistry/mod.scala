package typings.schemaRegistry

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schema-registry", "LivingAvroSchema")
  @js.native
  class LivingAvroSchema protected () extends RegistryClient {
    def this(subject: String, version: String, config: RegistryClientConfig) = this()
    
    def fetch(): RegistryRequest = js.native
    def fetch(poll: Boolean): RegistryRequest = js.native
    
    def fromBuffer(buffer: Buffer): js.Any = js.native
    
    def on(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
    
    def removeListener(args: js.Any*): js.UndefOr[scala.Nothing] = js.native
    
    def stop(): js.UndefOr[scala.Nothing] = js.native
    
    def toBuffer(`object`: js.Object): Buffer = js.native
  }
  
  @JSImport("schema-registry", "RegistryClient")
  @js.native
  class RegistryClient protected () extends StObject {
    def this(config: RegistryClientConfig) = this()
    
    def checkSubjectRegistration(subject: String, schema: js.Object): RegistryRequest = js.native
    
    def getConfig(): RegistryRequest = js.native
    
    def getLatestSubjectSchema(subject: String): RegistryRequest = js.native
    
    def getSchemaById(id: Double): RegistryRequest = js.native
    
    def getSubjectConfig(subject: String): RegistryRequest = js.native
    
    def getSubjectSchemaForVersion(subject: String, version: Double): RegistryRequest = js.native
    
    def getSubjects(): RegistryRequest = js.native
    
    def getVersionsForSubject(subject: String): RegistryRequest = js.native
    
    var host: String = js.native
    
    def isAlive(): RegistryRequest = js.native
    
    var logger: js.Object = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
    
    def registerSubjectVersion(subject: String, schema: js.Object): RegistryRequest = js.native
    
    def request(options: js.Object, expectedStatusCode: Double): RegistryRequest = js.native
    
    def setConfig(config: js.Object): RegistryRequest = js.native
    
    def setSubjectConfig(subject: String, config: js.Object): RegistryRequest = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait AvroSchemaResponseInterface extends StObject {
    
    var id: Double = js.native
    
    var schema: js.Any = js.native
    
    var subject: String = js.native
    
    var version: Double = js.native
  }
  object AvroSchemaResponseInterface {
    
    @scala.inline
    def apply(id: Double, schema: js.Any, subject: String, version: Double): AvroSchemaResponseInterface = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvroSchemaResponseInterface]
    }
    
    @scala.inline
    implicit class AvroSchemaResponseInterfaceMutableBuilder[Self <: AvroSchemaResponseInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegistryClientConfig extends StObject {
    
    var host: String = js.native
    
    var logger: js.UndefOr[js.Object] = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object RegistryClientConfig {
    
    @scala.inline
    def apply(host: String, port: Double): RegistryClientConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryClientConfig]
    }
    
    @scala.inline
    implicit class RegistryClientConfigMutableBuilder[Self <: RegistryClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: js.Object): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type RegistryRequest = js.Promise[AvroSchemaResponseInterface]
}

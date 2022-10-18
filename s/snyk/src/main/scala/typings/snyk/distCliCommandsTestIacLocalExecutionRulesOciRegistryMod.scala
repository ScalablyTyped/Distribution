package typings.snyk

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionRulesOciRegistryMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-registry", "RemoteOciRegistry")
  @js.native
  open class RemoteOciRegistry protected ()
    extends StObject
       with OciRegistry {
    def this(registry: String) = this()
    def this(registry: String, username: String) = this()
    def this(registry: String, username: String, password: String) = this()
    def this(registry: String, username: Unit, password: String) = this()
    
    /* CompleteClass */
    override def getLayer(repository: String, digest: String): js.Promise[GetLayerResponse] = js.native
    
    /* CompleteClass */
    override def getManifest(repository: String, tag: String): js.Promise[GetManifestResponse] = js.native
    
    /* private */ var password: Any = js.native
    
    /* private */ var registry: Any = js.native
    
    /* private */ var username: Any = js.native
  }
  /* static members */
  object RemoteOciRegistry {
    
    @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-registry", "RemoteOciRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-registry", "RemoteOciRegistry.options")
    @js.native
    def options: Any = js.native
    inline def options_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  trait GetLayerResponse extends StObject {
    
    var blob: Buffer
  }
  object GetLayerResponse {
    
    inline def apply(blob: Buffer): GetLayerResponse = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLayerResponse]
    }
    
    extension [Self <: GetLayerResponse](x: Self) {
      
      inline def setBlob(value: Buffer): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetManifestResponse extends StObject {
    
    var layers: js.Array[Layer]
    
    var schemaVersion: Double
  }
  object GetManifestResponse {
    
    inline def apply(layers: js.Array[Layer], schemaVersion: Double): GetManifestResponse = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetManifestResponse]
    }
    
    extension [Self <: GetManifestResponse](x: Self) {
      
      inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait Layer extends StObject {
    
    var digest: String
  }
  object Layer {
    
    inline def apply(digest: String): Layer = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    }
  }
  
  trait OciRegistry extends StObject {
    
    def getLayer(repository: String, digest: String): js.Promise[GetLayerResponse]
    
    def getManifest(repository: String, tag: String): js.Promise[GetManifestResponse]
  }
  object OciRegistry {
    
    inline def apply(
      getLayer: (String, String) => js.Promise[GetLayerResponse],
      getManifest: (String, String) => js.Promise[GetManifestResponse]
    ): OciRegistry = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction2(getLayer), getManifest = js.Any.fromFunction2(getManifest))
      __obj.asInstanceOf[OciRegistry]
    }
    
    extension [Self <: OciRegistry](x: Self) {
      
      inline def setGetLayer(value: (String, String) => js.Promise[GetLayerResponse]): Self = StObject.set(x, "getLayer", js.Any.fromFunction2(value))
      
      inline def setGetManifest(value: (String, String) => js.Promise[GetManifestResponse]): Self = StObject.set(x, "getManifest", js.Any.fromFunction2(value))
    }
  }
}

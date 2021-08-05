package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getConfigurationMod {
  
  @JSImport("@pulumi/aws/msk/getConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetConfigurationResult]]
  inline def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetConfigurationResult]]
  
  trait GetConfigurationArgs extends StObject {
    
    /**
      * Name of the configuration.
      */
    val name: String
  }
  object GetConfigurationArgs {
    
    inline def apply(name: String): GetConfigurationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConfigurationArgs]
    }
    
    extension [Self <: GetConfigurationArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetConfigurationResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: String
    
    /**
      * Description of the configuration.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * List of Apache Kafka versions which can use this configuration.
      */
    val kafkaVersions: js.Array[String]
    
    /**
      * Latest revision of the configuration.
      */
    val latestRevision: Double
    
    val name: String
    
    /**
      * Contents of the server.properties file.
      */
    val serverProperties: String
  }
  object GetConfigurationResult {
    
    inline def apply(
      arn: String,
      description: String,
      id: String,
      kafkaVersions: js.Array[String],
      latestRevision: Double,
      name: String,
      serverProperties: String
    ): GetConfigurationResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kafkaVersions = kafkaVersions.asInstanceOf[js.Any], latestRevision = latestRevision.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConfigurationResult]
    }
    
    extension [Self <: GetConfigurationResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKafkaVersions(value: js.Array[String]): Self = StObject.set(x, "kafkaVersions", value.asInstanceOf[js.Any])
      
      inline def setKafkaVersionsVarargs(value: String*): Self = StObject.set(x, "kafkaVersions", js.Array(value :_*))
      
      inline def setLatestRevision(value: Double): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setServerProperties(value: String): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
    }
  }
}

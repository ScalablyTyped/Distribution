package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getConfigurationMod {
  
  @JSImport("@pulumi/aws/msk/getConfiguration", "getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] = js.native
  @JSImport("@pulumi/aws/msk/getConfiguration", "getConfiguration")
  @js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] = js.native
  
  @js.native
  trait GetConfigurationArgs extends StObject {
    
    /**
      * Name of the configuration.
      */
    val name: String = js.native
  }
  object GetConfigurationArgs {
    
    @scala.inline
    def apply(name: String): GetConfigurationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConfigurationArgs]
    }
    
    @scala.inline
    implicit class GetConfigurationArgsMutableBuilder[Self <: GetConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetConfigurationResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: String = js.native
    
    /**
      * Description of the configuration.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * List of Apache Kafka versions which can use this configuration.
      */
    val kafkaVersions: js.Array[String] = js.native
    
    /**
      * Latest revision of the configuration.
      */
    val latestRevision: Double = js.native
    
    val name: String = js.native
    
    /**
      * Contents of the server.properties file.
      */
    val serverProperties: String = js.native
  }
  object GetConfigurationResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetConfigurationResultMutableBuilder[Self <: GetConfigurationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersions(value: js.Array[String]): Self = StObject.set(x, "kafkaVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersionsVarargs(value: String*): Self = StObject.set(x, "kafkaVersions", js.Array(value :_*))
      
      @scala.inline
      def setLatestRevision(value: Double): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerProperties(value: String): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
    }
  }
}

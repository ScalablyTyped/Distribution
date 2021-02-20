package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.ConnectionPhysicalConnectionRequirements
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glueConnectionMod {
  
  @JSImport("@pulumi/aws/glue/connection", "Connection")
  @js.native
  class Connection protected () extends CustomResource {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Glue Connection.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
      */
    val catalogId: Output_[String] = js.native
    
    /**
      * A map of key-value pairs used as parameters for this connection.
      */
    val connectionProperties: Output_[StringDictionary[String]] = js.native
    
    /**
      * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
      */
    val connectionType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Description of the connection.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of criteria that can be used in selecting this connection.
      */
    val matchCriterias: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the connection.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
      */
    val physicalConnectionRequirements: Output_[js.UndefOr[ConnectionPhysicalConnectionRequirements]] = js.native
  }
  /* static members */
  object Connection {
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID]): Connection = js.native
    @JSImport("@pulumi/aws/glue/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Connection = js.native
    @JSImport("@pulumi/aws/glue/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState): Connection = js.native
    @JSImport("@pulumi/aws/glue/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): Connection = js.native
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/connection", "Connection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
  }
  
  @js.native
  trait ConnectionArgs extends StObject {
    
    /**
      * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of key-value pairs used as parameters for this connection.
      */
    val connectionProperties: Input[StringDictionary[Input[String]]] = js.native
    
    /**
      * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the connection.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of criteria that can be used in selecting this connection.
      */
    val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
      */
    val physicalConnectionRequirements: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]] = js.native
  }
  object ConnectionArgs {
    
    @scala.inline
    def apply(connectionProperties: Input[StringDictionary[Input[String]]]): ConnectionArgs = {
      val __obj = js.Dynamic.literal(connectionProperties = connectionProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionArgs]
    }
    
    @scala.inline
    implicit class ConnectionArgsMutableBuilder[Self <: ConnectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setConnectionProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMatchCriterias(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchCriterias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchCriteriasUndefined: Self = StObject.set(x, "matchCriterias", js.undefined)
      
      @scala.inline
      def setMatchCriteriasVarargs(value: Input[String]*): Self = StObject.set(x, "matchCriterias", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhysicalConnectionRequirements(value: Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]): Self = StObject.set(x, "physicalConnectionRequirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "physicalConnectionRequirements", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionState extends StObject {
    
    /**
      * The ARN of the Glue Connection.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of key-value pairs used as parameters for this connection.
      */
    val connectionProperties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the connection.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of criteria that can be used in selecting this connection.
      */
    val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
      */
    val physicalConnectionRequirements: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]] = js.native
  }
  object ConnectionState {
    
    @scala.inline
    def apply(): ConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionState]
    }
    
    @scala.inline
    implicit class ConnectionStateMutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setConnectionProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPropertiesUndefined: Self = StObject.set(x, "connectionProperties", js.undefined)
      
      @scala.inline
      def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMatchCriterias(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchCriterias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchCriteriasUndefined: Self = StObject.set(x, "matchCriterias", js.undefined)
      
      @scala.inline
      def setMatchCriteriasVarargs(value: Input[String]*): Self = StObject.set(x, "matchCriterias", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhysicalConnectionRequirements(value: Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]): Self = StObject.set(x, "physicalConnectionRequirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "physicalConnectionRequirements", js.undefined)
    }
  }
}

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
    
    @JSImport("@pulumi/aws/glue/connection", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Connection]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Connection]
    inline def get(name: String, id: Input[ID], state: ConnectionState): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Connection]
    inline def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Connection]
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean]
  }
  
  trait ConnectionArgs extends StObject {
    
    /**
      * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of key-value pairs used as parameters for this connection.
      */
    val connectionProperties: Input[StringDictionary[Input[String]]]
    
    /**
      * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the connection.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of criteria that can be used in selecting this connection.
      */
    val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
      */
    val physicalConnectionRequirements: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]] = js.undefined
  }
  object ConnectionArgs {
    
    inline def apply(connectionProperties: Input[StringDictionary[Input[String]]]): ConnectionArgs = {
      val __obj = js.Dynamic.literal(connectionProperties = connectionProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionArgs]
    }
    
    extension [Self <: ConnectionArgs](x: Self) {
      
      inline def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      inline def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      inline def setConnectionProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
      
      inline def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMatchCriterias(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchCriterias", value.asInstanceOf[js.Any])
      
      inline def setMatchCriteriasUndefined: Self = StObject.set(x, "matchCriterias", js.undefined)
      
      inline def setMatchCriteriasVarargs(value: Input[String]*): Self = StObject.set(x, "matchCriterias", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhysicalConnectionRequirements(value: Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]): Self = StObject.set(x, "physicalConnectionRequirements", value.asInstanceOf[js.Any])
      
      inline def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "physicalConnectionRequirements", js.undefined)
    }
  }
  
  trait ConnectionState extends StObject {
    
    /**
      * The ARN of the Glue Connection.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of key-value pairs used as parameters for this connection.
      */
    val connectionProperties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the connection.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of criteria that can be used in selecting this connection.
      */
    val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
      */
    val physicalConnectionRequirements: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]] = js.undefined
  }
  object ConnectionState {
    
    inline def apply(): ConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionState]
    }
    
    extension [Self <: ConnectionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      inline def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      inline def setConnectionProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
      
      inline def setConnectionPropertiesUndefined: Self = StObject.set(x, "connectionProperties", js.undefined)
      
      inline def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMatchCriterias(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchCriterias", value.asInstanceOf[js.Any])
      
      inline def setMatchCriteriasUndefined: Self = StObject.set(x, "matchCriterias", js.undefined)
      
      inline def setMatchCriteriasVarargs(value: Input[String]*): Self = StObject.set(x, "matchCriterias", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhysicalConnectionRequirements(value: Input[typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements]): Self = StObject.set(x, "physicalConnectionRequirements", value.asInstanceOf[js.Any])
      
      inline def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "physicalConnectionRequirements", js.undefined)
    }
  }
}

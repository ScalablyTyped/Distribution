package typings.pulumiAws

import typings.pulumiAws.outputMod.dynamodb.GlobalTableReplica
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalTableMod {
  
  @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
  @js.native
  class GlobalTable protected () extends CustomResource {
    /**
      * Create a GlobalTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalTableArgs) = this()
    def this(name: String, args: GlobalTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the DynamoDB Global Table
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: Output_[String] = js.native
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: Output_[js.Array[GlobalTableReplica]] = js.native
  }
  /* static members */
  object GlobalTable {
    
    @JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GlobalTable]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GlobalTable]
    inline def get(name: String, id: Input[ID], state: GlobalTableState): GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GlobalTable]
    inline def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GlobalTable]
    
    /**
      * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean]
  }
  
  trait GlobalTableArgs extends StObject {
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]
  }
  object GlobalTableArgs {
    
    inline def apply(replicas: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): GlobalTableArgs = {
      val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableArgs]
    }
    
    extension [Self <: GlobalTableArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReplicas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    }
  }
  
  trait GlobalTableState extends StObject {
    
    /**
      * The ARN of the DynamoDB Global Table
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the global table. Must match underlying DynamoDB Table names in all regions.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
      */
    val replicas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]] = js.undefined
  }
  object GlobalTableState {
    
    inline def apply(): GlobalTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableState]
    }
    
    extension [Self <: GlobalTableState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReplicas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      inline def setReplicasVarargs(value: Input[typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    }
  }
}

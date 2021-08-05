package typings.pulumiAws

import typings.pulumiAws.outputMod.cognito.ResourceServerScope
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceServerMod {
  
  @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer")
  @js.native
  class ResourceServer protected () extends CustomResource {
    /**
      * Create a ResourceServer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceServerArgs) = this()
    def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An identifier for the resource server.
      */
    val identifier: Output_[String] = js.native
    
    /**
      * A name for the resource server.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of all scopes configured for this resource server in the format identifier/scope_name.
      */
    val scopeIdentifiers: Output_[js.Array[String]] = js.native
    
    /**
      * A list of Authorization Scope.
      */
    val scopes: Output_[js.UndefOr[js.Array[ResourceServerScope]]] = js.native
    
    val userPoolId: Output_[String] = js.native
  }
  /* static members */
  object ResourceServer {
    
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResourceServer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceServer]
    inline def get(name: String, id: Input[ID], state: ResourceServerState): ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResourceServer]
    inline def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceServer]
    
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean]
  }
  
  trait ResourceServerArgs extends StObject {
    
    /**
      * An identifier for the resource server.
      */
    val identifier: Input[String]
    
    /**
      * A name for the resource server.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of Authorization Scope.
      */
    val scopes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]] = js.undefined
    
    val userPoolId: Input[String]
  }
  object ResourceServerArgs {
    
    inline def apply(identifier: Input[String], userPoolId: Input[String]): ResourceServerArgs = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceServerArgs]
    }
    
    extension [Self <: ResourceServerArgs](x: Self) {
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScopes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceServerState extends StObject {
    
    /**
      * An identifier for the resource server.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name for the resource server.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of all scopes configured for this resource server in the format identifier/scope_name.
      */
    val scopeIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of Authorization Scope.
      */
    val scopes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]] = js.undefined
    
    val userPoolId: js.UndefOr[Input[String]] = js.undefined
  }
  object ResourceServerState {
    
    inline def apply(): ResourceServerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceServerState]
    }
    
    extension [Self <: ResourceServerState](x: Self) {
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScopeIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "scopeIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setScopeIdentifiersUndefined: Self = StObject.set(x, "scopeIdentifiers", js.undefined)
      
      inline def setScopeIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "scopeIdentifiers", js.Array(value :_*))
      
      inline def setScopes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
    }
  }
}

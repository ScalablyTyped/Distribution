package typings.pulumiAws

import typings.pulumiAws.outputMod.cognito.ResourceServerScope
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): ResourceServer = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  @js.native
  trait ResourceServerArgs extends StObject {
    
    /**
      * An identifier for the resource server.
      */
    val identifier: Input[String] = js.native
    
    /**
      * A name for the resource server.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Authorization Scope.
      */
    val scopes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]] = js.native
    
    val userPoolId: Input[String] = js.native
  }
  object ResourceServerArgs {
    
    @scala.inline
    def apply(identifier: Input[String], userPoolId: Input[String]): ResourceServerArgs = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceServerArgs]
    }
    
    @scala.inline
    implicit class ResourceServerArgsMutableBuilder[Self <: ResourceServerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScopes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceServerState extends StObject {
    
    /**
      * An identifier for the resource server.
      */
    val identifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * A name for the resource server.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of all scopes configured for this resource server in the format identifier/scope_name.
      */
    val scopeIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of Authorization Scope.
      */
    val scopes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]] = js.native
    
    val userPoolId: js.UndefOr[Input[String]] = js.native
  }
  object ResourceServerState {
    
    @scala.inline
    def apply(): ResourceServerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceServerState]
    }
    
    @scala.inline
    implicit class ResourceServerStateMutableBuilder[Self <: ResourceServerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScopeIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "scopeIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeIdentifiersUndefined: Self = StObject.set(x, "scopeIdentifiers", js.undefined)
      
      @scala.inline
      def setScopeIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "scopeIdentifiers", js.Array(value :_*))
      
      @scala.inline
      def setScopes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: Input[typings.pulumiAws.inputMod.cognito.ResourceServerScope]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
    }
  }
}

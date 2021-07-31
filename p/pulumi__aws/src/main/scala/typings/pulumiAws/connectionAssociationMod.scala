package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionAssociationMod {
  
  @JSImport("@pulumi/aws/directconnect/connectionAssociation", "ConnectionAssociation")
  @js.native
  class ConnectionAssociation protected () extends CustomResource {
    /**
      * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionAssociationArgs) = this()
    def this(name: String, args: ConnectionAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the connection.
      */
    val connectionId: Output_[String] = js.native
    
    /**
      * The ID of the LAG with which to associate the connection.
      */
    val lagId: Output_[String] = js.native
  }
  /* static members */
  object ConnectionAssociation {
    
    @JSImport("@pulumi/aws/directconnect/connectionAssociation", "ConnectionAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionAssociationState): ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionAssociationState, opts: CustomResourceOptions): ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConnectionAssociation]
    
    /**
      * Returns true if the given object is an instance of ConnectionAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean]
  }
  
  trait ConnectionAssociationArgs extends StObject {
    
    /**
      * The ID of the connection.
      */
    val connectionId: Input[String]
    
    /**
      * The ID of the LAG with which to associate the connection.
      */
    val lagId: Input[String]
  }
  object ConnectionAssociationArgs {
    
    @scala.inline
    def apply(connectionId: Input[String], lagId: Input[String]): ConnectionAssociationArgs = {
      val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionAssociationArgs]
    }
    
    @scala.inline
    implicit class ConnectionAssociationArgsMutableBuilder[Self <: ConnectionAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLagId(value: Input[String]): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionAssociationState extends StObject {
    
    /**
      * The ID of the connection.
      */
    val connectionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the LAG with which to associate the connection.
      */
    val lagId: js.UndefOr[Input[String]] = js.undefined
  }
  object ConnectionAssociationState {
    
    @scala.inline
    def apply(): ConnectionAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionAssociationState]
    }
    
    @scala.inline
    implicit class ConnectionAssociationStateMutableBuilder[Self <: ConnectionAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setLagId(value: Input[String]): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    }
  }
}

package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityPoolRoleAttachmentMod {
  
  @JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
  @js.native
  class IdentityPoolRoleAttachment protected () extends CustomResource {
    /**
      * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolRoleAttachmentArgs) = this()
    def this(name: String, args: IdentityPoolRoleAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    val identityPoolId: Output_[String] = js.native
    
    /**
      * A List of Role Mapping.
      */
    val roleMappings: Output_[js.UndefOr[js.Array[IdentityPoolRoleAttachmentRoleMapping]]] = js.native
    
    /**
      * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
      */
    val roles: Output_[StringDictionary[String]] = js.native
  }
  /* static members */
  object IdentityPoolRoleAttachment {
    
    @JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdentityPoolRoleAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityPoolRoleAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IdentityPoolRoleAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityPoolRoleAttachment]
    
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean]
  }
  
  trait IdentityPoolRoleAttachmentArgs extends StObject {
    
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    val identityPoolId: Input[String]
    
    /**
      * A List of Role Mapping.
      */
    val roleMappings: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]]
        ]
      ] = js.undefined
    
    /**
      * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
      */
    val roles: Input[StringDictionary[Input[String]]]
  }
  object IdentityPoolRoleAttachmentArgs {
    
    @scala.inline
    def apply(identityPoolId: Input[String], roles: Input[StringDictionary[Input[String]]]): IdentityPoolRoleAttachmentArgs = {
      val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityPoolRoleAttachmentArgs]
    }
    
    @scala.inline
    implicit class IdentityPoolRoleAttachmentArgsMutableBuilder[Self <: IdentityPoolRoleAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityPoolId(value: Input[String]): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappings(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]]
            ]
      ): Self = StObject.set(x, "roleMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappingsUndefined: Self = StObject.set(x, "roleMappings", js.undefined)
      
      @scala.inline
      def setRoleMappingsVarargs(value: Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]*): Self = StObject.set(x, "roleMappings", js.Array(value :_*))
      
      @scala.inline
      def setRoles(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityPoolRoleAttachmentState extends StObject {
    
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    val identityPoolId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A List of Role Mapping.
      */
    val roleMappings: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]]
        ]
      ] = js.undefined
    
    /**
      * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
      */
    val roles: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object IdentityPoolRoleAttachmentState {
    
    @scala.inline
    def apply(): IdentityPoolRoleAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
    }
    
    @scala.inline
    implicit class IdentityPoolRoleAttachmentStateMutableBuilder[Self <: IdentityPoolRoleAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityPoolId(value: Input[String]): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolIdUndefined: Self = StObject.set(x, "identityPoolId", js.undefined)
      
      @scala.inline
      def setRoleMappings(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]]
            ]
      ): Self = StObject.set(x, "roleMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappingsUndefined: Self = StObject.set(x, "roleMappings", js.undefined)
      
      @scala.inline
      def setRoleMappingsVarargs(value: Input[typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping]*): Self = StObject.set(x, "roleMappings", js.Array(value :_*))
      
      @scala.inline
      def setRoles(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    }
  }
}

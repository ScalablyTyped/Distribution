package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glacier.VaultNotification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacierVaultMod {
  
  @JSImport("@pulumi/aws/glacier/vault", "Vault")
  @js.native
  class Vault protected () extends CustomResource {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The policy document. This is a JSON formatted string.
      * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
      */
    val accessPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the vault.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The URI of the vault that was created.
      */
    val location: Output_[String] = js.native
    
    /**
      * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
      */
    val name: Output_[String] = js.native
    
    /**
      * The notifications for the Vault. Fields documented below.
      */
    val notifications: Output_[js.UndefOr[js.Array[VaultNotification]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Vault {
    
    @JSImport("@pulumi/aws/glacier/vault", "Vault")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Vault]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Vault]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultState): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Vault]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Vault]
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ Boolean]
  }
  
  trait VaultArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
      */
    val accessPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The notifications for the Vault. Fields documented below.
      */
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glacier.VaultNotification]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VaultArgs {
    
    @scala.inline
    def apply(): VaultArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultArgs]
    }
    
    @scala.inline
    implicit class VaultArgsMutableBuilder[Self <: VaultArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glacier.VaultNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.glacier.VaultNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VaultState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
      */
    val accessPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the vault.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URI of the vault that was created.
      */
    val location: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The notifications for the Vault. Fields documented below.
      */
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glacier.VaultNotification]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VaultState {
    
    @scala.inline
    def apply(): VaultState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultState]
    }
    
    @scala.inline
    implicit class VaultStateMutableBuilder[Self <: VaultState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicy(value: Input[String]): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glacier.VaultNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.glacier.VaultNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}

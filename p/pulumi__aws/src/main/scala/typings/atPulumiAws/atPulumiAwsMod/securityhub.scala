package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.securityhubAccountMod.AccountArgs
import typings.atPulumiAws.securityhubAccountMod.AccountState
import typings.atPulumiAws.securityhubProductSubscriptionMod.ProductSubscriptionArgs
import typings.atPulumiAws.securityhubProductSubscriptionMod.ProductSubscriptionState
import typings.atPulumiAws.securityhubStandardsSubscriptionMod.StandardsSubscriptionArgs
import typings.atPulumiAws.securityhubStandardsSubscriptionMod.StandardsSubscriptionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "securityhub")
@js.native
object securityhub extends js.Object {
  @js.native
  class Account protected ()
    extends typings.atPulumiAws.securityhubMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ProductSubscription protected ()
    extends typings.atPulumiAws.securityhubMod.ProductSubscription {
    /**
      * Create a ProductSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProductSubscriptionArgs) = this()
    def this(name: String, args: ProductSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StandardsSubscription protected ()
    extends typings.atPulumiAws.securityhubMod.StandardsSubscription {
    /**
      * Create a StandardsSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StandardsSubscriptionArgs) = this()
    def this(name: String, args: StandardsSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Account extends js.Object {
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.securityhubAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typings.atPulumiAws.securityhubAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.atPulumiAws.securityhubAccountMod.Account = js.native
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/account.Account */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ProductSubscription extends js.Object {
    /**
      * Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.securityhubProductSubscriptionMod.ProductSubscription = js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState): typings.atPulumiAws.securityhubProductSubscriptionMod.ProductSubscription = js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState, opts: CustomResourceOptions): typings.atPulumiAws.securityhubProductSubscriptionMod.ProductSubscription = js.native
    /**
      * Returns true if the given object is an instance of ProductSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StandardsSubscription extends js.Object {
    /**
      * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState): typings.atPulumiAws.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState, opts: CustomResourceOptions): typings.atPulumiAws.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
    /**
      * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/standardsSubscription.StandardsSubscription */ Boolean = js.native
  }
  
}


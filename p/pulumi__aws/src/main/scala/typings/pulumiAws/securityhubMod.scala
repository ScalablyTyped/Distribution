package typings.pulumiAws

import typings.pulumiAws.productSubscriptionMod.ProductSubscriptionArgs
import typings.pulumiAws.productSubscriptionMod.ProductSubscriptionState
import typings.pulumiAws.securityhubAccountMod.AccountArgs
import typings.pulumiAws.securityhubAccountMod.AccountState
import typings.pulumiAws.securityhubMemberMod.MemberArgs
import typings.pulumiAws.securityhubMemberMod.MemberState
import typings.pulumiAws.standardsSubscriptionMod.StandardsSubscriptionArgs
import typings.pulumiAws.standardsSubscriptionMod.StandardsSubscriptionState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/securityhub", JSImport.Namespace)
@js.native
object securityhubMod extends js.Object {
  @js.native
  class Account protected ()
    extends typings.pulumiAws.securityhubAccountMod.Account {
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
  class Member protected ()
    extends typings.pulumiAws.securityhubMemberMod.Member {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberArgs) = this()
    def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ProductSubscription protected ()
    extends typings.pulumiAws.productSubscriptionMod.ProductSubscription {
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
    extends typings.pulumiAws.standardsSubscriptionMod.StandardsSubscription {
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.securityhubAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typings.pulumiAws.securityhubAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.pulumiAws.securityhubAccountMod.Account = js.native
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/account.Account */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Member extends js.Object {
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.securityhubMemberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState): typings.pulumiAws.securityhubMemberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typings.pulumiAws.securityhubMemberMod.Member = js.native
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/member.Member */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState): typings.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState): typings.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    /**
      * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/standardsSubscription.StandardsSubscription */ Boolean = js.native
  }
  
}


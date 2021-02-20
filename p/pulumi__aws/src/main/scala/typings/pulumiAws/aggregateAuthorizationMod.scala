package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregateAuthorizationMod {
  
  @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization")
  @js.native
  class AggregateAuthorization protected () extends CustomResource {
    /**
      * Create a AggregateAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AggregateAuthorizationArgs) = this()
    def this(name: String, args: AggregateAuthorizationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Account ID
      */
    val accountId: Output_[String] = js.native
    
    /**
      * The ARN of the authorization
      */
    val arn: Output_[String] = js.native
    
    /**
      * Region
      */
    val region: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object AggregateAuthorization {
    
    /**
      * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID]): AggregateAuthorization = js.native
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AggregateAuthorization = js.native
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState): AggregateAuthorization = js.native
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): AggregateAuthorization = js.native
    
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = js.native
  }
  
  @js.native
  trait AggregateAuthorizationArgs extends StObject {
    
    /**
      * Account ID
      */
    val accountId: Input[String] = js.native
    
    /**
      * Region
      */
    val region: Input[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AggregateAuthorizationArgs {
    
    @scala.inline
    def apply(accountId: Input[String], region: Input[String]): AggregateAuthorizationArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregateAuthorizationArgs]
    }
    
    @scala.inline
    implicit class AggregateAuthorizationArgsMutableBuilder[Self <: AggregateAuthorizationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait AggregateAuthorizationState extends StObject {
    
    /**
      * Account ID
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the authorization
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Region
      */
    val region: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AggregateAuthorizationState {
    
    @scala.inline
    def apply(): AggregateAuthorizationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregateAuthorizationState]
    }
    
    @scala.inline
    implicit class AggregateAuthorizationStateMutableBuilder[Self <: AggregateAuthorizationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}

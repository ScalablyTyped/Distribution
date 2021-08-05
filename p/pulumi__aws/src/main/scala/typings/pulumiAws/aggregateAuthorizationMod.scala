package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/cfg/aggregateAuthorization", "AggregateAuthorization")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: AggregateAuthorizationState): AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AggregateAuthorization]
    
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean]
  }
  
  trait AggregateAuthorizationArgs extends StObject {
    
    /**
      * Account ID
      */
    val accountId: Input[String]
    
    /**
      * Region
      */
    val region: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AggregateAuthorizationArgs {
    
    inline def apply(accountId: Input[String], region: Input[String]): AggregateAuthorizationArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregateAuthorizationArgs]
    }
    
    extension [Self <: AggregateAuthorizationArgs](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AggregateAuthorizationState extends StObject {
    
    /**
      * Account ID
      */
    val accountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the authorization
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Region
      */
    val region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AggregateAuthorizationState {
    
    inline def apply(): AggregateAuthorizationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregateAuthorizationState]
    }
    
    extension [Self <: AggregateAuthorizationState](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}

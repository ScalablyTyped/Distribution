package typings.pulumiAws.mod

import typings.pulumiAws.distributionMod.DistributionArgs
import typings.pulumiAws.distributionMod.DistributionState
import typings.pulumiAws.getDistributionMod.GetDistributionArgs
import typings.pulumiAws.getDistributionMod.GetDistributionResult
import typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentityArgs
import typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentityState
import typings.pulumiAws.publicKeyMod.PublicKeyArgs
import typings.pulumiAws.publicKeyMod.PublicKeyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfront {
  
  @JSImport("@pulumi/aws", "cloudfront")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "cloudfront.Distribution")
  @js.native
  class Distribution protected ()
    extends typings.pulumiAws.cloudfrontMod.Distribution {
    /**
      * Create a Distribution resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionArgs) = this()
    def this(name: String, args: DistributionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Distribution {
    
    @JSImport("@pulumi/aws", "cloudfront.Distribution")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Distribution resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.distributionMod.Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionMod.Distribution]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.distributionMod.Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionMod.Distribution]
    @scala.inline
    def get(name: String, id: Input[ID], state: DistributionState): typings.pulumiAws.distributionMod.Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionMod.Distribution]
    @scala.inline
    def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): typings.pulumiAws.distributionMod.Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionMod.Distribution]
    
    /**
      * Returns true if the given object is an instance of Distribution.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity")
  @js.native
  class OriginAccessIdentity protected ()
    extends typings.pulumiAws.cloudfrontMod.OriginAccessIdentity {
    /**
      * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OriginAccessIdentityArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OriginAccessIdentity {
    
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity]
    
    /**
      * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cloudfront.PublicKey")
  @js.native
  class PublicKey protected ()
    extends typings.pulumiAws.cloudfrontMod.PublicKey {
    /**
      * Create a PublicKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicKeyArgs) = this()
    def this(name: String, args: PublicKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublicKey {
    
    @JSImport("@pulumi/aws", "cloudfront.PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PublicKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.publicKeyMod.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicKeyMod.PublicKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.publicKeyMod.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicKeyMod.PublicKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicKeyState): typings.pulumiAws.publicKeyMod.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicKeyMod.PublicKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): typings.pulumiAws.publicKeyMod.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicKeyMod.PublicKey]
    
    /**
      * Returns true if the given object is an instance of PublicKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean]
  }
  
  @scala.inline
  def getDistribution(args: GetDistributionArgs): js.Promise[GetDistributionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistribution")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDistributionResult]]
  @scala.inline
  def getDistribution(args: GetDistributionArgs, opts: InvokeOptions): js.Promise[GetDistributionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistribution")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDistributionResult]]
}

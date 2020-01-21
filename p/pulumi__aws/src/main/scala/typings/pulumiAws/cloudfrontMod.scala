package typings.pulumiAws

import typings.pulumiAws.distributionMod.DistributionArgs
import typings.pulumiAws.distributionMod.DistributionState
import typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentityArgs
import typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentityState
import typings.pulumiAws.publicKeyMod.PublicKeyArgs
import typings.pulumiAws.publicKeyMod.PublicKeyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront", JSImport.Namespace)
@js.native
object cloudfrontMod extends js.Object {
  @js.native
  class Distribution protected ()
    extends typings.pulumiAws.distributionMod.Distribution {
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
  
  @js.native
  class OriginAccessIdentity protected ()
    extends typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity {
    /**
      * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OriginAccessIdentityArgs) = this()
    def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PublicKey protected ()
    extends typings.pulumiAws.publicKeyMod.PublicKey {
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
  @js.native
  object Distribution extends js.Object {
    /**
      * Get an existing Distribution resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.distributionMod.Distribution = js.native
    def get(name: String, id: Input[ID], state: DistributionState): typings.pulumiAws.distributionMod.Distribution = js.native
    def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): typings.pulumiAws.distributionMod.Distribution = js.native
    /**
      * Returns true if the given object is an instance of Distribution.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OriginAccessIdentity extends js.Object {
    /**
      * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): typings.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    /**
      * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PublicKey extends js.Object {
    /**
      * Get an existing PublicKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.publicKeyMod.PublicKey = js.native
    def get(name: String, id: Input[ID], state: PublicKeyState): typings.pulumiAws.publicKeyMod.PublicKey = js.native
    def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): typings.pulumiAws.publicKeyMod.PublicKey = js.native
    /**
      * Returns true if the given object is an instance of PublicKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = js.native
  }
  
}


package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.route53.ZoneVpc
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoneMod {
  
  @JSImport("@pulumi/aws/route53/zone", "Zone")
  @js.native
  class Zone protected () extends CustomResource {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ZoneArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
      */
    val comment: Output_[String] = js.native
    
    /**
      * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
      */
    val delegationSetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * This is the name of the hosted zone.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of name servers in associated (or default) delegation set.
      * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
      */
    val nameServers: Output_[js.Array[String]] = js.native
    
    /**
      * A mapping of tags to assign to the zone.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
      */
    val vpcs: Output_[js.UndefOr[js.Array[ZoneVpc]]] = js.native
    
    /**
      * The Hosted Zone ID. This can be referenced by zone records.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object Zone {
    
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/zone", "Zone.get")
    @js.native
    def get(name: String, id: Input[ID]): Zone = js.native
    @JSImport("@pulumi/aws/route53/zone", "Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Zone = js.native
    @JSImport("@pulumi/aws/route53/zone", "Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneState): Zone = js.native
    @JSImport("@pulumi/aws/route53/zone", "Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): Zone = js.native
    
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/zone", "Zone.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
  }
  
  @js.native
  trait ZoneArgs extends StObject {
    
    /**
      * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
      */
    val comment: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
      */
    val delegationSetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * This is the name of the hosted zone.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A mapping of tags to assign to the zone.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
      */
    val vpcs: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ZoneVpc]]]] = js.native
  }
  object ZoneArgs {
    
    @scala.inline
    def apply(): ZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneArgs]
    }
    
    @scala.inline
    implicit class ZoneArgsMutableBuilder[Self <: ZoneArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDelegationSetId(value: Input[String]): Self = StObject.set(x, "delegationSetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegationSetIdUndefined: Self = StObject.set(x, "delegationSetId", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ZoneVpc]]]): Self = StObject.set(x, "vpcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcsUndefined: Self = StObject.set(x, "vpcs", js.undefined)
      
      @scala.inline
      def setVpcsVarargs(value: Input[typings.pulumiAws.inputMod.route53.ZoneVpc]*): Self = StObject.set(x, "vpcs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ZoneState extends StObject {
    
    /**
      * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
      */
    val comment: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
      */
    val delegationSetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * This is the name of the hosted zone.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of name servers in associated (or default) delegation set.
      * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
      */
    val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A mapping of tags to assign to the zone.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
      */
    val vpcs: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ZoneVpc]]]] = js.native
    
    /**
      * The Hosted Zone ID. This can be referenced by zone records.
      */
    val zoneId: js.UndefOr[Input[String]] = js.native
  }
  object ZoneState {
    
    @scala.inline
    def apply(): ZoneState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneState]
    }
    
    @scala.inline
    implicit class ZoneStateMutableBuilder[Self <: ZoneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDelegationSetId(value: Input[String]): Self = StObject.set(x, "delegationSetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegationSetIdUndefined: Self = StObject.set(x, "delegationSetId", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
      
      @scala.inline
      def setNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ZoneVpc]]]): Self = StObject.set(x, "vpcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcsUndefined: Self = StObject.set(x, "vpcs", js.undefined)
      
      @scala.inline
      def setVpcsVarargs(value: Input[typings.pulumiAws.inputMod.route53.ZoneVpc]*): Self = StObject.set(x, "vpcs", js.Array(value :_*))
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}

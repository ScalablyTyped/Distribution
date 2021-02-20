package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delegationSetMod {
  
  @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet")
  @js.native
  class DelegationSet protected () extends CustomResource {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DelegationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of authoritative name servers for the hosted zone
      * (effectively a list of NS records).
      */
    val nameServers: Output_[js.Array[String]] = js.native
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single delegation set amongst others)
      */
    val referenceName: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object DelegationSet {
    
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): DelegationSet = js.native
    @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DelegationSet = js.native
    @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): DelegationSet = js.native
    @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): DelegationSet = js.native
    
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/delegationSet", "DelegationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
  }
  
  @js.native
  trait DelegationSetArgs extends StObject {
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single delegation set amongst others)
      */
    val referenceName: js.UndefOr[Input[String]] = js.native
  }
  object DelegationSetArgs {
    
    @scala.inline
    def apply(): DelegationSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelegationSetArgs]
    }
    
    @scala.inline
    implicit class DelegationSetArgsMutableBuilder[Self <: DelegationSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferenceName(value: Input[String]): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceNameUndefined: Self = StObject.set(x, "referenceName", js.undefined)
    }
  }
  
  @js.native
  trait DelegationSetState extends StObject {
    
    /**
      * A list of authoritative name servers for the hosted zone
      * (effectively a list of NS records).
      */
    val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single delegation set amongst others)
      */
    val referenceName: js.UndefOr[Input[String]] = js.native
  }
  object DelegationSetState {
    
    @scala.inline
    def apply(): DelegationSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelegationSetState]
    }
    
    @scala.inline
    implicit class DelegationSetStateMutableBuilder[Self <: DelegationSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
      
      @scala.inline
      def setNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
      
      @scala.inline
      def setReferenceName(value: Input[String]): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceNameUndefined: Self = StObject.set(x, "referenceName", js.undefined)
    }
  }
}

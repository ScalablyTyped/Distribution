package typings.pulumiAws.mod

import typings.pulumiAws.getResourceShareMod.GetResourceShareArgs
import typings.pulumiAws.getResourceShareMod.GetResourceShareResult
import typings.pulumiAws.principalAssociationMod.PrincipalAssociationArgs
import typings.pulumiAws.principalAssociationMod.PrincipalAssociationState
import typings.pulumiAws.resourceAssociationMod.ResourceAssociationArgs
import typings.pulumiAws.resourceAssociationMod.ResourceAssociationState
import typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterArgs
import typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterState
import typings.pulumiAws.resourceShareMod.ResourceShareArgs
import typings.pulumiAws.resourceShareMod.ResourceShareState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ram {
  
  @JSImport("@pulumi/aws", "ram.PrincipalAssociation")
  @js.native
  class PrincipalAssociation protected ()
    extends typings.pulumiAws.ramMod.PrincipalAssociation {
    /**
      * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrincipalAssociationArgs) = this()
    def this(name: String, args: PrincipalAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PrincipalAssociation {
    
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ram.PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    @JSImport("@pulumi/aws", "ram.PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    @JSImport("@pulumi/aws", "ram.PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState): typings.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    @JSImport("@pulumi/aws", "ram.PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): typings.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ram.PrincipalAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ram.ResourceAssociation")
  @js.native
  class ResourceAssociation protected ()
    extends typings.pulumiAws.ramMod.ResourceAssociation {
    /**
      * Create a ResourceAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceAssociationArgs) = this()
    def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourceAssociation {
    
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ram.ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    @JSImport("@pulumi/aws", "ram.ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    @JSImport("@pulumi/aws", "ram.ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState): typings.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    @JSImport("@pulumi/aws", "ram.ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): typings.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ram.ResourceAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ram.ResourceShare")
  @js.native
  class ResourceShare protected ()
    extends typings.pulumiAws.ramMod.ResourceShare {
    /**
      * Create a ResourceShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ResourceShareArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ResourceShareArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourceShare {
    
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ram.ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceShareMod.ResourceShare = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.resourceShareMod.ResourceShare = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareState): typings.pulumiAws.resourceShareMod.ResourceShare = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): typings.pulumiAws.resourceShareMod.ResourceShare = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ram.ResourceShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ram.ResourceShareAccepter")
  @js.native
  class ResourceShareAccepter protected ()
    extends typings.pulumiAws.ramMod.ResourceShareAccepter {
    /**
      * Create a ResourceShareAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceShareAccepterArgs) = this()
    def this(name: String, args: ResourceShareAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourceShareAccepter {
    
    /**
      * Get an existing ResourceShareAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ram.ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState): typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws", "ram.ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState, opts: CustomResourceOptions): typings.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceShareAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ram.ResourceShareAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShareAccepter.ResourceShareAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ram.getResourceShare")
  @js.native
  def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] = js.native
  @JSImport("@pulumi/aws", "ram.getResourceShare")
  @js.native
  def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] = js.native
}

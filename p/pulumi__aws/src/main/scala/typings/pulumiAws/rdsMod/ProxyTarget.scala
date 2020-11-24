package typings.pulumiAws.rdsMod

import typings.pulumiAws.proxyTargetMod.ProxyTargetArgs
import typings.pulumiAws.proxyTargetMod.ProxyTargetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds", "ProxyTarget")
@js.native
class ProxyTarget protected ()
  extends typings.pulumiAws.proxyTargetMod.ProxyTarget {
  /**
    * Create a ProxyTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProxyTargetArgs) = this()
  def this(name: String, args: ProxyTargetArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/rds", "ProxyTarget")
@js.native
object ProxyTarget extends js.Object {
  
  /**
    * Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.proxyTargetMod.ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.proxyTargetMod.ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: ProxyTargetState): typings.pulumiAws.proxyTargetMod.ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: ProxyTargetState, opts: CustomResourceOptions): typings.pulumiAws.proxyTargetMod.ProxyTarget = js.native
  
  /**
    * Returns true if the given object is an instance of ProxyTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean = js.native
}

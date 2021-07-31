package typings.pulumiAws.mod

import typings.pulumiAws.providerMod.ProviderArgs
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "Provider")
@js.native
class Provider protected ()
  extends typings.pulumiAws.providerMod.Provider {
  /**
    * Create a Provider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ProviderArgs) = this()
  def this(name: String, args: Unit, opts: ResourceOptions) = this()
  def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
}
/* static members */
object Provider {
  
  @JSImport("@pulumi/aws", "Provider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of Provider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @scala.inline
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/provider.Provider */ Boolean]
}

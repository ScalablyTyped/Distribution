package typings.pulumiAws.mod.apigateway

import typings.pulumiAws.clientCertificateMod.ClientCertificateArgs
import typings.pulumiAws.clientCertificateMod.ClientCertificateState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigateway.ClientCertificate")
@js.native
class ClientCertificate protected ()
  extends typings.pulumiAws.apigatewayMod.ClientCertificate {
  /**
    * Create a ClientCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClientCertificateArgs) = this()
  def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
  def this(name: String, args: ClientCertificateArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object ClientCertificate {
  
  @JSImport("@pulumi/aws", "apigateway.ClientCertificate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing ClientCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  inline def get(name: String, id: Input[ID]): typings.pulumiAws.clientCertificateMod.ClientCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clientCertificateMod.ClientCertificate]
  inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.clientCertificateMod.ClientCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clientCertificateMod.ClientCertificate]
  inline def get(name: String, id: Input[ID], state: ClientCertificateState): typings.pulumiAws.clientCertificateMod.ClientCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clientCertificateMod.ClientCertificate]
  inline def get(name: String, id: Input[ID], state: ClientCertificateState, opts: CustomResourceOptions): typings.pulumiAws.clientCertificateMod.ClientCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clientCertificateMod.ClientCertificate]
  
  /**
    * Returns true if the given object is an instance of ClientCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ Boolean]
}

package typings
package atPulumiAwsLib.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "Certificate")
@js.native
class Certificate protected ()
  extends atPulumiAwsLib.iotCertificateMod.Certificate {
  /**
    * Create a Certificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.iotCertificateMod.CertificateArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.iotCertificateMod.CertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iot", "Certificate")
@js.native
object Certificate extends js.Object {
  /**
    * Get an existing Certificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotCertificateMod.CertificateState
  ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotCertificateMod.CertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
}


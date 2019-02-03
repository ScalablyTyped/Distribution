package typings
package atPulumiAwsLib.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", "Certificate")
@js.native
class Certificate protected ()
  extends atPulumiAwsLib.dmsCertificateMod.Certificate {
  /**
    * Create a Certificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.dmsCertificateMod.CertificateArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.dmsCertificateMod.CertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dms", "Certificate")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dmsCertificateMod.CertificateState
  ): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dmsCertificateMod.CertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
}


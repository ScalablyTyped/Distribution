package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "acmpca")
@js.native
object acmpcaNs extends js.Object {
  @js.native
  class CertificateAuthority protected ()
    extends atPulumiAwsLib.acmpcaMod.CertificateAuthority {
    /**
      * Create a CertificateAuthority resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getCertificateAuthority(args: atPulumiAwsLib.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityArgs): js.Promise[atPulumiAwsLib.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityResult] = js.native
  def getCertificateAuthority(
    args: atPulumiAwsLib.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.acmpcaGetCertificateAuthorityMod.GetCertificateAuthorityResult] = js.native
  /* static members */
  @js.native
  object CertificateAuthority extends js.Object {
    /**
      * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityState
    ): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
  }
  
}


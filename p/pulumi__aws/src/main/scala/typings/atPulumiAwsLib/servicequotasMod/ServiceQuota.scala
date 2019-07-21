package typings
package atPulumiAwsLib.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicequotas", "ServiceQuota")
@js.native
class ServiceQuota protected ()
  extends atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota {
  /**
    * Create a ServiceQuota resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/servicequotas", "ServiceQuota")
@js.native
object ServiceQuota extends js.Object {
  /**
    * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaState
  ): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  /**
    * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ scala.Boolean = js.native
}


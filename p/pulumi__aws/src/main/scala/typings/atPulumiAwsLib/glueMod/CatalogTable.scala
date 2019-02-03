package typings
package atPulumiAwsLib.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue", "CatalogTable")
@js.native
class CatalogTable protected ()
  extends atPulumiAwsLib.glueCatalogTableMod.CatalogTable {
  /**
    * Create a CatalogTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogTableMod.CatalogTableArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogTableMod.CatalogTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/glue", "CatalogTable")
@js.native
object CatalogTable extends js.Object {
  /**
    * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCatalogTableMod.CatalogTableState
  ): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCatalogTableMod.CatalogTableState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
}


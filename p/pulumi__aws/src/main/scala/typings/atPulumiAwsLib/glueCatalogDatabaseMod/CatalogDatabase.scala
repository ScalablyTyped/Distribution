package typings
package atPulumiAwsLib.glueCatalogDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase")
@js.native
class CatalogDatabase protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a CatalogDatabase resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: CatalogDatabaseArgs) = this()
  def this(name: java.lang.String, args: CatalogDatabaseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Description of the database.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The location of the database (for example, an HDFS path).
    */
  val locationUri: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the database.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of key-value pairs that define parameters and properties of the database.
    */
  val parameters: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glue/catalogDatabase", "CatalogDatabase")
@js.native
object CatalogDatabase extends js.Object {
  /**
    * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseState
  ): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
}


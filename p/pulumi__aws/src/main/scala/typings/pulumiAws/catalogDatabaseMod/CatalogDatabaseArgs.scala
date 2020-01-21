package typings.pulumiAws.catalogDatabaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogDatabaseArgs extends js.Object {
  /**
    * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the database.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The location of the database (for example, an HDFS path).
    */
  val locationUri: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of key-value pairs that define parameters and properties of the database.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object CatalogDatabaseArgs {
  @scala.inline
  def apply(
    catalogId: Input[String] = null,
    description: Input[String] = null,
    locationUri: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null
  ): CatalogDatabaseArgs = {
    val __obj = js.Dynamic.literal()
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (locationUri != null) __obj.updateDynamic("locationUri")(locationUri.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogDatabaseArgs]
  }
}


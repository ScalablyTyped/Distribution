package typings.atPulumiAws.glueConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.glue.ConnectionPhysicalConnectionRequirements
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionArgs extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: Input[StringDictionary[_]] = js.native
  /**
    * The type of the connection. Defaults to `JBDC`.
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the connection.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: js.UndefOr[Input[ConnectionPhysicalConnectionRequirements]] = js.native
}

object ConnectionArgs {
  @scala.inline
  def apply(
    connectionProperties: Input[StringDictionary[_]],
    catalogId: Input[String] = null,
    connectionType: Input[String] = null,
    description: Input[String] = null,
    matchCriterias: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    physicalConnectionRequirements: Input[ConnectionPhysicalConnectionRequirements] = null
  ): ConnectionArgs = {
    val __obj = js.Dynamic.literal(connectionProperties = connectionProperties.asInstanceOf[js.Any])
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (matchCriterias != null) __obj.updateDynamic("matchCriterias")(matchCriterias.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (physicalConnectionRequirements != null) __obj.updateDynamic("physicalConnectionRequirements")(physicalConnectionRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArgs]
  }
}


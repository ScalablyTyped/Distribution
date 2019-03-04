package typings
package atPulumiAwsLib.glueConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionArgs extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  /**
    * The type of the connection. Defaults to `JBDC`.
    */
  val connectionType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the connection.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AvailabilityZoneSecurityGroupIdListsSubnetId]
  ] = js.undefined
}

object ConnectionArgs {
  @scala.inline
  def apply(
    connectionProperties: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]],
    catalogId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectionType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    matchCriterias: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    physicalConnectionRequirements: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AvailabilityZoneSecurityGroupIdListsSubnetId] = null
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


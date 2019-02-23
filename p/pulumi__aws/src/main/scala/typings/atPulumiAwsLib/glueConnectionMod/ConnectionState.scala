package typings
package atPulumiAwsLib.glueConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionState extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
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


package typings
package atPulumiAwsLib.workspacesGetBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleResult extends js.Object {
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[atPulumiAwsLib.Anon_NameString_201725593]
  /**
    * The description of the bundle.
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the compute type.
    */
  val name: java.lang.String
  /**
    * The owner of the bundle.
    */
  val owner: java.lang.String
  /**
    * The root volume. See supported fields below.
    */
  val rootStorages: js.Array[atPulumiAwsLib.Anon_Capacity]
  /**
    * The user storage. See supported fields below.
    */
  val userStorages: js.Array[atPulumiAwsLib.Anon_Capacity]
}


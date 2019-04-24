package typings
package atPulumiAwsLib.workspacesGetBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleResult extends js.Object {
  val bundleId: java.lang.String
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[atPulumiAwsLib.Anon_NameString_1260399121]
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

object GetBundleResult {
  @scala.inline
  def apply(
    bundleId: java.lang.String,
    computeTypes: js.Array[atPulumiAwsLib.Anon_NameString_1260399121],
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    owner: java.lang.String,
    rootStorages: js.Array[atPulumiAwsLib.Anon_Capacity],
    userStorages: js.Array[atPulumiAwsLib.Anon_Capacity]
  ): GetBundleResult = {
    val __obj = js.Dynamic.literal(bundleId = bundleId, computeTypes = computeTypes, description = description, id = id, name = name, owner = owner, rootStorages = rootStorages, userStorages = userStorages)
  
    __obj.asInstanceOf[GetBundleResult]
  }
}


package typings.atPulumiAws.workspacesGetBundleMod

import typings.atPulumiAws.Anon_Capacity
import typings.atPulumiAws.Anon_NameString_1260399121
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleResult extends js.Object {
  val bundleId: String
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[Anon_NameString_1260399121]
  /**
    * The description of the bundle.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the compute type.
    */
  val name: String
  /**
    * The owner of the bundle.
    */
  val owner: String
  /**
    * The root volume. See supported fields below.
    */
  val rootStorages: js.Array[Anon_Capacity]
  /**
    * The user storage. See supported fields below.
    */
  val userStorages: js.Array[Anon_Capacity]
}

object GetBundleResult {
  @scala.inline
  def apply(
    bundleId: String,
    computeTypes: js.Array[Anon_NameString_1260399121],
    description: String,
    id: String,
    name: String,
    owner: String,
    rootStorages: js.Array[Anon_Capacity],
    userStorages: js.Array[Anon_Capacity]
  ): GetBundleResult = {
    val __obj = js.Dynamic.literal(bundleId = bundleId, computeTypes = computeTypes, description = description, id = id, name = name, owner = owner, rootStorages = rootStorages, userStorages = userStorages)
  
    __obj.asInstanceOf[GetBundleResult]
  }
}


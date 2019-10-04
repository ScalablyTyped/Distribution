package typings.atPulumiAws.workspacesGetBundleMod

import typings.atPulumiAws.typesOutputMod.workspacesNs.GetBundleComputeType
import typings.atPulumiAws.typesOutputMod.workspacesNs.GetBundleRootStorage
import typings.atPulumiAws.typesOutputMod.workspacesNs.GetBundleUserStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundleResult extends js.Object {
  val bundleId: String
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[GetBundleComputeType]
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
  val rootStorages: js.Array[GetBundleRootStorage]
  /**
    * The user storage. See supported fields below.
    */
  val userStorages: js.Array[GetBundleUserStorage]
}

object GetBundleResult {
  @scala.inline
  def apply(
    bundleId: String,
    computeTypes: js.Array[GetBundleComputeType],
    description: String,
    id: String,
    name: String,
    owner: String,
    rootStorages: js.Array[GetBundleRootStorage],
    userStorages: js.Array[GetBundleUserStorage]
  ): GetBundleResult = {
    val __obj = js.Dynamic.literal(bundleId = bundleId, computeTypes = computeTypes, description = description, id = id, name = name, owner = owner, rootStorages = rootStorages, userStorages = userStorages)
  
    __obj.asInstanceOf[GetBundleResult]
  }
}


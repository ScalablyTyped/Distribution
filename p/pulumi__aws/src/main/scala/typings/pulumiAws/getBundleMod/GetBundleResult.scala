package typings.pulumiAws.getBundleMod

import typings.pulumiAws.outputMod.workspaces.GetBundleComputeType
import typings.pulumiAws.outputMod.workspaces.GetBundleRootStorage
import typings.pulumiAws.outputMod.workspaces.GetBundleUserStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleResult extends js.Object {
  val bundleId: String = js.native
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[GetBundleComputeType] = js.native
  /**
    * The description of the bundle.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the compute type.
    */
  val name: String = js.native
  /**
    * The owner of the bundle.
    */
  val owner: String = js.native
  /**
    * The root volume. See supported fields below.
    */
  val rootStorages: js.Array[GetBundleRootStorage] = js.native
  /**
    * The user storage. See supported fields below.
    */
  val userStorages: js.Array[GetBundleUserStorage] = js.native
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
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], computeTypes = computeTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rootStorages = rootStorages.asInstanceOf[js.Any], userStorages = userStorages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBundleResult]
  }
}


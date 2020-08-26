package typings.pulumiAws.getBundleMod

import typings.pulumiAws.outputMod.workspaces.GetBundleComputeType
import typings.pulumiAws.outputMod.workspaces.GetBundleRootStorage
import typings.pulumiAws.outputMod.workspaces.GetBundleUserStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleResult extends js.Object {
  /**
    * The ID of the bundle.
    */
  val bundleId: js.UndefOr[String] = js.native
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[GetBundleComputeType] = js.native
  /**
    * The description of the bundle.
    */
  val description: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the compute type.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The owner of the bundle.
    */
  val owner: js.UndefOr[String] = js.native
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
    computeTypes: js.Array[GetBundleComputeType],
    description: String,
    id: String,
    rootStorages: js.Array[GetBundleRootStorage],
    userStorages: js.Array[GetBundleUserStorage]
  ): GetBundleResult = {
    val __obj = js.Dynamic.literal(computeTypes = computeTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rootStorages = rootStorages.asInstanceOf[js.Any], userStorages = userStorages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundleResult]
  }
  @scala.inline
  implicit class GetBundleResultOps[Self <: GetBundleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeTypesVarargs(value: GetBundleComputeType*): Self = this.set("computeTypes", js.Array(value :_*))
    @scala.inline
    def setComputeTypes(value: js.Array[GetBundleComputeType]): Self = this.set("computeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootStoragesVarargs(value: GetBundleRootStorage*): Self = this.set("rootStorages", js.Array(value :_*))
    @scala.inline
    def setRootStorages(value: js.Array[GetBundleRootStorage]): Self = this.set("rootStorages", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserStoragesVarargs(value: GetBundleUserStorage*): Self = this.set("userStorages", js.Array(value :_*))
    @scala.inline
    def setUserStorages(value: js.Array[GetBundleUserStorage]): Self = this.set("userStorages", value.asInstanceOf[js.Any])
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


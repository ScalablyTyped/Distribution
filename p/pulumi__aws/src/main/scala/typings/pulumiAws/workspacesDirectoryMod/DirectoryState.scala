package typings.pulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryState extends js.Object {
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  val selfServicePermissions: js.UndefOr[Input[DirectorySelfServicePermissions]] = js.native
  /**
    * The identifiers of the subnets where the directory resides.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DirectoryState {
  @scala.inline
  def apply(
    directoryId: Input[String] = null,
    selfServicePermissions: Input[DirectorySelfServicePermissions] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): DirectoryState = {
    val __obj = js.Dynamic.literal()
    if (directoryId != null) __obj.updateDynamic("directoryId")(directoryId.asInstanceOf[js.Any])
    if (selfServicePermissions != null) __obj.updateDynamic("selfServicePermissions")(selfServicePermissions.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryState]
  }
}


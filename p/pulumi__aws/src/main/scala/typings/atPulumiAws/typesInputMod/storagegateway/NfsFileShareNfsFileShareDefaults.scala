package typings.atPulumiAws.typesInputMod.storagegateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsFileShareNfsFileShareDefaults extends js.Object {
  /**
    * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
    */
  var directoryMode: js.UndefOr[Input[String]] = js.native
  /**
    * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
    */
  var fileMode: js.UndefOr[Input[String]] = js.native
  /**
    * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var groupId: js.UndefOr[Input[Double]] = js.native
  /**
    * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var ownerId: js.UndefOr[Input[Double]] = js.native
}

object NfsFileShareNfsFileShareDefaults {
  @scala.inline
  def apply(
    directoryMode: Input[String] = null,
    fileMode: Input[String] = null,
    groupId: Input[Double] = null,
    ownerId: Input[Double] = null
  ): NfsFileShareNfsFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
  }
}


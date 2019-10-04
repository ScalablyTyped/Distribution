package typings.atPulumiAws.typesOutputMod.storagegatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsFileShareNfsFileShareDefaults extends js.Object {
  /**
    * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
    */
  var directoryMode: js.UndefOr[String] = js.undefined
  /**
    * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
    */
  var fileMode: js.UndefOr[String] = js.undefined
  /**
    * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var groupId: js.UndefOr[Double] = js.undefined
  /**
    * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var ownerId: js.UndefOr[Double] = js.undefined
}

object NfsFileShareNfsFileShareDefaults {
  @scala.inline
  def apply(
    directoryMode: String = null,
    fileMode: String = null,
    groupId: Int | Double = null,
    ownerId: Int | Double = null
  ): NfsFileShareNfsFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode)
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
  }
}


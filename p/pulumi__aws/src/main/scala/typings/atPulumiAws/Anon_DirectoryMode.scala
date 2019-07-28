package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectoryMode extends js.Object {
  var directoryMode: js.UndefOr[String] = js.undefined
  var fileMode: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[Double] = js.undefined
  var ownerId: js.UndefOr[Double] = js.undefined
}

object Anon_DirectoryMode {
  @scala.inline
  def apply(
    directoryMode: String = null,
    fileMode: String = null,
    groupId: Int | Double = null,
    ownerId: Int | Double = null
  ): Anon_DirectoryMode = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode)
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DirectoryMode]
  }
}


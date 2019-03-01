package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectoryMode extends js.Object {
  var directoryMode: js.UndefOr[java.lang.String] = js.undefined
  var fileMode: js.UndefOr[java.lang.String] = js.undefined
  var groupId: js.UndefOr[scala.Double] = js.undefined
  var ownerId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DirectoryMode {
  @scala.inline
  def apply(
    directoryMode: java.lang.String = null,
    fileMode: java.lang.String = null,
    groupId: scala.Int | scala.Double = null,
    ownerId: scala.Int | scala.Double = null
  ): Anon_DirectoryMode = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode)
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DirectoryMode]
  }
}


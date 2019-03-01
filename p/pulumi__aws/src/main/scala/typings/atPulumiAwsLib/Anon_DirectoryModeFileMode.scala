package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectoryModeFileMode extends js.Object {
  var directoryMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var fileMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var groupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_DirectoryModeFileMode {
  @scala.inline
  def apply(
    directoryMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fileMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    groupId: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ownerId: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DirectoryModeFileMode = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DirectoryModeFileMode]
  }
}


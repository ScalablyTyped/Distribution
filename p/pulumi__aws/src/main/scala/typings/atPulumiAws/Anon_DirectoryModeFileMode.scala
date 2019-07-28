package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectoryModeFileMode extends js.Object {
  var directoryMode: js.UndefOr[Input[String]] = js.undefined
  var fileMode: js.UndefOr[Input[String]] = js.undefined
  var groupId: js.UndefOr[Input[Double]] = js.undefined
  var ownerId: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_DirectoryModeFileMode {
  @scala.inline
  def apply(
    directoryMode: Input[String] = null,
    fileMode: Input[String] = null,
    groupId: Input[Double] = null,
    ownerId: Input[Double] = null
  ): Anon_DirectoryModeFileMode = {
    val __obj = js.Dynamic.literal()
    if (directoryMode != null) __obj.updateDynamic("directoryMode")(directoryMode.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DirectoryModeFileMode]
  }
}


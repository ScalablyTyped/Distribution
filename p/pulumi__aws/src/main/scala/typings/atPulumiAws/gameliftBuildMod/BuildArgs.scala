package typings.atPulumiAws.gameliftBuildMod

import typings.atPulumiAws.typesInputMod.gamelift.BuildStorageLocation
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArgs extends js.Object {
  /**
    * Name of the build
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: Input[String] = js.native
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: Input[BuildStorageLocation] = js.native
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object BuildArgs {
  @scala.inline
  def apply(
    operatingSystem: Input[String],
    storageLocation: Input[BuildStorageLocation],
    name: Input[String] = null,
    version: Input[String] = null
  ): BuildArgs = {
    val __obj = js.Dynamic.literal(operatingSystem = operatingSystem.asInstanceOf[js.Any], storageLocation = storageLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArgs]
  }
}


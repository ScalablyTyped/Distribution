package typings
package atPulumiAwsLib.gameliftBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildState extends js.Object {
  /**
    * Name of the build
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketKeyRoleArn]] = js.undefined
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object BuildState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    operatingSystem: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    storageLocation: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketKeyRoleArn] = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): BuildState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildState]
  }
}


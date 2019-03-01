package typings
package atPulumiAwsLib.gameliftBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArgs extends js.Object {
  /**
    * Name of the build
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketKeyRoleArn]
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object BuildArgs {
  @scala.inline
  def apply(
    operatingSystem: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    storageLocation: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketKeyRoleArn],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): BuildArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArgs]
  }
}


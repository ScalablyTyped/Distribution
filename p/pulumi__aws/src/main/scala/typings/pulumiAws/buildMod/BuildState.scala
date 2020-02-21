package typings.pulumiAws.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.BuildStorageLocation
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildState extends js.Object {
  /**
    * Gamelift Build ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the build
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: js.UndefOr[Input[BuildStorageLocation]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object BuildState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    operatingSystem: Input[String] = null,
    storageLocation: Input[BuildStorageLocation] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): BuildState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildState]
  }
}


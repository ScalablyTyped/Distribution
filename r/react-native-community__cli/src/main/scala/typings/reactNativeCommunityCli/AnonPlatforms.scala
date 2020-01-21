package typings.reactNativeCommunityCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlatforms extends js.Object {
  var platforms: js.Array[String]
  var providesModuleNodeModules: js.Array[String]
}

object AnonPlatforms {
  @scala.inline
  def apply(platforms: js.Array[String], providesModuleNodeModules: js.Array[String]): AnonPlatforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlatforms]
  }
}


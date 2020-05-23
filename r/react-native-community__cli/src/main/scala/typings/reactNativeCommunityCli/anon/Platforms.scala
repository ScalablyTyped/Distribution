package typings.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platforms extends js.Object {
  var platforms: js.Array[String]
  var providesModuleNodeModules: js.Array[String]
}

object Platforms {
  @scala.inline
  def apply(platforms: js.Array[String], providesModuleNodeModules: js.Array[String]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
}


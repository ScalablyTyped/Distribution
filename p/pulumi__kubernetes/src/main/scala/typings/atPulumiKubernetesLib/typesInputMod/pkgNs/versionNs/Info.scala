package typings
package atPulumiKubernetesLib.typesInputMod.pkgNs.versionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
trait Info extends js.Object {
  var buildDate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var compiler: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var gitCommit: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var gitTreeState: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var gitVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var goVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var major: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var minor: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var platform: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Info {
  @scala.inline
  def apply(
    buildDate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    compiler: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    gitCommit: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    gitTreeState: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    gitVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    goVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    major: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    minor: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    platform: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildDate")(buildDate.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    __obj.updateDynamic("gitCommit")(gitCommit.asInstanceOf[js.Any])
    __obj.updateDynamic("gitTreeState")(gitTreeState.asInstanceOf[js.Any])
    __obj.updateDynamic("gitVersion")(gitVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("goVersion")(goVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}


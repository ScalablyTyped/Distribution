package typings.pulumiKubernetes.inputMod.pkg.version

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
trait Info extends js.Object {
  var buildDate: Input[String]
  var compiler: Input[String]
  var gitCommit: Input[String]
  var gitTreeState: Input[String]
  var gitVersion: Input[String]
  var goVersion: Input[String]
  var major: Input[String]
  var minor: Input[String]
  var platform: Input[String]
}

object Info {
  @scala.inline
  def apply(
    buildDate: Input[String],
    compiler: Input[String],
    gitCommit: Input[String],
    gitTreeState: Input[String],
    gitVersion: Input[String],
    goVersion: Input[String],
    major: Input[String],
    minor: Input[String],
    platform: Input[String]
  ): Info = {
    val __obj = js.Dynamic.literal(buildDate = buildDate.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], gitTreeState = gitTreeState.asInstanceOf[js.Any], gitVersion = gitVersion.asInstanceOf[js.Any], goVersion = goVersion.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}


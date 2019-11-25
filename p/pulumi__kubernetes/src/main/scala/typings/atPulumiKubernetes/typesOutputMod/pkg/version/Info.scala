package typings.atPulumiKubernetes.typesOutputMod.pkg.version

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
trait Info extends js.Object {
  val buildDate: String
  val compiler: String
  val gitCommit: String
  val gitTreeState: String
  val gitVersion: String
  val goVersion: String
  val major: String
  val minor: String
  val platform: String
}

object Info {
  @scala.inline
  def apply(
    buildDate: String,
    compiler: String,
    gitCommit: String,
    gitTreeState: String,
    gitVersion: String,
    goVersion: String,
    major: String,
    minor: String,
    platform: String
  ): Info = {
    val __obj = js.Dynamic.literal(buildDate = buildDate.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], gitTreeState = gitTreeState.asInstanceOf[js.Any], gitVersion = gitVersion.asInstanceOf[js.Any], goVersion = goVersion.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Info]
  }
}


package typings.atPulumiKubernetes.typesOutputMod.pkgNs.versionNs

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
    val __obj = js.Dynamic.literal(buildDate = buildDate, compiler = compiler, gitCommit = gitCommit, gitTreeState = gitTreeState, gitVersion = gitVersion, goVersion = goVersion, major = major, minor = minor, platform = platform)
  
    __obj.asInstanceOf[Info]
  }
}


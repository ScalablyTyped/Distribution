package typings
package atPulumiKubernetesLib.typesOutputMod.pkgNs.versionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
trait Info extends js.Object {
  val buildDate: java.lang.String
  val compiler: java.lang.String
  val gitCommit: java.lang.String
  val gitTreeState: java.lang.String
  val gitVersion: java.lang.String
  val goVersion: java.lang.String
  val major: java.lang.String
  val minor: java.lang.String
  val platform: java.lang.String
}

object Info {
  @scala.inline
  def apply(
    buildDate: java.lang.String,
    compiler: java.lang.String,
    gitCommit: java.lang.String,
    gitTreeState: java.lang.String,
    gitVersion: java.lang.String,
    goVersion: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    platform: java.lang.String
  ): Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildDate")(buildDate)
    __obj.updateDynamic("compiler")(compiler)
    __obj.updateDynamic("gitCommit")(gitCommit)
    __obj.updateDynamic("gitTreeState")(gitTreeState)
    __obj.updateDynamic("gitVersion")(gitVersion)
    __obj.updateDynamic("goVersion")(goVersion)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Info]
  }
}


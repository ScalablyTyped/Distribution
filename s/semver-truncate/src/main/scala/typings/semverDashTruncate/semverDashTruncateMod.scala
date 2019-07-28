package typings.semverDashTruncate

import typings.semverDashTruncate.semverDashTruncateStrings.major
import typings.semverDashTruncate.semverDashTruncateStrings.minor
import typings.semverDashTruncate.semverDashTruncateStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver-truncate", JSImport.Namespace)
@js.native
object semverDashTruncateMod extends js.Object {
  def apply(version: String, `type`: patch | minor | major): String = js.native
}


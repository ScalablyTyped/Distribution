package typings
package semverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object semverMod {
  type Operator = semverLib.semverLibStrings.`===` | semverLib.semverLibStrings.`!==` | semverLib.semverLibStrings.Empty | semverLib.semverLibStrings.`=` | semverLib.semverLibStrings.`==` | semverLib.semverLibStrings.`!=` | semverLib.semverLibStrings.`>` | semverLib.semverLibStrings.`>=` | semverLib.semverLibStrings.`<` | semverLib.semverLibStrings.`<=`
  type ReleaseType = semverLib.semverLibStrings.major | semverLib.semverLibStrings.premajor | semverLib.semverLibStrings.minor | semverLib.semverLibStrings.preminor | semverLib.semverLibStrings.patch | semverLib.semverLibStrings.prepatch | semverLib.semverLibStrings.prerelease
}

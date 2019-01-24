package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ResultNs {
  type baselineState = sarifLib.sarifLibStrings.`new` | sarifLib.sarifLibStrings.existing | sarifLib.sarifLibStrings.absent
  type level = sarifLib.sarifLibStrings.notApplicable | sarifLib.sarifLibStrings.pass | sarifLib.sarifLibStrings.note | sarifLib.sarifLibStrings.warning | sarifLib.sarifLibStrings.error | sarifLib.sarifLibStrings.open
  type suppressionStates = sarifLib.sarifLibStrings.suppressedInSource | sarifLib.sarifLibStrings.suppressedExternally
}

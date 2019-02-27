package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ResultNs {
  type baselineState = sarifLib.sarifLibStrings.`new` | sarifLib.sarifLibStrings.unchanged | sarifLib.sarifLibStrings.updated | sarifLib.sarifLibStrings.absent
  type kind = sarifLib.sarifLibStrings.none | sarifLib.sarifLibStrings.notApplicable | sarifLib.sarifLibStrings.pass | sarifLib.sarifLibStrings.fail | sarifLib.sarifLibStrings.review | sarifLib.sarifLibStrings.open
  type level = sarifLib.sarifLibStrings.none | sarifLib.sarifLibStrings.note | sarifLib.sarifLibStrings.warning | sarifLib.sarifLibStrings.error
  type suppressionStates = sarifLib.sarifLibStrings.suppressedInSource | sarifLib.sarifLibStrings.suppressedExternally
}

package typings
package proxyDashVerifierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxyDashVerifierMod {
  type AnonymityLevel = proxyDashVerifierLib.proxyDashVerifierLibStrings.transparent | proxyDashVerifierLib.proxyDashVerifierLibStrings.anonymous | proxyDashVerifierLib.proxyDashVerifierLibStrings.elite
  type CustomTestResult = CustomTestWorkingResult | CustomTestNotWorkingResult
  type Protocol = proxyDashVerifierLib.proxyDashVerifierLibStrings.http | proxyDashVerifierLib.proxyDashVerifierLibStrings.https | proxyDashVerifierLib.proxyDashVerifierLibStrings.socks5 | proxyDashVerifierLib.proxyDashVerifierLibStrings.socks4
  type Result = WorkingResult | NotWorkingResult
}

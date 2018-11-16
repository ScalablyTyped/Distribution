package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coverage extends js.Object {
  def startCSSCoverage(): stdLib.Promise[scala.Unit] = js.native
  def startCSSCoverage(options: StartCoverageOptions): stdLib.Promise[scala.Unit] = js.native
  def startJSCoverage(): stdLib.Promise[scala.Unit] = js.native
  def startJSCoverage(options: StartCoverageOptions): stdLib.Promise[scala.Unit] = js.native
  def stopCSSCoverage(): stdLib.Promise[js.Array[CoverageEntry]] = js.native
  def stopJSCoverage(): stdLib.Promise[js.Array[CoverageEntry]] = js.native
}


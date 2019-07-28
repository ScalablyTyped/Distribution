package typings.sigmajs

import typings.sigmajs.SigmaJsNs.Sigma
import typings.sigmajs.SigmaJsNs.SigmaConfigs
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sigma")
@js.native
class sigma () extends Sigma {
  def this(configuration: SigmaConfigs) = this()
  def this(container: String) = this()
  def this(container: Element) = this()
}


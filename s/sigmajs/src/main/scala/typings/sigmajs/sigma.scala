package typings.sigmajs

import org.scalablytyped.runtime.TopLevel
import typings.sigmajs.SigmaJs.Sigma
import typings.sigmajs.SigmaJs.SigmaConfigs
import typings.sigmajs.SigmaJs.SigmaFactory
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

@JSGlobal("sigma")
@js.native
object sigma extends TopLevel[SigmaFactory]


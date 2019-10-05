package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parsers extends js.Object {
  @JSName("gexf")
  var gexf_Original: GexfParser = js.native
  @JSName("json")
  var json_Original: JsonParser = js.native
  def gexf(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit = js.native
  def json(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit = js.native
}


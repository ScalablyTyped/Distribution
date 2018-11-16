package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parsers extends js.Object {
  @JSName("gexf")
  var gexf_Original: GexfParser = js.native
  @JSName("json")
  var json_Original: JsonParser = js.native
  def gexf(target: java.lang.String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, scala.Unit]): scala.Unit = js.native
  def json(target: java.lang.String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, scala.Unit]): scala.Unit = js.native
}


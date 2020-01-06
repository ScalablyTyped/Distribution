package typings.atRdfjsParserDashN3.atRdfjsParserDashN3Mod

import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.Sink
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[Q /* <: BaseQuad */] extends Sink[Q] {
  def `import`(stream: Stream[Q], options: ParserOptions): Stream[Q] = js.native
}


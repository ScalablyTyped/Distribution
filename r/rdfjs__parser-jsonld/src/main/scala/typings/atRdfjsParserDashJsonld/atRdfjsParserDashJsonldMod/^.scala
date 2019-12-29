package typings.atRdfjsParserDashJsonld.atRdfjsParserDashJsonldMod

import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/parser-jsonld", JSImport.Namespace)
@js.native
class ^ () extends Parser {
  def this(options: ParserOptions) = this()
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  /* CompleteClass */
  override def `import`(stream: Stream[Quad]): EventEmitter = js.native
}


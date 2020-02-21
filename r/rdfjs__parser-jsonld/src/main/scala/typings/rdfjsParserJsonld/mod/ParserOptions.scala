package typings.rdfjsParserJsonld.mod

import typings.jsonld.jsonldSpecMod.Context
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var factory: js.UndefOr[DataFactory[Quad]] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(baseIRI: String = null, context: Context = null, factory: DataFactory[Quad] = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}


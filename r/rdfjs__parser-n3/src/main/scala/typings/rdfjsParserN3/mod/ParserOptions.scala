package typings.rdfjsParserN3.mod

import typings.rdfJs.mod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var factory: js.UndefOr[DataFactory] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(baseIRI: String = null, factory: DataFactory = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}


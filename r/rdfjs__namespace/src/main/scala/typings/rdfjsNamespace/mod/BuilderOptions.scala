package typings.rdfjsNamespace.mod

import typings.rdfJs.mod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuilderOptions extends js.Object {
  var factory: js.UndefOr[DataFactory] = js.undefined
}

object BuilderOptions {
  @scala.inline
  def apply(factory: DataFactory = null): BuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuilderOptions]
  }
}


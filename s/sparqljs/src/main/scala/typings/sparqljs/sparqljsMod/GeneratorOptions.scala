package typings.sparqljs.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorOptions extends js.Object {
  var allPrefixes: js.UndefOr[Boolean] = js.undefined
}

object GeneratorOptions {
  @scala.inline
  def apply(allPrefixes: js.UndefOr[Boolean] = js.undefined): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPrefixes)) __obj.updateDynamic("allPrefixes")(allPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorOptions]
  }
}


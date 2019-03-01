package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorOptions extends js.Object {
  var allPrefixes: js.UndefOr[scala.Boolean] = js.undefined
}

object GeneratorOptions {
  @scala.inline
  def apply(allPrefixes: js.UndefOr[scala.Boolean] = js.undefined): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPrefixes)) __obj.updateDynamic("allPrefixes")(allPrefixes)
    __obj.asInstanceOf[GeneratorOptions]
  }
}


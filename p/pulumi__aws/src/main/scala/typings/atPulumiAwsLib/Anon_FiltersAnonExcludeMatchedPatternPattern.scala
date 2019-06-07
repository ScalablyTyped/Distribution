package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersAnonExcludeMatchedPatternPattern extends js.Object {
  var filters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ExcludeMatchedPatternPattern]]]
  ] = js.undefined
}

object Anon_FiltersAnonExcludeMatchedPatternPattern {
  @scala.inline
  def apply(
    filters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ExcludeMatchedPatternPattern]]] = null
  ): Anon_FiltersAnonExcludeMatchedPatternPattern = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FiltersAnonExcludeMatchedPatternPattern]
  }
}


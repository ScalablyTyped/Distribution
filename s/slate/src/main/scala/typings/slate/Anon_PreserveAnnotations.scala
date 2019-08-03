package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveAnnotations extends js.Object {
  var preserveAnnotations: js.UndefOr[Boolean] = js.undefined
  var preserveData: js.UndefOr[Boolean] = js.undefined
  var preserveSelection: js.UndefOr[Boolean] = js.undefined
}

object Anon_PreserveAnnotations {
  @scala.inline
  def apply(
    preserveAnnotations: js.UndefOr[Boolean] = js.undefined,
    preserveData: js.UndefOr[Boolean] = js.undefined,
    preserveSelection: js.UndefOr[Boolean] = js.undefined
  ): Anon_PreserveAnnotations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveAnnotations)) __obj.updateDynamic("preserveAnnotations")(preserveAnnotations)
    if (!js.isUndefined(preserveData)) __obj.updateDynamic("preserveData")(preserveData)
    if (!js.isUndefined(preserveSelection)) __obj.updateDynamic("preserveSelection")(preserveSelection)
    __obj.asInstanceOf[Anon_PreserveAnnotations]
  }
}


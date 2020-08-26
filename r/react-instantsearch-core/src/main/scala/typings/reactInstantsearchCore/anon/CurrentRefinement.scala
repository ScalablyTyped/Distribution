package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRefinement extends js.Object {
  var currentRefinement: String = js.native
  var items: js.UndefOr[scala.Nothing] = js.native
}

object CurrentRefinement {
  @scala.inline
  def apply(currentRefinement: String): CurrentRefinement = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRefinement]
  }
  @scala.inline
  implicit class CurrentRefinementOps[Self <: CurrentRefinement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
  }
  
}


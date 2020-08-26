package typings.semanticUiRating.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'initialRating'> */
@js.native
trait PickImplinitialRating extends js.Object {
  var initialRating: Double = js.native
}

object PickImplinitialRating {
  @scala.inline
  def apply(initialRating: Double): PickImplinitialRating = {
    val __obj = js.Dynamic.literal(initialRating = initialRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinitialRating]
  }
  @scala.inline
  implicit class PickImplinitialRatingOps[Self <: PickImplinitialRating] (val x: Self) extends AnyVal {
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
    def setInitialRating(value: Double): Self = this.set("initialRating", value.asInstanceOf[js.Any])
  }
  
}


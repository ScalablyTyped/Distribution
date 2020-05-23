package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsRefined extends js.Object {
  var isRefined: Boolean
  var label: String
  var noRefinement: Boolean
  var value: String
}

object IsRefined {
  @scala.inline
  def apply(isRefined: Boolean, label: String, noRefinement: Boolean, value: String): IsRefined = {
    val __obj = js.Dynamic.literal(isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noRefinement = noRefinement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefined]
  }
}


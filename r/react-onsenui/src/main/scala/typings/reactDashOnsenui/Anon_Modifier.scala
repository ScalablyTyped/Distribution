package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modifier extends js.Object {
  var modifier: js.UndefOr[String] = js.undefined
}

object Anon_Modifier {
  @scala.inline
  def apply(modifier: String = null): Anon_Modifier = {
    val __obj = js.Dynamic.literal()
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[Anon_Modifier]
  }
}


package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(`data-badge`: String | Double = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (`data-badge` != null) __obj.updateDynamic("data-badge")(`data-badge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}


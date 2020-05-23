package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparator extends js.Object {
  var comparator: js.Any
  var filterType: TEXT
  var filterVal: js.Any
}

object Comparator {
  @scala.inline
  def apply(comparator: js.Any, filterType: TEXT, filterVal: js.Any): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any], filterVal = filterVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
}


package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var ref: js.UndefOr[js.Function1[/* element */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}

object Anon_Element {
  @scala.inline
  def apply(
    style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    ref: /* element */ stdLib.HTMLElement => scala.Unit = null
  ): Anon_Element = {
    val __obj = js.Dynamic.literal(style = style)
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Anon_Element]
  }
}


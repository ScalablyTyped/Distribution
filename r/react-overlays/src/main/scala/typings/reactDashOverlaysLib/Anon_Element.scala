package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var ref: js.UndefOr[js.Function1[/* element */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  var style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}

object Anon_Element {
  @scala.inline
  def apply(
    style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    ref: js.Function1[/* element */ reactLib.HTMLElement, scala.Unit] = null
  ): Anon_Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("style")(style)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Element]
  }
}


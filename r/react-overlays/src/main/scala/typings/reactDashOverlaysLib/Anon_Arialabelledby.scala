package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabelledby extends js.Object {
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[js.Function1[/* element */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  var style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}

object Anon_Arialabelledby {
  @scala.inline
  def apply(
    style: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    `aria-labelledby`: java.lang.String = null,
    ref: js.Function1[/* element */ reactLib.HTMLElement, scala.Unit] = null
  ): Anon_Arialabelledby = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("style")(style)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Arialabelledby]
  }
}


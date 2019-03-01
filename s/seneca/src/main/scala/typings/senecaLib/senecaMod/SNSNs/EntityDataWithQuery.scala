package typings
package senecaLib.senecaMod.SNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityDataWithQuery
  extends /* entityKey */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("sort$")
  var sort$: js.UndefOr[js.Any] = js.undefined
}

object EntityDataWithQuery {
  @scala.inline
  def apply(
    StringDictionary: /* entityKey */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    id: java.lang.String = null,
    sort$: js.Any = null
  ): EntityDataWithQuery = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sort$ != null) __obj.updateDynamic("sort$")(sort$)
    __obj.asInstanceOf[EntityDataWithQuery]
  }
}


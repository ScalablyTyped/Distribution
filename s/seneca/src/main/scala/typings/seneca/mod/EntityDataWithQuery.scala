package typings.seneca.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityDataWithQuery
  extends /* plugin_name */ StringDictionary[js.Any] {
  var id: js.UndefOr[String] = js.undefined
  @JSName("sort$")
  var sort$: js.UndefOr[js.Any] = js.undefined
}

object EntityDataWithQuery {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    id: String = null,
    sort$: js.Any = null
  ): EntityDataWithQuery = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sort$ != null) __obj.updateDynamic("sort$")(sort$.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDataWithQuery]
  }
}


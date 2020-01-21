package typings.reactTabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLUListElement>, 'className'> ]: react.react.HTMLProps<std.HTMLUListElement>[P]} */ trait TabListProps extends js.Object {
  var className: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
}

object TabListProps {
  @scala.inline
  def apply(className: String | js.Array[String] | StringDictionary[Boolean] = null): TabListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabListProps]
  }
}


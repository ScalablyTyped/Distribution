package typings
package reactDashTabsLib.reactDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<react.HTMLUListElement>, 'className'> ]: react.react.HTMLProps<react.HTMLUListElement>[P]} */ trait TabListProps extends js.Object {
  var className: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
}

object TabListProps {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null
  ): TabListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabListProps]
  }
}


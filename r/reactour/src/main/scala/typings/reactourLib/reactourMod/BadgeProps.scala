package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.PropsWithRef<react.react.ComponentProps<'span'>> | react.react.PropsWithoutRef<any> & react.react.RefAttributes<std.InstanceType<'span'>> */ trait BadgeProps extends js.Object {
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(accentColor: java.lang.String = null): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    __obj.asInstanceOf[BadgeProps]
  }
}


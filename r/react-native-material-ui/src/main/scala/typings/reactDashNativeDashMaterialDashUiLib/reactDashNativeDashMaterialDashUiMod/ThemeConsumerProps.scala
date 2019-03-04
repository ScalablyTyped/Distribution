package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps extends js.Object {
  def children(props: ThemeProps): reactLib.reactMod.ReactNs.ReactElement[_]
}

object ThemeConsumerProps {
  @scala.inline
  def apply(children: js.Function1[ThemeProps, reactLib.reactMod.ReactNs.ReactElement[_]]): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[ThemeConsumerProps]
  }
}


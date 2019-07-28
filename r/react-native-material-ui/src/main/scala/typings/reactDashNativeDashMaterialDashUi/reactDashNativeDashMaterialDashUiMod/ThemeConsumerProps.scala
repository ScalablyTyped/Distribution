package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps extends js.Object {
  def children(props: ThemeProps): ReactElement
}

object ThemeConsumerProps {
  @scala.inline
  def apply(children: ThemeProps => ReactElement): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ThemeConsumerProps]
  }
}


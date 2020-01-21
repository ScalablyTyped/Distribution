package typings.reactNativeTabView

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  def jumpTo(key: String): Unit
  def render(children: ReactNode): ReactNode
}

object AnonChildren {
  @scala.inline
  def apply(
    jumpTo: String => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    render: ReactNode => ReactNode
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[AnonChildren]
  }
}


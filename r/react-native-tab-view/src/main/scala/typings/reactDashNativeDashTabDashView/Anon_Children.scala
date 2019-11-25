package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  def jumpTo(key: String): Unit
  def render(children: ReactNode): ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(
    jumpTo: String => Unit,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    render: ReactNode => ReactNode
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[Anon_Children]
  }
}


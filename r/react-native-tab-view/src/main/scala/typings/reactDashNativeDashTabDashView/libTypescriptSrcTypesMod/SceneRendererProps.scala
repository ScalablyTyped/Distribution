package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneRendererProps extends js.Object {
  var layout: Layout
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  def jumpTo(key: String): Unit
}

object SceneRendererProps {
  @scala.inline
  def apply(
    jumpTo: String => Unit,
    layout: Layout,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  ): SceneRendererProps = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SceneRendererProps]
  }
}


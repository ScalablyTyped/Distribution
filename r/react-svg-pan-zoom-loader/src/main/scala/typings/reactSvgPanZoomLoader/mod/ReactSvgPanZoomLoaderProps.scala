package typings.reactSvgPanZoomLoader.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSvgPanZoomLoaderProps extends js.Object {
  var proxy: js.UndefOr[ReactNode] = js.undefined
  var src: String
  def render(content: ReactNode): ReactNode
}

object ReactSvgPanZoomLoaderProps {
  @scala.inline
  def apply(render: ReactNode => ReactNode, src: String, proxy: ReactNode = null): ReactSvgPanZoomLoaderProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
  }
}


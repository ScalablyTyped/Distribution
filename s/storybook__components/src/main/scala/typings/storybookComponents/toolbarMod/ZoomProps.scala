package typings.storybookComponents.toolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomProps extends js.Object {
  def resetZoom(): Unit
  def zoom(`val`: Double): Unit
}

object ZoomProps {
  @scala.inline
  def apply(resetZoom: () => Unit, zoom: Double => Unit): ZoomProps = {
    val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
  
    __obj.asInstanceOf[ZoomProps]
  }
}


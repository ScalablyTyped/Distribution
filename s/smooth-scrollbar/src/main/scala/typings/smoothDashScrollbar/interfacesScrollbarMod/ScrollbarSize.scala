package typings.smoothDashScrollbar.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarSize extends js.Object {
  var container: Metrics
  var content: Metrics
}

object ScrollbarSize {
  @scala.inline
  def apply(container: Metrics, content: Metrics): ScrollbarSize = {
    val __obj = js.Dynamic.literal(container = container, content = content)
  
    __obj.asInstanceOf[ScrollbarSize]
  }
}


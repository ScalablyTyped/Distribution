package typings.reactDashLeaflet

import typings.leaflet.leafletMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E
}

object Anon_PopupContainer {
  @scala.inline
  def apply[E /* <: Path */](popupContainer: E): Anon_PopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PopupContainer[E]]
  }
}


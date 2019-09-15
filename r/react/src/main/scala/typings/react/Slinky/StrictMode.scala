package typings.react.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StrictMode
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.react.reactMod.^.StrictMode.asInstanceOf[String | js.Object]
  def apply(): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_Children
}


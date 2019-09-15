package typings.semanticDashUiDashReact.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsAddonsRefRefFindNodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RefFindNode
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsRefRefFindNodeMod.default].asInstanceOf[String | js.Object]
  def apply(
    ReactComponentClass: ReactComponentClass[typings.semanticDashUiDashReact.distCommonjsAddonsRefRefFindNodeMod.RefFindNode] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ReactComponentClass)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typings.semanticDashUiDashReact.distCommonjsAddonsRefRefFindNodeMod.RefFindNode
}


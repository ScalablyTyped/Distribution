package typings.stormReactDiagrams.linkWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/widgets/LinkWidget", "LinkWidget")
@js.native
class LinkWidget protected () extends BaseWidget[LinkProps, LinkState] {
  def this(props: LinkProps) = this()
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MLinkWidget(): Boolean = js.native
}

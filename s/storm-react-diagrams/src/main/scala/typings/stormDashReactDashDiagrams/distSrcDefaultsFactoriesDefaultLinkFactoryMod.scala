package typings.stormDashReactDashDiagrams

import typings.react.reactMod.Global.JSX.Element
import typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
import typings.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultLinkWidgetMod.DefaultLinkWidget
import typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", JSImport.Namespace)
@js.native
object distSrcDefaultsFactoriesDefaultLinkFactoryMod extends js.Object {
  @js.native
  class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): Element = js.native
  }
  
}


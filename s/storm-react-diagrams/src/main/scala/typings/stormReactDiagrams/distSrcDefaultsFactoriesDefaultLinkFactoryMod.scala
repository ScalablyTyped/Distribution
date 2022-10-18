package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.distSrcDefaultsWidgetsDefaultLinkWidgetMod.DefaultLinkWidget
import typings.stormReactDiagrams.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsFactoriesDefaultLinkFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", "DefaultLinkFactory")
  @js.native
  open class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): Element = js.native
  }
}

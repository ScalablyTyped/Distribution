package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typings.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLinkFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", "DefaultLinkFactory")
  @js.native
  open class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): Element = js.native
  }
}

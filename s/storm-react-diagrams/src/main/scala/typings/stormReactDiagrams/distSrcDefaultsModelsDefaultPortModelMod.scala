package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.stormReactDiagrams.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typings.stormReactDiagrams.distSrcModelsPortModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsModelsDefaultPortModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultPortModel", "DefaultPortModel")
  @js.native
  open class DefaultPortModel protected () extends PortModel {
    def this(isInput: Boolean, name: String) = this()
    def this(isInput: Boolean, name: String, label: String) = this()
    def this(isInput: Boolean, name: String, label: String, id: String) = this()
    def this(isInput: Boolean, name: String, label: Unit, id: String) = this()
    
    var in: Boolean = js.native
    
    var label: String = js.native
    
    def link(port: PortModel): LinkModel[LinkModelListener] = js.native
    
    @JSName("links")
    var links_DefaultPortModel: StringDictionary[DefaultLinkModel] = js.native
  }
}

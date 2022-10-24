package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.stormReactDiagrams.anon.Height
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typings.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsPortModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/PortModel", "PortModel")
  @js.native
  open class PortModel protected () extends BaseModel[NodeModel, BaseModelListener] {
    def this(name: String) = this()
    def this(name: String, `type`: String) = this()
    def this(name: String, `type`: String, id: String) = this()
    def this(name: String, `type`: Unit, id: String) = this()
    def this(name: String, `type`: String, id: String, maximumLinks: Double) = this()
    def this(name: String, `type`: String, id: Unit, maximumLinks: Double) = this()
    def this(name: String, `type`: Unit, id: String, maximumLinks: Double) = this()
    def this(name: String, `type`: Unit, id: Unit, maximumLinks: Double) = this()
    
    def addLink(link: LinkModel[LinkModelListener]): Unit = js.native
    
    def canLinkToPort(port: PortModel): Boolean = js.native
    
    def createLinkModel(): LinkModel[LinkModelListener] | Null = js.native
    
    def doClone(lookupTable: js.Object, clone: Any): Unit = js.native
    
    def getLinks(): StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    def getMaximumLinks(): Double = js.native
    
    def getName(): String = js.native
    
    def getNode(): NodeModel = js.native
    
    var height: Double = js.native
    
    var links: StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    var maximumLinks: Double = js.native
    
    var name: String = js.native
    
    def removeLink(link: LinkModel[LinkModelListener]): Unit = js.native
    
    def setMaximumLinks(maximumLinks: Double): Unit = js.native
    
    def updateCoords(param0: Height): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}

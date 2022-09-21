package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultNodeModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultNodeModel", "DefaultNodeModel")
  @js.native
  open class DefaultNodeModel () extends NodeModel {
    def this(name: String) = this()
    def this(name: String, color: String) = this()
    def this(name: Unit, color: String) = this()
    
    def addInPort(label: String): DefaultPortModel = js.native
    
    def addOutPort(label: String): DefaultPortModel = js.native
    
    var color: String = js.native
    
    def getInPorts(): js.Array[DefaultPortModel] = js.native
    
    def getOutPorts(): js.Array[DefaultPortModel] = js.native
    
    var name: String = js.native
    
    @JSName("ports")
    var ports_DefaultNodeModel: StringDictionary[DefaultPortModel] = js.native
  }
}

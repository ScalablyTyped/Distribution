package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.X
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsPointModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/PointModel", "PointModel")
  @js.native
  open class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: X) = this()
    
    def getLink(): LinkModel[LinkModelListener] = js.native
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def isConnectedToPort(): Boolean = js.native
    
    def updateLocation(points: X): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}

package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.BaseEventDefaultLinkModel
import typings.stormReactDiagrams.anon.BaseEventDefaultLinkModelEntity
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsModelsDefaultLinkModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel", "DefaultLinkModel")
  @js.native
  open class DefaultLinkModel () extends LinkModel[DefaultLinkModelListener] {
    def this(`type`: String) = this()
    
    def addLabel(label: String): Unit = js.native
    
    var color: String = js.native
    
    var curvyness: Double = js.native
    
    def setColor(color: String): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    var width: Double = js.native
  }
  
  trait DefaultLinkModelListener
    extends StObject
       with LinkModelListener {
    
    var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModel, Unit]] = js.undefined
    
    var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModelEntity, Unit]] = js.undefined
  }
  object DefaultLinkModelListener {
    
    inline def apply(): DefaultLinkModelListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultLinkModelListener]
    }
    
    extension [Self <: DefaultLinkModelListener](x: Self) {
      
      inline def setColorChanged(value: /* event */ BaseEventDefaultLinkModel => Unit): Self = StObject.set(x, "colorChanged", js.Any.fromFunction1(value))
      
      inline def setColorChangedUndefined: Self = StObject.set(x, "colorChanged", js.undefined)
      
      inline def setWidthChanged(value: /* event */ BaseEventDefaultLinkModelEntity => Unit): Self = StObject.set(x, "widthChanged", js.Any.fromFunction1(value))
      
      inline def setWidthChangedUndefined: Self = StObject.set(x, "widthChanged", js.undefined)
    }
  }
}

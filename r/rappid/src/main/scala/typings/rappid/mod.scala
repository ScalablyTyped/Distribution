package typings.rappid

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.Paper
import typings.rappid.anon.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ui {
    
    @JSImport("rappid", "ui.SelectionView")
    @js.native
    class SelectionView protected ()
      extends Model[js.Any, ModelSetOptions, js.Object] {
      def this(opt: Graph) = this()
      
      def addHandle(handle: Handle): Unit = js.native
      
      def cancelSelection(): Unit = js.native
      
      def changeHandle(name: String, handle: Handle): Unit = js.native
      
      def createSelectionBox(cellView: CellView): Unit = js.native
      
      def destroySelectionBox(cellView: CellView): Unit = js.native
      
      var graph: typings.jointjs.mod.dia.Graph = js.native
      
      var model: Collection[Cell] = js.native
      
      var paper: Paper = js.native
      
      def removeHandle(name: String): Unit = js.native
      
      def startSelecting(evt: js.Any): Unit = js.native
    }
    
    trait Handle extends StObject {
      
      var icon: String
      
      var name: String
      
      var position: String
    }
    object Handle {
      
      inline def apply(icon: String, name: String, position: String): Handle = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
        __obj.asInstanceOf[Handle]
      }
      
      extension [Self <: Handle](x: Self) {
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      }
    }
  }
}

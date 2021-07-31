package typings.rappid

import typings.backbone.mod.Collection
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Paper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Graph extends StObject {
    
    var graph: typings.jointjs.mod.dia.Graph
    
    var model: Collection[Cell]
    
    var paper: Paper
  }
  object Graph {
    
    @scala.inline
    def apply(graph: typings.jointjs.mod.dia.Graph, model: Collection[Cell], paper: Paper): Graph = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    @scala.inline
    implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGraph(value: typings.jointjs.mod.dia.Graph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: Collection[Cell]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaper(value: Paper): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    }
  }
}

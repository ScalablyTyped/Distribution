package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.End
import typings.stormReactDiagrams.anon.X
import typings.stormReactDiagrams.mod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathFindingMod {
  
  @JSImport("storm-react-diagrams/dist/src/routing/PathFinding", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PathFinding {
    def this(diagramEngine: DiagramEngine) = this()
    
    /**
      * Taking as argument a fully unblocked walking matrix, this method
      * finds a direct path from point A to B.
      */
    /* CompleteClass */
    override def calculateDirectPath(from: X, to: X): js.Array[js.Array[Double]] = js.native
    
    /**
      * Puts everything together: merges the paths from/to the centre of the ports,
      * with the path calculated around other elements.
      */
    /* CompleteClass */
    override def calculateDynamicPath(
      routingMatrix: js.Array[js.Array[Double]],
      start: X,
      end: X,
      pathToStart: js.Array[js.Array[Double]],
      pathToEnd: js.Array[js.Array[Double]]
    ): js.Any = js.native
    
    /**
      * Using @link{#calculateDirectPath}'s result as input, we here
      * determine the first walkable point found in the matrix that includes
      * blocked paths.
      */
    /* CompleteClass */
    override def calculateLinkStartEndCoords(matrix: js.Array[js.Array[Double]], path: js.Array[js.Array[Double]]): End = js.native
    
    /* CompleteClass */
    var diagramEngine: DiagramEngine = js.native
    
    /* CompleteClass */
    var instance: js.Any = js.native
  }
  
  @JSImport("storm-react-diagrams/dist/src/routing/PathFinding", "ROUTING_SCALING_FACTOR")
  @js.native
  val ROUTING_SCALING_FACTOR: /* 5 */ Double = js.native
  
  trait PathFinding extends StObject {
    
    /**
      * Taking as argument a fully unblocked walking matrix, this method
      * finds a direct path from point A to B.
      */
    def calculateDirectPath(from: X, to: X): js.Array[js.Array[Double]]
    
    /**
      * Puts everything together: merges the paths from/to the centre of the ports,
      * with the path calculated around other elements.
      */
    def calculateDynamicPath(
      routingMatrix: js.Array[js.Array[Double]],
      start: X,
      end: X,
      pathToStart: js.Array[js.Array[Double]],
      pathToEnd: js.Array[js.Array[Double]]
    ): js.Any
    
    /**
      * Using @link{#calculateDirectPath}'s result as input, we here
      * determine the first walkable point found in the matrix that includes
      * blocked paths.
      */
    def calculateLinkStartEndCoords(matrix: js.Array[js.Array[Double]], path: js.Array[js.Array[Double]]): End
    
    var diagramEngine: DiagramEngine
    
    var instance: js.Any
  }
  object PathFinding {
    
    @scala.inline
    def apply(
      calculateDirectPath: (X, X) => js.Array[js.Array[Double]],
      calculateDynamicPath: (js.Array[js.Array[Double]], X, X, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any,
      calculateLinkStartEndCoords: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => End,
      diagramEngine: DiagramEngine,
      instance: js.Any
    ): PathFinding = {
      val __obj = js.Dynamic.literal(calculateDirectPath = js.Any.fromFunction2(calculateDirectPath), calculateDynamicPath = js.Any.fromFunction5(calculateDynamicPath), calculateLinkStartEndCoords = js.Any.fromFunction2(calculateLinkStartEndCoords), diagramEngine = diagramEngine.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathFinding]
    }
    
    @scala.inline
    implicit class PathFindingMutableBuilder[Self <: PathFinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateDirectPath(value: (X, X) => js.Array[js.Array[Double]]): Self = StObject.set(x, "calculateDirectPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCalculateDynamicPath(
        value: (js.Array[js.Array[Double]], X, X, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any
      ): Self = StObject.set(x, "calculateDynamicPath", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCalculateLinkStartEndCoords(value: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => End): Self = StObject.set(x, "calculateLinkStartEndCoords", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}

package typings.rdfTransformTripleToQuad

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.streamMod.Transform
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
  @js.native
  open class ^[Q /* <: BaseQuad */] () extends TripleToQuadTransform[Q] {
    def this(graph: String) = this()
    def this(graph: QuadGraph) = this()
    def this(graph: String, options: TripleToQuadTransformOptions) = this()
    def this(graph: Unit, options: TripleToQuadTransformOptions) = this()
    def this(graph: QuadGraph, options: TripleToQuadTransformOptions) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
  - typings.rdfjsTypes.streamMod.Stream because Inheritance from two classes. Inlined read */ @js.native
  trait TripleToQuadTransform[Q /* <: BaseQuad */]
    extends Transform
       with EventEmitter {
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    def read(): Q | Null = js.native
  }
  
  trait TripleToQuadTransformOptions extends StObject {
    
    var factory: DataFactory[Quad, Quad]
  }
  object TripleToQuadTransformOptions {
    
    inline def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TripleToQuadTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TripleToQuadTransformOptions] (val x: Self) extends AnyVal {
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
}

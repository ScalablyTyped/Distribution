package typings.rdfTransformTripleToQuad

import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends TripleToQuadTransform[Q] {
    def this(graph: QuadGraph) = this()
    def this(graph: Unit, options: TripleToQuadTransformOptions) = this()
    def this(graph: QuadGraph, options: TripleToQuadTransformOptions) = this()
  }
  
  @js.native
  trait TripleToQuadTransform[Q /* <: BaseQuad */]
    extends Transform
       with Stream[Q] {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    /* InferMemberOverrides */
    override def read(): (Q | Null) & (String | Buffer) = js.native
  }
  
  trait TripleToQuadTransformOptions extends StObject {
    
    var factory: DataFactory[Quad, Quad]
  }
  object TripleToQuadTransformOptions {
    
    @scala.inline
    def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TripleToQuadTransformOptions]
    }
    
    @scala.inline
    implicit class TripleToQuadTransformOptionsMutableBuilder[Self <: TripleToQuadTransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
}

package typings.rdfjsTypes

import typings.node.eventsMod.EventEmitter
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  trait Sink[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends StObject {
    
    /**
      * Consumes the given stream.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * Depending on the use case, subtypes of EventEmitter or Stream are used.
      * @see Stream
      *
      * @param stream The stream that will be consumed.
      * @return The resulting event emitter.
      */
    def `import`(stream: InputStream): OutputStream
  }
  object Sink {
    
    inline def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](`import`: InputStream => OutputStream): Sink[InputStream, OutputStream] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Sink[InputStream, OutputStream]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sink[?, ?], InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] (val x: Self & (Sink[InputStream, OutputStream])) extends AnyVal {
      
      inline def setImport(value: InputStream => OutputStream): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
    }
  }
  
  trait Source[Q /* <: BaseQuad */] extends StObject {
    
    /**
      * Returns a stream that processes all quads matching the pattern.
      *
      * @param subject   The optional subject.
      * @param predicate The optional predicate.
      * @param object    The optional object.
      * @param graph     The optional graph.
      * @return The resulting quad stream.
      */
    def `match`(
      subject: js.UndefOr[Term | Null],
      predicate: js.UndefOr[Term | Null],
      `object`: js.UndefOr[Term | Null],
      graph: js.UndefOr[Term | Null]
    ): Stream[Q]
  }
  object Source {
    
    inline def apply[Q /* <: BaseQuad */](
      `match`: (js.UndefOr[Term | Null], js.UndefOr[Term | Null], js.UndefOr[Term | Null], js.UndefOr[Term | Null]) => Stream[Q]
    ): Source[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(js.Any.fromFunction4(`match`))
      __obj.asInstanceOf[Source[Q]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Source[?], Q /* <: BaseQuad */] (val x: Self & Source[Q]) extends AnyVal {
      
      inline def setMatch(
        value: (js.UndefOr[Term | Null], js.UndefOr[Term | Null], js.UndefOr[Term | Null], js.UndefOr[Term | Null]) => Stream[Q]
      ): Self = StObject.set(x, "match", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Store[Q /* <: BaseQuad */]
    extends StObject
       with Source[Q]
       with Sink[Stream[Q], EventEmitter] {
    
    def deleteGraph(graph: String): EventEmitter = js.native
    /**
      * Deletes the given named graph.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * @see Stream
      *
      * @param graph The graph term or string to match.
      * @return The resulting event emitter.
      */
    @JSName("deleteGraph")
    def deleteGraph_graph(graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any): EventEmitter = js.native
    
    /**
      * Removes all streamed quads.
      *
      * The end and error events are used like described in the Stream interface.
      * @see Stream
      *
      * @param stream The stream that will be consumed.
      * @return The resulting event emitter.
      */
    def remove(stream: Stream[Q]): EventEmitter = js.native
    
    /**
      * All quads matching the pattern will be removed.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * @see Stream
      *
      * @param subject   The optional subject.
      * @param predicate The optional predicate.
      * @param object    The optional object.
      * @param graph     The optional graph.
      * @return The resulting event emitter.
      */
    def removeMatches(
      subject: js.UndefOr[Term | Null],
      predicate: js.UndefOr[Term | Null],
      `object`: js.UndefOr[Term | Null],
      graph: js.UndefOr[Term | Null]
    ): EventEmitter = js.native
  }
  
  @js.native
  trait Stream[Q /* <: BaseQuad */] extends EventEmitter {
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    def read(): Q | Null = js.native
  }
}

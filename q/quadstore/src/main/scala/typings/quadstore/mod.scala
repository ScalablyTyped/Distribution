package typings.quadstore

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.quadstore.anon.ContextKey
import typings.quadstore.anon.`0`
import typings.quadstore.quadstoreStrings.graph
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quadstore", JSImport.Namespace)
  @js.native
  class ^[CK /* <: String */, TermType, Q] protected ()
    extends typings.quadstore.mod.quadstore[CK, TermType, Q] {
    def this(db: AbstractLevelDOWN[_, _]) = this()
    def this(db: AbstractLevelDOWN[_, _], opts: `0`[CK]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("quadstore", "QuadStore")
  @js.native
  class QuadStore_[CK /* <: String */, TermType, Q] protected ()
    extends typings.quadstore.mod.quadstore[CK, TermType, Q] {
    def this(db: AbstractLevelDOWN[_, _]) = this()
    def this(db: AbstractLevelDOWN[_, _], opts: ContextKey) = this()
  }
  
  @JSImport("quadstore", "QuadStore")
  @js.native
  val QuadStore_ : Instantiable2[
    /* db */ AbstractLevelDOWN[js.Any, js.Any], 
    /* opts */ js.UndefOr[ContextKey], 
    typings.quadstore.mod.quadstore[String, js.Object, js.Object]
  ] = js.native
  
  @JSImport("quadstore", "RdfStore")
  @js.native
  class RdfStore[Q /* <: BaseQuad */] protected ()
    extends typings.quadstore.mod.quadstore[graph, Q, Term] {
    def this(abstractLevelDOWN: AbstractLevelDOWN[_, _], opts: js.Any) = this()
    
    def deleteGraph(graph: QuadGraph): EventEmitter = js.native
    
    def `match`(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
    
    def remove(source: ReadableStream): Unit = js.native
    def remove(source: ReadableStream, opts: js.Any): Unit = js.native
    
    def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
  }
  
  @js.native
  trait IndexOptions extends StObject {
    
    var gt: js.UndefOr[String] = js.native
    
    var gte: js.UndefOr[String] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var lt: js.UndefOr[String] = js.native
    
    var lte: js.UndefOr[String] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object IndexOptions {
    
    @scala.inline
    def apply(): IndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexOptions]
    }
    
    @scala.inline
    implicit class IndexOptionsMutableBuilder[Self <: IndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGt(value: String): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      @scala.inline
      def setGte(value: String): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLt(value: String): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLte(value: String): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait MatchTerms[TermType, CK /* <: String */] extends StObject {
    
    var `object`: js.UndefOr[TermType] = js.native
    
    var predicate: js.UndefOr[TermType] = js.native
    
    var subject: js.UndefOr[TermType] = js.native
  }
  
  type Quad[TermType, CK /* <: String */] = Triple[TermType] with typings.quadstore.quadstoreStrings.Quad with TopLevel[js.Any]
  
  @js.native
  trait StreamOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object StreamOptions {
    
    @scala.inline
    def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait Triple[TermType] extends StObject {
    
    var `object`: TermType = js.native
    
    var predicate: TermType = js.native
    
    var subject: TermType = js.native
  }
  object Triple {
    
    @scala.inline
    def apply[TermType](`object`: TermType, predicate: TermType, subject: TermType): Triple[TermType] = {
      val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triple[TermType]]
    }
    
    @scala.inline
    implicit class TripleMutableBuilder[Self <: Triple[_], TermType] (val x: Self with Triple[TermType]) extends AnyVal {
      
      @scala.inline
      def setObject(value: TermType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(value: TermType): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: TermType): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait quadstore[CK /* <: String */, TermType, Q] extends EventEmitter {
    
    var boundary: String = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def del(matchTermsOrOldQuads: js.Array[Q]): js.Promise[Unit] = js.native
    def del(matchTermsOrOldQuads: js.Array[Q], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    def del(matchTermsOrOldQuads: MatchTerms[TermType, CK]): js.Promise[Unit] = js.native
    def del(matchTermsOrOldQuads: MatchTerms[TermType, CK], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def delStream(stream: ReadableStream): js.Promise[Unit] = js.native
    def delStream(stream: ReadableStream, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def get(matchTerms: MatchTerms[TermType, CK]): js.Promise[js.Array[Q]] = js.native
    def get(
      matchTerms: MatchTerms[TermType, CK],
      cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]
    ): Unit = js.native
    
    def getApproximateCount(matchTerms: MatchTerms[TermType, CK]): js.Promise[Double] = js.native
    def getApproximateCount(matchTerms: MatchTerms[TermType, CK], cb: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Unit = js.native
    def getApproximateCount(matchTerms: MatchTerms[TermType, CK], opts: js.Any): js.Promise[Double] = js.native
    def getApproximateCount(
      matchTerms: MatchTerms[TermType, CK],
      opts: js.Any,
      cb: js.Function2[/* err */ js.Any, /* count */ Double, Unit]
    ): Unit = js.native
    
    def getByIndex(name: String): js.Promise[js.Array[Q]] = js.native
    def getByIndex(name: String, cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]): Unit = js.native
    def getByIndex(name: String, opts: IndexOptions): js.Promise[js.Array[Q]] = js.native
    def getByIndex(
      name: String,
      opts: IndexOptions,
      cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]
    ): Unit = js.native
    
    def getByIndexStream(name: String): ReadableStream = js.native
    def getByIndexStream(name: String, opts: IndexOptions): ReadableStream = js.native
    
    def getStream(): ReadableStream = js.native
    def getStream(matchTerms: js.UndefOr[scala.Nothing], opts: StreamOptions): ReadableStream = js.native
    def getStream(matchTerms: MatchTerms[TermType, CK]): ReadableStream = js.native
    def getStream(matchTerms: MatchTerms[TermType, CK], opts: StreamOptions): ReadableStream = js.native
    
    def patch(matchTermsOrOldQuads: js.Array[Q], newQuads: js.Array[Q]): Unit = js.native
    def patch(
      matchTermsOrOldQuads: js.Array[Q],
      newQuads: js.Array[Q],
      opts: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.Any, Unit]
    ): Unit = js.native
    def patch(matchTermsOrOldQuads: js.Array[Q], newQuads: js.Array[Q], opts: js.Any): Unit = js.native
    def patch(
      matchTermsOrOldQuads: js.Array[Q],
      newQuads: js.Array[Q],
      opts: js.Any,
      cb: js.Function1[/* err */ js.Any, Unit]
    ): Unit = js.native
    def patch(matchTermsOrOldQuads: MatchTerms[TermType, CK], newQuads: js.Array[Q]): Unit = js.native
    def patch(
      matchTermsOrOldQuads: MatchTerms[TermType, CK],
      newQuads: js.Array[Q],
      opts: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.Any, Unit]
    ): Unit = js.native
    def patch(matchTermsOrOldQuads: MatchTerms[TermType, CK], newQuads: js.Array[Q], opts: js.Any): Unit = js.native
    def patch(
      matchTermsOrOldQuads: MatchTerms[TermType, CK],
      newQuads: js.Array[Q],
      opts: js.Any,
      cb: js.Function1[/* err */ js.Any, Unit]
    ): Unit = js.native
    
    def put(quads: js.Array[Q]): js.Promise[Unit] = js.native
    def put(quads: js.Array[Q], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def putStream(source: ReadableStream): js.Promise[Unit] = js.native
    def putStream(source: ReadableStream, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    def putStream(source: ReadableStream, opts: js.Any): js.Promise[Unit] = js.native
    def putStream(source: ReadableStream, opts: js.Any, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def registerIndex(name: String, keyFn: js.Function1[/* quad */ Q, String]): Unit = js.native
    
    var separator: String = js.native
    
    def toJSON(): String = js.native
  }
}

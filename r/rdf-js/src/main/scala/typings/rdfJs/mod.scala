package typings.rdfJs

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.rdfJsStrings._empty
import typings.std.Iterator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait BaseQuad
    extends StObject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if the argument is a) of the same type b) has all components equal.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * The named graph.
      * @see Quad_Graph
      */
    var graph: Term = js.native
    
    /**
      * The object.
      * @see Quad_Object
      */
    var `object`: Term = js.native
    
    /**
      * The predicate.
      * @see Quad_Predicate
      */
    var predicate: Term = js.native
    
    /**
      * The subject.
      * @see Quad_Subject
      */
    var subject: Term = js.native
    
    /**
      * Contains the constant "Quad".
      */
    var termType: typings.rdfJs.rdfJsStrings.Quad = js.native
    
    /**
      * Contains an empty string as constant value.
      */
    var value: _empty = js.native
  }
  
  @js.native
  trait BlankNode
    extends StObject
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "BlankNode" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "BlankNode".
      */
    var termType: typings.rdfJs.rdfJsStrings.BlankNode = js.native
    
    /**
      * Blank node name as a string, without any serialization specific prefixes,
      * e.g. when parsing,
      * if the data was sourced from Turtle, remove _:,
      * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
      */
    var value: String = js.native
  }
  
  @js.native
  trait DataFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends StObject {
    
    /**
      * @param value The optional blank node identifier.
      * @return A new instance of BlankNode.
      *                         If the `value` parameter is undefined a new identifier
      *                         for the blank node is generated for each call.
      * @see BlankNode
      */
    def blankNode(): BlankNode = js.native
    def blankNode(value: String): BlankNode = js.native
    
    /**
      * @return An instance of DefaultGraph.
      */
    def defaultGraph(): DefaultGraph = js.native
    
    /**
      * @param                 value              The literal value.
      * @param languageOrDatatype The optional language or datatype.
      *                                                    If `languageOrDatatype` is a NamedNode,
      *                                                    then it is used for the value of `NamedNode.datatype`.
      *                                                    Otherwise `languageOrDatatype` is used for the value
      *                                                    of `NamedNode.language`.
      * @return A new instance of Literal.
      * @see Literal
      */
    def literal(value: String): Literal = js.native
    def literal(value: String, languageOrDatatype: String): Literal = js.native
    def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
    
    /**
      * @param value The IRI for the named node.
      * @return A new instance of NamedNode.
      * @see NamedNode
      */
    def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
    
    /**
      * @param subject   The quad subject term.
      * @param predicate The quad predicate term.
      * @param object    The quad object term.
      * @param graph     The quad graph term.
      * @return A new instance of Quad.
      * @see Quad
      */
    def quad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any
    ): OutQuad = js.native
    def quad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['graph'] */ js.Any
    ): OutQuad = js.native
    
    /**
      * This method is optional.
      * @param value The variable name
      * @return A new instance of Variable.
      * @see Variable
      */
    var variable: js.UndefOr[js.Function1[/* value */ String, Variable]] = js.native
  }
  
  @js.native
  trait Dataset[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with DatasetCore[OutQuad, InQuad] {
    
    def addAll(quads: js.Array[InQuad]): this.type = js.native
    /**
      * Imports the quads into this dataset.
      *
      * This method differs from `Dataset.union` in that it adds all `quads` to the current instance, rather than
      * combining `quads` and the current instance to create a new instance.
      */
    def addAll(quads: Dataset[InQuad, InQuad]): this.type = js.native
    
    /**
      * Returns `true` if the current instance is a superset of the given dataset; differently put: if the given dataset
      * is a subset of, is contained in the current dataset.
      *
      * Blank Nodes will be normalized.
      */
    def contains(other: Dataset[InQuad, InQuad]): Boolean = js.native
    
    /**
      * This method removes the quads in the current instance that match the given arguments.
      *
      * The logic described in {@link https://rdf.js.org/dataset-spec/#quad-matching|Quad Matching} is applied for each
      * quad in this dataset to select the quads which will be deleted.
      *
      * @param subject   The optional exact subject to match.
      * @param predicate The optional exact predicate to match.
      * @param object    The optional exact object to match.
      * @param graph     The optional exact graph to match.
      */
    def deleteMatches(): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Unit, `object`: Unit, graph: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Unit, `object`: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Unit, `object`: Term, graph: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Term, `object`: Unit, graph: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Term, `object`: Term): this.type = js.native
    def deleteMatches(subject: Unit, predicate: Term, `object`: Term, graph: Term): this.type = js.native
    def deleteMatches(subject: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Unit, `object`: Unit, graph: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Unit, `object`: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Unit, `object`: Term, graph: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Term, `object`: Unit, graph: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Term, `object`: Term): this.type = js.native
    def deleteMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): this.type = js.native
    
    /**
      * Returns a new dataset that contains all quads from the current dataset, not included in the given dataset.
      */
    def difference(other: Dataset[InQuad, InQuad]): Dataset[OutQuad, InQuad] = js.native
    
    /**
      * Returns true if the current instance contains the same graph structure as the given dataset.
      *
      * Blank Nodes will be normalized.
      */
    def equals(other: Dataset[InQuad, InQuad]): Boolean = js.native
    
    /**
      * Universal quantification method, tests whether every quad in the dataset passes the test implemented by the
      * provided `iteratee`.
      *
      * This method immediately returns boolean `false` once a quad that does not pass the test is found.
      *
      * This method always returns boolean `true` on an empty dataset.
      *
      * This method is aligned with `Array.prototype.every()` in ECMAScript-262.
      */
    def every(iteratee: js.Function2[/* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], Boolean]): Boolean = js.native
    
    /**
      * Creates a new dataset with all the quads that pass the test implemented by the provided `iteratee`.
      *
      * This method is aligned with Array.prototype.filter() in ECMAScript-262.
      */
    def filter(iteratee: js.Function2[/* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], Boolean]): Dataset[OutQuad, InQuad] = js.native
    
    /**
      * Executes the provided `iteratee` once on each quad in the dataset.
      *
      * This method is aligned with `Array.prototype.forEach()` in ECMAScript-262.
      */
    def forEach(iteratee: js.Function2[/* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], Unit]): Unit = js.native
    
    /**
      * Imports all quads from the given stream into the dataset.
      *
      * The stream events `end` and `error` are wrapped in a Promise.
      */
    def `import`(stream: Stream[InQuad]): js.Promise[this.type] = js.native
    
    /**
      * Returns a new dataset containing alls quads from the current dataset that are also included in the given dataset.
      */
    def intersection(other: Dataset[InQuad, InQuad]): this.type = js.native
    
    /**
      * Returns a new dataset containing all quads returned by applying `iteratee` to each quad in the current dataset.
      */
    def map(iteratee: js.Function2[/* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], OutQuad]): Dataset[OutQuad, InQuad] = js.native
    
    /**
      * This method calls the `iteratee` on each `quad` of the `Dataset`. The first time the `iteratee` is called, the
      * `accumulator` value is the `initialValue` or, if not given, equals to the first quad of the `Dataset`. The return
      * value of the `iteratee` is used as `accumulator` value for the next calls.
      *
      * This method returns the return value of the last `iteratee` call.
      *
      * This method is aligned with `Array.prototype.reduce()` in ECMAScript-262.
      */
    def reduce[A](
      iteratee: js.Function3[/* accumulator */ A, /* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], A]
    ): A = js.native
    def reduce[A](
      iteratee: js.Function3[/* accumulator */ A, /* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], A],
      initialValue: A
    ): A = js.native
    
    /**
      * Existential quantification method, tests whether some quads in the dataset pass the test implemented by the
      * provided `iteratee`.
      *
      * This method immediately returns boolean `true` once a quad that passes the test is found.
      *
      * This method is aligned with `Array.prototype.some()` in ECMAScript-262.
      */
    def some(iteratee: js.Function2[/* quad */ OutQuad, /* dataset */ Dataset[OutQuad, OutQuad], Boolean]): Boolean = js.native
    
    /**
      * Returns the set of quads within the dataset as a host language native sequence, for example an `Array` in
      * ECMAScript-262.
      *
      * Since a `Dataset` is an unordered set, the order of the quads within the returned sequence is arbitrary.
      */
    def toArray(): js.Array[OutQuad] = js.native
    
    /**
      * Returns an N-Quads string representation of the dataset, preprocessed with
      * {@link https://json-ld.github.io/normalization/spec/|RDF Dataset Normalization} algorithm.
      */
    def toCanonical(): String = js.native
    
    /**
      * Returns a stream that contains all quads of the dataset.
      */
    def toStream(): Stream[OutQuad] = js.native
    
    /**
      * Returns a new `Dataset` that is a concatenation of this dataset and the quads given as an argument.
      */
    def union(quads: Dataset[InQuad, InQuad]): Dataset[OutQuad, InQuad] = js.native
  }
  
  @js.native
  trait DatasetCore[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends StObject {
    
    /**
      * Adds the specified quad to the dataset.
      *
      * Existing quads, as defined in `Quad.equals`, will be ignored.
      */
    def add(quad: InQuad): this.type = js.native
    
    /**
      * Removes the specified quad from the dataset.
      */
    def delete(quad: InQuad): this.type = js.native
    
    /**
      * Determines whether a dataset includes a certain quad.
      */
    def has(quad: InQuad): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[OutQuad, js.Any, Unit]] = js.native
    
    /**
      * Returns a new dataset that is comprised of all quads in the current instance matching the given arguments.
      *
      * The logic described in {@link https://rdf.js.org/dataset-spec/#quad-matching|Quad Matching} is applied for each
      * quad in this dataset to check if it should be included in the output dataset.
      *
      * This method always returns a new DatasetCore, even if that dataset contains no quads.
      *
      * Since a `DatasetCore` is an unordered set, the order of the quads within the returned sequence is arbitrary.
      *
      * @param subject   The optional exact subject to match.
      * @param predicate The optional exact predicate to match.
      * @param object    The optional exact object to match.
      * @param graph     The optional exact graph to match.
      */
    def `match`(
      subject: js.UndefOr[Term | Null],
      predicate: js.UndefOr[Term | Null],
      `object`: js.UndefOr[Term | Null],
      graph: js.UndefOr[Term | Null]
    ): DatasetCore[OutQuad, InQuad] = js.native
    
    /**
      * A non-negative integer that specifies the number of quads in the set.
      */
    val size: Double = js.native
  }
  
  @js.native
  trait DatasetCoreFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */, D /* <: DatasetCore[OutQuad, InQuad] */] extends StObject {
    
    /**
      * Returns a new dataset and imports all quads, if given.
      */
    def dataset(): D = js.native
    def dataset(quads: js.Array[InQuad]): D = js.native
  }
  
  @js.native
  trait DatasetFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */, D /* <: Dataset[OutQuad, InQuad] */]
    extends StObject
       with DatasetCoreFactory[OutQuad, InQuad, D] {
    
    def dataset(quads: Dataset[InQuad, InQuad]): D = js.native
  }
  
  @js.native
  trait DefaultGraph
    extends StObject
       with _QuadGraph
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "DefaultGraph".
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "DefaultGraph".
      */
    var termType: typings.rdfJs.rdfJsStrings.DefaultGraph = js.native
    
    /**
      * Contains an empty string as constant value.
      */
    var value: _empty = js.native
  }
  
  @js.native
  trait Literal
    extends StObject
       with _QuadObject
       with _Term {
    
    /**
      * A NamedNode whose IRI represents the datatype of the literal.
      */
    var datatype: NamedNode[String] = js.native
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "Literal"
      *                   and the same `value`, `language`, and `datatype`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * the language as lowercase BCP47 string (examples: en, en-gb)
      * or an empty string if the literal has no language.
      * @link http://tools.ietf.org/html/bcp47
      */
    var language: String = js.native
    
    /**
      * Contains the constant "Literal".
      */
    var termType: typings.rdfJs.rdfJsStrings.Literal = js.native
    
    /**
      * The text value, unescaped, without language or type (example: Brad Pitt).
      */
    var value: String = js.native
  }
  
  @js.native
  trait NamedNode[Iri /* <: String */] extends StObject {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "NamedNode" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "NamedNode".
      */
    var termType: typings.rdfJs.rdfJsStrings.NamedNode = js.native
    
    /**
      * The IRI of the named node (example: `http://example.org/resource`)
      */
    var value: Iri = js.native
  }
  
  @js.native
  trait Quad
    extends StObject
       with BaseQuad
       with _QuadObject
       with _QuadSubject {
    
    /**
      * The named graph.
      * @see Quad_Graph
      */
    @JSName("graph")
    var graph_Quad: QuadGraph = js.native
    
    /**
      * The object.
      * @see Quad_Object
      */
    @JSName("object")
    var object_Quad: QuadObject = js.native
    
    /**
      * The predicate.
      * @see Quad_Predicate
      */
    @JSName("predicate")
    var predicate_Quad: QuadPredicate = js.native
    
    /**
      * The subject.
      * @see Quad_Subject
      */
    @JSName("subject")
    var subject_Quad: QuadSubject = js.native
  }
  
  trait QuadFilterIteratee[Q /* <: BaseQuad */] extends StObject {
    
    /**
      * A callable function that returns `true` if the input quad passes the test this function implements.
      */
    def test(quad: Q, dataset: Dataset[Q, Q]): Boolean
  }
  object QuadFilterIteratee {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](test: (Q, Dataset[Q, Q]) => Boolean): QuadFilterIteratee[Q] = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
      __obj.asInstanceOf[QuadFilterIteratee[Q]]
    }
    
    @scala.inline
    implicit class QuadFilterIterateeMutableBuilder[Self <: QuadFilterIteratee[?], Q /* <: BaseQuad */] (val x: Self & QuadFilterIteratee[Q]) extends AnyVal {
      
      @scala.inline
      def setTest(value: (Q, Dataset[Q, Q]) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.DefaultGraph
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Variable
  */
  type QuadGraph = _QuadGraph | NamedNode[String]
  
  trait QuadMapIteratee[Q /* <: BaseQuad */] extends StObject {
    
    /**
      * A callable function that can be executed on a quad and returns a quad.
      *
      * The returned quad can be the given quad or a new one.
      */
    def map(quad: Q, dataset: Dataset[Q, Q]): Q
  }
  object QuadMapIteratee {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](map: (Q, Dataset[Q, Q]) => Q): QuadMapIteratee[Q] = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[QuadMapIteratee[Q]]
    }
    
    @scala.inline
    implicit class QuadMapIterateeMutableBuilder[Self <: QuadMapIteratee[?], Q /* <: BaseQuad */] (val x: Self & QuadMapIteratee[Q]) extends AnyVal {
      
      @scala.inline
      def setMap(value: (Q, Dataset[Q, Q]) => Q): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.Literal
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Quad
    - typings.rdfJs.mod.Variable
  */
  type QuadObject = _QuadObject | NamedNode[String]
  
  type QuadPredicate = NamedNode[String] | Variable
  
  trait QuadReduceIteratee[A, Q /* <: BaseQuad */] extends StObject {
    
    /**
      * A callable function that can be executed on an accumulator and quad and returns a new accumulator.
      */
    def run(accumulator: A, quad: Q, dataset: Dataset[Q, Q]): A
  }
  object QuadReduceIteratee {
    
    @scala.inline
    def apply[A, Q /* <: BaseQuad */](run: (A, Q, Dataset[Q, Q]) => A): QuadReduceIteratee[A, Q] = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[QuadReduceIteratee[A, Q]]
    }
    
    @scala.inline
    implicit class QuadReduceIterateeMutableBuilder[Self <: QuadReduceIteratee[?, ?], A, Q /* <: BaseQuad */] (val x: Self & (QuadReduceIteratee[A, Q])) extends AnyVal {
      
      @scala.inline
      def setRun(value: (A, Q, Dataset[Q, Q]) => A): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  trait QuadRunIteratee[Q /* <: BaseQuad */] extends StObject {
    
    /**
      * A callable function that can be executed on a quad.
      */
    def run(quad: Q, dataset: Dataset[Q, Q]): Unit
  }
  object QuadRunIteratee {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](run: (Q, Dataset[Q, Q]) => Unit): QuadRunIteratee[Q] = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run))
      __obj.asInstanceOf[QuadRunIteratee[Q]]
    }
    
    @scala.inline
    implicit class QuadRunIterateeMutableBuilder[Self <: QuadRunIteratee[?], Q /* <: BaseQuad */] (val x: Self & QuadRunIteratee[Q]) extends AnyVal {
      
      @scala.inline
      def setRun(value: (Q, Dataset[Q, Q]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Quad
    - typings.rdfJs.mod.Variable
  */
  type QuadSubject = _QuadSubject | NamedNode[String]
  
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
    
    @scala.inline
    def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](`import`: InputStream => OutputStream): Sink[InputStream, OutputStream] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Sink[InputStream, OutputStream]]
    }
    
    @scala.inline
    implicit class SinkMutableBuilder[Self <: Sink[?, ?], InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] (val x: Self & (Sink[InputStream, OutputStream])) extends AnyVal {
      
      @scala.inline
      def setImport(value: InputStream => OutputStream): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
    }
  }
  
  trait Source[Q /* <: BaseQuad */] extends StObject {
    
    /**
      * Returns a stream that processes all quads matching the pattern.
      *
      * @param subject   The optional exact subject or subject regex to match.
      * @param predicate The optional exact predicate or predicate regex to match.
      * @param object    The optional exact object or object regex to match.
      * @param graph     The optional exact graph or graph regex to match.
      * @return The resulting quad stream.
      */
    def `match`(
      subject: js.UndefOr[Term | RegExp],
      predicate: js.UndefOr[Term | RegExp],
      `object`: js.UndefOr[Term | RegExp],
      graph: js.UndefOr[Term | RegExp]
    ): Stream[Q]
  }
  object Source {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](
      `match`: (js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp]) => Stream[Q]
    ): Source[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(js.Any.fromFunction4(`match`))
      __obj.asInstanceOf[Source[Q]]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source[?], Q /* <: BaseQuad */] (val x: Self & Source[Q]) extends AnyVal {
      
      @scala.inline
      def setMatch(
        value: (js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp], js.UndefOr[Term | RegExp]) => Stream[Q]
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
      * @param subject   The optional exact subject or subject regex to match.
      * @param predicate The optional exact predicate or predicate regex to match.
      * @param object    The optional exact object or object regex to match.
      * @param graph     The optional exact graph or graph regex to match.
      * @return The resulting event emitter.
      */
    def removeMatches(
      subject: js.UndefOr[Term | RegExp],
      predicate: js.UndefOr[Term | RegExp],
      `object`: js.UndefOr[Term | RegExp],
      graph: js.UndefOr[Term | RegExp]
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Literal
    - typings.rdfJs.mod.Variable
    - typings.rdfJs.mod.DefaultGraph
    - typings.rdfJs.mod.BaseQuad
  */
  type Term = _Term | NamedNode[String]
  
  @js.native
  trait Variable
    extends StObject
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    
    /**
      * @param other The term to compare with.
      * @return True if and only if other has termType "Variable" and the same `value`.
      */
    def equals(): Boolean = js.native
    def equals(other: Term): Boolean = js.native
    
    /**
      * Contains the constant "Variable".
      */
    var termType: typings.rdfJs.rdfJsStrings.Variable = js.native
    
    /**
      * The name of the variable *without* leading ? (example: a).
      */
    var value: String = js.native
  }
  
  trait _QuadGraph extends StObject
  
  trait _QuadObject extends StObject
  
  trait _QuadSubject extends StObject
  
  trait _Term extends StObject
}

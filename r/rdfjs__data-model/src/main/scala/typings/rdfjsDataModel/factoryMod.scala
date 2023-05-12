package typings.rdfjsDataModel

import typings.rdfjsDataModel.libFromTermMod.FromTerm
import typings.rdfjsDataModel.rdfjsDataModelStrings.blankNode
import typings.rdfjsDataModel.rdfjsDataModelStrings.defaultGraph
import typings.rdfjsDataModel.rdfjsDataModelStrings.fromQuad
import typings.rdfjsDataModel.rdfjsDataModelStrings.fromTerm
import typings.rdfjsDataModel.rdfjsDataModelStrings.literal
import typings.rdfjsDataModel.rdfjsDataModelStrings.namedNode
import typings.rdfjsDataModel.rdfjsDataModelStrings.quad
import typings.rdfjsDataModel.rdfjsDataModelStrings.variable
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.dataModelMod.Variable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/data-model/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataFactory
  object default {
    
    /* static member */
    @JSImport("@rdfjs/data-model/Factory", "default.exports")
    @js.native
    val exports: js.Tuple8[blankNode, defaultGraph, fromQuad, fromTerm, literal, namedNode, quad, variable] = js.native
  }
  
  /* Inlined parent std.Required<@rdfjs/types.@rdfjs/types.DataFactory<@rdfjs/types.@rdfjs/types.BaseQuad, @rdfjs/types.@rdfjs/types.BaseQuad>> */
  @js.native
  trait DataFactory extends StObject {
    
    def blankNode(): BlankNode = js.native
    @JSName("blankNode")
    var blankNode_Original: js.Function0[BlankNode] = js.native
    
    def defaultGraph(): DefaultGraph = js.native
    @JSName("defaultGraph")
    var defaultGraph_Original: js.Function0[DefaultGraph] = js.native
    
    def fromQuad[T /* <: BaseQuad */](value: T): ReturnType[FromTerm[T, this.type]] = js.native
    
    def fromTerm(value: BaseQuad): ReturnType[FromTerm[BaseQuad, this.type]] = js.native
    def fromTerm(value: BlankNode): ReturnType[FromTerm[BlankNode, this.type]] = js.native
    def fromTerm(value: DefaultGraph): ReturnType[FromTerm[DefaultGraph, this.type]] = js.native
    def fromTerm(value: Literal): ReturnType[FromTerm[Literal, this.type]] = js.native
    def fromTerm(value: NamedNode[String]): ReturnType[FromTerm[NamedNode[String], this.type]] = js.native
    def fromTerm(value: Variable): ReturnType[FromTerm[Variable, this.type]] = js.native
    
    def init(): Unit = js.native
    
    def literal(value: String): Literal = js.native
    @JSName("literal")
    var literal_Original: js.Function1[/* value */ String, Literal] = js.native
    
    def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
    @JSName("namedNode")
    var namedNode_Original: js.Function1[/* value */ String, NamedNode[String]] = js.native
    
    def quad(subject: Term, predicate: Term, `object`: Term): BaseQuad = js.native
    def quad[Q /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ): Q = js.native
    def quad[Q /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
    ): Q = js.native
    @JSName("quad")
    var quad_Original: js.Function3[/* subject */ Term, /* predicate */ Term, /* object */ Term, BaseQuad] = js.native
    
    def variable(value: String): Variable = js.native
    @JSName("variable")
    var variable_Original: js.Function1[/* value */ String, Variable] = js.native
  }
}

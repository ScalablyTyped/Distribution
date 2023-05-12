package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfExt.libQuadMod.QuadExt
import typings.rdfExt.libVariableMod.VariableExt
import typings.rdfExt.rdfExtStrings.blankNode
import typings.rdfExt.rdfExtStrings.defaultGraph
import typings.rdfExt.rdfExtStrings.fromQuad
import typings.rdfExt.rdfExtStrings.fromTerm
import typings.rdfExt.rdfExtStrings.literal
import typings.rdfExt.rdfExtStrings.namedNode
import typings.rdfExt.rdfExtStrings.quad_
import typings.rdfExt.rdfExtStrings.variable
import typings.rdfjsDataModel.libFromTermMod.FromTerm
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.QuadObject
import typings.rdfjsTypes.dataModelMod.QuadPredicate
import typings.rdfjsTypes.dataModelMod.QuadSubject
import typings.rdfjsTypes.dataModelMod.Variable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/DataFactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataFactoryExt
  @JSImport("rdf-ext/DataFactory", JSImport.Default)
  @js.native
  val default: DataFactoryExtCtor = js.native
  
  @js.native
  trait DataFactoryExt
    extends StObject
       with DataFactory[QuadExt, Quad] {
    
    def fromQuad(original: Quad): ReturnType[FromTerm[Quad, this.type]] = js.native
    
    def fromTerm(original: BaseQuad): ReturnType[FromTerm[BaseQuad, this.type]] = js.native
    def fromTerm(original: BlankNode): ReturnType[FromTerm[BlankNode, this.type]] = js.native
    def fromTerm(original: DefaultGraph): ReturnType[FromTerm[DefaultGraph, this.type]] = js.native
    def fromTerm(original: Literal): ReturnType[FromTerm[Literal, this.type]] = js.native
    def fromTerm(original: NamedNode[String]): ReturnType[FromTerm[NamedNode[String], this.type]] = js.native
    def fromTerm(original: Variable): ReturnType[FromTerm[Variable, this.type]] = js.native
    
    def init(): Unit = js.native
    
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
    
    @JSName("variable")
    def variable_MDataFactoryExt(value: String): VariableExt = js.native
  }
  
  @js.native
  trait DataFactoryExtCtor
    extends StObject
       with Instantiable0[DataFactoryExt] {
    
    var exports: js.Tuple8[namedNode, blankNode, literal, variable, defaultGraph, quad_, fromTerm, fromQuad] = js.native
  }
  
  type _To = DataFactoryExtCtor
  
  /* This means you don't have to write `default`, but can instead just say `dataFactoryMod.foo` */
  override def _to: DataFactoryExtCtor = default
}

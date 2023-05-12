package typings.rdfjsDataModel

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.dataModelMod.Variable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromTermMod {
  
  @JSImport("@rdfjs/data-model/lib/fromTerm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: BaseQuad): ReturnType[FromTerm[BaseQuad, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[BaseQuad, D]]]
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: BlankNode): ReturnType[FromTerm[BlankNode, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[BlankNode, D]]]
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: DefaultGraph): ReturnType[FromTerm[DefaultGraph, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[DefaultGraph, D]]]
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: Literal): ReturnType[FromTerm[Literal, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[Literal, D]]]
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: NamedNode[String]): ReturnType[FromTerm[NamedNode[String], D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[NamedNode[String], D]]]
  inline def default[D /* <: DataFactory[Quad, Quad] */](factory: D, original: Variable): ReturnType[FromTerm[Variable, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FromTerm[Variable, D]]]
  
  type FromTerm[T /* <: Term */, D /* <: DataFactory[Quad, Quad] */] = js.Function2[
    /* factory */ D, 
    /* original */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends @rdfjs/types.@rdfjs/types/data-model.Literal ? std.ReturnType<D['literal']> : T extends @rdfjs/types.@rdfjs/types/data-model.BlankNode ? std.ReturnType<D['blankNode']> : T extends @rdfjs/types.@rdfjs/types/data-model.NamedNode<string> ? std.ReturnType<D['namedNode']> : T extends @rdfjs/types.@rdfjs/types/data-model.Variable ? D['variable'] extends (arg : ...any): @rdfjs/types.@rdfjs/types/data-model.Variable ? std.ReturnType<D['variable']> : never : T extends @rdfjs/types.@rdfjs/types/data-model.BaseQuad ? std.ReturnType<D['quad']> : T extends @rdfjs/types.@rdfjs/types/data-model.DefaultGraph ? std.ReturnType<D['defaultGraph']> : never */ js.Any
  ]
}

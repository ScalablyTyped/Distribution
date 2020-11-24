package typings.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlankTerm = typings.rdfJs.mod.BlankNode
  
  /* Rewritten from type alias, can be one of: 
    - typings.sparqljs.mod.OperationExpression
    - typings.sparqljs.mod.FunctionCallExpression
    - typings.sparqljs.mod.AggregateExpression
    - typings.sparqljs.mod.BgpPattern
    - typings.sparqljs.mod.GraphPattern
    - typings.sparqljs.mod.GroupPattern
    - typings.sparqljs.mod.Tuple
    - typings.sparqljs.mod.Term
  */
  type Expression = typings.sparqljs.mod._Expression | typings.sparqljs.mod.Term
  
  type IriTerm = typings.rdfJs.mod.NamedNode[java.lang.String]
  
  type LiteralTerm = typings.rdfJs.mod.Literal
  
  type QuadTerm = typings.rdfJs.mod.Quad
  
  type Term = typings.sparqljs.mod.VariableTerm | typings.sparqljs.mod.IriTerm | typings.sparqljs.mod.LiteralTerm | typings.sparqljs.mod.BlankTerm | typings.sparqljs.mod.QuadTerm
  
  type ValuePatternRow = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      typings.sparqljs.mod.IriTerm | typings.sparqljs.mod.BlankTerm | typings.sparqljs.mod.LiteralTerm
    ]
  ]
  
  type Variable = typings.sparqljs.mod.VariableExpression | typings.sparqljs.mod.VariableTerm
  
  type VariableTerm = typings.rdfJs.mod.Variable
}

package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlankTerm = BlankNode

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
type Expression = _Expression | Term

type IriTerm = NamedNode[String]

type LiteralTerm = Literal

type QuadTerm = Quad

type Term = VariableTerm | IriTerm | LiteralTerm | BlankTerm | QuadTerm

type ValuePatternRow = StringDictionary[js.UndefOr[IriTerm | BlankTerm | LiteralTerm]]

type Variable = VariableExpression | VariableTerm

type VariableTerm = typings.rdfjsTypes.dataModelMod.Variable

package typings.rdflib.formulaMod

import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/formula", JSImport.Default)
@js.native
/**
  * Initializes this formula
  * @constructor
  * @param statements - Initial array of statements
  * @param constraints - initial array of constraints
  * @param initBindings - initial bindings used in Query
  * @param optional - optional
  * @param opts
  * @param opts.rdfFactory - The rdf factory that should be used by the store
  */
class default () extends Formula {
  def this(statements: js.Array[
        typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ]) = this()
  def this(
    statements: js.Array[
        typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_],
    optional: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_],
    optional: js.Array[_],
    opts: FormulaOpts
  ) = this()
}


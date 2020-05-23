package typings.rdflib.mod

import typings.rdflib.literalMod.default
import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Literal")
@js.native
class Literal protected () extends default {
  /**
    * Initializes a literal
    * @param value - The literal's lexical value
    * @param language - The language for the literal. Defaults to ''.
    * @param datatype - The literal's datatype as a named node. Defaults to xsd:string.
    */
  def this(value: String) = this()
  def this(value: String, language: String) = this()
  def this(value: String, language: String, datatype: js.Any) = this()
  def this(value: String, language: Null, datatype: js.Any) = this()
}

/* static members */
@JSImport("rdflib", "Literal")
@js.native
object Literal extends js.Object {
  /**
    * Builds a literal node from a boolean value
    * @param value - The value
    */
  def fromBoolean(value: Boolean): typings.rdflib.literalMod.Literal = js.native
  /**
    * Builds a literal node from a date value
    * @param value The value
    */
  def fromDate(value: Date): typings.rdflib.literalMod.Literal = js.native
  /**
    * Builds a literal node from a number value
    * @param value - The value
    */
  def fromNumber(value: Double): typings.rdflib.literalMod.Literal = js.native
  /**
    * Builds a literal node from an input value
    * @param value - The input value
    */
  def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
  /** Serializes a literal to an N-Triples string */
  def toNT(literal: typings.rdflib.literalMod.Literal): String = js.native
}


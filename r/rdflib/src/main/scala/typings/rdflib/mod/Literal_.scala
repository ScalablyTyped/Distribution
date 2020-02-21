package typings.rdflib.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Literal")
@js.native
class Literal_ protected () extends Node {
  /**
    * Initializes this literal
    * @param value The literal's lexical value
    * @param language The language for the literal
    * @param datatype The literal's datatype as a named node
    */
  def this(value: String) = this()
  def this(value: String, language: String) = this()
  def this(value: String, language: String, datatype: NamedNode_) = this()
  /**
    * The literal's datatype as a named node
    */
  var datatype: NamedNode_ = js.native
  /**
    * The language for the literal
    */
  var lang: String = js.native
  /**
    * The language for the literal
    */
  var language: String = js.native
  /**
    * Gets a copy of this literal
    */
  def copy(): Literal_ = js.native
}

/* static members */
@JSImport("rdflib", "Literal")
@js.native
object Literal_ extends js.Object {
  var termType: String = js.native
  /**
    * Builds a literal node from a boolean value
    * @param value The value
    */
  def fromBoolean(value: Boolean): Literal_ = js.native
  /**
    * Builds a literal node from a date value
    * @param value The value
    */
  def fromDate(value: Date): Literal_ = js.native
  /**
    * Builds a literal node from a number value
    * @param value The value
    */
  def fromNumber(value: Double): Literal_ = js.native
  /**
    * Builds a literal node from an input value
    * @param value The input value
    */
  def fromValue(value: ValueType): Literal_ | ValueType = js.native
}


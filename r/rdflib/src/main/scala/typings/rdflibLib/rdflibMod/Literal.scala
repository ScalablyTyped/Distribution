package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Literal")
@js.native
class Literal protected () extends Node {
  /**
    * Initializes this literal
    * @param value The literal's lexical value
    * @param language The language for the literal
    * @param datatype The literal's datatype as a named node
    */
  def this(value: java.lang.String, language: java.lang.String, datatype: NamedNode) = this()
  /**
    * The literal's datatype as a named node
    */
  var datatype: NamedNode = js.native
  /**
    * The language for the literal
    */
  var lang: java.lang.String = js.native
  /**
    * The language for the literal
    */
  var language: java.lang.String = js.native
  /**
    * Gets a copy of this literal
    */
  def copy(): Literal = js.native
}

@JSImport("rdflib", "Literal")
@js.native
object Literal extends js.Object {
  var termType: java.lang.String = js.native
  /**
    * Builds a literal node from a boolean value
    * @param value The value
    */
  def fromBoolean(value: scala.Boolean): rdflibLib.rdflibMod.Literal = js.native
  /**
    * Builds a literal node from a date value
    * @param value The value
    */
  def fromDate(value: stdLib.Date): rdflibLib.rdflibMod.Literal = js.native
  /**
    * Builds a literal node from a number value
    * @param value The value
    */
  def fromNumber(value: scala.Double): rdflibLib.rdflibMod.Literal = js.native
  /**
    * Builds a literal node from an input value
    * @param value The input value
    */
  def fromValue(value: rdflibLib.rdflibMod.ValueType): rdflibLib.rdflibMod.Literal | rdflibLib.rdflibMod.ValueType = js.native
}


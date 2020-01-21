package typings.queryString.mod

import typings.queryString.AnonParseBooleans
import typings.queryString.AnonParseBooleansTrue
import typings.queryString.AnonParseNumbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", "parse")
@js.native
object parse extends js.Object {
  def apply(query: String): ParsedQuery[String] = js.native
  def apply(query: String, options: AnonParseBooleansTrue with ParseOptions): ParsedQuery[String | Boolean] = js.native
  def apply(query: String, options: AnonParseNumbers with ParseOptions): ParsedQuery[String | Double] = js.native
  def apply(query: String, options: AnonParseBooleans with ParseOptions): ParsedQuery[String | Boolean | Double] = js.native
  def apply(query: String, options: ParseOptions): ParsedQuery[String] = js.native
}


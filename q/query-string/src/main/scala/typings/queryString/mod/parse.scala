package typings.queryString.mod

import typings.queryString.parseBooleanstrueParseOpt
import typings.queryString.parseBooleanstrueparseNum
import typings.queryString.parseNumberstrueParseOpti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", "parse")
@js.native
object parse extends js.Object {
  def apply(query: String): ParsedQuery[String] = js.native
  def apply(query: String, options: ParseOptions): ParsedQuery[String] = js.native
  def apply(query: String, options: parseBooleanstrueParseOpt): ParsedQuery[String | Boolean] = js.native
  def apply(query: String, options: parseBooleanstrueparseNum): ParsedQuery[String | Boolean | Double] = js.native
  def apply(query: String, options: parseNumberstrueParseOpti): ParsedQuery[String | Double] = js.native
}


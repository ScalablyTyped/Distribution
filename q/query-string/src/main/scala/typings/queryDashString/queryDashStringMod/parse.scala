package typings.queryDashString.queryDashStringMod

import typings.queryDashString.Anon_ParseBooleans
import typings.queryDashString.Anon_ParseBooleansTrue
import typings.queryDashString.Anon_ParseNumbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", "parse")
@js.native
object parse extends js.Object {
  def apply(query: String): ParsedQuery[String] = js.native
  def apply(query: String, options: Anon_ParseNumbers with ParseOptions): ParsedQuery[String | Double] = js.native
  def apply(query: String, options: Anon_ParseBooleansTrue with ParseOptions): ParsedQuery[String | Boolean] = js.native
  def apply(query: String, options: Anon_ParseBooleans with ParseOptions): ParsedQuery[String | Boolean | Double] = js.native
  def apply(query: String, options: ParseOptions): ParsedQuery[String] = js.native
}


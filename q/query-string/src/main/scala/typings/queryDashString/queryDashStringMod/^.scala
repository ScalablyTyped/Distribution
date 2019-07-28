package typings.queryDashString.queryDashStringMod

import org.scalablytyped.runtime.StringDictionary
import typings.queryDashString.Anon_ParseBooleans
import typings.queryDashString.Anon_ParseBooleansTrue
import typings.queryDashString.Anon_ParseNumbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(url: String): String = js.native
  def parse(query: String): ParsedQuery[String] = js.native
  def parse(query: String, options: Anon_ParseBooleansTrue with ParseOptions): ParsedQuery[String | Boolean] = js.native
  def parse(query: String, options: Anon_ParseNumbers with ParseOptions): ParsedQuery[String | Double] = js.native
  def parse(query: String, options: Anon_ParseBooleans with ParseOptions): ParsedQuery[String | Boolean | Double] = js.native
  def parse(query: String, options: ParseOptions): ParsedQuery[String] = js.native
  def parseUrl(url: String): ParsedUrl = js.native
  def parseUrl(url: String, options: ParseOptions): ParsedUrl = js.native
  def stringify(`object`: StringDictionary[js.Any]): String = js.native
  def stringify(`object`: StringDictionary[js.Any], options: StringifyOptions): String = js.native
}


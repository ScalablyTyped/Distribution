package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(url: java.lang.String): java.lang.String = js.native
  def parse(query: java.lang.String): ParsedQuery[java.lang.String] = js.native
  def parse(query: java.lang.String, options: queryDashStringLib.Anon_ParseBooleans with ParseOptions): ParsedQuery[java.lang.String | scala.Boolean | scala.Double] = js.native
  def parse(query: java.lang.String, options: queryDashStringLib.Anon_ParseNumbers with ParseOptions): ParsedQuery[java.lang.String | scala.Double] = js.native
  def parse(query: java.lang.String, options: queryDashStringLib.Anon_ParseBooleansTrue with ParseOptions): ParsedQuery[java.lang.String | scala.Boolean] = js.native
  def parse(query: java.lang.String, options: ParseOptions): ParsedQuery[java.lang.String] = js.native
  def parseUrl(url: java.lang.String): ParsedUrl = js.native
  def parseUrl(url: java.lang.String, options: ParseOptions): ParsedUrl = js.native
  def stringify(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def stringify(`object`: org.scalablytyped.runtime.StringDictionary[js.Any], options: StringifyOptions): java.lang.String = js.native
}


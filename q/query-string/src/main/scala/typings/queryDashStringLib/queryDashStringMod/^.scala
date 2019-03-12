package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(url: java.lang.String): java.lang.String = js.native
  def parse(query: java.lang.String): ParsedQuery = js.native
  def parse(query: java.lang.String, options: ParseOptions): ParsedQuery = js.native
  def parseUrl(url: java.lang.String): ParsedUrl = js.native
  def parseUrl(url: java.lang.String, options: ParseOptions): ParsedUrl = js.native
  def stringify(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def stringify(`object`: org.scalablytyped.runtime.StringDictionary[js.Any], options: StringifyOptions): java.lang.String = js.native
}


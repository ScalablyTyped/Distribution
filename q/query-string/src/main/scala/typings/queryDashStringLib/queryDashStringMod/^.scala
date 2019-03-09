package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(url: java.lang.String): java.lang.String = js.native
  def parse(query: java.lang.String): queryDashStringLib.queryDashStringMod.ParsedQuery = js.native
  def parse(query: java.lang.String, options: queryDashStringLib.queryDashStringMod.ParseOptions): queryDashStringLib.queryDashStringMod.ParsedQuery = js.native
  def parseUrl(url: java.lang.String): queryDashStringLib.queryDashStringMod.ParsedUrl = js.native
  def parseUrl(url: java.lang.String, options: queryDashStringLib.queryDashStringMod.ParseOptions): queryDashStringLib.queryDashStringMod.ParsedUrl = js.native
  def stringify(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def stringify(
    `object`: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: queryDashStringLib.queryDashStringMod.StringifyOptions
  ): java.lang.String = js.native
}


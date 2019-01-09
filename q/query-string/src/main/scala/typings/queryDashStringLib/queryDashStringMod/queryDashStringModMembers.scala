package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object queryDashStringModMembers extends js.Object {
  def extract(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): OutputParams = js.native
  def parse(str: java.lang.String, options: ParseOptions): OutputParams = js.native
  def parseUrl(str: java.lang.String): queryDashStringLib.Anon_Query = js.native
  def parseUrl(str: java.lang.String, options: ParseOptions): queryDashStringLib.Anon_Query = js.native
  def stringify(obj: InputParams): java.lang.String = js.native
  def stringify(obj: InputParams, options: StringifyOptions): java.lang.String = js.native
}


package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("query-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): queryDashStringLib.queryDashStringMod.OutputParams = js.native
  def parse(str: java.lang.String, options: queryDashStringLib.queryDashStringMod.ParseOptions): queryDashStringLib.queryDashStringMod.OutputParams = js.native
  def parseUrl(str: java.lang.String): queryDashStringLib.Anon_Query = js.native
  def parseUrl(str: java.lang.String, options: queryDashStringLib.queryDashStringMod.ParseOptions): queryDashStringLib.Anon_Query = js.native
  def stringify(obj: queryDashStringLib.queryDashStringMod.InputParams): java.lang.String = js.native
  def stringify(
    obj: queryDashStringLib.queryDashStringMod.InputParams,
    options: queryDashStringLib.queryDashStringMod.StringifyOptions
  ): java.lang.String = js.native
}


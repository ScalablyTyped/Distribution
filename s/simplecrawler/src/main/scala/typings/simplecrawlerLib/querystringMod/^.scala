package typings
package simplecrawlerLib.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def escape(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): js.Any = js.native
  def parse(str: java.lang.String, sep: java.lang.String): js.Any = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): js.Any = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): js.Any = js.native
  @JSName("parse")
  def parse_TObjectT[T /* <: js.Object */](str: java.lang.String): T = js.native
  @JSName("parse")
  def parse_TObjectT[T /* <: js.Object */](str: java.lang.String, sep: java.lang.String): T = js.native
  @JSName("parse")
  def parse_TObjectT[T /* <: js.Object */](str: java.lang.String, sep: java.lang.String, eq: java.lang.String): T = js.native
  @JSName("parse")
  def parse_TObjectT[T /* <: js.Object */](str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): T = js.native
  def stringify[T](obj: T): java.lang.String = js.native
  def stringify[T](obj: T, sep: java.lang.String): java.lang.String = js.native
  def stringify[T](obj: T, sep: java.lang.String, eq: java.lang.String): java.lang.String = js.native
  def stringify[T](obj: T, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}


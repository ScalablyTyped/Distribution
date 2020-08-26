package typings.simpleQueryString

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-query-string", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var version: String = js.native
  def parse(str: String): StringDictionary[String | js.Array[String] | Null] = js.native
  def parse(str: String, delimeter: js.UndefOr[scala.Nothing], eq: String): StringDictionary[String | js.Array[String] | Null] = js.native
  def parse(str: String, delimeter: String): StringDictionary[String | js.Array[String] | Null] = js.native
  def parse(str: String, delimeter: String, eq: String): StringDictionary[String | js.Array[String] | Null] = js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T]): String = js.native
  def stringify[T](
    obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T],
    delimeter: js.UndefOr[scala.Nothing],
    eq: String
  ): String = js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String): String = js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String, eq: String): String = js.native
}


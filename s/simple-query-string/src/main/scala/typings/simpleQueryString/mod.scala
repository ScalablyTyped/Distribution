package typings.simpleQueryString

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("simple-query-string", "parse")
  @js.native
  def parse(str: String): StringDictionary[String | js.Array[String] | Null] = js.native
  @JSImport("simple-query-string", "parse")
  @js.native
  def parse(str: String, delimeter: js.UndefOr[scala.Nothing], eq: String): StringDictionary[String | js.Array[String] | Null] = js.native
  @JSImport("simple-query-string", "parse")
  @js.native
  def parse(str: String, delimeter: String): StringDictionary[String | js.Array[String] | Null] = js.native
  @JSImport("simple-query-string", "parse")
  @js.native
  def parse(str: String, delimeter: String, eq: String): StringDictionary[String | js.Array[String] | Null] = js.native
  
  @JSImport("simple-query-string", "stringify")
  @js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T]): String = js.native
  @JSImport("simple-query-string", "stringify")
  @js.native
  def stringify[T](
    obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T],
    delimeter: js.UndefOr[scala.Nothing],
    eq: String
  ): String = js.native
  @JSImport("simple-query-string", "stringify")
  @js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String): String = js.native
  @JSImport("simple-query-string", "stringify")
  @js.native
  def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String, eq: String): String = js.native
  
  @JSImport("simple-query-string", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}

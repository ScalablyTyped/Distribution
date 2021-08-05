package typings.simpleQueryString

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): StringDictionary[String | js.Array[String] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String | js.Array[String] | Null]]
  inline def parse(str: String, delimeter: String): StringDictionary[String | js.Array[String] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | js.Array[String] | Null]]
  inline def parse(str: String, delimeter: String, eq: String): StringDictionary[String | js.Array[String] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | js.Array[String] | Null]]
  inline def parse(str: String, delimeter: Unit, eq: String): StringDictionary[String | js.Array[String] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | js.Array[String] | Null]]
  
  inline def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: String, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify[T](obj: /* tslint:disable-next-line ban-types */
  StringDictionary[T], delimeter: Unit, eq: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], delimeter.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("simple-query-string", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}

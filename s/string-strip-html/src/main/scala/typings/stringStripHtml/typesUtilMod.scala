package typings.stringStripHtml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilMod {
  
  @JSImport("string-strip-html/types/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def characterSuitableForNames(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("characterSuitableForNames")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def notWithinAttrQuotes(tag: Obj, str: String, i: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notWithinAttrQuotes")(tag.asInstanceOf[js.Any], str.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def prepHopefullyAnArray(something: Any, name: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepHopefullyAnArray")(something.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def xBeforeYOnTheRight(str: String, startingIdx: Double, x: String, y: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xBeforeYOnTheRight")(str.asInstanceOf[js.Any], startingIdx.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Obj = StringDictionary[Any]
}

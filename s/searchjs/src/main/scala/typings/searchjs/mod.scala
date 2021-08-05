package typings.searchjs

import typings.searchjs.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("searchjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchArray(ary: js.Array[js.Any], search: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchArray")(ary.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def matchObject(obj: js.Any, search: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchObject")(obj.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def resetDefaults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDefaults")().asInstanceOf[Unit]
  
  inline def setDefaults(options: End): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def singleMatch(field: js.Any, s: js.Any, text: Boolean, word: Boolean, start: Boolean, end: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("singleMatch")(field.asInstanceOf[js.Any], s.asInstanceOf[js.Any], text.asInstanceOf[js.Any], word.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}

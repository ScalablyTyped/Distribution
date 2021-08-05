package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringRepeatMod {
  
  @JSImport("random-js/dist/utils/stringRepeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringRepeat(pattern: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringRepeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
}

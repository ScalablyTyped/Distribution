package typings.reactSelect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diacriticsMod {
  
  @JSImport("react-select/dist/declarations/src/diacritics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stripDiacritics(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripDiacritics")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}

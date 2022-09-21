package typings.reactNativeSvg

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-svg/lib/typescript/lib/util", "idPattern")
  @js.native
  val idPattern: js.RegExp = js.native
  
  inline def pickNotNil(`object`: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickNotNil")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
}

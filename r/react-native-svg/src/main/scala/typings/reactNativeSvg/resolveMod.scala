package typings.reactNativeSvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve[T](styleProp: js.Iterable[T], cleanedProps: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(styleProp.asInstanceOf[js.Any], cleanedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
}

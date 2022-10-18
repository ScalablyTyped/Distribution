package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsIsOneOfMod {
  
  @JSImport("smooth-scrollbar/utils/is-one-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isOneOf(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOneOf(a: Any, b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

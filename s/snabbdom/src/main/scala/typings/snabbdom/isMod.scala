package typings.snabbdom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("snabbdom/build/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def primitive(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primitive")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

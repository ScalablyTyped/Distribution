package typings.reactDiv100vh

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-div-100vh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-div-100vh", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HTMLAttributes[HTMLDivElement] & RefAttributes[HTMLDivElement]] = js.native
  
  inline def measureHeight(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("measureHeight")().asInstanceOf[Double | Null]
  
  inline def use100vh(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("use100vh")().asInstanceOf[Double | Null]
}

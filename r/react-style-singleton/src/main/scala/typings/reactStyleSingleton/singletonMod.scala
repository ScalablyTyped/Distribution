package typings.reactStyleSingleton

import typings.reactStyleSingleton.anon.Add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singletonMod {
  
  @JSImport("react-style-singleton/dist/es5/singleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stylesheetSingleton(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheetSingleton")().asInstanceOf[Add]
}

package typings.reactWithStyles

import typings.reactWithStyles.anon.Css
import typings.reactWithStyles.anon.StylesFn
import typings.reactWithStyles.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseStylesMod {
  
  @JSImport("react-with-styles/lib/hooks/useStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TStyles /* <: Styles */](param0: StylesFn[TStyles]): Css[TStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Css[TStyles]]
}

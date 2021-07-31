package typings.reactWithStyles

import typings.reactWithStyles.anon.Css
import typings.reactWithStyles.anon.StylesFn
import typings.reactWithStyles.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStylesMod {
  
  @JSImport("react-with-styles/lib/hooks/useStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TStyles /* <: Styles */](hasStylesFn: StylesFn[TStyles]): Css[TStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStylesFn.asInstanceOf[js.Any]).asInstanceOf[Css[TStyles]]
}

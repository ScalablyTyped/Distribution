package typings.reactLoaderSpinner

import typings.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("react-loader-spinner/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultStyle(visible: Boolean): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyle")(visible.asInstanceOf[js.Any]).asInstanceOf[Style]
}

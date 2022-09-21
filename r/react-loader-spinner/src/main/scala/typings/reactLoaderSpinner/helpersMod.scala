package typings.reactLoaderSpinner

import typings.reactLoaderSpinner.typeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-loader-spinner/dist/esm/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultStyle(visible: Boolean): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyle")(visible.asInstanceOf[js.Any]).asInstanceOf[Style]
}

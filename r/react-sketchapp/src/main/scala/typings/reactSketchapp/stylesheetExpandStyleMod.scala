package typings.reactSketchapp

import typings.reactSketchapp.libStylesheetTypesMod.RawStyle
import typings.reactSketchapp.libStylesheetTypesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesheetExpandStyleMod {
  
  @JSImport("react-sketchapp/lib/stylesheet/expandStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandStyle(style: RawStyle): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("expandStyle")(style.asInstanceOf[js.Any]).asInstanceOf[Style]
}

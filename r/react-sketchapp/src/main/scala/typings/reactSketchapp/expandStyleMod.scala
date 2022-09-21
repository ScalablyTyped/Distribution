package typings.reactSketchapp

import typings.reactSketchapp.stylesheetTypesMod.RawStyle
import typings.reactSketchapp.stylesheetTypesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandStyleMod {
  
  @JSImport("react-sketchapp/lib/module/stylesheet/expandStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandStyle(style: RawStyle): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("expandStyle")(style.asInstanceOf[js.Any]).asInstanceOf[Style]
}

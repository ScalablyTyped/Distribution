package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sketchFindFontNameMod {
  
  @JSImport("react-sketchapp/lib/platformBridges/sketch/findFontName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findFont(style: TextStyle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findFont")(style.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def findFontName(style: TextStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findFontName")(style.asInstanceOf[js.Any]).asInstanceOf[String]
}

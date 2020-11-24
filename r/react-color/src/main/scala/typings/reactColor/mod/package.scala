package typings.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactColor.mod.HSLColor
    - typings.reactColor.mod.RGBColor
  */
  type Color = typings.reactColor.mod._Color | java.lang.String
  
  type ColorChangeHandler = js.Function2[
    /* color */ typings.reactColor.mod.ColorResult, 
    /* event */ typings.react.mod.ChangeEvent[typings.std.HTMLInputElement], 
    scala.Unit
  ]
}

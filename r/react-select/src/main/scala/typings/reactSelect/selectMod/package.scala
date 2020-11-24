package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type ElRef = typings.react.mod.Ref[js.Any]
  
  type MouseOrTouchEvent = (typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLElement]
  
  type SelectComponentsProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typings.reactSelect.reactSelectStrings.SelectComponentsProps with org.scalablytyped.runtime.TopLevel[js.Any]
}

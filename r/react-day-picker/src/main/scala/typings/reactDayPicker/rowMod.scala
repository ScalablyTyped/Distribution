package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.rowRowMod.RowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowMod {
  
  @JSImport("react-day-picker/dist/components/Row", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Row(props: RowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

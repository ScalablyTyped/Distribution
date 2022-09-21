package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.tableTableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("react-day-picker/dist/components/Table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Table(props: TableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Table")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

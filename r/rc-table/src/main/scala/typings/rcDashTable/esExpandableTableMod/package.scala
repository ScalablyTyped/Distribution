package typings.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esExpandableTableMod {
  import typings.rcDashTable.esInterfaceMod.Cell
  import typings.rcDashTable.esInterfaceMod.FixedType
  import typings.rcDashTable.esInterfaceMod.Key
  import typings.rcDashTable.esInterfaceMod.RenderRows
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.ReactElement
  import typings.std.HTMLElement

  type ExpandChangeEventHandler[ValueType] = js.Function5[
    /* expanded */ Boolean, 
    /* record */ ValueType, 
    /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
    /* rowKey */ Key, 
    /* destroy */ Boolean, 
    Unit
  ]
  type ExpandEventHandler[ValueType] = js.Function2[/* expanded */ Boolean, /* record */ ValueType, Unit]
  type RenderExpandIndentCell = js.Function2[/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType, Unit]
  type RenderTableRows[ValueType] = js.Function8[
    /* renderRows */ RenderRows[ValueType], 
    /* rows */ js.Array[ReactElement], 
    /* record */ ValueType, 
    /* index */ Double, 
    /* indent */ Double, 
    /* fixed */ FixedType, 
    /* parentKey */ Key, 
    /* ancestorKeys */ js.Array[Key], 
    Unit
  ]
}

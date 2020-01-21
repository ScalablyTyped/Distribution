package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expandableTableMod {
  type ExpandChangeEventHandler[ValueType] = js.Function5[
    /* expanded */ scala.Boolean, 
    /* record */ ValueType, 
    /* event */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
    /* rowKey */ typings.rcTable.interfaceMod.Key, 
    /* destroy */ scala.Boolean, 
    scala.Unit
  ]
  type ExpandEventHandler[ValueType] = js.Function2[/* expanded */ scala.Boolean, /* record */ ValueType, scala.Unit]
  type RenderExpandIndentCell = js.Function2[
    /* rows */ js.Array[js.Array[typings.rcTable.interfaceMod.Cell]], 
    /* fixed */ typings.rcTable.interfaceMod.FixedType, 
    scala.Unit
  ]
  type RenderTableRows[ValueType] = js.Function8[
    /* renderRows */ typings.rcTable.interfaceMod.RenderRows[ValueType], 
    /* rows */ js.Array[typings.react.mod.ReactElement], 
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    /* fixed */ typings.rcTable.interfaceMod.FixedType, 
    /* parentKey */ typings.rcTable.interfaceMod.Key, 
    /* ancestorKeys */ js.Array[typings.rcTable.interfaceMod.Key], 
    scala.Unit
  ]
}

package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type CustomizeComponent[P /* <: typings.react.mod.HTMLAttributes[typings.std.HTMLElement] */] = typings.react.mod.ComponentType[P] | typings.react.mod.FC[P] | java.lang.String
  type DefaultValueType = typings.std.Record[java.lang.String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    /* expanded */ scala.Boolean, 
    typings.react.mod.ReactNode
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.rcTable.rcTableStrings.left
    - typings.rcTable.rcTableStrings.right
    - scala.Boolean
  */
  type FixedType = typings.rcTable.interfaceMod._FixedType | scala.Boolean
  type GetComponentProps[DataType] = js.Function2[
    /* data */ DataType, 
    /* index */ js.UndefOr[scala.Double], 
    typings.react.mod.HTMLAttributes[typings.std.HTMLElement]
  ]
  type GetRowKey[ValueType] = js.Function2[/* value */ ValueType, /* index */ scala.Double, typings.rcTable.interfaceMod.Key]
  type IconExpandEventHandler[ValueType] = js.Function2[
    /* record */ ValueType, 
    /* event */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type Key = typings.react.mod.Key
  type LegacyFunction[ValueType] = js.Function3[
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.Element, typings.std.Event_], 
    scala.Unit
  ]
  type RenderExpandIcon[ValueType] = js.Function1[/* props */ typings.rcTable.AnonExpandable[ValueType], typings.react.mod.ReactNode]
  type RenderNode = js.Function0[typings.react.mod.ReactNode]
  type RenderRows[ValueType] = js.Function3[
    /* renderData */ js.Array[ValueType], 
    /* indent */ scala.Double, 
    /* ancestorKeys */ js.UndefOr[js.Array[typings.rcTable.interfaceMod.Key]], 
    js.Array[typings.react.mod.ReactElement]
  ]
  type RowHoverEventHandler = js.Function2[/* isHover */ scala.Boolean, /* key */ typings.rcTable.interfaceMod.Key, scala.Unit]
}

package typings.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceMod {
  import typings.rcDashTable.Anon_ExpandableExpanded
  import typings.react.Element
  import typings.react.Event
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.FC
  import typings.react.reactMod.HTMLAttributes
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.SyntheticEvent
  import typings.std.HTMLElement
  import typings.std.Record

  type CustomizeComponent[P /* <: HTMLAttributes[HTMLElement] */] = ComponentType[P] | FC[P] | String
  type DefaultValueType = Record[String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ Double, 
    /* indent */ Double, 
    /* expanded */ Boolean, 
    ReactNode
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.rcDashTable.rcDashTableStrings.left
    - typings.rcDashTable.rcDashTableStrings.right
    - scala.Boolean
  */
  type FixedType = _FixedType | Boolean
  type GetComponentProps[DataType] = js.Function2[/* data */ DataType, /* index */ js.UndefOr[Double], HTMLAttributes[HTMLElement]]
  type GetRowKey[ValueType] = js.Function2[/* value */ ValueType, /* index */ Double, Key]
  type IconExpandEventHandler[ValueType] = js.Function2[/* record */ ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  type Key = typings.react.reactMod.Key
  type LegacyFunction[ValueType] = js.Function3[
    /* record */ ValueType, 
    /* index */ Double, 
    /* event */ SyntheticEvent[Element, Event], 
    Unit
  ]
  type RenderExpandIcon[ValueType] = js.Function1[/* props */ Anon_ExpandableExpanded[ValueType], ReactNode]
  type RenderNode = js.Function0[ReactNode]
  type RenderRows[ValueType] = js.Function3[
    /* renderData */ js.Array[ValueType], 
    /* indent */ Double, 
    /* ancestorKeys */ js.UndefOr[js.Array[Key]], 
    js.Array[ReactElement]
  ]
  type RowHoverEventHandler = js.Function2[/* isHover */ Boolean, /* key */ Key, Unit]
}

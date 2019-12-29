package typings.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceMod {
  import typings.rcDashMenu.Anon_DomEventKey
  import typings.rcDashMenu.Anon_Hover
  import typings.rcDashMenu.Anon_Item
  import typings.rcDashMenu.rcDashMenuBooleans.`false`
  import typings.react.reactMod.AnimationEvent
  import typings.react.reactMod.CSSProperties
  import typings.react.reactMod.Key
  import typings.react.reactMod.ReactInstance
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.TransitionEvent
  import typings.std.HTMLElement
  import typings.std.Record

  type AnimationType = String | (Record[String, js.Any])
  type BuiltinPlacements = Record[String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ Key, Unit]
  type HoverEventHandler = js.Function1[/* info */ Anon_Hover, Unit]
  type LegacyFunctionRef = js.Function1[/* node */ ReactInstance, Unit]
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ Anon_DomEventKey, Unit]
  type MotionEventHandler = js.Function2[
    /* element */ HTMLElement, 
    /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]], 
    js.UndefOr[CSSProperties | `false` | Null | Unit]
  ]
  type MotionNameObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in rc-menu.rc-menu/lib/interface.MotionStatus | rc-menu.rc-menu/lib/interface.MotionActiveStatus ]:? string}
    */ typings.rcDashMenu.rcDashMenuStrings.MotionNameObject with js.Any
  type OpenAnimation = String | (Record[String, js.Any])
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Anon_Item, Unit]
  type RenderIconType = ReactNode | (js.Function1[/* props */ js.Any, ReactNode])
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  type TransitionNameType = String
}

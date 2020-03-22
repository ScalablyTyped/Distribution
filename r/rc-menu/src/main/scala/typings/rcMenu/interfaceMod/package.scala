package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type BuiltinPlacements = typings.std.Record[java.lang.String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ typings.react.mod.Key, scala.Unit]
  type HoverEventHandler = js.Function1[/* info */ typings.rcMenu.AnonHover, scala.Unit]
  type LegacyFunctionRef = js.Function1[/* node */ typings.react.mod.ReactInstance, scala.Unit]
  type MenuClickEventHandler = js.Function1[/* info */ typings.rcMenu.interfaceMod.MenuInfo, scala.Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ typings.rcMenu.AnonKey, scala.Unit]
  type OpenAnimation = java.lang.String | (typings.std.Record[java.lang.String, js.Any])
  type OpenEventHandler = js.Function1[/* keys */ js.Array[typings.react.mod.Key] | typings.rcMenu.AnonOpen, scala.Unit]
  type RenderIconType = typings.react.mod.ReactNode | (js.Function1[/* props */ js.Any, typings.react.mod.ReactNode])
  type SelectEventHandler = js.Function1[/* info */ typings.rcMenu.interfaceMod.SelectInfo, scala.Unit]
}

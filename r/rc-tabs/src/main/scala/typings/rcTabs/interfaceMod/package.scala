package typings.rcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type OnTabScroll = js.Function1[/* info */ typings.rcTabs.anon.Direction, scala.Unit]
  type RenderTabBar = js.Function2[
    /* props */ js.Any, 
    /* DefaultTabBar */ typings.react.mod.ComponentType[js.Object], 
    typings.react.mod.ReactElement
  ]
  type TabOffsetMap = typings.std.Map[typings.react.mod.Key, typings.rcTabs.interfaceMod.TabOffset]
  type TabSizeMap = typings.std.Map[typings.react.mod.Key, typings.rcTabs.anon.Height]
}

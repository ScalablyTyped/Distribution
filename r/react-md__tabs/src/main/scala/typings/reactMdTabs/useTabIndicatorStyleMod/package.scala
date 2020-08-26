package typings.reactMdTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useTabIndicatorStyleMod {
  type CSSProperties = typings.react.mod.CSSProperties with typings.reactMdTabs.useTabIndicatorStyleMod.CSSVariables
  type MergedTabRef = js.Function1[/* instance */ typings.std.HTMLDivElement | scala.Null, scala.Unit]
  type ReturnValue = js.Tuple3[
    typings.reactMdTabs.useTabIndicatorStyleMod.CSSProperties, 
    typings.reactMdTabs.useTabIndicatorStyleMod.MergedTabRef, 
    typings.react.mod.MutableRefObject[typings.std.HTMLDivElement | scala.Null]
  ]
}

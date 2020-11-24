package typings.reactMdTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useTabIndicatorStyleMod {
  
  type CSSProperties = typings.react.mod.CSSProperties with typings.reactMdTabs.useTabIndicatorStyleMod.CSSVariables
  
  type MergedTabRef = js.Function1[/* instance */ typings.std.HTMLDivElement | scala.Null, scala.Unit]
  
  type ReturnValue = js.Tuple4[
    typings.reactMdTabs.useTabIndicatorStyleMod.CSSProperties, 
    typings.reactMdTabs.useTabIndicatorStyleMod.MergedTabRef, 
    typings.react.mod.MutableRefObject[typings.std.HTMLDivElement | scala.Null], 
    typings.reactMdTabs.useTabIndicatorStyleMod.UpdateIndicatorStyles
  ]
  
  type UpdateIndicatorStyles = js.Function0[scala.Unit]
}

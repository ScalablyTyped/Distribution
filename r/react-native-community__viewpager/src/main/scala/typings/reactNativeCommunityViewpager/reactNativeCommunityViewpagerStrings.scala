package typings.reactNativeCommunityViewpager

import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.Orientation
import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.OverScrollMode
import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.PageScrollState
import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.TransitionStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeCommunityViewpagerStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with OverScrollMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait auto
    extends StObject
       with OverScrollMode
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait curl
    extends StObject
       with TransitionStyle
  inline def curl: curl = "curl".asInstanceOf[curl]
  
  @js.native
  sealed trait dragging
    extends StObject
       with PageScrollState
  inline def dragging: dragging = "dragging".asInstanceOf[dragging]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Orientation
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait idle
    extends StObject
       with PageScrollState
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait never
    extends StObject
       with OverScrollMode
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `on-drag` extends StObject
  inline def `on-drag`: `on-drag` = "on-drag".asInstanceOf[`on-drag`]
  
  @js.native
  sealed trait scroll
    extends StObject
       with TransitionStyle
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait settling
    extends StObject
       with PageScrollState
  inline def settling: settling = "settling".asInstanceOf[settling]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Orientation
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}

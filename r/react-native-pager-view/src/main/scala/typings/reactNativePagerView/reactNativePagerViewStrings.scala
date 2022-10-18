package typings.reactNativePagerView

import typings.reactNativePagerView.libTypescriptTypesMod.Orientation
import typings.reactNativePagerView.libTypescriptTypesMod.OverScrollMode
import typings.reactNativePagerView.libTypescriptTypesMod.PageScrollState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativePagerViewStrings {
  
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
  sealed trait locale extends StObject
  inline def locale: locale = "locale".asInstanceOf[locale]
  
  @js.native
  sealed trait ltr extends StObject
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
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
  sealed trait rtl extends StObject
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
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

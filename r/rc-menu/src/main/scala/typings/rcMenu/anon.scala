package typings.rcMenu

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: Boolean
    
    var disabled: Boolean
    
    var open: Boolean
    
    var selected: Boolean
  }
  object Active {
    
    inline def apply(active: Boolean, disabled: Boolean, open: Boolean, selected: Boolean): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdjustX extends StObject {
    
    var adjustX: Double
    
    var adjustY: Double
  }
  object AdjustX {
    
    inline def apply(adjustX: Double, adjustY: Double): AdjustX = {
      val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustX]
    }
    
    extension [Self <: AdjustX](x: Self) {
      
      inline def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      inline def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomEvent extends StObject {
    
    var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
    
    var key: String
  }
  object DomEvent {
    
    inline def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: String): DomEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEvent]
    }
    
    extension [Self <: DomEvent](x: Self) {
      
      inline def setDomEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetKeyPath extends StObject {
    
    def getKeyPath(eventKey: String): js.Array[String] = js.native
    def getKeyPath(eventKey: String, includeOverflow: Boolean): js.Array[String] = js.native
    
    def getKeys(): js.Array[String] = js.native
    
    def getSubPathKeys(key: String): Set[String] = js.native
    
    def isSubPathKey(pathKeys: js.Array[String], eventKey: String): Boolean = js.native
    
    def refreshOverflowKeys(keys: js.Array[String]): Unit = js.native
    
    def registerPath(key: String, keyPath: js.Array[String]): Unit = js.native
    
    def unregisterPath(key: String, keyPath: js.Array[String]): Unit = js.native
  }
  
  trait Item extends StObject {
    
    var item: ReactInstance
  }
  object Item {
    
    inline def apply(item: ReactInstance): Item = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: js.Array[Double]
    
    var overflow: AdjustX
    
    var points: js.Array[String]
  }
  object Offset {
    
    inline def apply(offset: js.Array[Double], overflow: AdjustX, points: js.Array[String]): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<{[ key in rc-menu.rc-menu/es/interface.MenuMode | 'other' ]: rc-motion.rc-motion.CSSMotionProps}> */
  trait PartialkeyinMenuModeother extends StObject {
    
    var horizontal: js.UndefOr[CSSMotionProps] = js.undefined
    
    var `inline`: js.UndefOr[CSSMotionProps] = js.undefined
    
    var other: js.UndefOr[CSSMotionProps] = js.undefined
    
    var vertical: js.UndefOr[CSSMotionProps] = js.undefined
  }
  object PartialkeyinMenuModeother {
    
    inline def apply(): PartialkeyinMenuModeother = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialkeyinMenuModeother]
    }
    
    extension [Self <: PartialkeyinMenuModeother](x: Self) {
      
      inline def setHorizontal(value: CSSMotionProps): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInline(value: CSSMotionProps): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOther(value: CSSMotionProps): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setVertical(value: CSSMotionProps): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Boolean
  }
  object Selected {
    
    inline def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}

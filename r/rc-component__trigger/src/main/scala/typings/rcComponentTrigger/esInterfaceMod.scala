package typings.rcComponentTrigger

import typings.rcComponentTrigger.anon.AdjustX
import typings.rcComponentTrigger.rcComponentTriggerStrings.scroll
import typings.rcComponentTrigger.rcComponentTriggerStrings.visible
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentTrigger.rcComponentTriggerStrings.hover
    - typings.rcComponentTrigger.rcComponentTriggerStrings.focus
    - typings.rcComponentTrigger.rcComponentTriggerStrings.click
    - typings.rcComponentTrigger.rcComponentTriggerStrings.contextMenu
  */
  trait ActionType extends StObject
  object ActionType {
    
    inline def click: typings.rcComponentTrigger.rcComponentTriggerStrings.click = "click".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.click]
    
    inline def contextMenu: typings.rcComponentTrigger.rcComponentTriggerStrings.contextMenu = "contextMenu".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.contextMenu]
    
    inline def focus: typings.rcComponentTrigger.rcComponentTriggerStrings.focus = "focus".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.focus]
    
    inline def hover: typings.rcComponentTrigger.rcComponentTriggerStrings.hover = "hover".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.hover]
  }
  
  type AlignPoint = /* template literal string: ${AlignPointTopBottom}${AlignPointLeftRight} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentTrigger.rcComponentTriggerStrings.l
    - typings.rcComponentTrigger.rcComponentTriggerStrings.r
    - typings.rcComponentTrigger.rcComponentTriggerStrings.c
  */
  trait AlignPointLeftRight extends StObject
  object AlignPointLeftRight {
    
    inline def c: typings.rcComponentTrigger.rcComponentTriggerStrings.c = "c".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.c]
    
    inline def l: typings.rcComponentTrigger.rcComponentTriggerStrings.l = "l".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.l]
    
    inline def r: typings.rcComponentTrigger.rcComponentTriggerStrings.r = "r".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.r]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentTrigger.rcComponentTriggerStrings.t
    - typings.rcComponentTrigger.rcComponentTriggerStrings.b
    - typings.rcComponentTrigger.rcComponentTriggerStrings.c
  */
  trait AlignPointTopBottom extends StObject
  object AlignPointTopBottom {
    
    inline def b: typings.rcComponentTrigger.rcComponentTriggerStrings.b = "b".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.b]
    
    inline def c: typings.rcComponentTrigger.rcComponentTriggerStrings.c = "c".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.c]
    
    inline def t: typings.rcComponentTrigger.rcComponentTriggerStrings.t = "t".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.t]
  }
  
  trait AlignType extends StObject {
    
    /** Auto adjust arrow position */
    var autoArrow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Config visible region check of html node. Default `visible`:
      *  - `visible`: The visible region of user browser window. Use `clientHeight` for check.
      *  - `scroll`: The whole region of the html scroll area. Use `scrollHeight` for check.
      */
    var htmlRegion: js.UndefOr[visible | scroll] = js.undefined
    
    var ignoreShake: js.UndefOr[Boolean] = js.undefined
    
    /**
      * offset source node by offset[0] in x and offset[1] in y.
      * If offset contains percentage string value, it is relative to sourceNode region.
      */
    var offset: js.UndefOr[js.Array[OffsetType]] = js.undefined
    
    /**
      * If adjustX field is true, will adjust source node in x direction if source node is invisible.
      * If adjustY field is true, will adjust source node in y direction if source node is invisible.
      */
    var overflow: js.UndefOr[AdjustX] = js.undefined
    
    /**
      * move point of source node to align with point of target node.
      * Such as ['tr','cc'], align top right point of source node with center point of target node.
      * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
    var points: js.UndefOr[js.Array[String | AlignPoint]] = js.undefined
    
    /**
      * offset target node by offset[0] in x and offset[1] in y.
      * If targetOffset contains percentage string value, it is relative to targetNode region.
      */
    var targetOffset: js.UndefOr[js.Array[OffsetType]] = js.undefined
    
    /**
      * Whether use css bottom instead of top to position
      */
    var useCssBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether use css right instead of left to position
      */
    var useCssRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether use css transform instead of left/top/right/bottom to position if browser supports.
      * Defaults to false.
      */
    var useCssTransform: js.UndefOr[Boolean] = js.undefined
  }
  object AlignType {
    
    inline def apply(): AlignType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignType] (val x: Self) extends AnyVal {
      
      inline def setAutoArrow(value: Boolean): Self = StObject.set(x, "autoArrow", value.asInstanceOf[js.Any])
      
      inline def setAutoArrowUndefined: Self = StObject.set(x, "autoArrow", js.undefined)
      
      inline def setHtmlRegion(value: visible | scroll): Self = StObject.set(x, "htmlRegion", value.asInstanceOf[js.Any])
      
      inline def setHtmlRegionUndefined: Self = StObject.set(x, "htmlRegion", js.undefined)
      
      inline def setIgnoreShake(value: Boolean): Self = StObject.set(x, "ignoreShake", value.asInstanceOf[js.Any])
      
      inline def setIgnoreShakeUndefined: Self = StObject.set(x, "ignoreShake", js.undefined)
      
      inline def setOffset(value: js.Array[OffsetType]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: OffsetType*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPoints(value: js.Array[String | AlignPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: (String | AlignPoint)*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTargetOffset(value: js.Array[OffsetType]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      inline def setTargetOffsetVarargs(value: OffsetType*): Self = StObject.set(x, "targetOffset", js.Array(value*))
      
      inline def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      inline def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      inline def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      inline def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      inline def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      inline def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  type AnimationType = String
  
  trait ArrowPos extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ArrowPos {
    
    inline def apply(): ArrowPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowPos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowPos] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ArrowTypeOuter extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
  }
  object ArrowTypeOuter {
    
    inline def apply(): ArrowTypeOuter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowTypeOuter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowTypeOuter] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type BuildInPlacements = Record[String, AlignType]
  
  trait CommonEventHandler extends StObject {
    
    def remove(): Unit
  }
  object CommonEventHandler {
    
    inline def apply(remove: () => Unit): CommonEventHandler = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[CommonEventHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonEventHandler] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  trait MobileConfig extends StObject {
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    /** Set popup motion. You can ref `rc-motion` for more info. */
    var popupMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var popupRender: js.UndefOr[js.Function1[/* originNode */ ReactNode, ReactNode]] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object MobileConfig {
    
    inline def apply(): MobileConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MobileConfig] (val x: Self) extends AnyVal {
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupMotion(value: CSSMotionProps): Self = StObject.set(x, "popupMotion", value.asInstanceOf[js.Any])
      
      inline def setPopupMotionUndefined: Self = StObject.set(x, "popupMotion", js.undefined)
      
      inline def setPopupRender(value: /* originNode */ ReactNode => ReactNode): Self = StObject.set(x, "popupRender", js.Any.fromFunction1(value))
      
      inline def setPopupRenderUndefined: Self = StObject.set(x, "popupRender", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
    }
  }
  
  type OffsetType = Double | (/* template literal string: ${number}% */ String)
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentTrigger.rcComponentTriggerStrings.top
    - typings.rcComponentTrigger.rcComponentTriggerStrings.left
    - typings.rcComponentTrigger.rcComponentTriggerStrings.right
    - typings.rcComponentTrigger.rcComponentTriggerStrings.bottom
    - typings.rcComponentTrigger.rcComponentTriggerStrings.topLeft
    - typings.rcComponentTrigger.rcComponentTriggerStrings.topRight
    - typings.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft
    - typings.rcComponentTrigger.rcComponentTriggerStrings.bottomRight
    - typings.rcComponentTrigger.rcComponentTriggerStrings.leftTop
    - typings.rcComponentTrigger.rcComponentTriggerStrings.leftBottom
    - typings.rcComponentTrigger.rcComponentTriggerStrings.rightTop
    - typings.rcComponentTrigger.rcComponentTriggerStrings.rightBottom
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.rcComponentTrigger.rcComponentTriggerStrings.bottom = "bottom".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.bottom]
    
    inline def bottomLeft: typings.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft]
    
    inline def bottomRight: typings.rcComponentTrigger.rcComponentTriggerStrings.bottomRight = "bottomRight".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.bottomRight]
    
    inline def left: typings.rcComponentTrigger.rcComponentTriggerStrings.left = "left".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.left]
    
    inline def leftBottom: typings.rcComponentTrigger.rcComponentTriggerStrings.leftBottom = "leftBottom".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.leftBottom]
    
    inline def leftTop: typings.rcComponentTrigger.rcComponentTriggerStrings.leftTop = "leftTop".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.leftTop]
    
    inline def right: typings.rcComponentTrigger.rcComponentTriggerStrings.right = "right".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.right]
    
    inline def rightBottom: typings.rcComponentTrigger.rcComponentTriggerStrings.rightBottom = "rightBottom".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.rightBottom]
    
    inline def rightTop: typings.rcComponentTrigger.rcComponentTriggerStrings.rightTop = "rightTop".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.rightTop]
    
    inline def top: typings.rcComponentTrigger.rcComponentTriggerStrings.top = "top".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.top]
    
    inline def topLeft: typings.rcComponentTrigger.rcComponentTriggerStrings.topLeft = "topLeft".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.topLeft]
    
    inline def topRight: typings.rcComponentTrigger.rcComponentTriggerStrings.topRight = "topRight".asInstanceOf[typings.rcComponentTrigger.rcComponentTriggerStrings.topRight]
  }
  
  trait Point extends StObject {
    
    var pageX: Double
    
    var pageY: Double
  }
  object Point {
    
    inline def apply(pageX: Double, pageY: Double): Point = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  type StretchType = String
  
  type TransitionNameType = String
}

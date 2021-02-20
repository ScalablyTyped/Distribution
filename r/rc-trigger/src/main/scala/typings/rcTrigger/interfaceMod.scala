package typings.rcTrigger

import org.scalablytyped.runtime.StringDictionary
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.anon.AdjustX
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  type ActionType = String
  
  type AlignPoint = String
  
  @js.native
  trait AlignType extends StObject {
    
    var ignoreShake: js.UndefOr[Boolean] = js.native
    
    /**
      * offset source node by offset[0] in x and offset[1] in y.
      * If offset contains percentage string value, it is relative to sourceNode region.
      */
    var offset: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * If adjustX field is true, will adjust source node in x direction if source node is invisible.
      * If adjustY field is true, will adjust source node in y direction if source node is invisible.
      */
    var overflow: js.UndefOr[AdjustX] = js.native
    
    /**
      * move point of source node to align with point of target node.
      * Such as ['tr','cc'], align top right point of source node with center point of target node.
      * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
    var points: js.UndefOr[js.Array[AlignPoint]] = js.native
    
    /**
      * offset target node by offset[0] in x and offset[1] in y.
      * If targetOffset contains percentage string value, it is relative to targetNode region.
      */
    var targetOffset: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Whether use css bottom instead of top to position
      */
    var useCssBottom: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether use css right instead of left to position
      */
    var useCssRight: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether use css transform instead of left/top/right/bottom to position if browser supports.
      * Defaults to false.
      */
    var useCssTransform: js.UndefOr[Boolean] = js.native
  }
  object AlignType {
    
    @scala.inline
    def apply(): AlignType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignType]
    }
    
    @scala.inline
    implicit class AlignTypeMutableBuilder[Self <: AlignType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreShake(value: Boolean): Self = StObject.set(x, "ignoreShake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreShakeUndefined: Self = StObject.set(x, "ignoreShake", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[AlignPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: AlignPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setTargetOffset(value: js.Array[Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setTargetOffsetVarargs(value: Double*): Self = StObject.set(x, "targetOffset", js.Array(value :_*))
      
      @scala.inline
      def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      @scala.inline
      def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      @scala.inline
      def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  type AnimationType = String
  
  type BuildInPlacements = StringDictionary[AlignType]
  
  @js.native
  trait CommonEventHandler extends StObject {
    
    def remove(): Unit = js.native
  }
  object CommonEventHandler {
    
    @scala.inline
    def apply(remove: () => Unit): CommonEventHandler = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[CommonEventHandler]
    }
    
    @scala.inline
    implicit class CommonEventHandlerMutableBuilder[Self <: CommonEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MobileConfig extends StObject {
    
    var popupClassName: js.UndefOr[String] = js.native
    
    /** Set popup motion. You can ref `rc-motion` for more info. */
    var popupMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var popupRender: js.UndefOr[js.Function1[/* originNode */ ReactNode, ReactNode]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
  }
  object MobileConfig {
    
    @scala.inline
    def apply(): MobileConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileConfig]
    }
    
    @scala.inline
    implicit class MobileConfigMutableBuilder[Self <: MobileConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupMotion(value: CSSMotionProps): Self = StObject.set(x, "popupMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupMotionUndefined: Self = StObject.set(x, "popupMotion", js.undefined)
      
      @scala.inline
      def setPopupRender(value: /* originNode */ ReactNode => ReactNode): Self = StObject.set(x, "popupRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopupRenderUndefined: Self = StObject.set(x, "popupRender", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(pageX: Double, pageY: Double): Point = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  type StretchType = String
  
  type TransitionNameType = String
}

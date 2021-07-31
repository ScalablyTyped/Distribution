package typings.reactMdUtils

import typings.reactMdUtils.reactMdUtilsStrings.absolute
import typings.reactMdUtils.reactMdUtilsStrings.fixed
import typings.reactMdUtils.sizingConstantsMod.QuerySize
import typings.reactMdUtils.typesMod.HorizontalPosition
import typings.reactMdUtils.typesMod.VerticalPosition
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @react-md/utils.@react-md/utils/types/sizing/useAppSizeMedia.AppSize & {  __initialized :boolean} */
  trait AppSizeinitializedboolean extends StObject {
    
    var __initialized: Boolean
    
    /**
      * Boolean if currently matching a desktop screen by comparing the max width
      * of the device.
      */
    var isDesktop: Boolean
    
    /**
      * Boolean if the app is considered to be in landscape mode. This will just
      * verify that the window width is greater than the window height.
      *
      * NOTE: This might not be super accurate on Android devices since the soft
      * keyboard will change the dimensions of the viewport when it appears. It is
      * recommended to use the `useOrientation` hook as well if you'd like to get
      * the current orientation type.
      */
    var isLandscape: Boolean
    
    /**
      * Boolean if currently matching a large desktop screen by comparing the max
      * width of the device.
      */
    var isLargeDesktop: Boolean
    
    /**
      * Boolean if currently matching a phone by comparing the max width of the
      * device.
      */
    var isPhone: Boolean
    
    /**
      * Boolean if currently matching a tablet by comparing the max width of the
      * device.
      */
    var isTablet: Boolean
  }
  object AppSizeinitializedboolean {
    
    @scala.inline
    def apply(
      __initialized: Boolean,
      isDesktop: Boolean,
      isLandscape: Boolean,
      isLargeDesktop: Boolean,
      isPhone: Boolean,
      isTablet: Boolean
    ): AppSizeinitializedboolean = {
      val __obj = js.Dynamic.literal(__initialized = __initialized.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isLargeDesktop = isLargeDesktop.asInstanceOf[js.Any], isPhone = isPhone.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSizeinitializedboolean]
    }
    
    @scala.inline
    implicit class AppSizeinitializedbooleanMutableBuilder[Self <: AppSizeinitializedboolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLargeDesktop(value: Boolean): Self = StObject.set(x, "isLargeDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPhone(value: Boolean): Self = StObject.set(x, "isPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__initialized(value: Boolean): Self = StObject.set(x, "__initialized", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-md/utils.@react-md/utils/types/positioning/types.Coords & {  position :'fixed' | 'absolute',   transformOrigin :string | undefined} */
  trait Coordspositionfixedabsolu extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var position: fixed | absolute
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var transformOrigin: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Coordspositionfixedabsolu {
    
    @scala.inline
    def apply(position: fixed | absolute): Coordspositionfixedabsolu = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordspositionfixedabsolu]
    }
    
    @scala.inline
    implicit class CoordspositionfixedabsoluMutableBuilder[Self <: Coordspositionfixedabsolu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPosition(value: fixed | absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Max
    extends StObject
       with WidthMediaQuerys {
    
    var max: QuerySize
  }
  object Max {
    
    @scala.inline
    def apply(max: QuerySize): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxMin
    extends StObject
       with WidthMediaQuerys {
    
    var max: QuerySize
    
    var min: QuerySize
  }
  object MaxMin {
    
    @scala.inline
    def apply(max: QuerySize, min: QuerySize): MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxMin]
    }
    
    @scala.inline
    implicit class MaxMinMutableBuilder[Self <: MaxMin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Min
    extends StObject
       with WidthMediaQuerys {
    
    var min: QuerySize
  }
  object Min {
    
    @scala.inline
    def apply(min: QuerySize): Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    @scala.inline
    implicit class MinMutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-md/utils.@react-md/utils/types/positioning/types.PositionAnchor> */
  trait PartialPositionAnchor extends StObject {
    
    var x: js.UndefOr[HorizontalPosition] = js.undefined
    
    var y: js.UndefOr[VerticalPosition] = js.undefined
  }
  object PartialPositionAnchor {
    
    @scala.inline
    def apply(): PartialPositionAnchor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPositionAnchor]
    }
    
    @scala.inline
    implicit class PartialPositionAnchorMutableBuilder[Self <: PartialPositionAnchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: VerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Ref[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional ref that can be applied.
      */
    var ref: js.UndefOr[typings.react.mod.Ref[E]] = js.undefined
  }
  object Ref {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): Ref[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[E]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[?], E /* <: HTMLElement */] (val x: Self & Ref[E]) extends AnyVal {
      
      @scala.inline
      def setRef(value: typings.react.mod.Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}

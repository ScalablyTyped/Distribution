package typings.reactMdIcon

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgiconMod {
  
  @JSImport("@react-md/icon/types/SVGIcon", "SVGIcon")
  @js.native
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  
  @js.native
  trait SVGIconProps extends HTMLAttributes[SVGSVGElement] {
    
    /**
      * Boolean if the icon should use the dense spec.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the SVG should gain the `focusable` attribute. This is disabled
      * by default since IE11 and Edge actually default this to true and keyboard's
      * will tab focus all SVGs.
      */
    var focusable: js.UndefOr[Boolean] = js.native
    
    /**
      * This should be a link to a part of an SVG sprite map. So normally one of
      * the following:
      * - `'#some-custom-svg'`
      * - `'/images/spritemap.svg#some-custom-svg'`
      *
      * This prop **should not** be used with the `children` prop as only one will
      * be rendered.
      *
      * > NOTE: IE **does not support** external SVGs. Please see the demo for more
      * > details.
      */
    var use: js.UndefOr[String] = js.native
    
    /**
      * The `viewBox` attribute allows you to specify that a given set of graphics
      * stretch to fit a particular container element.
      *
      * The value of the `viewBox` attribute is a list of four numbers min-x,
      * min-y, width and height, separated by white space and/or a comma, which
      * specify a rectangle in user space which should be mapped to the bounds of
      * the viewport established by the given element, taking into account
      * attribute `preserveAspectRatio`.
      *
      * Negative values for width or height are not permitted and a value of zero
      * disables rendering of the element. An optional `viewbox` for the SVG.
      *
      * For example, if the SVG element is 250 (width) by 200 (height) and you
      * provide `viewBox="0 0 25 20"`, the coordinates inside the SVG will go from
      * the top left corner (0, 0) to the bottom right (25, 20) and each unit will
      * be worth `10px`.
      */
    var viewBox: js.UndefOr[String] = js.native
    
    /**
      * An optional `xmlns` string to provide. The `use` prop will not work without
      * this prop defined.
      */
    var xmlns: js.UndefOr[String] = js.native
  }
  object SVGIconProps {
    
    @scala.inline
    def apply(): SVGIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGIconProps]
    }
    
    @scala.inline
    implicit class SVGIconPropsMutableBuilder[Self <: SVGIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
}

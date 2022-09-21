package typings.storefrontUiVue

import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bannerbackgroundcolor extends StObject {
    
    var `--_banner-background-color`: String
    
    var `--_banner-background-desktop-image`: String
    
    var `--_banner-background-image`: String
  }
  object Bannerbackgroundcolor {
    
    inline def apply(
      `--_banner-background-color`: String,
      `--_banner-background-desktop-image`: String,
      `--_banner-background-image`: String
    ): Bannerbackgroundcolor = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_banner-background-color")(`--_banner-background-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_banner-background-desktop-image")(`--_banner-background-desktop-image`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_banner-background-image")(`--_banner-background-image`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bannerbackgroundcolor]
    }
    
    extension [Self <: Bannerbackgroundcolor](x: Self) {
      
      inline def `set--_banner-background-color`(value: String): Self = StObject.set(x, "--_banner-background-color", value.asInstanceOf[js.Any])
      
      inline def `set--_banner-background-desktop-image`(value: String): Self = StObject.set(x, "--_banner-background-desktop-image", value.asInstanceOf[js.Any])
      
      inline def `set--_banner-background-image`(value: String): Self = StObject.set(x, "--_banner-background-image", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calltoactionbackgroundcolor extends StObject {
    
    var `--_call-to-action-background-color`: String
    
    var `--_call-to-action-background-desktop-image`: String
    
    var `--_call-to-action-background-image`: String
  }
  object Calltoactionbackgroundcolor {
    
    inline def apply(
      `--_call-to-action-background-color`: String,
      `--_call-to-action-background-desktop-image`: String,
      `--_call-to-action-background-image`: String
    ): Calltoactionbackgroundcolor = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_call-to-action-background-color")(`--_call-to-action-background-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_call-to-action-background-desktop-image")(`--_call-to-action-background-desktop-image`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_call-to-action-background-image")(`--_call-to-action-background-image`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calltoactionbackgroundcolor]
    }
    
    extension [Self <: Calltoactionbackgroundcolor](x: Self) {
      
      inline def `set--_call-to-action-background-color`(value: String): Self = StObject.set(x, "--_call-to-action-background-color", value.asInstanceOf[js.Any])
      
      inline def `set--_call-to-action-background-desktop-image`(value: String): Self = StObject.set(x, "--_call-to-action-background-desktop-image", value.asInstanceOf[js.Any])
      
      inline def `set--_call-to-action-background-image`(value: String): Self = StObject.set(x, "--_call-to-action-background-image", value.asInstanceOf[js.Any])
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: Boolean
    
    var index: Double
  }
  object Disabled {
    
    inline def apply(disabled: Boolean, index: Double): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Footercolumnwidth extends StObject {
    
    var `--_footer-column-width`: String
  }
  object Footercolumnwidth {
    
    inline def apply(`--_footer-column-width`: String): Footercolumnwidth = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_footer-column-width")(`--_footer-column-width`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Footercolumnwidth]
    }
    
    extension [Self <: Footercolumnwidth](x: Self) {
      
      inline def `set--_footer-column-width`(value: String): Self = StObject.set(x, "--_footer-column-width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headerheight extends StObject {
    
    var `--_header-height`: String
  }
  object Headerheight {
    
    inline def apply(`--_header-height`: String): Headerheight = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_header-height")(`--_header-height`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headerheight]
    }
    
    extension [Self <: Headerheight](x: Self) {
      
      inline def `set--_header-height`(value: String): Self = StObject.set(x, "--_header-height", value.asInstanceOf[js.Any])
    }
  }
  
  trait Href extends StObject {
    
    var href: String | Location
  }
  object Href {
    
    inline def apply(href: String | Location): Href = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Href]
    }
    
    extension [Self <: Href](x: Self) {
      
      inline def setHref(value: String | Location): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait Imageheight extends StObject {
    
    var `--_image-height`: String | Double
    
    var `--_image-width`: String | Double
  }
  object Imageheight {
    
    inline def apply(`--_image-height`: String | Double, `--_image-width`: String | Double): Imageheight = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_image-height")(`--_image-height`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_image-width")(`--_image-width`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imageheight]
    }
    
    extension [Self <: Imageheight](x: Self) {
      
      inline def `set--_image-height`(value: String | Double): Self = StObject.set(x, "--_image-height", value.asInstanceOf[js.Any])
      
      inline def `set--_image-width`(value: String | Double): Self = StObject.set(x, "--_image-width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scrollablemaxheight extends StObject {
    
    var `--_scrollable-max-height`: js.UndefOr[String] = js.undefined
  }
  object Scrollablemaxheight {
    
    inline def apply(): Scrollablemaxheight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scrollablemaxheight]
    }
    
    extension [Self <: Scrollablemaxheight](x: Self) {
      
      inline def `set--_scrollable-max-height`(value: String): Self = StObject.set(x, "--_scrollable-max-height", value.asInstanceOf[js.Any])
      
      inline def `set--_scrollable-max-heightUndefined`: Self = StObject.set(x, "--_scrollable-max-height", js.undefined)
    }
  }
  
  trait Stepsprogressactivestep extends StObject {
    
    var `--_steps-progress-active-step`: Double
    
    var `--_steps-progress-width`: String
  }
  object Stepsprogressactivestep {
    
    inline def apply(`--_steps-progress-active-step`: Double, `--_steps-progress-width`: String): Stepsprogressactivestep = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("--_steps-progress-active-step")(`--_steps-progress-active-step`.asInstanceOf[js.Any])
      __obj.updateDynamic("--_steps-progress-width")(`--_steps-progress-width`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stepsprogressactivestep]
    }
    
    extension [Self <: Stepsprogressactivestep](x: Self) {
      
      inline def `set--_steps-progress-active-step`(value: Double): Self = StObject.set(x, "--_steps-progress-active-step", value.asInstanceOf[js.Any])
      
      inline def `set--_steps-progress-width`(value: String): Self = StObject.set(x, "--_steps-progress-width", value.asInstanceOf[js.Any])
    }
  }
  
  trait To extends StObject {
    
    var to: String | Location
  }
  object To {
    
    inline def apply(to: String | Location): To = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setTo(value: String | Location): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

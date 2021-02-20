package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.mod.TextStyle
import typings.reactSketchapp.typesMod.SketchContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClearExistingStyles extends StObject {
    
    var clearExistingStyles: js.UndefOr[Boolean] = js.native
    
    var context: SketchContext = js.native
  }
  object ClearExistingStyles {
    
    @scala.inline
    def apply(context: SketchContext): ClearExistingStyles = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearExistingStyles]
    }
    
    @scala.inline
    implicit class ClearExistingStylesMutableBuilder[Self <: ClearExistingStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearExistingStyles(value: Boolean): Self = StObject.set(x, "clearExistingStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearExistingStylesUndefined: Self = StObject.set(x, "clearExistingStyles", js.undefined)
      
      @scala.inline
      def setContext(value: SketchContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IsInAParentText extends StObject {
    
    var isInAParentText: Boolean = js.native
  }
  object IsInAParentText {
    
    @scala.inline
    def apply(isInAParentText: Boolean): IsInAParentText = {
      val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsInAParentText]
    }
    
    @scala.inline
    implicit class IsInAParentTextMutableBuilder[Self <: IsInAParentText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInAParentText(value: Boolean): Self = StObject.set(x, "isInAParentText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Overrides extends StObject {
    
    var overrides: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object Overrides {
    
    @scala.inline
    def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverrides(value: StringDictionary[js.Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait Src extends StObject {
    
    var src: String = js.native
  }
  object Src {
    
    @scala.inline
    def apply(src: String): Src = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    @scala.inline
    implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: typings.reactSketchapp.mod.Style | TextStyle = js.native
  }
  object Style {
    
    @scala.inline
    def apply(style: typings.reactSketchapp.mod.Style | TextStyle): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: typings.reactSketchapp.mod.Style | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Width {
    
    @scala.inline
    def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

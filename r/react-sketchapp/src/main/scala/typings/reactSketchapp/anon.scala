package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.mod.TextStyle
import typings.reactSketchapp.typesMod.SketchContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearExistingStyles extends StObject {
    
    var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
    
    var context: SketchContext
  }
  object ClearExistingStyles {
    
    inline def apply(context: SketchContext): ClearExistingStyles = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearExistingStyles]
    }
    
    extension [Self <: ClearExistingStyles](x: Self) {
      
      inline def setClearExistingStyles(value: Boolean): Self = StObject.set(x, "clearExistingStyles", value.asInstanceOf[js.Any])
      
      inline def setClearExistingStylesUndefined: Self = StObject.set(x, "clearExistingStyles", js.undefined)
      
      inline def setContext(value: SketchContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IsInAParentText extends StObject {
    
    var isInAParentText: Boolean
  }
  object IsInAParentText {
    
    inline def apply(isInAParentText: Boolean): IsInAParentText = {
      val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsInAParentText]
    }
    
    extension [Self <: IsInAParentText](x: Self) {
      
      inline def setIsInAParentText(value: Boolean): Self = StObject.set(x, "isInAParentText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Overrides extends StObject {
    
    var overrides: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object Overrides {
    
    inline def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    extension [Self <: Overrides](x: Self) {
      
      inline def setOverrides(value: StringDictionary[js.Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait Src extends StObject {
    
    var src: String
  }
  object Src {
    
    inline def apply(src: String): Src = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    extension [Self <: Src](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: typings.reactSketchapp.mod.Style | TextStyle
  }
  object Style {
    
    inline def apply(style: typings.reactSketchapp.mod.Style | TextStyle): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: typings.reactSketchapp.mod.Style | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Width extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    inline def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

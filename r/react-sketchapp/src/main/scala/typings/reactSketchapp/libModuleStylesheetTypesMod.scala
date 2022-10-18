package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.contain
import typings.reactSketchapp.reactSketchappStrings.cover
import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.repeat
import typings.reactSketchapp.reactSketchappStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleStylesheetTypesMod {
  
  type RawStyle = StringDictionary[Any]
  
  type RawStyles = StringDictionary[RawStyle]
  
  trait Rules extends StObject {
    
    var declarations: StringDictionary[RawStyle]
  }
  object Rules {
    
    inline def apply(declarations: StringDictionary[RawStyle]): Rules = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def setDeclarations(value: StringDictionary[RawStyle]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var resizeMode: js.UndefOr[contain | cover | stretch | center | repeat | none] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    var width: js.UndefOr[Double | Null] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setResizeMode(value: contain | cover | stretch | center | repeat | none): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: StringDictionary[Double]*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type StyleId = Double
  
  type StyleSheetInstance = StringDictionary[StyleId]
  
  type Transform = js.Array[StringDictionary[Double]]
  
  type UserStyle = RawStyle | StyleId
  
  type UserStyles = js.Array[UserStyle] | UserStyle
}

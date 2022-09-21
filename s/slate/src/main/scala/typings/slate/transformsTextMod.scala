package typings.slate

import typings.slate.editorMod.Editor
import typings.slate.locationMod.Location
import typings.slate.nodeMod.Node
import typings.slate.typesMod.TextUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsTextMod {
  
  @js.native
  trait TextTransforms extends StObject {
    
    def delete(editor: Editor): Unit = js.native
    def delete(editor: Editor, options: TextDeleteOptions): Unit = js.native
    
    def insertFragment(editor: Editor, fragment: js.Array[Node]): Unit = js.native
    def insertFragment(editor: Editor, fragment: js.Array[Node], options: TextInsertFragmentOptions): Unit = js.native
    
    def insertText(editor: Editor, text: String): Unit = js.native
    def insertText(editor: Editor, text: String, options: TextInsertTextOptions): Unit = js.native
  }
  @JSImport("slate/dist/transforms/text", "TextTransforms")
  @js.native
  val TextTransforms: typings.slate.transformsTextMod.TextTransforms = js.native
  
  trait TextDeleteOptions extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var unit: js.UndefOr[TextUnit] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object TextDeleteOptions {
    
    inline def apply(): TextDeleteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDeleteOptions]
    }
    
    extension [Self <: TextDeleteOptions](x: Self) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setUnit(value: TextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait TextInsertFragmentOptions extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object TextInsertFragmentOptions {
    
    inline def apply(): TextInsertFragmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInsertFragmentOptions]
    }
    
    extension [Self <: TextInsertFragmentOptions](x: Self) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait TextInsertTextOptions extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object TextInsertTextOptions {
    
    inline def apply(): TextInsertTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInsertTextOptions]
    }
    
    extension [Self <: TextInsertTextOptions](x: Self) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
}

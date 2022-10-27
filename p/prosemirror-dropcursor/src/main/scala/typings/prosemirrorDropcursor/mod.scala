package typings.prosemirrorDropcursor

import typings.prosemirrorState.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-dropcursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Create a plugin that, when added to a ProseMirror instance,
  causes a decoration to show up at the drop position when something
  is dragged over the editor.
  Nodes may add a `disableDropCursor` property to their spec to
  control the showing of a drop cursor inside them. This may be a
  boolean or a function, which will be called with a view and a
  position, and should return a boolean.
  */
  inline def dropCursor(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")().asInstanceOf[Plugin[Any]]
  inline def dropCursor(options: DropCursorOptions): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  trait DropCursorOptions extends StObject {
    
    /**
      A CSS class name to add to the cursor element.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      The color of the cursor. Defaults to `black`.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      The precise width of the cursor in pixels. Defaults to 1.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object DropCursorOptions {
    
    inline def apply(): DropCursorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropCursorOptions]
    }
    
    extension [Self <: DropCursorOptions](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

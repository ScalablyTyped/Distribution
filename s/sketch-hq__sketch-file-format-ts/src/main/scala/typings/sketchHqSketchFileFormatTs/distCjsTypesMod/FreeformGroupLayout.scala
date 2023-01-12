package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableFreeformGroupLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeformGroupLayout
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableFreeformGroupLayout
}
object FreeformGroupLayout {
  
  inline def apply(): FreeformGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFreeformGroupLayout")
    __obj.asInstanceOf[FreeformGroupLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeformGroupLayout] (val x: Self) extends AnyVal {
    
    inline def set_class(value: MSImmutableFreeformGroupLayout): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

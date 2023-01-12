package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeMode extends StObject {
  
  var resizeMode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.PatternFillType */ Any
  ] = js.undefined
}
object ResizeMode {
  
  inline def apply(): ResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeMode] (val x: Self) extends AnyVal {
    
    inline def setResizeMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.PatternFillType */ Any
    ): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
  }
}

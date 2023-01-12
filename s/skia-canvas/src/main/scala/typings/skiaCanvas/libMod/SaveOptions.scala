package typings.skiaCanvas.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptions
  extends StObject
     with RenderOptions {
  
  /** Image format to use */
  var format: js.UndefOr[ExportFormat] = js.undefined
}
object SaveOptions {
  
  inline def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ExportFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}

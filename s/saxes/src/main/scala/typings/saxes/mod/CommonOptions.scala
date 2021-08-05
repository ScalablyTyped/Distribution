package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOptions extends StObject {
  
  /**
    * A file name to use for error reporting. "File name" is a loose concept. You
    * could use a URL to some resource, or any descriptive name you like.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** Whether to accept XML fragments. Unset means ``false``. */
  var fragment: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to track positions. Unset means ``true``. */
  var position: js.UndefOr[Boolean] = js.undefined
}
object CommonOptions {
  
  inline def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  extension [Self <: CommonOptions](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

package typings.reactSketchapp.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedBoxProps extends StObject {
  
  /** A JavaScript Error object */
  var error: Error
}
object RedBoxProps {
  
  @scala.inline
  def apply(error: Error): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedBoxProps]
  }
  
  @scala.inline
  implicit class RedBoxPropsMutableBuilder[Self <: RedBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

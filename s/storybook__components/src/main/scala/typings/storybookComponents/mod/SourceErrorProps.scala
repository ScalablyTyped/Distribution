package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceErrorProps extends StObject {
  
  var error: js.UndefOr[SourceError] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
}
object SourceErrorProps {
  
  inline def apply(): SourceErrorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceErrorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceErrorProps] (val x: Self) extends AnyVal {
    
    inline def setError(value: SourceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
  }
}

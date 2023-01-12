package typings.storybookComponents.mod

import typings.storybookComponents.storybookComponentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsTableLoadingProps extends StObject {
  
  var isLoading: `true`
}
object ArgsTableLoadingProps {
  
  inline def apply(): ArgsTableLoadingProps = {
    val __obj = js.Dynamic.literal(isLoading = true)
    __obj.asInstanceOf[ArgsTableLoadingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgsTableLoadingProps] (val x: Self) extends AnyVal {
    
    inline def setIsLoading(value: `true`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
  }
}

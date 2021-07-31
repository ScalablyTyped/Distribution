package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkletOptions extends StObject {
  
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
}
object WorkletOptions {
  
  @scala.inline
  def apply(): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkletOptions]
  }
  
  @scala.inline
  implicit class WorkletOptionsMutableBuilder[Self <: WorkletOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
  }
}

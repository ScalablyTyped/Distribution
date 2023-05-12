package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.user_report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFeedbackItemHeaders extends StObject {
  
  var `type`: user_report
}
object UserFeedbackItemHeaders {
  
  inline def apply(): UserFeedbackItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("user_report")
    __obj.asInstanceOf[UserFeedbackItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserFeedbackItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: user_report): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var submitter: js.UndefOr[HTMLElement | Null] = js.undefined
}
object SubmitEventInit {
  
  inline def apply(): SubmitEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitEventInit]
  }
  
  extension [Self <: SubmitEventInit](x: Self) {
    
    inline def setSubmitter(value: HTMLElement): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    inline def setSubmitterNull: Self = StObject.set(x, "submitter", null)
    
    inline def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
  }
}

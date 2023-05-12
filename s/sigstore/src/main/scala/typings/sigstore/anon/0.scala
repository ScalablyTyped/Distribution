package typings.sigstore.anon

import typings.sigstore.sigstoreStrings.certificateIdentities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  @JSName("$case")
  var $case: certificateIdentities
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal($case = "certificateIdentities")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def set$case(value: certificateIdentities): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
  }
}

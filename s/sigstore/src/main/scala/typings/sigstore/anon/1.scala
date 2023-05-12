package typings.sigstore.anon

import typings.sigstore.sigstoreStrings.messageSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  @JSName("$case")
  var $case: messageSignature
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal($case = "messageSignature")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def set$case(value: messageSignature): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
  }
}

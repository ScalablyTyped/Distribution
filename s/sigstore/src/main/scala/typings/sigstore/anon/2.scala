package typings.sigstore.anon

import typings.sigstore.sigstoreStrings.dsseEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  @JSName("$case")
  var $case: dsseEnvelope
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal($case = "dsseEnvelope")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def set$case(value: dsseEnvelope): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
  }
}

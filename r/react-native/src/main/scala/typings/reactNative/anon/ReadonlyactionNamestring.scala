package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  actionName :string}> */
trait ReadonlyactionNamestring extends StObject {
  
  val actionName: String
}
object ReadonlyactionNamestring {
  
  inline def apply(actionName: String): ReadonlyactionNamestring = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyactionNamestring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyactionNamestring] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}

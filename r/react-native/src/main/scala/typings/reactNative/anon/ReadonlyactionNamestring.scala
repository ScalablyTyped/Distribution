package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  actionName :string}> */
@js.native
trait ReadonlyactionNamestring extends StObject {
  
  val actionName: String = js.native
}
object ReadonlyactionNamestring {
  
  @scala.inline
  def apply(actionName: String): ReadonlyactionNamestring = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyactionNamestring]
  }
  
  @scala.inline
  implicit class ReadonlyactionNamestringMutableBuilder[Self <: ReadonlyactionNamestring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}

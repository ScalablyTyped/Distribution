package typings.reactNativeDraggableFlatlist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  value :boolean}> */
trait Readonlyvalueboolean extends StObject {
  
  val value: Boolean
}
object Readonlyvalueboolean {
  
  inline def apply(value: Boolean): Readonlyvalueboolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyvalueboolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyvalueboolean] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

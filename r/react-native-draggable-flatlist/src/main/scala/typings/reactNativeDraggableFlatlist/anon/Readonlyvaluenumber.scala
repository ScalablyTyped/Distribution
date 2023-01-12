package typings.reactNativeDraggableFlatlist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  value :number}> */
trait Readonlyvaluenumber extends StObject {
  
  val value: Double
}
object Readonlyvaluenumber {
  
  inline def apply(value: Double): Readonlyvaluenumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyvaluenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyvaluenumber] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

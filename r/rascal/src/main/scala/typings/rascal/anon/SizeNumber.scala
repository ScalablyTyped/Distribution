package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeNumber extends StObject {
  
  var size: Double
}
object SizeNumber {
  
  @scala.inline
  def apply(size: Double): SizeNumber = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeNumber]
  }
  
  @scala.inline
  implicit class SizeNumberMutableBuilder[Self <: SizeNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

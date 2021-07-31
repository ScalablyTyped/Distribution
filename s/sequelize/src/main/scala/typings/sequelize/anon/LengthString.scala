package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthString extends StObject {
  
  var length: String
}
object LengthString {
  
  @scala.inline
  def apply(length: String): LengthString = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthString]
  }
  
  @scala.inline
  implicit class LengthStringMutableBuilder[Self <: LengthString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

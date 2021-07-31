package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Durable extends StObject {
  
  var durable: Boolean
}
object Durable {
  
  @scala.inline
  def apply(durable: Boolean): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
  
  @scala.inline
  implicit class DurableMutableBuilder[Self <: Durable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
  }
}

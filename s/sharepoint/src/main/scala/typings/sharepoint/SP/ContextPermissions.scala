package typings.sharepoint.SP

import typings.sharepoint.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextPermissions extends StObject {
  
  def fromJson(json: High): Unit
  
  def has(perm: Double): Boolean
  
  def hasPermissions(high: Double, low: Double): Boolean
}
object ContextPermissions {
  
  inline def apply(fromJson: High => Unit, has: Double => Boolean, hasPermissions: (Double, Double) => Boolean): ContextPermissions = {
    val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions))
    __obj.asInstanceOf[ContextPermissions]
  }
  
  extension [Self <: ContextPermissions](x: Self) {
    
    inline def setFromJson(value: High => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
    
    inline def setHas(value: Double => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setHasPermissions(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasPermissions", js.Any.fromFunction2(value))
  }
}

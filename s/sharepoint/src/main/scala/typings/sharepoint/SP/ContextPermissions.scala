package typings.sharepoint.SP

import typings.sharepoint.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextPermissions extends StObject {
  
  def fromJson(json: High): Unit = js.native
  
  def has(perm: Double): Boolean = js.native
  
  def hasPermissions(high: Double, low: Double): Boolean = js.native
}
object ContextPermissions {
  
  @scala.inline
  def apply(fromJson: High => Unit, has: Double => Boolean, hasPermissions: (Double, Double) => Boolean): ContextPermissions = {
    val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions))
    __obj.asInstanceOf[ContextPermissions]
  }
  
  @scala.inline
  implicit class ContextPermissionsMutableBuilder[Self <: ContextPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromJson(value: High => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: Double => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPermissions(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasPermissions", js.Any.fromFunction2(value))
  }
}

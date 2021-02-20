package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePermissions extends ClientValueObject {
  
  def clear(perm: PermissionKind): Unit = js.native
  
  def clearAll(): Unit = js.native
  
  def equals(perm: BasePermissions): Boolean = js.native
  
  def has(perm: PermissionKind): Boolean = js.native
  
  def hasPermissions(high: Double, low: Double): Boolean = js.native
  
  def set(perm: PermissionKind): Unit = js.native
}
object BasePermissions {
  
  @scala.inline
  def apply(
    clear: PermissionKind => Unit,
    clearAll: () => Unit,
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    equals_ : BasePermissions => Boolean,
    fromJson: js.Any => Unit,
    get_typeId: () => String,
    has: PermissionKind => Boolean,
    hasPermissions: (Double, Double) => Boolean,
    set: PermissionKind => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): BasePermissions = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), clearAll = js.Any.fromFunction0(clearAll), customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_typeId = js.Any.fromFunction0(get_typeId), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions), set = js.Any.fromFunction1(set), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[BasePermissions]
  }
  
  @scala.inline
  implicit class BasePermissionsMutableBuilder[Self <: BasePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: PermissionKind => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearAll(value: () => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals_(value: BasePermissions => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: PermissionKind => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPermissions(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasPermissions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: PermissionKind => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}

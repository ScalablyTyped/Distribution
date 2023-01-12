package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.firestore.AnyJs
import typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFieldValue extends StObject {
  
  /* static member */
  def arrayRemove(elements: AnyJs*): FieldValue
  
  /* static member */
  def arrayUnion(elements: AnyJs*): FieldValue
  
  /* static member */
  def delete(): FieldValue
  
  /* static member */
  def increment(n: Double): FieldValue
  
  /* static member */
  def serverTimestamp(): FieldValue
}
object TypeofFieldValue {
  
  inline def apply(
    arrayRemove: /* repeated */ AnyJs => FieldValue,
    arrayUnion: /* repeated */ AnyJs => FieldValue,
    delete: () => FieldValue,
    increment: Double => FieldValue,
    serverTimestamp: () => FieldValue
  ): TypeofFieldValue = {
    val __obj = js.Dynamic.literal(arrayRemove = js.Any.fromFunction1(arrayRemove), arrayUnion = js.Any.fromFunction1(arrayUnion), delete = js.Any.fromFunction0(delete), increment = js.Any.fromFunction1(increment), serverTimestamp = js.Any.fromFunction0(serverTimestamp))
    __obj.asInstanceOf[TypeofFieldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFieldValue] (val x: Self) extends AnyVal {
    
    inline def setArrayRemove(value: /* repeated */ AnyJs => FieldValue): Self = StObject.set(x, "arrayRemove", js.Any.fromFunction1(value))
    
    inline def setArrayUnion(value: /* repeated */ AnyJs => FieldValue): Self = StObject.set(x, "arrayUnion", js.Any.fromFunction1(value))
    
    inline def setDelete(value: () => FieldValue): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setIncrement(value: Double => FieldValue): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
    
    inline def setServerTimestamp(value: () => FieldValue): Self = StObject.set(x, "serverTimestamp", js.Any.fromFunction0(value))
  }
}

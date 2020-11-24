package typings.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializable[T] extends js.Object {
  
  /**
    * Returns either this instance's serialized represention, if immediately
    * available, or a promise for its serialized representation. This function is
    * conceptually equivalent to objects that have a {@code toJSON()} property,
    * except the serialize() result may be a promise or an object containing a
    * promise (which are not directly JSON friendly).
    *
    * @return {!(T|IThenable.<!T>)} This instance's serialized wire format.
    */
  def serialize(): T | js.Promise[T] = js.native
}
object Serializable {
  
  @scala.inline
  def apply[T](serialize: () => T | js.Promise[T]): Serializable[T] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[Serializable[T]]
  }
  
  @scala.inline
  implicit class SerializableOps[Self <: Serializable[_], T] (val x: Self with Serializable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSerialize(value: () => T | js.Promise[T]): Self = this.set("serialize", js.Any.fromFunction0(value))
  }
}

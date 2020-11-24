package typings.promiseTheWorld.anon

import org.scalablytyped.runtime.Instantiable0
import typings.promiseTheWorld.mutexMod.Mutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmutex extends js.Object {
  
  var Mutex: Instantiable0[typings.promiseTheWorld.mutexMod.Mutex] = js.native
}
object Typeofmutex {
  
  @scala.inline
  def apply(Mutex: Instantiable0[Mutex]): Typeofmutex = {
    val __obj = js.Dynamic.literal(Mutex = Mutex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmutex]
  }
  
  @scala.inline
  implicit class TypeofmutexOps[Self <: Typeofmutex] (val x: Self) extends AnyVal {
    
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
    def setMutex(value: Instantiable0[Mutex]): Self = this.set("Mutex", value.asInstanceOf[js.Any])
  }
}

package typings.sequester

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sequester", "createLock")
  @js.native
  def createLock(): Lock = js.native
  
  type Callback = js.Function0[Unit]
  
  @js.native
  trait Lock extends StObject {
    
    var count: Double = js.native
    
    def dispose(): Unit = js.native
    
    def downgrade(): Unit = js.native
    
    def exclude(cb: Callback): Unit = js.native
    
    def share(cb: Callback): Unit = js.native
    
    def unlock(): Unit = js.native
  }
  object Lock {
    
    @scala.inline
    def apply(
      count: Double,
      dispose: () => Unit,
      downgrade: () => Unit,
      exclude: Callback => Unit,
      share: Callback => Unit,
      unlock: () => Unit
    ): Lock = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), downgrade = js.Any.fromFunction0(downgrade), exclude = js.Any.fromFunction1(exclude), share = js.Any.fromFunction1(share), unlock = js.Any.fromFunction0(unlock))
      __obj.asInstanceOf[Lock]
    }
    
    @scala.inline
    implicit class LockMutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDowngrade(value: () => Unit): Self = StObject.set(x, "downgrade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExclude(value: Callback => Unit): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShare(value: Callback => Unit): Self = StObject.set(x, "share", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
    }
  }
}

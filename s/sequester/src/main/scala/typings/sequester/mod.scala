package typings.sequester

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sequester", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLock(): Lock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLock")().asInstanceOf[Lock]
  
  type Callback = js.Function0[Unit]
  
  trait Lock extends StObject {
    
    var count: Double
    
    def dispose(): Unit
    
    def downgrade(): Unit
    
    def exclude(cb: Callback): Unit
    
    def share(cb: Callback): Unit
    
    def unlock(): Unit
  }
  object Lock {
    
    inline def apply(
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
    
    extension [Self <: Lock](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDowngrade(value: () => Unit): Self = StObject.set(x, "downgrade", js.Any.fromFunction0(value))
      
      inline def setExclude(value: Callback => Unit): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setShare(value: Callback => Unit): Self = StObject.set(x, "share", js.Any.fromFunction1(value))
      
      inline def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
    }
  }
}

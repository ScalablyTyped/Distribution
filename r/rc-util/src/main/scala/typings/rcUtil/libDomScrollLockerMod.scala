package typings.rcUtil

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomScrollLockerMod {
  
  @JSImport("rc-util/lib/Dom/scrollLocker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ScrollLocker {
    def this(options: scrollLockOptions) = this()
  }
  
  @js.native
  trait ScrollLocker extends StObject {
    
    def getContainer(): js.UndefOr[HTMLElement] = js.native
    
    def lock(): Unit = js.native
    
    /* private */ var lockTarget: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def reLock(): Unit = js.native
    def reLock(options: scrollLockOptions): Unit = js.native
    
    def unLock(): Unit = js.native
  }
  
  trait scrollLockOptions extends StObject {
    
    var container: HTMLElement
  }
  object scrollLockOptions {
    
    inline def apply(container: HTMLElement): scrollLockOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[scrollLockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: scrollLockOptions] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}

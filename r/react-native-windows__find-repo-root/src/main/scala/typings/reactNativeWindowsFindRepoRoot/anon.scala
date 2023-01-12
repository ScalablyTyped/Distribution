package typings.reactNativeWindowsFindRepoRoot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sync extends StObject {
    
    def sync(): String
    @JSName("sync")
    var sync_Original: js.Function0[String]
  }
  object Sync {
    
    inline def apply(sync: () => String): Sync = {
      val __obj = js.Dynamic.literal(sync = js.Any.fromFunction0(sync))
      __obj.asInstanceOf[Sync]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
      
      inline def setSync(value: () => String): Self = StObject.set(x, "sync", js.Any.fromFunction0(value))
    }
  }
}

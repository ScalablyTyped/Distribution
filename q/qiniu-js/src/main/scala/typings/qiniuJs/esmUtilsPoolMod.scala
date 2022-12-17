package typings.qiniuJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsPoolMod {
  
  @JSImport("qiniu-js/esm/utils/pool", "Pool")
  @js.native
  open class Pool[T] protected () extends StObject {
    def this(runTask: RunTask[T], limit: Double) = this()
    
    def abort(): Unit = js.native
    
    var aborted: Boolean = js.native
    
    /* private */ var check: Any = js.native
    
    def enqueue(task: T): js.Promise[Unit] = js.native
    
    /* private */ var limit: Any = js.native
    
    var processing: js.Array[QueueContent[T]] = js.native
    
    var queue: js.Array[QueueContent[T]] = js.native
    
    /* private */ var run: Any = js.native
    
    /* private */ var runTask: Any = js.native
  }
  
  @js.native
  trait QueueContent[T] extends StObject {
    
    def reject(): Unit = js.native
    def reject(err: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    
    var task: T = js.native
  }
  
  @js.native
  trait RunTask[T] extends StObject {
    
    def apply(args: T*): js.Promise[Unit] = js.native
  }
}

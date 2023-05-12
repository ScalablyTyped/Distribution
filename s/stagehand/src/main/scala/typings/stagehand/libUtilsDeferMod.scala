package typings.stagehand

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDeferMod {
  
  @JSImport("stagehand/lib/utils/defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
  
  @js.native
  trait Deferred[T] extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(error: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    def resolve(value: PromiseLike[T]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stagehand.stagehandStrings.pending
    - typings.stagehand.stagehandStrings.resolved
    - typings.stagehand.stagehandStrings.rejected
  */
  trait DeferredState extends StObject
  object DeferredState {
    
    inline def pending: typings.stagehand.stagehandStrings.pending = "pending".asInstanceOf[typings.stagehand.stagehandStrings.pending]
    
    inline def rejected: typings.stagehand.stagehandStrings.rejected = "rejected".asInstanceOf[typings.stagehand.stagehandStrings.rejected]
    
    inline def resolved: typings.stagehand.stagehandStrings.resolved = "resolved".asInstanceOf[typings.stagehand.stagehandStrings.resolved]
  }
}

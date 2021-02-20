package typings.stickyCluster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Stickyclusterworkerindex extends StObject {
    
    var stickycluster_worker_index: Double = js.native
  }
  object Stickyclusterworkerindex {
    
    @scala.inline
    def apply(stickycluster_worker_index: Double): Stickyclusterworkerindex = {
      val __obj = js.Dynamic.literal(stickycluster_worker_index = stickycluster_worker_index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stickyclusterworkerindex]
    }
    
    @scala.inline
    implicit class StickyclusterworkerindexMutableBuilder[Self <: Stickyclusterworkerindex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStickycluster_worker_index(value: Double): Self = StObject.set(x, "stickycluster_worker_index", value.asInstanceOf[js.Any])
    }
  }
}

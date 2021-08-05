package typings.stickyCluster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Stickyclusterworkerindex extends StObject {
    
    var stickycluster_worker_index: Double
  }
  object Stickyclusterworkerindex {
    
    inline def apply(stickycluster_worker_index: Double): Stickyclusterworkerindex = {
      val __obj = js.Dynamic.literal(stickycluster_worker_index = stickycluster_worker_index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stickyclusterworkerindex]
    }
    
    extension [Self <: Stickyclusterworkerindex](x: Self) {
      
      inline def setStickycluster_worker_index(value: Double): Self = StObject.set(x, "stickycluster_worker_index", value.asInstanceOf[js.Any])
    }
  }
}

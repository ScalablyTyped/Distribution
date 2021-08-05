package typings.pulumiKubernetes.outputMod.apps.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED.
  */
trait RollbackConfig extends StObject {
  
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: Double
}
object RollbackConfig {
  
  inline def apply(revision: Double): RollbackConfig = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfig]
  }
  
  extension [Self <: RollbackConfig](x: Self) {
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}

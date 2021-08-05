package typings.pulumiKubernetes.inputMod.apps.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var revision: js.UndefOr[Input[Double]] = js.undefined
}
object RollbackConfig {
  
  inline def apply(): RollbackConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfig]
  }
  
  extension [Self <: RollbackConfig](x: Self) {
    
    inline def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}

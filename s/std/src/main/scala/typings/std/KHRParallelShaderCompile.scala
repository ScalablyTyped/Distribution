package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KHRParallelShaderCompile extends StObject {
  
  /* standard dom */
  val COMPLETION_STATUS_KHR: GLenum
}
object KHRParallelShaderCompile {
  
  inline def apply(COMPLETION_STATUS_KHR: GLenum): KHRParallelShaderCompile = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHRParallelShaderCompile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KHRParallelShaderCompile] (val x: Self) extends AnyVal {
    
    inline def setCOMPLETION_STATUS_KHR(value: GLenum): Self = StObject.set(x, "COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
  }
}

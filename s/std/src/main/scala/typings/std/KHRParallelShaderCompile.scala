package typings.std

import typings.std.stdInts.`0x91B1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KHR_parallel_shader_compile) */
trait KHRParallelShaderCompile extends StObject {
  
  /* standard dom */
  val COMPLETION_STATUS_KHR: `0x91B1`
}
object KHRParallelShaderCompile {
  
  inline def apply(): KHRParallelShaderCompile = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = 0x91B1)
    __obj.asInstanceOf[KHRParallelShaderCompile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KHRParallelShaderCompile] (val x: Self) extends AnyVal {
    
    inline def setCOMPLETION_STATUS_KHR(value: `0x91B1`): Self = StObject.set(x, "COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
  }
}

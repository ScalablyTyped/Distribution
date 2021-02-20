package typings.singleLineLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("single-line-log", "stderr")
  @js.native
  val stderr: SingleLineLog = js.native
  
  @JSImport("single-line-log", "stdout")
  @js.native
  val stdout: SingleLineLog = js.native
  
  @js.native
  trait SingleLineLog extends StObject {
    
    def apply(data: String): Unit = js.native
    
    def clear(): Unit = js.native
    
    def write(data: String): Unit = js.native
  }
}

package typings.processWarning

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("process-warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Warning = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Warning]
  
  @JSImport("process-warning", "WarnOpts")
  @js.native
  open class WarnOpts () extends StObject {
    
    var code: String = js.native
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  type BuildWarnOptsFn = js.Function3[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], /* c */ js.UndefOr[Any], WarnOpts]
  
  @js.native
  trait Warning extends StObject {
    
    def create(name: String, code: String, message: String): BuildWarnOptsFn = js.native
    
    def emit(cod: String): Unit = js.native
    def emit(cod: String, a: Any): Unit = js.native
    def emit(cod: String, a: Any, b: Any): Unit = js.native
    def emit(cod: String, a: Any, b: Any, c: Any): Unit = js.native
    def emit(cod: String, a: Any, b: Unit, c: Any): Unit = js.native
    def emit(cod: String, a: Unit, b: Any): Unit = js.native
    def emit(cod: String, a: Unit, b: Any, c: Any): Unit = js.native
    def emit(cod: String, a: Unit, b: Unit, c: Any): Unit = js.native
    
    var emitted: Map[String, Boolean] = js.native
  }
}

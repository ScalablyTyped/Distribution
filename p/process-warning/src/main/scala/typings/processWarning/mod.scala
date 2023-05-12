package typings.processWarning

import typings.std.Map
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<ProcessWarning> is not an array type */ params: Parameters[ProcessWarning_]
  ): ReturnType[ProcessWarning_] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[ReturnType[ProcessWarning_]]
  
  @JSImport("process-warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("process-warning", JSImport.Default)
  @js.native
  val default: ProcessWarning_ = js.native
  
  @JSImport("process-warning", "processWarning")
  @js.native
  val processWarning: ProcessWarning_ = js.native
  
  type BuildWarnOptsFn = js.Function3[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], /* c */ js.UndefOr[Any], WarnOpts]
  
  trait ProcessWarningOptions extends StObject {
    
    var unlimited: js.UndefOr[Boolean] = js.undefined
  }
  object ProcessWarningOptions {
    
    inline def apply(): ProcessWarningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessWarningOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessWarningOptions] (val x: Self) extends AnyVal {
      
      inline def setUnlimited(value: Boolean): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
      
      inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
    }
  }
  
  type ProcessWarning_ = js.Function0[Warning]
  
  trait WarnOpts extends StObject {
    
    var code: String
    
    var message: String
    
    var name: String
  }
  object WarnOpts {
    
    inline def apply(code: String, message: String, name: String): WarnOpts = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WarnOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WarnOpts] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Warning extends StObject {
    
    def create(name: String, code: String, message: String): BuildWarnOptsFn = js.native
    def create(name: String, code: String, message: String, opts: ProcessWarningOptions): BuildWarnOptsFn = js.native
    
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

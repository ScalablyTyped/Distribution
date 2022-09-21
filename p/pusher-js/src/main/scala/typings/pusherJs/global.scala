package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("CDN_HTTP")
  @js.native
  def CDN_HTTP: Any = js.native
  
  @JSGlobal("CDN_HTTPS")
  @js.native
  def CDN_HTTPS: Any = js.native
  inline def CDN_HTTPS_=(x: Any): Unit = js.Dynamic.global.updateDynamic("CDN_HTTPS")(x.asInstanceOf[js.Any])
  
  inline def CDN_HTTP_=(x: Any): Unit = js.Dynamic.global.updateDynamic("CDN_HTTP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("DEPENDENCY_SUFFIX")
  @js.native
  def DEPENDENCY_SUFFIX: Any = js.native
  inline def DEPENDENCY_SUFFIX_=(x: Any): Unit = js.Dynamic.global.updateDynamic("DEPENDENCY_SUFFIX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("RUNTIME")
  @js.native
  def RUNTIME: Any = js.native
  inline def RUNTIME_=(x: Any): Unit = js.Dynamic.global.updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("VERSION")
  @js.native
  def VERSION: Any = js.native
  inline def VERSION_=(x: Any): Unit = js.Dynamic.global.updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSGlobal("global")
  @js.native
  val global: Any = js.native
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.exports")
    @js.native
    def exports: Any = js.native
    inline def exports_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  object require {
    
    inline def apply(paths: js.Array[String], callback: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[T](path: String): T = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @JSGlobal("require")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ensure(
      paths: js.Array[String],
      callback: js.Function1[/* require */ js.Function1[/* path */ String, Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(paths.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

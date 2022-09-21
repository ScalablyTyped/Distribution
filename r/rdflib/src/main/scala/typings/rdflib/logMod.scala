package typings.rdflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  object default {
    
    @JSImport("rdflib/lib/log", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def msg(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def success(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

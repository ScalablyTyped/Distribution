package typings.stdinDiscarder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("stdin-discarder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Start discarding stdin.
    	*/
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    
    /**
    	Stop discarding stdin.
    	*/
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  }
}

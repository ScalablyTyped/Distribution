package typings.recluster

import typings.node.childProcessMod.ChildProcess
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(file: String): Balancer = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[Balancer]
  inline def apply(file: String, options: BalancerOptions): Balancer = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Balancer]
  
  @JSImport("recluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("recluster", "Balancer")
  @js.native
  class Balancer protected () extends EventEmitter {
    def this(file: String, options: BalancerOptions) = this()
    
    def activeWorkers(): js.Array[ChildProcess] = js.native
    
    def reload(): Unit = js.native
    def reload(cb: js.Function0[Unit]): Unit = js.native
    
    def run(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def workers(): js.Array[ChildProcess] = js.native
  }
  
  trait BalancerOptions extends StObject {
    
    /** arguments to pass to the worker (default: []) */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /** max time between respawns when workers die */
    var backoff: js.UndefOr[Double] = js.undefined
    
    /** what to log to stdout (default: {respawns: true}) */
    var log: js.UndefOr[LogOptions] = js.undefined
    
    /** logger to use, needs `log` method (default: console) */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /** when does the worker become ready? 'listening' or 'started' */
    var readyWhen: js.UndefOr[String] = js.undefined
    
    /** min time between respawns when workers die */
    var respawn: js.UndefOr[Double] = js.undefined
    
    /** kill timeout for old workers after reload (sec) */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** number of active workers */
    var workers: js.UndefOr[Double] = js.undefined
  }
  object BalancerOptions {
    
    inline def apply(): BalancerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BalancerOptions]
    }
    
    extension [Self <: BalancerOptions](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setLog(value: LogOptions): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setReadyWhen(value: String): Self = StObject.set(x, "readyWhen", value.asInstanceOf[js.Any])
      
      inline def setReadyWhenUndefined: Self = StObject.set(x, "readyWhen", js.undefined)
      
      inline def setRespawn(value: Double): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
      
      inline def setRespawnUndefined: Self = StObject.set(x, "respawn", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait LogOptions extends StObject {
    
    var respawns: js.UndefOr[Boolean] = js.undefined
  }
  object LogOptions {
    
    inline def apply(): LogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOptions]
    }
    
    extension [Self <: LogOptions](x: Self) {
      
      inline def setRespawns(value: Boolean): Self = StObject.set(x, "respawns", value.asInstanceOf[js.Any])
      
      inline def setRespawnsUndefined: Self = StObject.set(x, "respawns", js.undefined)
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def log(message: Unit, optionalParams: js.Any*): Unit = js.native
  }
}

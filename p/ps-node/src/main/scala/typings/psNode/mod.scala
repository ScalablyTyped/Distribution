package typings.psNode

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ps-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def kill(pID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, signal: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, signal: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, signal: Unit, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, signal: Signal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: String, signal: Signal, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, signal: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, signal: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, signal: Unit, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, signal: Signal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def kill(pID: Double, signal: Signal, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pID.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lookup(query: Query, cb: js.Function2[/* err */ Error, /* list */ js.Array[Program], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(query.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Program extends StObject {
    
    var arguments: js.Array[String]
    
    var command: String
    
    var pid: Double
  }
  object Program {
    
    @scala.inline
    def apply(arguments: js.Array[String], command: String, pid: Double): Program = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Program]
    }
    
    @scala.inline
    implicit class ProgramMutableBuilder[Self <: Program] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    var arguments: js.UndefOr[String | RegExp] = js.undefined
    
    var command: js.UndefOr[String | RegExp] = js.undefined
    
    var pid: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var ppid: js.UndefOr[Double] = js.undefined
    
    var psargs: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Query {
    
    @scala.inline
    def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: String | RegExp): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setCommand(value: String | RegExp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setPid(value: String | js.Array[String] | Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      @scala.inline
      def setPidVarargs(value: String*): Self = StObject.set(x, "pid", js.Array(value :_*))
      
      @scala.inline
      def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpidUndefined: Self = StObject.set(x, "ppid", js.undefined)
      
      @scala.inline
      def setPsargs(value: String | js.Array[String]): Self = StObject.set(x, "psargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPsargsUndefined: Self = StObject.set(x, "psargs", js.undefined)
      
      @scala.inline
      def setPsargsVarargs(value: String*): Self = StObject.set(x, "psargs", js.Array(value :_*))
    }
  }
  
  trait Signal extends StObject {
    
    var signal: String
    
    var timeout: Double
  }
  object Signal {
    
    @scala.inline
    def apply(signal: String, timeout: Double): Signal = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signal]
    }
    
    @scala.inline
    implicit class SignalMutableBuilder[Self <: Signal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}

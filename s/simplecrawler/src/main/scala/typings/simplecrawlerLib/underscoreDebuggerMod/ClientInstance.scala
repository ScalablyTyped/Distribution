package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInstance
  extends simplecrawlerLib.NodeJSNs.EventEmitter {
  var breakpoints: js.Array[Breakpoint] = js.native
  var currentFrame: scala.Double = js.native
  var currentScript: java.lang.String = js.native
  var currentSourceColumn: scala.Double = js.native
  var currentSourceLine: scala.Double = js.native
  var currentSourceLineText: java.lang.String = js.native
  var handles: js.Array[ScriptDesc] = js.native
  var protocol: Protocol = js.native
  var scripts: js.Array[ScriptDesc] = js.native
  def clearBreakpoint(rq: Request, cb: RequestHandler): scala.Unit = js.native
  def connect(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def listbreakpoints(cb: RequestHandler): scala.Unit = js.native
  def mirrorObject(obj: js.Any, depth: scala.Double, cb: ResponseBodyHandler): scala.Unit = js.native
  def req(req: js.Any, cb: RequestHandler): scala.Unit = js.native
  def reqContinue(cb: RequestHandler): scala.Unit = js.native
  def reqFrameEval(code: java.lang.String, frame: scala.Double, cb: RequestHandler): scala.Unit = js.native
  def reqScripts(cb: js.Any): scala.Unit = js.native
  def reqSource(from: scala.Double, to: scala.Double, cb: RequestHandler): scala.Unit = js.native
  def setBreakpoint(rq: BreakpointMessageBody, cb: RequestHandler): scala.Unit = js.native
}


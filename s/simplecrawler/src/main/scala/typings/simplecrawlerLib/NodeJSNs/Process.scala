package typings
package simplecrawlerLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends EventEmitter {
  var arch: java.lang.String = js.native
  var argv: js.Array[java.lang.String] = js.native
  var argv0: java.lang.String = js.native
  var config: simplecrawlerLib.Anon_Targetdefaults = js.native
  var connected: scala.Boolean = js.native
  var debugPort: scala.Double = js.native
  var domain: Domain = js.native
  var env: ProcessEnv = js.native
  var execArgv: js.Array[java.lang.String] = js.native
  var execPath: java.lang.String = js.native
  var exitCode: scala.Double = js.native
  var mainModule: js.UndefOr[simplecrawlerLib.NodeModule] = js.native
  var pid: scala.Double = js.native
  var platform: Platform = js.native
  // Worker
  var send: js.UndefOr[
    js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], scala.Unit]
  ] = js.native
  var stderr: WriteStream = js.native
  var stdin: ReadStream = js.native
  var stdout: WriteStream = js.native
  var title: java.lang.String = js.native
  var version: java.lang.String = js.native
  var versions: ProcessVersions = js.native
  def abort(): scala.Unit = js.native
  def chdir(directory: java.lang.String): scala.Unit = js.native
  def cpuUsage(): CpuUsage = js.native
  def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
  def cwd(): java.lang.String = js.native
  def disconnect(): scala.Unit = js.native
  def emitWarning(warning: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: java.lang.String, name: java.lang.String, ctor: js.Function): scala.Unit = js.native
  def emitWarning(warning: simplecrawlerLib.Error): scala.Unit = js.native
  def emitWarning(warning: simplecrawlerLib.Error, name: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: simplecrawlerLib.Error, name: java.lang.String, ctor: js.Function): scala.Unit = js.native
  def exit(): scala.Nothing = js.native
  def exit(code: scala.Double): scala.Nothing = js.native
  def getgid(): scala.Double = js.native
  def getuid(): scala.Double = js.native
  def hrtime(): js.Tuple2[scala.Double, scala.Double] = js.native
  def hrtime(time: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def kill(pid: scala.Double, signal: java.lang.String): scala.Unit = js.native
  def kill(pid: scala.Double, signal: scala.Double): scala.Unit = js.native
  def memoryUsage(): MemoryUsage = js.native
  def nextTick(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def openStdin(): Socket = js.native
  def setgid(id: java.lang.String): scala.Unit = js.native
  def setgid(id: scala.Double): scala.Unit = js.native
  def setuid(id: java.lang.String): scala.Unit = js.native
  def setuid(id: scala.Double): scala.Unit = js.native
  def umask(): scala.Double = js.native
  def umask(mask: scala.Double): scala.Double = js.native
  def uptime(): scala.Double = js.native
}


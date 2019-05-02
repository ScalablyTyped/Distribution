package typings
package simplecrawlerLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var EOL: java.lang.String = js.native
  def arch(): java.lang.String = js.native
  def cpus(): js.Array[CpuInfo] = js.native
  def endianness(): simplecrawlerLib.simplecrawlerLibStrings.BE | simplecrawlerLib.simplecrawlerLibStrings.LE = js.native
  def freemem(): scala.Double = js.native
  def homedir(): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def loadavg(): js.Array[scala.Double] = js.native
  def networkInterfaces(): org.scalablytyped.runtime.StringDictionary[js.Array[NetworkInterfaceInfo]] = js.native
  def platform(): simplecrawlerLib.NodeJSNs.Platform = js.native
  def release(): java.lang.String = js.native
  def tmpdir(): java.lang.String = js.native
  def totalmem(): scala.Double = js.native
  def `type`(): java.lang.String = js.native
  def uptime(): scala.Double = js.native
  def userInfo(): simplecrawlerLib.Anon_Gid = js.native
  def userInfo(options: simplecrawlerLib.Anon_Encoding): simplecrawlerLib.Anon_Gid = js.native
}


package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdp-transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(description: java.lang.String): sdpDashTransformLib.sdpDashTransformMod.SessionDescription = js.native
  def parseImageAttributes(params: java.lang.String): js.Array[sdpDashTransformLib.sdpDashTransformMod.ParamMap] = js.native
  def parseParams(params: java.lang.String): sdpDashTransformLib.sdpDashTransformMod.ParamMap = js.native
  def parsePayloads(payloads: java.lang.String): js.Array[scala.Double] = js.native
  def parseRemoteCandidates(candidates: java.lang.String): js.Array[sdpDashTransformLib.Anon_Component] = js.native
  def parseSimulcastStreamList(streams: java.lang.String): js.Array[sdpDashTransformLib.Anon_Paused] = js.native
  def write(description: sdpDashTransformLib.sdpDashTransformMod.SessionDescription): java.lang.String = js.native
}


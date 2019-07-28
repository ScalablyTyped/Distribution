package typings.sdpDashTransform.sdpDashTransformMod

import typings.sdpDashTransform.Anon_Component
import typings.sdpDashTransform.Anon_Paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdp-transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(description: String): SessionDescription = js.native
  def parseImageAttributes(params: String): js.Array[ParamMap] = js.native
  def parseParams(params: String): ParamMap = js.native
  def parsePayloads(payloads: String): js.Array[Double] = js.native
  def parseRemoteCandidates(candidates: String): js.Array[Anon_Component] = js.native
  def parseSimulcastStreamList(streams: String): js.Array[Anon_Paused] = js.native
  def write(description: SessionDescription): String = js.native
}


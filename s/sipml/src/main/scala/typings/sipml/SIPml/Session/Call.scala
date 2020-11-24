package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call
  extends typings.sipml.SIPml.Session {
  
  def acceptTransfer(): Double = js.native
  def acceptTransfer(configuration: Configuration): Double = js.native
  
  def call(to: String): Double = js.native
  def call(to: String, configuration: Configuration): Double = js.native
  
  def dtmf(): Double = js.native
  
  def hangup(): Double = js.native
  def hangup(configuration: Configuration): Double = js.native
  
  def hold(): Double = js.native
  def hold(configuration: Configuration): Double = js.native
  
  def info(): Double = js.native
  
  def rejectTransfer(): Double = js.native
  
  def resume(): Double = js.native
  
  def transfer(): Double = js.native
}
@JSGlobal("SIPml.Session.Call")
@js.native
object Call extends js.Object {
  
  /**
    * Should be 
    *
    * Session.EventSubscriptionType |
    * "m_early_media" |
    * "m_local_hold_ok" |
    * "m_local_hold_nok" |
    * "m_local_resume_ok" |
    * "m_local_resume_nok" |
    * "m_remote_hold" |
    * "m_remote_resume" |
    * "m_stream_video_local_added" |
    * "m_stream_video_local_removed" |
    * "m_stream_video_remote_added" |
    * "m_stream_video_remote_removed" |
    * "m_stream_audio_local_added" |
    * "m_stream_audio_local_removed" |
    * "m_stream_audio_remote_added" |
    * "m_stream_audio_remote_removed" |
    * "i_ect_new_call" |
    * "o_ect_trying" |
    * "o_ect_accepted" |
    * "o_ect_completed" |
    * "i_ect_completed" |
    * "o_ect_failed" |
    * "i_ect_failed" |
    * "o_ect_notify" |
    * "i_ect_notify" |
    * "i_ect_requested " |
    * "m_bfcp_info" |
    * "i_info" |
    */
  type EventSubscriptionType = typings.sipml.SIPml.Session.EventSubscriptionType
}

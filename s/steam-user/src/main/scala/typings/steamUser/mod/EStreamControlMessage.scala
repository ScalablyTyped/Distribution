package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamControlMessage extends StObject
@JSImport("steam-user", "EStreamControlMessage")
@js.native
object EStreamControlMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamControlMessage & Double] = js.native
  
  @js.native
  sealed trait AuthenticationRequest
    extends StObject
       with EStreamControlMessage
  /* 1 */ val AuthenticationRequest: typings.steamUser.mod.EStreamControlMessage.AuthenticationRequest & Double = js.native
  
  @js.native
  sealed trait AuthenticationResponse
    extends StObject
       with EStreamControlMessage
  /* 2 */ val AuthenticationResponse: typings.steamUser.mod.EStreamControlMessage.AuthenticationResponse & Double = js.native
  
  @js.native
  sealed trait ClientHandshake
    extends StObject
       with EStreamControlMessage
  /* 6 */ val ClientHandshake: typings.steamUser.mod.EStreamControlMessage.ClientHandshake & Double = js.native
  
  @js.native
  sealed trait DeleteCursor
    extends StObject
       with EStreamControlMessage
  /* 68 */ val DeleteCursor: typings.steamUser.mod.EStreamControlMessage.DeleteCursor & Double = js.native
  
  @js.native
  sealed trait DisableHighResCapture
    extends StObject
       with EStreamControlMessage
  /* 125 */ val DisableHighResCapture: typings.steamUser.mod.EStreamControlMessage.DisableHighResCapture & Double = js.native
  
  @js.native
  sealed trait EnableHighResCapture
    extends StObject
       with EStreamControlMessage
  /* 124 */ val EnableHighResCapture: typings.steamUser.mod.EStreamControlMessage.EnableHighResCapture & Double = js.native
  
  @js.native
  sealed trait GetCursorImage
    extends StObject
       with EStreamControlMessage
  /* 66 */ val GetCursorImage: typings.steamUser.mod.EStreamControlMessage.GetCursorImage & Double = js.native
  
  @js.native
  sealed trait GetTouchConfigData
    extends StObject
       with EStreamControlMessage
  /* 111 */ val GetTouchConfigData: typings.steamUser.mod.EStreamControlMessage.GetTouchConfigData & Double = js.native
  
  @js.native
  sealed trait GetTouchIconData
    extends StObject
       with EStreamControlMessage
  /* 115 */ val GetTouchIconData: typings.steamUser.mod.EStreamControlMessage.GetTouchIconData & Double = js.native
  
  @js.native
  sealed trait HideCursor
    extends StObject
       with EStreamControlMessage
  /* 64 */ val HideCursor: typings.steamUser.mod.EStreamControlMessage.HideCursor & Double = js.native
  
  @js.native
  sealed trait InputKeyDown
    extends StObject
       with EStreamControlMessage
  /* 58 */ val InputKeyDown: typings.steamUser.mod.EStreamControlMessage.InputKeyDown & Double = js.native
  
  @js.native
  sealed trait InputKeyUp
    extends StObject
       with EStreamControlMessage
  /* 59 */ val InputKeyUp: typings.steamUser.mod.EStreamControlMessage.InputKeyUp & Double = js.native
  
  @js.native
  sealed trait InputLatencyTest
    extends StObject
       with EStreamControlMessage
  /* 70 */ val InputLatencyTest: typings.steamUser.mod.EStreamControlMessage.InputLatencyTest & Double = js.native
  
  @js.native
  sealed trait InputMouseDown
    extends StObject
       with EStreamControlMessage
  /* 56 */ val InputMouseDown: typings.steamUser.mod.EStreamControlMessage.InputMouseDown & Double = js.native
  
  @js.native
  sealed trait InputMouseMotion
    extends StObject
       with EStreamControlMessage
  /* 54 */ val InputMouseMotion: typings.steamUser.mod.EStreamControlMessage.InputMouseMotion & Double = js.native
  
  @js.native
  sealed trait InputMouseUp
    extends StObject
       with EStreamControlMessage
  /* 57 */ val InputMouseUp: typings.steamUser.mod.EStreamControlMessage.InputMouseUp & Double = js.native
  
  @js.native
  sealed trait InputMouseWheel
    extends StObject
       with EStreamControlMessage
  /* 55 */ val InputMouseWheel: typings.steamUser.mod.EStreamControlMessage.InputMouseWheel & Double = js.native
  
  @js.native
  sealed trait InputText
    extends StObject
       with EStreamControlMessage
  /* 109 */ val InputText: typings.steamUser.mod.EStreamControlMessage.InputText & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerDown
    extends StObject
       with EStreamControlMessage
  /* 117 */ val InputTouchFingerDown: typings.steamUser.mod.EStreamControlMessage.InputTouchFingerDown & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerMotion
    extends StObject
       with EStreamControlMessage
  /* 118 */ val InputTouchFingerMotion: typings.steamUser.mod.EStreamControlMessage.InputTouchFingerMotion & Double = js.native
  
  @js.native
  sealed trait InputTouchFingerUp
    extends StObject
       with EStreamControlMessage
  /* 119 */ val InputTouchFingerUp: typings.steamUser.mod.EStreamControlMessage.InputTouchFingerUp & Double = js.native
  
  @js.native
  sealed trait KeepAlive
    extends StObject
       with EStreamControlMessage
  /* 9 */ val KeepAlive: typings.steamUser.mod.EStreamControlMessage.KeepAlive & Double = js.native
  
  @js.native
  sealed trait LAST_SETUP_MESSAGE
    extends StObject
       with EStreamControlMessage
  /* 15 */ val LAST_SETUP_MESSAGE: typings.steamUser.mod.EStreamControlMessage.LAST_SETUP_MESSAGE & Double = js.native
  
  @js.native
  sealed trait NegotiationComplete
    extends StObject
       with EStreamControlMessage
  /* 5 */ val NegotiationComplete: typings.steamUser.mod.EStreamControlMessage.NegotiationComplete & Double = js.native
  
  @js.native
  sealed trait NegotiationInit
    extends StObject
       with EStreamControlMessage
  /* 3 */ val NegotiationInit: typings.steamUser.mod.EStreamControlMessage.NegotiationInit & Double = js.native
  
  @js.native
  sealed trait NegotiationSetConfig
    extends StObject
       with EStreamControlMessage
  /* 4 */ val NegotiationSetConfig: typings.steamUser.mod.EStreamControlMessage.NegotiationSetConfig & Double = js.native
  
  @js.native
  sealed trait OverlayEnabled
    extends StObject
       with EStreamControlMessage
  /* 74 */ val OverlayEnabled: typings.steamUser.mod.EStreamControlMessage.OverlayEnabled & Double = js.native
  
  @js.native
  sealed trait Pause
    extends StObject
       with EStreamControlMessage
  /* 122 */ val Pause: typings.steamUser.mod.EStreamControlMessage.Pause & Double = js.native
  
  @js.native
  sealed trait QuitRequest
    extends StObject
       with EStreamControlMessage
  /* 83 */ val QuitRequest: typings.steamUser.mod.EStreamControlMessage.QuitRequest & Double = js.native
  
  @js.native
  sealed trait RemoteHID
    extends StObject
       with EStreamControlMessage
  /* 106 */ val RemoteHID: typings.steamUser.mod.EStreamControlMessage.RemoteHID & Double = js.native
  
  @js.native
  sealed trait Resume
    extends StObject
       with EStreamControlMessage
  /* 123 */ val Resume: typings.steamUser.mod.EStreamControlMessage.Resume & Double = js.native
  
  @js.native
  sealed trait SaveTouchConfigLayout
    extends StObject
       with EStreamControlMessage
  /* 113 */ val SaveTouchConfigLayout: typings.steamUser.mod.EStreamControlMessage.SaveTouchConfigLayout & Double = js.native
  
  @js.native
  sealed trait ServerHandshake
    extends StObject
       with EStreamControlMessage
  /* 7 */ val ServerHandshake: typings.steamUser.mod.EStreamControlMessage.ServerHandshake & Double = js.native
  
  @js.native
  sealed trait SetActivity
    extends StObject
       with EStreamControlMessage
  /* 98 */ val SetActivity: typings.steamUser.mod.EStreamControlMessage.SetActivity & Double = js.native
  
  @js.native
  sealed trait SetCapslock
    extends StObject
       with EStreamControlMessage
  /* 127 */ val SetCapslock: typings.steamUser.mod.EStreamControlMessage.SetCapslock & Double = js.native
  
  @js.native
  sealed trait SetCaptureSize
    extends StObject
       with EStreamControlMessage
  /* 120 */ val SetCaptureSize: typings.steamUser.mod.EStreamControlMessage.SetCaptureSize & Double = js.native
  
  @js.native
  sealed trait SetCursor
    extends StObject
       with EStreamControlMessage
  /* 65 */ val SetCursor: typings.steamUser.mod.EStreamControlMessage.SetCursor & Double = js.native
  
  @js.native
  sealed trait SetCursorImage
    extends StObject
       with EStreamControlMessage
  /* 67 */ val SetCursorImage: typings.steamUser.mod.EStreamControlMessage.SetCursorImage & Double = js.native
  
  @js.native
  sealed trait SetFlashState
    extends StObject
       with EStreamControlMessage
  /* 121 */ val SetFlashState: typings.steamUser.mod.EStreamControlMessage.SetFlashState & Double = js.native
  
  @js.native
  sealed trait SetGammaRamp
    extends StObject
       with EStreamControlMessage
  /* 89 */ val SetGammaRamp: typings.steamUser.mod.EStreamControlMessage.SetGammaRamp & Double = js.native
  
  @js.native
  sealed trait SetIcon
    extends StObject
       with EStreamControlMessage
  /* 82 */ val SetIcon: typings.steamUser.mod.EStreamControlMessage.SetIcon & Double = js.native
  
  @js.native
  sealed trait SetKeymap
    extends StObject
       with EStreamControlMessage
  /* 128 */ val SetKeymap: typings.steamUser.mod.EStreamControlMessage.SetKeymap & Double = js.native
  
  @js.native
  sealed trait SetQoS
    extends StObject
       with EStreamControlMessage
  /* 87 */ val SetQoS: typings.steamUser.mod.EStreamControlMessage.SetQoS & Double = js.native
  
  @js.native
  sealed trait SetSpectatorMode
    extends StObject
       with EStreamControlMessage
  /* 105 */ val SetSpectatorMode: typings.steamUser.mod.EStreamControlMessage.SetSpectatorMode & Double = js.native
  
  @js.native
  sealed trait SetStreamingClientConfig
    extends StObject
       with EStreamControlMessage
  /* 99 */ val SetStreamingClientConfig: typings.steamUser.mod.EStreamControlMessage.SetStreamingClientConfig & Double = js.native
  
  @js.native
  sealed trait SetTargetBitrate
    extends StObject
       with EStreamControlMessage
  /* 94 */ val SetTargetBitrate: typings.steamUser.mod.EStreamControlMessage.SetTargetBitrate & Double = js.native
  
  @js.native
  sealed trait SetTargetFramerate
    extends StObject
       with EStreamControlMessage
  /* 69 */ val SetTargetFramerate: typings.steamUser.mod.EStreamControlMessage.SetTargetFramerate & Double = js.native
  
  @js.native
  sealed trait SetTitle
    extends StObject
       with EStreamControlMessage
  /* 81 */ val SetTitle: typings.steamUser.mod.EStreamControlMessage.SetTitle & Double = js.native
  
  @js.native
  sealed trait SetTouchConfigData
    extends StObject
       with EStreamControlMessage
  /* 112 */ val SetTouchConfigData: typings.steamUser.mod.EStreamControlMessage.SetTouchConfigData & Double = js.native
  
  @js.native
  sealed trait SetTouchIconData
    extends StObject
       with EStreamControlMessage
  /* 116 */ val SetTouchIconData: typings.steamUser.mod.EStreamControlMessage.SetTouchIconData & Double = js.native
  
  @js.native
  sealed trait ShowCursor
    extends StObject
       with EStreamControlMessage
  /* 63 */ val ShowCursor: typings.steamUser.mod.EStreamControlMessage.ShowCursor & Double = js.native
  
  @js.native
  sealed trait StartAudioData
    extends StObject
       with EStreamControlMessage
  /* 50 */ val StartAudioData: typings.steamUser.mod.EStreamControlMessage.StartAudioData & Double = js.native
  
  @js.native
  sealed trait StartMicrophoneData
    extends StObject
       with EStreamControlMessage
  /* 107 */ val StartMicrophoneData: typings.steamUser.mod.EStreamControlMessage.StartMicrophoneData & Double = js.native
  
  @js.native
  sealed trait StartNetworkTest
    extends StObject
       with EStreamControlMessage
  /* 8 */ val StartNetworkTest: typings.steamUser.mod.EStreamControlMessage.StartNetworkTest & Double = js.native
  
  @js.native
  sealed trait StartVideoData
    extends StObject
       with EStreamControlMessage
  /* 52 */ val StartVideoData: typings.steamUser.mod.EStreamControlMessage.StartVideoData & Double = js.native
  
  @js.native
  sealed trait StopAudioData
    extends StObject
       with EStreamControlMessage
  /* 51 */ val StopAudioData: typings.steamUser.mod.EStreamControlMessage.StopAudioData & Double = js.native
  
  @js.native
  sealed trait StopMicrophoneData
    extends StObject
       with EStreamControlMessage
  /* 108 */ val StopMicrophoneData: typings.steamUser.mod.EStreamControlMessage.StopMicrophoneData & Double = js.native
  
  @js.native
  sealed trait StopRequest
    extends StObject
       with EStreamControlMessage
  /* 129 */ val StopRequest: typings.steamUser.mod.EStreamControlMessage.StopRequest & Double = js.native
  
  @js.native
  sealed trait StopVideoData
    extends StObject
       with EStreamControlMessage
  /* 53 */ val StopVideoData: typings.steamUser.mod.EStreamControlMessage.StopVideoData & Double = js.native
  
  @js.native
  sealed trait SystemSuspend
    extends StObject
       with EStreamControlMessage
  /* 100 */ val SystemSuspend: typings.steamUser.mod.EStreamControlMessage.SystemSuspend & Double = js.native
  
  @js.native
  sealed trait ToggleMagnification
    extends StObject
       with EStreamControlMessage
  /* 126 */ val ToggleMagnification: typings.steamUser.mod.EStreamControlMessage.ToggleMagnification & Double = js.native
  
  @js.native
  sealed trait TouchActionSetActive
    extends StObject
       with EStreamControlMessage
  /* 114 */ val TouchActionSetActive: typings.steamUser.mod.EStreamControlMessage.TouchActionSetActive & Double = js.native
  
  @js.native
  sealed trait TouchActionSetLayerAdded
    extends StObject
       with EStreamControlMessage
  /* 130 */ val TouchActionSetLayerAdded: typings.steamUser.mod.EStreamControlMessage.TouchActionSetLayerAdded & Double = js.native
  
  @js.native
  sealed trait TouchActionSetLayerRemoved
    extends StObject
       with EStreamControlMessage
  /* 131 */ val TouchActionSetLayerRemoved: typings.steamUser.mod.EStreamControlMessage.TouchActionSetLayerRemoved & Double = js.native
  
  @js.native
  sealed trait TouchConfigActive
    extends StObject
       with EStreamControlMessage
  /* 110 */ val TouchConfigActive: typings.steamUser.mod.EStreamControlMessage.TouchConfigActive & Double = js.native
  
  @js.native
  sealed trait VideoDecoderInfo
    extends StObject
       with EStreamControlMessage
  /* 80 */ val VideoDecoderInfo: typings.steamUser.mod.EStreamControlMessage.VideoDecoderInfo & Double = js.native
  
  @js.native
  sealed trait VideoEncoderInfo
    extends StObject
       with EStreamControlMessage
  /* 90 */ val VideoEncoderInfo: typings.steamUser.mod.EStreamControlMessage.VideoEncoderInfo & Double = js.native
  
  @js.native
  sealed trait VirtualHereReady
    extends StObject
       with EStreamControlMessage
  /* 103 */ val VirtualHereReady: typings.steamUser.mod.EStreamControlMessage.VirtualHereReady & Double = js.native
  
  @js.native
  sealed trait VirtualHereRequest
    extends StObject
       with EStreamControlMessage
  /* 102 */ val VirtualHereRequest: typings.steamUser.mod.EStreamControlMessage.VirtualHereRequest & Double = js.native
  
  @js.native
  sealed trait VirtualHereShareDevice
    extends StObject
       with EStreamControlMessage
  /* 104 */ val VirtualHereShareDevice: typings.steamUser.mod.EStreamControlMessage.VirtualHereShareDevice & Double = js.native
}

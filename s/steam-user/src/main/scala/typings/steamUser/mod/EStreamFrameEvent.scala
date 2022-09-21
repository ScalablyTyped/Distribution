package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamFrameEvent extends StObject
@JSImport("steam-user", "EStreamFrameEvent")
@js.native
object EStreamFrameEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamFrameEvent & Double] = js.native
  
  @js.native
  sealed trait CaptureBegin
    extends StObject
       with EStreamFrameEvent
  /* 6 */ val CaptureBegin: typings.steamUser.mod.EStreamFrameEvent.CaptureBegin & Double = js.native
  
  @js.native
  sealed trait CaptureEnd
    extends StObject
       with EStreamFrameEvent
  /* 7 */ val CaptureEnd: typings.steamUser.mod.EStreamFrameEvent.CaptureEnd & Double = js.native
  
  @js.native
  sealed trait Complete
    extends StObject
       with EStreamFrameEvent
  /* 18 */ val Complete: typings.steamUser.mod.EStreamFrameEvent.Complete & Double = js.native
  
  @js.native
  sealed trait ConvertBegin
    extends StObject
       with EStreamFrameEvent
  /* 8 */ val ConvertBegin: typings.steamUser.mod.EStreamFrameEvent.ConvertBegin & Double = js.native
  
  @js.native
  sealed trait ConvertEnd
    extends StObject
       with EStreamFrameEvent
  /* 9 */ val ConvertEnd: typings.steamUser.mod.EStreamFrameEvent.ConvertEnd & Double = js.native
  
  @js.native
  sealed trait DecodeBegin
    extends StObject
       with EStreamFrameEvent
  /* 14 */ val DecodeBegin: typings.steamUser.mod.EStreamFrameEvent.DecodeBegin & Double = js.native
  
  @js.native
  sealed trait DecodeEnd
    extends StObject
       with EStreamFrameEvent
  /* 15 */ val DecodeEnd: typings.steamUser.mod.EStreamFrameEvent.DecodeEnd & Double = js.native
  
  @js.native
  sealed trait EncodeBegin
    extends StObject
       with EStreamFrameEvent
  /* 10 */ val EncodeBegin: typings.steamUser.mod.EStreamFrameEvent.EncodeBegin & Double = js.native
  
  @js.native
  sealed trait EncodeEnd
    extends StObject
       with EStreamFrameEvent
  /* 11 */ val EncodeEnd: typings.steamUser.mod.EStreamFrameEvent.EncodeEnd & Double = js.native
  
  @js.native
  sealed trait InputEventHandled
    extends StObject
       with EStreamFrameEvent
  /* 4 */ val InputEventHandled: typings.steamUser.mod.EStreamFrameEvent.InputEventHandled & Double = js.native
  
  @js.native
  sealed trait InputEventQueued
    extends StObject
       with EStreamFrameEvent
  /* 3 */ val InputEventQueued: typings.steamUser.mod.EStreamFrameEvent.InputEventQueued & Double = js.native
  
  @js.native
  sealed trait InputEventRecv
    extends StObject
       with EStreamFrameEvent
  /* 2 */ val InputEventRecv: typings.steamUser.mod.EStreamFrameEvent.InputEventRecv & Double = js.native
  
  @js.native
  sealed trait InputEventSend
    extends StObject
       with EStreamFrameEvent
  /* 1 */ val InputEventSend: typings.steamUser.mod.EStreamFrameEvent.InputEventSend & Double = js.native
  
  @js.native
  sealed trait InputEventStart
    extends StObject
       with EStreamFrameEvent
  /* 0 */ val InputEventStart: typings.steamUser.mod.EStreamFrameEvent.InputEventStart & Double = js.native
  
  @js.native
  sealed trait Recv
    extends StObject
       with EStreamFrameEvent
  /* 13 */ val Recv: typings.steamUser.mod.EStreamFrameEvent.Recv & Double = js.native
  
  @js.native
  sealed trait Send
    extends StObject
       with EStreamFrameEvent
  /* 12 */ val Send: typings.steamUser.mod.EStreamFrameEvent.Send & Double = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with EStreamFrameEvent
  /* 5 */ val Start: typings.steamUser.mod.EStreamFrameEvent.Start & Double = js.native
  
  @js.native
  sealed trait UploadBegin
    extends StObject
       with EStreamFrameEvent
  /* 16 */ val UploadBegin: typings.steamUser.mod.EStreamFrameEvent.UploadBegin & Double = js.native
  
  @js.native
  sealed trait UploadEnd
    extends StObject
       with EStreamFrameEvent
  /* 17 */ val UploadEnd: typings.steamUser.mod.EStreamFrameEvent.UploadEnd & Double = js.native
}

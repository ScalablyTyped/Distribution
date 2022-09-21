package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamingDataType extends StObject
@JSImport("steam-user", "EStreamingDataType")
@js.native
object EStreamingDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamingDataType & Double] = js.native
  
  @js.native
  sealed trait AudioData
    extends StObject
       with EStreamingDataType
  /* 0 */ val AudioData: typings.steamUser.mod.EStreamingDataType.AudioData & Double = js.native
  
  @js.native
  sealed trait MicrophoneData
    extends StObject
       with EStreamingDataType
  /* 2 */ val MicrophoneData: typings.steamUser.mod.EStreamingDataType.MicrophoneData & Double = js.native
  
  @js.native
  sealed trait VideoData
    extends StObject
       with EStreamingDataType
  /* 1 */ val VideoData: typings.steamUser.mod.EStreamingDataType.VideoData & Double = js.native
}

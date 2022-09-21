package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamVideoCodec extends StObject
@JSImport("steam-user", "EStreamVideoCodec")
@js.native
object EStreamVideoCodec extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamVideoCodec & Double] = js.native
  
  @js.native
  sealed trait H264
    extends StObject
       with EStreamVideoCodec
  /* 4 */ val H264: typings.steamUser.mod.EStreamVideoCodec.H264 & Double = js.native
  
  @js.native
  sealed trait HEVC
    extends StObject
       with EStreamVideoCodec
  /* 5 */ val HEVC: typings.steamUser.mod.EStreamVideoCodec.HEVC & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EStreamVideoCodec
  /* 0 */ val None: typings.steamUser.mod.EStreamVideoCodec.None & Double = js.native
  
  @js.native
  sealed trait ORBX1
    extends StObject
       with EStreamVideoCodec
  /* 6 */ val ORBX1: typings.steamUser.mod.EStreamVideoCodec.ORBX1 & Double = js.native
  
  @js.native
  sealed trait ORBX2
    extends StObject
       with EStreamVideoCodec
  /* 7 */ val ORBX2: typings.steamUser.mod.EStreamVideoCodec.ORBX2 & Double = js.native
  
  @js.native
  sealed trait Raw
    extends StObject
       with EStreamVideoCodec
  /* 1 */ val Raw: typings.steamUser.mod.EStreamVideoCodec.Raw & Double = js.native
  
  @js.native
  sealed trait VP8
    extends StObject
       with EStreamVideoCodec
  /* 2 */ val VP8: typings.steamUser.mod.EStreamVideoCodec.VP8 & Double = js.native
  
  @js.native
  sealed trait VP9
    extends StObject
       with EStreamVideoCodec
  /* 3 */ val VP9: typings.steamUser.mod.EStreamVideoCodec.VP9 & Double = js.native
}

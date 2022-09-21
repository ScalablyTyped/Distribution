package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DRMType extends StObject
@JSImport("react-native-video", "DRMType")
@js.native
object DRMType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DRMType & String] = js.native
  
  @js.native
  sealed trait CLEARKEY
    extends StObject
       with DRMType
  /* "clearkey" */ val CLEARKEY: typings.reactNativeVideo.mod.DRMType.CLEARKEY & String = js.native
  
  @js.native
  sealed trait FAIRPLAY
    extends StObject
       with DRMType
  /* "fairplay" */ val FAIRPLAY: typings.reactNativeVideo.mod.DRMType.FAIRPLAY & String = js.native
  
  @js.native
  sealed trait PLAYREADY
    extends StObject
       with DRMType
  /* "playready" */ val PLAYREADY: typings.reactNativeVideo.mod.DRMType.PLAYREADY & String = js.native
  
  @js.native
  sealed trait WIDEVINE
    extends StObject
       with DRMType
  /* "widevine" */ val WIDEVINE: typings.reactNativeVideo.mod.DRMType.WIDEVINE & String = js.native
}

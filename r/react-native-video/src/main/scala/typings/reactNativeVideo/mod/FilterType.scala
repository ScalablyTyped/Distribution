package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends StObject
@JSImport("react-native-video", "FilterType")
@js.native
object FilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType with String] = js.native
  
  @js.native
  sealed trait CHROME extends FilterType
  /* "CIPhotoEffectChrome" */ val CHROME: typings.reactNativeVideo.mod.FilterType.CHROME with String = js.native
  
  @js.native
  sealed trait FADE extends FilterType
  /* "CIPhotoEffectFade" */ val FADE: typings.reactNativeVideo.mod.FilterType.FADE with String = js.native
  
  @js.native
  sealed trait FALSE extends FilterType
  /* "CIFalseColor" */ val FALSE: typings.reactNativeVideo.mod.FilterType.FALSE with String = js.native
  
  @js.native
  sealed trait INSTANT extends FilterType
  /* "CIPhotoEffectInstant" */ val INSTANT: typings.reactNativeVideo.mod.FilterType.INSTANT with String = js.native
  
  @js.native
  sealed trait INVERT extends FilterType
  /* "CIColorInvert" */ val INVERT: typings.reactNativeVideo.mod.FilterType.INVERT with String = js.native
  
  @js.native
  sealed trait MAXIMUMCOMPONENT extends FilterType
  /* "CIMaximumComponent" */ val MAXIMUMCOMPONENT: typings.reactNativeVideo.mod.FilterType.MAXIMUMCOMPONENT with String = js.native
  
  @js.native
  sealed trait MINIMUMCOMPONENT extends FilterType
  /* "CIMinimumComponent" */ val MINIMUMCOMPONENT: typings.reactNativeVideo.mod.FilterType.MINIMUMCOMPONENT with String = js.native
  
  @js.native
  sealed trait MONO extends FilterType
  /* "CIPhotoEffectMono" */ val MONO: typings.reactNativeVideo.mod.FilterType.MONO with String = js.native
  
  @js.native
  sealed trait MONOCHROME extends FilterType
  /* "CIColorMonochrome" */ val MONOCHROME: typings.reactNativeVideo.mod.FilterType.MONOCHROME with String = js.native
  
  @js.native
  sealed trait NOIR extends FilterType
  /* "CIPhotoEffectNoir" */ val NOIR: typings.reactNativeVideo.mod.FilterType.NOIR with String = js.native
  
  @js.native
  sealed trait NONE extends FilterType
  /* "" */ val NONE: typings.reactNativeVideo.mod.FilterType.NONE with String = js.native
  
  @js.native
  sealed trait POSTERIZE extends FilterType
  /* "CIColorPosterize" */ val POSTERIZE: typings.reactNativeVideo.mod.FilterType.POSTERIZE with String = js.native
  
  @js.native
  sealed trait PROCESS extends FilterType
  /* "CIPhotoEffectProcess" */ val PROCESS: typings.reactNativeVideo.mod.FilterType.PROCESS with String = js.native
  
  @js.native
  sealed trait SEPIA extends FilterType
  /* "CISepiaTone" */ val SEPIA: typings.reactNativeVideo.mod.FilterType.SEPIA with String = js.native
  
  @js.native
  sealed trait TONAL extends FilterType
  /* "CIPhotoEffectTonal" */ val TONAL: typings.reactNativeVideo.mod.FilterType.TONAL with String = js.native
  
  @js.native
  sealed trait TRANSFER extends FilterType
  /* "CIPhotoEffectTransfer" */ val TRANSFER: typings.reactNativeVideo.mod.FilterType.TRANSFER with String = js.native
}

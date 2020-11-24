package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends js.Object
@JSImport("react-native-video", "FilterType")
@js.native
object FilterType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType with String] = js.native
  
  @js.native
  sealed trait CHROME extends FilterType
  /* "CIPhotoEffectChrome" */ @js.native
  object CHROME extends TopLevel[CHROME with String]
  
  @js.native
  sealed trait FADE extends FilterType
  /* "CIPhotoEffectFade" */ @js.native
  object FADE extends TopLevel[FADE with String]
  
  @js.native
  sealed trait FALSE extends FilterType
  /* "CIFalseColor" */ @js.native
  object FALSE extends TopLevel[FALSE with String]
  
  @js.native
  sealed trait INSTANT extends FilterType
  /* "CIPhotoEffectInstant" */ @js.native
  object INSTANT extends TopLevel[INSTANT with String]
  
  @js.native
  sealed trait INVERT extends FilterType
  /* "CIColorInvert" */ @js.native
  object INVERT extends TopLevel[INVERT with String]
  
  @js.native
  sealed trait MAXIMUMCOMPONENT extends FilterType
  /* "CIMaximumComponent" */ @js.native
  object MAXIMUMCOMPONENT extends TopLevel[MAXIMUMCOMPONENT with String]
  
  @js.native
  sealed trait MINIMUMCOMPONENT extends FilterType
  /* "CIMinimumComponent" */ @js.native
  object MINIMUMCOMPONENT extends TopLevel[MINIMUMCOMPONENT with String]
  
  @js.native
  sealed trait MONO extends FilterType
  /* "CIPhotoEffectMono" */ @js.native
  object MONO extends TopLevel[MONO with String]
  
  @js.native
  sealed trait MONOCHROME extends FilterType
  /* "CIColorMonochrome" */ @js.native
  object MONOCHROME extends TopLevel[MONOCHROME with String]
  
  @js.native
  sealed trait NOIR extends FilterType
  /* "CIPhotoEffectNoir" */ @js.native
  object NOIR extends TopLevel[NOIR with String]
  
  @js.native
  sealed trait NONE extends FilterType
  /* "" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  @js.native
  sealed trait POSTERIZE extends FilterType
  /* "CIColorPosterize" */ @js.native
  object POSTERIZE extends TopLevel[POSTERIZE with String]
  
  @js.native
  sealed trait PROCESS extends FilterType
  /* "CIPhotoEffectProcess" */ @js.native
  object PROCESS extends TopLevel[PROCESS with String]
  
  @js.native
  sealed trait SEPIA extends FilterType
  /* "CISepiaTone" */ @js.native
  object SEPIA extends TopLevel[SEPIA with String]
  
  @js.native
  sealed trait TONAL extends FilterType
  /* "CIPhotoEffectTonal" */ @js.native
  object TONAL extends TopLevel[TONAL with String]
  
  @js.native
  sealed trait TRANSFER extends FilterType
  /* "CIPhotoEffectTransfer" */ @js.native
  object TRANSFER extends TopLevel[TRANSFER with String]
}

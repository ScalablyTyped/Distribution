package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSImport("react-native-video", "FilterType")
@js.native
object FilterType extends js.Object {
  @js.native
  sealed trait CHROME extends FilterType
  
  @js.native
  sealed trait FADE extends FilterType
  
  @js.native
  sealed trait FALSE extends FilterType
  
  @js.native
  sealed trait INSTANT extends FilterType
  
  @js.native
  sealed trait INVERT extends FilterType
  
  @js.native
  sealed trait MAXIMUMCOMPONENT extends FilterType
  
  @js.native
  sealed trait MINIMUMCOMPONENT extends FilterType
  
  @js.native
  sealed trait MONO extends FilterType
  
  @js.native
  sealed trait MONOCHROME extends FilterType
  
  @js.native
  sealed trait NOIR extends FilterType
  
  @js.native
  sealed trait NONE extends FilterType
  
  @js.native
  sealed trait POSTERIZE extends FilterType
  
  @js.native
  sealed trait PROCESS extends FilterType
  
  @js.native
  sealed trait SEPIA extends FilterType
  
  @js.native
  sealed trait TONAL extends FilterType
  
  @js.native
  sealed trait TRANSFER extends FilterType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType with String] = js.native
  /* "CIPhotoEffectChrome" */ @js.native
  object CHROME extends TopLevel[CHROME with String]
  
  /* "CIPhotoEffectFade" */ @js.native
  object FADE extends TopLevel[FADE with String]
  
  /* "CIFalseColor" */ @js.native
  object FALSE extends TopLevel[FALSE with String]
  
  /* "CIPhotoEffectInstant" */ @js.native
  object INSTANT extends TopLevel[INSTANT with String]
  
  /* "CIColorInvert" */ @js.native
  object INVERT extends TopLevel[INVERT with String]
  
  /* "CIMaximumComponent" */ @js.native
  object MAXIMUMCOMPONENT extends TopLevel[MAXIMUMCOMPONENT with String]
  
  /* "CIMinimumComponent" */ @js.native
  object MINIMUMCOMPONENT extends TopLevel[MINIMUMCOMPONENT with String]
  
  /* "CIPhotoEffectMono" */ @js.native
  object MONO extends TopLevel[MONO with String]
  
  /* "CIColorMonochrome" */ @js.native
  object MONOCHROME extends TopLevel[MONOCHROME with String]
  
  /* "CIPhotoEffectNoir" */ @js.native
  object NOIR extends TopLevel[NOIR with String]
  
  /* "" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "CIColorPosterize" */ @js.native
  object POSTERIZE extends TopLevel[POSTERIZE with String]
  
  /* "CIPhotoEffectProcess" */ @js.native
  object PROCESS extends TopLevel[PROCESS with String]
  
  /* "CISepiaTone" */ @js.native
  object SEPIA extends TopLevel[SEPIA with String]
  
  /* "CIPhotoEffectTonal" */ @js.native
  object TONAL extends TopLevel[TONAL with String]
  
  /* "CIPhotoEffectTransfer" */ @js.native
  object TRANSFER extends TopLevel[TRANSFER with String]
  
}


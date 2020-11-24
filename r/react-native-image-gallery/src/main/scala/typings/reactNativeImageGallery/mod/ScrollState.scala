package typings.reactNativeImageGallery.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollState extends js.Object
@JSImport("react-native-image-gallery", "ScrollState")
@js.native
object ScrollState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScrollState with String] = js.native
  
  @js.native
  sealed trait DRAGGING extends ScrollState
  /* "dragging" */ @js.native
  object DRAGGING extends TopLevel[DRAGGING with String]
  
  @js.native
  sealed trait IDLE extends ScrollState
  /* "idle" */ @js.native
  object IDLE extends TopLevel[IDLE with String]
  
  @js.native
  sealed trait SETTLING extends ScrollState
  /* "settling" */ @js.native
  object SETTLING extends TopLevel[SETTLING with String]
}

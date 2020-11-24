package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Priority")
@js.native
object Priority extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  
  @js.native
  sealed trait Default extends Priority
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  @js.native
  sealed trait High extends Priority
  /* 1 */ @js.native
  object High extends TopLevel[High with Double]
  
  @js.native
  sealed trait Low extends Priority
  /* -1 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  @js.native
  sealed trait Max extends Priority
  /* 2 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Min extends Priority
  /* -2 */ @js.native
  object Min extends TopLevel[Min with Double]
}

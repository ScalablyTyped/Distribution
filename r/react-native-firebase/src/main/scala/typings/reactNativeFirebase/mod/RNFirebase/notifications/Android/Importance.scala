package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Importance extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Importance")
@js.native
object Importance extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Importance with Double] = js.native
  
  @js.native
  sealed trait Default extends Importance
  /* 3 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  @js.native
  sealed trait High extends Importance
  /* 4 */ @js.native
  object High extends TopLevel[High with Double]
  
  @js.native
  sealed trait Low extends Importance
  /* 2 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  @js.native
  sealed trait Max extends Importance
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Min extends Importance
  /* 1 */ @js.native
  object Min extends TopLevel[Min with Double]
  
  @js.native
  sealed trait None extends Importance
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Unspecified extends Importance
  /* -1000 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
}

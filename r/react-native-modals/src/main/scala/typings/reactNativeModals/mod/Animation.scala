package typings.reactNativeModals.mod

import typings.reactNativeModals.anon.AnimationDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-modals", "Animation")
@js.native
open class Animation protected () extends StObject {
  def this(params: AnimationDuration) = this()
  
  def getAnimations(): js.Object = js.native
  
  def in(): Unit = js.native
  def in(onFinised: Boolean): Unit = js.native
  
  def out(): Unit = js.native
  def out(onFinised: Boolean): Unit = js.native
}

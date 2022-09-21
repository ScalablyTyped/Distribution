package typings.reactNative.mod.Animated

import typings.reactNative.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Animated.AnimatedColor")
@js.native
open class AnimatedColor () extends AnimatedWithChildren {
  def this(valueIn: RgbaAnimatedValue) = this()
  def this(valueIn: RgbaValue) = this()
  def this(valueIn: ColorValue) = this()
  def this(valueIn: Null, config: AnimatedConfig) = this()
  def this(valueIn: Unit, config: AnimatedConfig) = this()
  def this(valueIn: RgbaAnimatedValue, config: AnimatedConfig) = this()
  def this(valueIn: RgbaValue, config: AnimatedConfig) = this()
  def this(valueIn: ColorValue, config: AnimatedConfig) = this()
  
  var a: AnimatedValue = js.native
  
  var b: AnimatedValue = js.native
  
  def extractOffset(): Unit = js.native
  
  def flattenOffset(): Unit = js.native
  
  var g: AnimatedValue = js.native
  
  var nativeColor: Any = js.native
  
  var r: AnimatedValue = js.native
  
  def resetAnimation(callback: js.Function1[/* value */ ColorValue, Any]): Unit = js.native
  
  def setOffset(offset: RgbaValue): Unit = js.native
  
  // Unsure what to do here
  def setValue(value: RgbaValue): Unit = js.native
  def setValue(value: ColorValue): Unit = js.native
  
  def stopAnimation(callback: js.Function1[/* value */ ColorValue, Any]): Unit = js.native
}

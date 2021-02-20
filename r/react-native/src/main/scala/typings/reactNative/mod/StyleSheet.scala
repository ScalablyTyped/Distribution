package typings.reactNative.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.reactNativeNumbers.`0`
import typings.reactNative.reactNativeStrings.absolute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheet {
  
  @JSImport("react-native", "StyleSheet.absoluteFill")
  @js.native
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  
  @JSImport("react-native", "StyleSheet.absoluteFillObject")
  @js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  
  @JSImport("react-native", "StyleSheet.compose")
  @js.native
  def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  @JSImport("react-native", "StyleSheet.compose")
  @js.native
  def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = js.native
  @JSImport("react-native", "StyleSheet.compose")
  @js.native
  def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  @JSImport("react-native", "StyleSheet.compose")
  @js.native
  def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = js.native
  
  @JSImport("react-native", "StyleSheet.create")
  @js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
  @JSImport("react-native", "StyleSheet.create")
  @js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
  
  @JSImport("react-native", "StyleSheet.flatten")
  @js.native
  def flatten[T](): T = js.native
  @JSImport("react-native", "StyleSheet.flatten")
  @js.native
  def flatten[T](style: StyleProp[T]): T = js.native
  
  @JSImport("react-native", "StyleSheet.hairlineWidth")
  @js.native
  val hairlineWidth: Double = js.native
  
  @JSImport("react-native", "StyleSheet.setStyleAttributePreprocessor")
  @js.native
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
  
  @js.native
  trait AbsoluteFillStyle extends StObject {
    
    var bottom: `0` = js.native
    
    var left: `0` = js.native
    
    var position: absolute = js.native
    
    var right: `0` = js.native
    
    var top: `0` = js.native
  }
  object AbsoluteFillStyle {
    
    @scala.inline
    def apply(bottom: `0`, left: `0`, position: absolute, right: `0`, top: `0`): AbsoluteFillStyle = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteFillStyle]
    }
    
    @scala.inline
    implicit class AbsoluteFillStyleMutableBuilder[Self <: AbsoluteFillStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: `0`): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: `0`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: `0`): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: `0`): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedStyles[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle}
    */ typings.reactNative.reactNativeStrings.NamedStyles with TopLevel[js.Any]
}

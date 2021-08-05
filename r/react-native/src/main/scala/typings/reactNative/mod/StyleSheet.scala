package typings.reactNative.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.reactNativeNumbers.`0`
import typings.reactNative.reactNativeStrings.absolute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheet {
  
  @JSImport("react-native", "StyleSheet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "StyleSheet.absoluteFill")
  @js.native
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  
  @JSImport("react-native", "StyleSheet.absoluteFillObject")
  @js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  
  inline def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  
  inline def create[T /* <: NamedStyles[js.Any | T] */](styles: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def create[T /* <: NamedStyles[js.Any | T] */](styles: NamedStyles[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def flatten[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[T]
  inline def flatten[T](style: StyleProp[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(style.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("react-native", "StyleSheet.hairlineWidth")
  @js.native
  val hairlineWidth: Double = js.native
  
  inline def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttributePreprocessor")(property.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AbsoluteFillStyle extends StObject {
    
    var bottom: `0`
    
    var left: `0`
    
    var position: absolute
    
    var right: `0`
    
    var top: `0`
  }
  object AbsoluteFillStyle {
    
    inline def apply(): AbsoluteFillStyle = {
      val __obj = js.Dynamic.literal(bottom = 0, left = 0, position = "absolute", right = 0, top = 0)
      __obj.asInstanceOf[AbsoluteFillStyle]
    }
    
    extension [Self <: AbsoluteFillStyle](x: Self) {
      
      inline def setBottom(value: `0`): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: `0`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: `0`): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: `0`): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedStyles[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle}
    */ typings.reactNative.reactNativeStrings.NamedStyles & TopLevel[js.Any]
}

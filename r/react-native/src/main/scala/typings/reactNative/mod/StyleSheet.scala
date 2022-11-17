package typings.reactNative.mod

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
  
  inline def create[T /* <: NamedStyles[Any | T] */](styles: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def create[T /* <: NamedStyles[Any | T] */](styles: NamedStyles[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def flatten[T](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
  inline def flatten[T](style: StyleProp[T]): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(style.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
  
  @JSImport("react-native", "StyleSheet.hairlineWidth")
  @js.native
  val hairlineWidth: Double = js.native
  
  inline def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttributePreprocessor")(property.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AbsoluteFillStyle extends StObject {
    
    var bottom: 0
    
    var left: 0
    
    var position: "absolute"
    
    var right: 0
    
    var top: 0
  }
  object AbsoluteFillStyle {
    
    inline def apply(): AbsoluteFillStyle = {
      val __obj = js.Dynamic.literal(bottom = 0, left = 0, position = "absolute", right = 0, top = 0)
      __obj.asInstanceOf[AbsoluteFillStyle]
    }
    
    extension [Self <: AbsoluteFillStyle](x: Self) {
      
      inline def setBottom(value: 0): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: 0): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: "absolute"): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: 0): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: 0): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle}
    }}}
    */
  @js.native
  trait NamedStyles[T] extends StObject
}

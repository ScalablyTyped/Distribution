package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object REACT_NATIVE_VERSION {
    
    @JSImport("react-native-gesture-handler/lib/typescript/utils", "REACT_NATIVE_VERSION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/utils", "REACT_NATIVE_VERSION.major")
    @js.native
    def major: Double = js.native
    inline def major_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("major")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-gesture-handler/lib/typescript/utils", "REACT_NATIVE_VERSION.minor")
    @js.native
    def minor: Double = js.native
    inline def minor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minor")(x.asInstanceOf[js.Any])
  }
  
  inline def hasProperty(`object`: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFabric(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFabric")().asInstanceOf[Boolean]
  
  inline def isJestEnv(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJestEnv")().asInstanceOf[Boolean]
  
  inline def isRemoteDebuggingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRemoteDebuggingEnabled")().asInstanceOf[Boolean]
  
  inline def shouldUseCodegenNativeComponent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseCodegenNativeComponent")().asInstanceOf[Boolean]
  
  inline def tagMessage(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tagMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toArray[T](`object`: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](`object`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def withPrevAndCurrent[T, Transformed](array: js.Array[T], mapFn: withPrevAndCurrentMapFn[T, Transformed]): js.Array[Transformed] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPrevAndCurrent")(array.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transformed]]
  
  type withPrevAndCurrentMapFn[T, Transformed] = js.Function2[/* previous */ Transformed | Null, /* current */ T, Transformed]
}

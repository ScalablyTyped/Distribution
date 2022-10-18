package typings.reactNativeReanimated

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2JestUtilsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/jestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def advanceAnimationByFrame(count: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("advanceAnimationByFrame")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def advanceAnimationByTime(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("advanceAnimationByTime")().asInstanceOf[Unit]
  inline def advanceAnimationByTime(time: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("advanceAnimationByTime")(time.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAnimatedStyle(received: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatedStyle")(received.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def setUpTests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpTests")().asInstanceOf[Unit]
  inline def setUpTests(userConfig: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpTests")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withReanimatedTimer(animationTest: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withReanimatedTimer")(animationTest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R] extends StObject {
        
        def toHaveAnimatedStyle(style: js.Array[Record[String, Any]]): R = js.native
        def toHaveAnimatedStyle(style: Record[String, Any]): R = js.native
      }
    }
  }
}

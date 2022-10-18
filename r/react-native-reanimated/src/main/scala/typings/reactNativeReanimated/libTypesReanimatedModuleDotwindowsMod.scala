package typings.reactNativeReanimated

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimatedModuleDotwindowsMod {
  
  object default {
    
    @JSImport("react-native-reanimated/lib/types/ReanimatedModule.windows", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addListener(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[js.Promise[Unit]]
    
    inline def animateNextTransition(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("animateNextTransition")().asInstanceOf[js.Promise[Unit]]
    
    inline def attachEvent(_viewTag: Double, _eventName: String, _nodeID: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachEvent")(_viewTag.asInstanceOf[js.Any], _eventName.asInstanceOf[js.Any], _nodeID.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def configureProps(_nativeProps: js.Array[String], _uiProps: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureProps")(_nativeProps.asInstanceOf[js.Any], _uiProps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def createNode(_nodeID: Double, _config: Record[String, Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(_nodeID.asInstanceOf[js.Any], _config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def detachEvent(_viewTag: Double, _eventName: String, _nodeID: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("detachEvent")(_viewTag.asInstanceOf[js.Any], _eventName.asInstanceOf[js.Any], _nodeID.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def disconnectNodeFromView(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectNodeFromView")().asInstanceOf[js.Promise[Unit]]
    
    inline def disconnectNodes(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectNodes")().asInstanceOf[js.Promise[Unit]]
    
    inline def dropNode(_nodeID: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropNode")(_nodeID.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def removeAllListeners(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[js.Promise[Unit]]
    
    inline def removeListeners(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListeners")().asInstanceOf[js.Promise[Unit]]
  }
}

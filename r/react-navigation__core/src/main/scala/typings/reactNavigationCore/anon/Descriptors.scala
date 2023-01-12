package typings.reactNavigationCore.anon

import typings.react.mod.global.JSX.Element
import typings.reactNavigationCore.libTypescriptSrcTypesMod.Descriptor
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventConsumer
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventEmitter
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typings.reactNavigationCore.libTypescriptSrcTypesMod.PrivateValueStore
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationCore.reactNavigationCoreStrings.getParent
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptors[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] extends StObject {
  
  def NavigationContent(param0: Children): Element
  
  var descriptors: Record[
    String, 
    Descriptor[
      ScreenOptions, 
      (Omit[
        Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
        getParent
      ]) & GetParent[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
      RouteProp[ParamListBase, String]
    ]
  ]
  
  var navigation: CanGoBack & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers
  
  var state: State
}
object Descriptors {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](
    NavigationContent: Children => Element,
    descriptors: Record[
      String, 
      Descriptor[
        ScreenOptions, 
        (Omit[
          Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
          getParent
        ]) & GetParent[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
        RouteProp[ParamListBase, String]
      ]
    ],
    navigation: CanGoBack & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers,
    state: State
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = {
    val __obj = js.Dynamic.literal(NavigationContent = js.Any.fromFunction1(NavigationContent), descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descriptors[?, ?, ?, ?], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] (val x: Self & (Descriptors[State, EventMap, ActionHelpers, ScreenOptions])) extends AnyVal {
    
    inline def setDescriptors(
      value: Record[
          String, 
          Descriptor[
            ScreenOptions, 
            (Omit[
              Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
              getParent
            ]) & GetParent[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
            RouteProp[ParamListBase, String]
          ]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setNavigation(
      value: CanGoBack & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers
    ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationContent(value: Children => Element): Self = StObject.set(x, "NavigationContent", js.Any.fromFunction1(value))
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}

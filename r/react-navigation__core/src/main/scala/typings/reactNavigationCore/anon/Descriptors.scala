package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.reactNavigationCore.typesMod.EventEmitter
import typings.reactNavigationCore.typesMod.PrivateValueStore
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptors[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, js.Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] extends StObject {
  
  var descriptors: Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ]
  
  var navigation: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[js.Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Any]) & ActionHelpers
  
  var state: State
}
object Descriptors {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, js.Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](
    descriptors: Record[
      String, 
      Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
    ],
    navigation: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[js.Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Any]) & ActionHelpers,
    state: State
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  }
  
  @scala.inline
  implicit class DescriptorsMutableBuilder[Self <: Descriptors[?, ?, ?, ?], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, js.Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] (val x: Self & (Descriptors[State, EventMap, ActionHelpers, ScreenOptions])) extends AnyVal {
    
    @scala.inline
    def setDescriptors(
      value: Record[
          String, 
          Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(
      value: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[js.Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Any]) & ActionHelpers
    ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}

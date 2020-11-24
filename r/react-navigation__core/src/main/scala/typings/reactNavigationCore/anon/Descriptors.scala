package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.reactNavigationCore.typesMod.EventEmitter
import typings.reactNavigationCore.typesMod.PrivateValueStore
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptors[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] extends js.Object {
  
  var descriptors: Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ] = js.native
  
  var navigation: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers = js.native
  
  var state: State = js.native
}
object Descriptors {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](
    descriptors: Record[
      String, 
      Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
    ],
    navigation: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers,
    state: State
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  }
  
  @scala.inline
  implicit class DescriptorsOps[Self <: Descriptors[_, _, _, _], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] (val x: Self with (Descriptors[State, EventMap, ActionHelpers, ScreenOptions])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptors(
      value: Record[
          String, 
          Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
        ]
    ): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(
      value: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers
    ): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}

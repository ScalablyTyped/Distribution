package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpersCommon<ParamList, State>, 'getParent'> & {getParent <T = @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<@react-navigation/routers.@react-navigation/routers.ParamListBase, @react-navigation/core.@react-navigation/core/lib/typescript/src/types.Keyof<@react-navigation/routers.@react-navigation/routers.ParamListBase>, undefined, @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers.ParamListBase>, {}, {}> | undefined>(id : NavigatorID | undefined): T, setParams (params : ParamList[RouteName] extends undefined ? undefined : std.Partial<ParamList[RouteName]>): void, setOptions (options : std.Partial<ScreenOptions>): void} & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventConsumer<EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State>> & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.PrivateValueStore<[ParamList, RouteName, EventMap]> */
@js.native
trait NavigationProp[ParamList /* <: js.Object */, RouteName /* <: /* keyof ParamList */ String */, NavigatorID /* <: js.UndefOr[String] */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * UGLY HACK! DO NOT USE THE TYPE!!!
    *
    * TypeScript requires a type to be used to be able to infer it.
    * The type should exist as its own without any operations such as union.
    * So we need to figure out a way to store this type in a property.
    * The problem with a normal property is that it shows up in intelliSense.
    * Adding private keyword works, but the annotation is stripped away in declaration.
    * Turns out if we use an empty string, it doesn't show up in intelliSense.
    */
  @JSName("")
  var _empty: (js.UndefOr[js.Tuple3[ParamList, Any, Any]]) & (js.UndefOr[js.Tuple3[ParamList, RouteName, EventMap]]) = js.native
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Keyof[EventMap & EventMapCore[State]] */](`type`: EventName, callback: EventListenerCallback[EventMap & EventMapCore[State], EventName]): js.Function0[Unit] = js.native
  
  var canGoBack: js.Function0[Boolean] = js.native
  
  var dispatch: js.Function1[
    /* action */ NavigationAction | (js.Function1[/* state */ State, NavigationAction]), 
    Unit
  ] = js.native
  
  var getId: js.Function0[js.UndefOr[String]] = js.native
  
  /**
    * Returns the navigation prop from a parent navigator based on the ID.
    * If an ID is provided, the navigation prop from the parent navigator with matching ID (including current) will be returned.
    * If no ID is provided, the navigation prop from the immediate parent navigator will be returned.
    *
    * @param id Optional ID of a parent navigator.
    */
  def getParent[T](): T = js.native
  def getParent[T](id: NavigatorID): T = js.native
  
  var getState: js.Function0[State] = js.native
  
  var goBack: js.Function0[Unit] = js.native
  
  var isFocused: js.Function0[Boolean] = js.native
  
  var navigate: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof ParamList extends unknown ? undefined extends ParamList[keyof ParamList] ? [screen: keyof ParamList] | [screen: keyof ParamList, params: ParamList[keyof ParamList]] : [screen: keyof ParamList, params: ParamList[keyof ParamList]] : never */ /* args */ js.Any, 
    Unit
  ] = js.native
  
  def removeListener[EventName /* <: Keyof[EventMap & EventMapCore[State]] */](`type`: EventName, callback: EventListenerCallback[EventMap & EventMapCore[State], EventName]): Unit = js.native
  
  var reset: js.Function1[/* state */ PartialState[State] | State, Unit] = js.native
  
  /**
    * Update the options for the route.
    * The options object will be shallow merged with default options object.
    *
    * @param options Options object for the route.
    */
  def setOptions(options: Partial[ScreenOptions]): Unit = js.native
  
  /**
    * Update the param object for the route.
    * The new params will be shallow merged with the old one.
    *
    * @param params Params object for the current route.
    */
  def setParams(
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] extends undefined ? undefined : std.Partial<ParamList[RouteName]> */ js.Any
  ): Unit = js.native
}

package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddKeyedListener extends StObject {
  
  var addKeyedListener: js.UndefOr[typings.reactNavigationCore.navigationBuilderContextMod.AddKeyedListener] = js.native
  
  var addListener: js.UndefOr[typings.reactNavigationCore.navigationBuilderContextMod.AddListener] = js.native
  
  var onAction: js.UndefOr[
    js.Function2[
      /* action */ NavigationAction, 
      /* visitedNavigators */ js.UndefOr[Set[String]], 
      Boolean
    ]
  ] = js.native
  
  def onDispatchAction(action: NavigationAction, noop: Boolean): Unit = js.native
  
  def onOptionsChange(options: js.Object): Unit = js.native
  
  var onRouteFocus: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
}
object AddKeyedListener {
  
  @scala.inline
  def apply(onDispatchAction: (NavigationAction, Boolean) => Unit, onOptionsChange: js.Object => Unit): AddKeyedListener = {
    val __obj = js.Dynamic.literal(onDispatchAction = js.Any.fromFunction2(onDispatchAction), onOptionsChange = js.Any.fromFunction1(onOptionsChange))
    __obj.asInstanceOf[AddKeyedListener]
  }
  
  @scala.inline
  implicit class AddKeyedListenerMutableBuilder[Self <: AddKeyedListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddKeyedListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Unit
    ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddKeyedListenerUndefined: Self = StObject.set(x, "addKeyedListener", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Unit
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setOnAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
    
    @scala.inline
    def setOnDispatchAction(value: (NavigationAction, Boolean) => Unit): Self = StObject.set(x, "onDispatchAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnOptionsChange(value: js.Object => Unit): Self = StObject.set(x, "onOptionsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRouteFocus(value: /* key */ String => Unit): Self = StObject.set(x, "onRouteFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRouteFocusUndefined: Self = StObject.set(x, "onRouteFocus", js.undefined)
  }
}

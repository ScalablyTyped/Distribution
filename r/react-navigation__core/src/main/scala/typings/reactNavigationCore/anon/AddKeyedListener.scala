package typings.reactNavigationCore.anon

import typings.react.mod.MutableRefObject
import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddKeyedListener extends StObject {
  
  var addKeyedListener: js.UndefOr[
    typings.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddKeyedListener
  ] = js.undefined
  
  var addListener: js.UndefOr[
    typings.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddListener
  ] = js.undefined
  
  var onAction: js.UndefOr[
    js.Function2[
      /* action */ NavigationAction, 
      /* visitedNavigators */ js.UndefOr[Set[String]], 
      Boolean
    ]
  ] = js.undefined
  
  def onDispatchAction(action: NavigationAction, noop: Boolean): Unit
  
  def onOptionsChange(options: js.Object): Unit
  
  var onRouteFocus: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  
  var stackRef: js.UndefOr[MutableRefObject[js.UndefOr[String]]] = js.undefined
}
object AddKeyedListener {
  
  inline def apply(onDispatchAction: (NavigationAction, Boolean) => Unit, onOptionsChange: js.Object => Unit): AddKeyedListener = {
    val __obj = js.Dynamic.literal(onDispatchAction = js.Any.fromFunction2(onDispatchAction), onOptionsChange = js.Any.fromFunction1(onOptionsChange))
    __obj.asInstanceOf[AddKeyedListener]
  }
  
  extension [Self <: AddKeyedListener](x: Self) {
    
    inline def setAddKeyedListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Unit
    ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3(value))
    
    inline def setAddKeyedListenerUndefined: Self = StObject.set(x, "addKeyedListener", js.undefined)
    
    inline def setAddListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Unit
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setOnAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction2(value))
    
    inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
    
    inline def setOnDispatchAction(value: (NavigationAction, Boolean) => Unit): Self = StObject.set(x, "onDispatchAction", js.Any.fromFunction2(value))
    
    inline def setOnOptionsChange(value: js.Object => Unit): Self = StObject.set(x, "onOptionsChange", js.Any.fromFunction1(value))
    
    inline def setOnRouteFocus(value: /* key */ String => Unit): Self = StObject.set(x, "onRouteFocus", js.Any.fromFunction1(value))
    
    inline def setOnRouteFocusUndefined: Self = StObject.set(x, "onRouteFocus", js.undefined)
    
    inline def setStackRef(value: MutableRefObject[js.UndefOr[String]]): Self = StObject.set(x, "stackRef", value.asInstanceOf[js.Any])
    
    inline def setStackRefUndefined: Self = StObject.set(x, "stackRef", js.undefined)
  }
}

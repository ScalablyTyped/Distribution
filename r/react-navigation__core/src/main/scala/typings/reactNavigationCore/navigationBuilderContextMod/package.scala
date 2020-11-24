package typings.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object navigationBuilderContextMod {
  
  type AddKeyedListener = js.Function3[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ typings.reactNavigationCore.reactNavigationCoreStrings.getState | typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove, 
    /* key */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any, 
    scala.Unit
  ]
  
  type AddListener = js.Function2[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ typings.reactNavigationCore.reactNavigationCoreStrings.action | typings.reactNavigationCore.reactNavigationCoreStrings.focus, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any, 
    scala.Unit
  ]
  
  type ChildActionListener = js.Function2[
    /* action */ typings.reactNavigationRouters.typesMod.NavigationAction, 
    /* visitedNavigators */ js.UndefOr[typings.std.Set[java.lang.String]], 
    scala.Boolean
  ]
  
  type ChildBeforeRemoveListener = js.Function1[
    /* action */ typings.reactNavigationRouters.typesMod.NavigationAction, 
    scala.Boolean
  ]
  
  type FocusedNavigationCallback[T] = js.Function1[
    /* navigation */ typings.reactNavigationCore.typesMod.NavigationHelpers[typings.reactNavigationRouters.typesMod.ParamListBase, js.Object], 
    T
  ]
  
  type FocusedNavigationListener = js.Function1[
    /* callback */ typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationCallback[js.Any], 
    typings.reactNavigationCore.anon.Handled[js.Any]
  ]
  
  type GetStateListener = js.Function0[
    typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase]
  ]
}

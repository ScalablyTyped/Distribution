package typings.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  type NavigationDrawerScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[
    typings.reactNavigationDrawer.typesMod.NavigationDrawerScreenProps[Params, ScreenProps]
  ]) with (typings.reactNavigationDrawer.anon.NavigationOptions[Params, ScreenProps])
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typings.reactNavigation.mod.NavigationDescriptor[
      typings.reactNavigation.mod.NavigationParams, 
      typings.reactNavigationDrawer.typesMod.NavigationDrawerOptions, 
      typings.reactNavigationDrawer.typesMod.NavigationDrawerProp[
        typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
        js.Any
      ]
    ]
  ]
  type ThemedColor = java.lang.String | typings.reactNavigationDrawer.anon.Dark
}

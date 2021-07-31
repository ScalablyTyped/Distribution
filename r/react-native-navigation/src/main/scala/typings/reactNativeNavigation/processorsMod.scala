package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.layoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorsMod {
  
  type LayoutProcessor = js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
  
  type OptionsProcessor[T] = js.Function2[/* value */ T, /* commandName */ CommandName, T]
}

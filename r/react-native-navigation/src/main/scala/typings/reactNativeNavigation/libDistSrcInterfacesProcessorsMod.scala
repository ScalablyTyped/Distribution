package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName
import typings.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesProcessorsMod {
  
  type LayoutProcessor = js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
  
  type OptionsProcessor[T, S] = js.Function3[/* value */ T, /* commandName */ CommandName, /* props */ js.UndefOr[S], T]
}

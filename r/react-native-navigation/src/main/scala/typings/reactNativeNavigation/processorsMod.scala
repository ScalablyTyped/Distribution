package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/interfaces/Processors", JSImport.Namespace)
@js.native
object processorsMod extends js.Object {
  type LayoutProcessor = js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
  type OptionsProcessor[T] = js.Function2[/* value */ T, /* commandName */ CommandName, T]
}


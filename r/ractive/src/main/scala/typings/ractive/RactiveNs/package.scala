package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RactiveNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ractive.Anon_Args
  import typings.std.HTMLElement

  type AdaptorPlugin = js.Object
  type AdaptorPlugins = StringDictionary[AdaptorPlugin]
  type ComponentPlugin = Static
  type ComponentPlugins = StringDictionary[ComponentPlugin]
  type DecoratorPlugin = js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Anon_Args]
  type DecoratorPlugins = StringDictionary[DecoratorPlugin]
  type EventPlugin = js.Function
  type EventPlugins = StringDictionary[EventPlugin]
  type Promise = js.Object
  type TransitionPlugin = js.Function2[/* t */ Transition, /* params */ js.Object, Unit]
  type TransitionPlugins = StringDictionary[TransitionPlugin]
}

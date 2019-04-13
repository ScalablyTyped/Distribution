package typings
package ractiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RactiveNs {
  type AdaptorPlugin = js.Object
  type AdaptorPlugins = org.scalablytyped.runtime.StringDictionary[AdaptorPlugin]
  type ComponentPlugin = Static
  type ComponentPlugins = org.scalablytyped.runtime.StringDictionary[ComponentPlugin]
  type DecoratorPlugin = js.Function2[/* node */ stdLib.HTMLElement, /* repeated */ js.Any, ractiveLib.Anon_Args]
  type DecoratorPlugins = org.scalablytyped.runtime.StringDictionary[DecoratorPlugin]
  type EventPlugin = js.Function
  type EventPlugins = org.scalablytyped.runtime.StringDictionary[EventPlugin]
  type Promise = js.Object
  type TransitionPlugin = js.Function2[/* t */ Transition, /* params */ js.Object, scala.Unit]
  type TransitionPlugins = org.scalablytyped.runtime.StringDictionary[TransitionPlugin]
}

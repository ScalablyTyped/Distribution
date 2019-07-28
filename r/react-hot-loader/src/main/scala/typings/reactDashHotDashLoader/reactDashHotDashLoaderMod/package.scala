package typings.reactDashHotDashLoader

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHotDashLoaderMod {
  type ExtractProps[TComponent] = js.Object
  type ReactComponent[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
}

package typings.reactDashHotDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHotDashLoaderMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type ExtractProps[TComponent] = js.Object
  type ReactComponent[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
}

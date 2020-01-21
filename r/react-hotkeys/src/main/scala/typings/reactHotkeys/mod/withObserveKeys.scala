package typings.reactHotkeys.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hotkeys", "withObserveKeys")
@js.native
object withObserveKeys extends js.Object {
  def apply(Component: ComponentClass[js.Object, ComponentState], hotKeysIgnoreOptions: HotKeysOverrideProps): ObserveKeys = js.native
}


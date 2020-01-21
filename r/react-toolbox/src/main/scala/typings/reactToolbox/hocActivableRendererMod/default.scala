package typings.reactToolbox.hocActivableRendererMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/hoc/ActivableRenderer", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](): (js.Function1[/* target */ ComponentClass[P, ComponentState], ComponentClass[P, ComponentState]]) with (js.Function1[/* clazz */ StatelessComponent[P], StatelessComponent[P]]) = js.native
  def apply[P](options: ActivableRendererFactoryOptions): (js.Function1[/* target */ ComponentClass[P, ComponentState], ComponentClass[P, ComponentState]]) with (js.Function1[/* clazz */ StatelessComponent[P], StatelessComponent[P]]) = js.native
}


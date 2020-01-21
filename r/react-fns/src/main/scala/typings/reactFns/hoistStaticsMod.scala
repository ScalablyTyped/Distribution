package typings.reactFns

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
@js.native
object hoistStaticsMod extends js.Object {
  def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[_, ComponentState]
  ): ComponentClass[P, ComponentState] = js.native
  def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[_, ComponentState],
    blacklist: StringDictionary[Boolean]
  ): ComponentClass[P, ComponentState] = js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
}


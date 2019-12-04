package typings.reactDashFns

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
@js.native
object distHoistStaticsMod extends js.Object {
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


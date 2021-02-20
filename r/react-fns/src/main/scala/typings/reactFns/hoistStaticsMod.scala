package typings.reactFns

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoistStaticsMod {
  
  @JSImport("react-fns/dist/hoistStatics", "hoistNonReactStatics")
  @js.native
  def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[_, ComponentState]
  ): ComponentClass[P, ComponentState] = js.native
  @JSImport("react-fns/dist/hoistStatics", "hoistNonReactStatics")
  @js.native
  def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[_, ComponentState],
    blacklist: StringDictionary[Boolean]
  ): ComponentClass[P, ComponentState] = js.native
  
  @JSImport("react-fns/dist/hoistStatics", "isEmptyChildren")
  @js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
}

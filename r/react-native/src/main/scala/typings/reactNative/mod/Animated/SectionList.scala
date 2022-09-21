package typings.reactNative.mod.Animated

import typings.react.mod.Component
import typings.reactNative.mod.SectionListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Animated.SectionList")
@js.native
open class SectionList[ItemT, SectionT] protected ()
  extends Component[AnimatedProps[SectionListProps[ItemT, SectionT]], js.Object, Any] {
  def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: Any) = this()
}

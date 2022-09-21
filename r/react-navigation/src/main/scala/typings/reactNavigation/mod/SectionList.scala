package typings.reactNavigation.mod

import typings.reactNative.mod.SectionListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "SectionList")
@js.native
open class SectionList[ItemT, SectionT] protected ()
  extends typings.reactNative.mod.SectionList[ItemT, SectionT] {
  def this(props: SectionListProps[ItemT, SectionT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SectionListProps[ItemT, SectionT], context: Any) = this()
}

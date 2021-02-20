package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.AutoHeight
import typings.reactVirtualized.esListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "List")
@js.native
class List protected ()
  extends typings.reactVirtualized.esListMod.List {
  def this(props: ListProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ListProps, context: js.Any) = this()
}
/* static members */
object List {
  
  @JSImport("react-virtualized", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "List.defaultProps")
  @js.native
  def defaultProps: AutoHeight = js.native
  @scala.inline
  def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

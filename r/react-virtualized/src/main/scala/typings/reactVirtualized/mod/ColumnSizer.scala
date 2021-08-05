package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.Children
import typings.reactVirtualized.esColumnSizerMod.ColumnSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "ColumnSizer")
@js.native
class ColumnSizer protected ()
  extends typings.reactVirtualized.esColumnSizerMod.ColumnSizer {
  def this(props: ColumnSizerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ColumnSizerProps, context: js.Any) = this()
}
/* static members */
object ColumnSizer {
  
  @JSImport("react-virtualized", "ColumnSizer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "ColumnSizer.propTypes")
  @js.native
  def propTypes: Children = js.native
  inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}

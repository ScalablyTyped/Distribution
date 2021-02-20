package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.ClassName
import typings.reactVirtualized.anon.DisableHeader
import typings.reactVirtualized.esTableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "Table")
@js.native
class Table protected ()
  extends typings.reactVirtualized.esTableMod.Table {
  def this(props: TableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TableProps, context: js.Any) = this()
}
/* static members */
object Table {
  
  @JSImport("react-virtualized", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "Table.defaultProps")
  @js.native
  def defaultProps: DisableHeader = js.native
  @scala.inline
  def defaultProps_=(x: DisableHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized", "Table.propTypes")
  @js.native
  def propTypes: ClassName = js.native
  @scala.inline
  def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}

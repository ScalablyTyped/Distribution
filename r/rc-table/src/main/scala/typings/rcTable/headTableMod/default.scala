package typings.rcTable.headTableMod

import typings.propTypes.mod.Requireable
import typings.rcTable.AnonTable
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/HeadTable", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(props: HeadTableProps, hasTable: AnonTable): Element = js.native
  @js.native
  object contextTypes extends js.Object {
    var table: Requireable[_] = js.native
  }
  
}


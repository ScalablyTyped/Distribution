package typings.reactBootstrapTable2Paginator.anon

import typings.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typings.reactBootstrapTableNext.mod.BootstrapTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var paginationProps: PaginationChildProps
  var paginationTableProps: BootstrapTableProps[_]
}

object PaginationProps {
  @scala.inline
  def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[_]): PaginationProps = {
    val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}


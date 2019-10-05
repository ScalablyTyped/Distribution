package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDecoratorProps extends js.Object {
  var getLoadingProps: ComponentPropsGetter0
  var getNoDataProps: ComponentPropsGetter0
  var getPaginationProps: ComponentPropsGetter0
  var getProps: ComponentPropsGetterRC | ComponentPropsGetterC | ComponentPropsGetter0
  var getResizerProps: ComponentPropsGetter0
  var getTableProps: ComponentPropsGetter0
  var getTbodyProps: ComponentPropsGetter0
  var getTdProps: ComponentPropsGetterRC | ComponentPropsGetterR
  var getTfootProps: ComponentPropsGetter0
  var getTfootTdProps: ComponentPropsGetterC
  var getTfootTrProps: ComponentPropsGetter0
  var getTheadFilterProps: ComponentPropsGetter0
  var getTheadFilterThProps: ComponentPropsGetterC
  var getTheadFilterTrProps: ComponentPropsGetter0
  var getTheadGroupProps: ComponentPropsGetter0
  var getTheadGroupThProps: ComponentPropsGetterC
  var getTheadGroupTrProps: ComponentPropsGetter0
  var getTheadProps: ComponentPropsGetter0
  var getTheadThProps: ComponentPropsGetterC
  var getTheadTrProps: ComponentPropsGetter0
  var getTrGroupProps: ComponentPropsGetterR | ComponentPropsGetter0
  var getTrProps: ComponentPropsGetterR | ComponentPropsGetter0
}

object ComponentDecoratorProps {
  @scala.inline
  def apply(
    getLoadingProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getNoDataProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getPaginationProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[Column[js.Any]], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getResizerProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTableProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTbodyProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTdProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[Column[js.Any]], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootTdProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTrGroupProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[scala.Nothing], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTrProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[scala.Nothing], js.UndefOr[js.Any]) => js.UndefOr[js.Object]
  ): ComponentDecoratorProps = {
    val __obj = js.Dynamic.literal(getLoadingProps = js.Any.fromFunction4(getLoadingProps), getNoDataProps = js.Any.fromFunction4(getNoDataProps), getPaginationProps = js.Any.fromFunction4(getPaginationProps), getProps = js.Any.fromFunction4(getProps), getResizerProps = js.Any.fromFunction4(getResizerProps), getTableProps = js.Any.fromFunction4(getTableProps), getTbodyProps = js.Any.fromFunction4(getTbodyProps), getTdProps = js.Any.fromFunction4(getTdProps), getTfootProps = js.Any.fromFunction4(getTfootProps), getTfootTdProps = js.Any.fromFunction4(getTfootTdProps), getTfootTrProps = js.Any.fromFunction4(getTfootTrProps), getTheadFilterProps = js.Any.fromFunction4(getTheadFilterProps), getTheadFilterThProps = js.Any.fromFunction4(getTheadFilterThProps), getTheadFilterTrProps = js.Any.fromFunction4(getTheadFilterTrProps), getTheadGroupProps = js.Any.fromFunction4(getTheadGroupProps), getTheadGroupThProps = js.Any.fromFunction4(getTheadGroupThProps), getTheadGroupTrProps = js.Any.fromFunction4(getTheadGroupTrProps), getTheadProps = js.Any.fromFunction4(getTheadProps), getTheadThProps = js.Any.fromFunction4(getTheadThProps), getTheadTrProps = js.Any.fromFunction4(getTheadTrProps), getTrGroupProps = js.Any.fromFunction4(getTrGroupProps), getTrProps = js.Any.fromFunction4(getTrProps))
  
    __obj.asInstanceOf[ComponentDecoratorProps]
  }
}


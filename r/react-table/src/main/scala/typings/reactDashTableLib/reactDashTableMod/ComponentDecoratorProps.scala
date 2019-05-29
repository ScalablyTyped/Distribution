package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDecoratorProps[D] extends js.Object {
  var getLoadingProps: ComponentPropsGetter0
  var getNoDataProps: ComponentPropsGetter0
  /**
    * @TODO not exists in react-table but in the docs
    */
  // getTfootThProps: ComponentPropsGetter
  var getPaginationProps: ComponentPropsGetter0
  var getProps: ComponentPropsGetterRC[D] | ComponentPropsGetterC[D] | ComponentPropsGetter0
  var getResizerProps: ComponentPropsGetter0
  var getTableProps: ComponentPropsGetter0
  var getTbodyProps: ComponentPropsGetter0
  /**
    * @TODO not exists in react-table but in the docs
    */
  // getThProps: ComponentPropsGetter
  var getTdProps: ComponentPropsGetterRC[D] | ComponentPropsGetterR[D]
  var getTfootProps: ComponentPropsGetter0
  var getTfootTrProps: ComponentPropsGetter0
  var getTheadFilterProps: ComponentPropsGetter0
  var getTheadFilterThProps: ComponentPropsGetterC[D]
  var getTheadFilterTrProps: ComponentPropsGetter0
  var getTheadGroupProps: ComponentPropsGetter0
  var getTheadGroupThProps: ComponentPropsGetterC[D]
  var getTheadGroupTrProps: ComponentPropsGetter0
  var getTheadProps: ComponentPropsGetter0
  var getTheadThProps: ComponentPropsGetterC[D]
  var getTheadTrProps: ComponentPropsGetter0
  var getTrGroupProps: ComponentPropsGetterR[D] | ComponentPropsGetter0
  var getTrProps: ComponentPropsGetterR[D] | ComponentPropsGetter0
}

object ComponentDecoratorProps {
  @scala.inline
  def apply[D](
    getLoadingProps: ComponentPropsGetter0,
    getNoDataProps: ComponentPropsGetter0,
    getPaginationProps: ComponentPropsGetter0,
    getProps: ComponentPropsGetterRC[D] | ComponentPropsGetterC[D] | ComponentPropsGetter0,
    getResizerProps: ComponentPropsGetter0,
    getTableProps: ComponentPropsGetter0,
    getTbodyProps: ComponentPropsGetter0,
    getTdProps: ComponentPropsGetterRC[D] | ComponentPropsGetterR[D],
    getTfootProps: ComponentPropsGetter0,
    getTfootTrProps: ComponentPropsGetter0,
    getTheadFilterProps: ComponentPropsGetter0,
    getTheadFilterThProps: ComponentPropsGetterC[D],
    getTheadFilterTrProps: ComponentPropsGetter0,
    getTheadGroupProps: ComponentPropsGetter0,
    getTheadGroupThProps: ComponentPropsGetterC[D],
    getTheadGroupTrProps: ComponentPropsGetter0,
    getTheadProps: ComponentPropsGetter0,
    getTheadThProps: ComponentPropsGetterC[D],
    getTheadTrProps: ComponentPropsGetter0,
    getTrGroupProps: ComponentPropsGetterR[D] | ComponentPropsGetter0,
    getTrProps: ComponentPropsGetterR[D] | ComponentPropsGetter0
  ): ComponentDecoratorProps[D] = {
    val __obj = js.Dynamic.literal(getLoadingProps = getLoadingProps, getNoDataProps = getNoDataProps, getPaginationProps = getPaginationProps, getProps = getProps.asInstanceOf[js.Any], getResizerProps = getResizerProps, getTableProps = getTableProps, getTbodyProps = getTbodyProps, getTdProps = getTdProps.asInstanceOf[js.Any], getTfootProps = getTfootProps, getTfootTrProps = getTfootTrProps, getTheadFilterProps = getTheadFilterProps, getTheadFilterThProps = getTheadFilterThProps, getTheadFilterTrProps = getTheadFilterTrProps, getTheadGroupProps = getTheadGroupProps, getTheadGroupThProps = getTheadGroupThProps, getTheadGroupTrProps = getTheadGroupTrProps, getTheadProps = getTheadProps, getTheadThProps = getTheadThProps, getTheadTrProps = getTheadTrProps, getTrGroupProps = getTrGroupProps.asInstanceOf[js.Any], getTrProps = getTrProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentDecoratorProps[D]]
  }
}


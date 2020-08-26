package typings.reactMdUtils.useWidthMediaQueryMod

import typings.reactMdUtils.sizingConstantsMod.QuerySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactMdUtils.anon.Min
  - typings.reactMdUtils.anon.Max
  - typings.reactMdUtils.anon.MaxMin
*/
trait WidthMediaQuerys extends js.Object

object WidthMediaQuerys {
  @scala.inline
  def Min(min: QuerySize): WidthMediaQuerys = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthMediaQuerys]
  }
  @scala.inline
  def Max(max: QuerySize): WidthMediaQuerys = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthMediaQuerys]
  }
  @scala.inline
  def MaxMin(max: QuerySize, min: QuerySize): WidthMediaQuerys = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthMediaQuerys]
  }
}


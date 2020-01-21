package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeaderProps[Data] extends js.Object {
  var headerData: js.UndefOr[Data] = js.native
  var height: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[Unit] = js.native
  def children(): ReactNode = js.native
  def children(props: CustomHeaderPropsChildrenFnProps[Data]): ReactNode = js.native
}


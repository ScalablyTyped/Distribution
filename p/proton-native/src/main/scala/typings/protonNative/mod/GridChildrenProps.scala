package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridChildrenProps extends js.Object {
  /**
    * Whether the component is aligned with the other components in the column/row.
    */
  var align: js.UndefOr[H] = js.native
  /**
    * What column the component resides in.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Whether the component can expand in the direction.
    */
  var expand: js.UndefOr[H] = js.native
  /**
    * What row the component resides in.
    */
  var row: js.UndefOr[Double] = js.native
  /**
    * How many rows/columns the component takes off.
    */
  var span: js.UndefOr[X] = js.native
}

object GridChildrenProps {
  @scala.inline
  def apply(): GridChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridChildrenProps]
  }
  @scala.inline
  implicit class GridChildrenPropsOps[Self <: GridChildrenProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: H): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setExpand(value: H): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setSpan(value: X): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}


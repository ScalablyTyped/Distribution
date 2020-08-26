package typings.reactMdTable.tableMod

import typings.react.mod.TableHTMLAttributes
import typings.reactMdTable.configMod.TableConfiguration
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps
  extends TableHTMLAttributes[HTMLTableElement]
     with TableConfiguration

object TableProps {
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
}


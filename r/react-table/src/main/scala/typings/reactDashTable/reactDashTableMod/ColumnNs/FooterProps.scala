package typings.reactDashTable.reactDashTableMod.ColumnNs

import typings.reactDashTable.reactDashTableMod.ReactTableFunction
import typings.reactDashTable.reactDashTableMod.TableCellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns footer section */
trait FooterProps extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Footer Name'
    * @example ({data, column}) => <div>Footer Name</div>,
    */
  var Footer: TableCellRenderer
  /**
    * Default: string
    * Set the classname of the `td` element of the column's footer
    */
  var footerClassName: String
  /**
    * Default: {}
    * Set the style of the `td` element of the column's footer
    */
  var footerStyle: js.Object
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  var getFooterProps: ReactTableFunction
}

object FooterProps {
  @scala.inline
  def apply(
    Footer: TableCellRenderer,
    footerClassName: String,
    footerStyle: js.Object,
    getFooterProps: ReactTableFunction
  ): FooterProps = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any], footerClassName = footerClassName, footerStyle = footerStyle, getFooterProps = getFooterProps)
  
    __obj.asInstanceOf[FooterProps]
  }
}


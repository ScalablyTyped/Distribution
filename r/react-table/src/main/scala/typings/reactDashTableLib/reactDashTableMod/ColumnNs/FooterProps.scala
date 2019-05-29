package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns footer section */
trait FooterProps[D] extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Footer Name'
    * @example ({data, column}) => <div>Footer Name</div>,
    */
  var Footer: reactDashTableLib.reactDashTableMod.TableCellRenderer[D]
  /**
    * Default: string
    * Set the classname of the `td` element of the column's footer
    */
  var footerClassName: java.lang.String
  /**
    * Default: {}
    * Set the style of the `td` element of the column's footer
    */
  var footerStyle: js.Object
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  var getFooterProps: reactDashTableLib.reactDashTableMod.ReactTableFunction
}

object FooterProps {
  @scala.inline
  def apply[D](
    Footer: reactDashTableLib.reactDashTableMod.TableCellRenderer[D],
    footerClassName: java.lang.String,
    footerStyle: js.Object,
    getFooterProps: reactDashTableLib.reactDashTableMod.ReactTableFunction
  ): FooterProps[D] = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any], footerClassName = footerClassName, footerStyle = footerStyle, getFooterProps = getFooterProps)
  
    __obj.asInstanceOf[FooterProps[D]]
  }
}


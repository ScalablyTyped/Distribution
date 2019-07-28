package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  /** Default: 'Loading...' */
  var loadingText: ReactNode
  /** Default: 'Next' */
  var nextText: ReactNode
  /** Default: 'No rows found' */
  var noDataText: ReactNode | ComponentType[js.Object]
  /** Default: 'of' */
  var ofText: ReactNode
  /** Default: 'Page' */
  var pageText: ReactNode
  /** Default: 'Previous' */
  var previousText: ReactNode
  /** Default: 'rows' */
  var rowsText: String
}

object TextProps {
  @scala.inline
  def apply(
    loadingText: ReactNode,
    nextText: ReactNode,
    noDataText: ReactNode | ComponentType[js.Object],
    ofText: ReactNode,
    pageText: ReactNode,
    previousText: ReactNode,
    rowsText: String
  ): TextProps = {
    val __obj = js.Dynamic.literal(loadingText = loadingText.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], pageText = pageText.asInstanceOf[js.Any], previousText = previousText.asInstanceOf[js.Any], rowsText = rowsText)
  
    __obj.asInstanceOf[TextProps]
  }
}


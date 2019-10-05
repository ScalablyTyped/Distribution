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
    rowsText: String,
    loadingText: ReactNode = null,
    nextText: ReactNode = null,
    noDataText: ReactNode | ComponentType[js.Object] = null,
    ofText: ReactNode = null,
    pageText: ReactNode = null,
    previousText: ReactNode = null
  ): TextProps = {
    val __obj = js.Dynamic.literal(rowsText = rowsText)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (ofText != null) __obj.updateDynamic("ofText")(ofText.asInstanceOf[js.Any])
    if (pageText != null) __obj.updateDynamic("pageText")(pageText.asInstanceOf[js.Any])
    if (previousText != null) __obj.updateDynamic("previousText")(previousText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}


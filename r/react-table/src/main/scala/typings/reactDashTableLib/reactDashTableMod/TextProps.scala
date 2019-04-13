package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  /** Default: 'Loading...' */
  var loadingText: reactLib.reactMod.ReactNode
  /** Default: 'Next' */
  var nextText: reactLib.reactMod.ReactNode
  /** Default: 'No rows found' */
  var noDataText: reactLib.reactMod.ReactNode | reactLib.reactMod.ComponentType[js.Object]
  /** Default: 'of' */
  var ofText: reactLib.reactMod.ReactNode
  /** Default: 'Page' */
  var pageText: reactLib.reactMod.ReactNode
  /** Default: 'Previous' */
  var previousText: reactLib.reactMod.ReactNode
  /** Default: 'rows' */
  var rowsText: java.lang.String
}

object TextProps {
  @scala.inline
  def apply(
    loadingText: reactLib.reactMod.ReactNode,
    nextText: reactLib.reactMod.ReactNode,
    noDataText: reactLib.reactMod.ReactNode | reactLib.reactMod.ComponentType[js.Object],
    ofText: reactLib.reactMod.ReactNode,
    pageText: reactLib.reactMod.ReactNode,
    previousText: reactLib.reactMod.ReactNode,
    rowsText: java.lang.String
  ): TextProps = {
    val __obj = js.Dynamic.literal(loadingText = loadingText.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], pageText = pageText.asInstanceOf[js.Any], previousText = previousText.asInstanceOf[js.Any], rowsText = rowsText)
  
    __obj.asInstanceOf[TextProps]
  }
}


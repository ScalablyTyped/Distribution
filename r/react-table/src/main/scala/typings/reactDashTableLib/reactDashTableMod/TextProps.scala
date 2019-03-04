package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  /** Default: 'Loading...' */
  var loadingText: reactLib.reactMod.ReactNs.ReactNode
  /** Default: 'Next' */
  var nextText: reactLib.reactMod.ReactNs.ReactNode
  /** Default: 'No rows found' */
  var noDataText: reactLib.reactMod.ReactNs.ReactNode | reactLib.reactMod.ReactNs.ComponentType[js.Object]
  /** Default: 'of' */
  var ofText: reactLib.reactMod.ReactNs.ReactNode
  /** Default: 'Page' */
  var pageText: reactLib.reactMod.ReactNs.ReactNode
  /** Default: 'Previous' */
  var previousText: reactLib.reactMod.ReactNs.ReactNode
  /** Default: 'rows' */
  var rowsText: java.lang.String
}

object TextProps {
  @scala.inline
  def apply(
    loadingText: reactLib.reactMod.ReactNs.ReactNode,
    nextText: reactLib.reactMod.ReactNs.ReactNode,
    noDataText: reactLib.reactMod.ReactNs.ReactNode | reactLib.reactMod.ReactNs.ComponentType[js.Object],
    ofText: reactLib.reactMod.ReactNs.ReactNode,
    pageText: reactLib.reactMod.ReactNs.ReactNode,
    previousText: reactLib.reactMod.ReactNs.ReactNode,
    rowsText: java.lang.String
  ): TextProps = {
    val __obj = js.Dynamic.literal(loadingText = loadingText.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], pageText = pageText.asInstanceOf[js.Any], previousText = previousText.asInstanceOf[js.Any], rowsText = rowsText)
  
    __obj.asInstanceOf[TextProps]
  }
}


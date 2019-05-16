package typings
package reactDashPdfLib.distOutlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Outline'
    */
  var className: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ reactDashPdfLib.Anon_PageNumber, scala.Unit]] = js.undefined
  /**
    * Function called in case of an error while retrieving the outline.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  /**
    * Function called when the outline is successfully retrieved.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ js.Any, scala.Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] = null,
    onItemClick: /* hasPageNumber */ reactDashPdfLib.Anon_PageNumber => scala.Unit = null,
    onLoadError: /* error */ stdLib.Error => scala.Unit = null,
    onLoadSuccess: /* pdf */ js.Any => scala.Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    __obj.asInstanceOf[Props]
  }
}


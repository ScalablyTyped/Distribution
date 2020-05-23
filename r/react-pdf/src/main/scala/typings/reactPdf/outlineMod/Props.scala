package typings.reactPdf.outlineMod

import typings.pdfjsDist.mod.PDFTreeNode
import typings.reactPdf.anon.PageNumber
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Outline'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ PageNumber, Unit]] = js.undefined
  /**
    * Function called in case of an error while retrieving the outline.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when the outline is successfully retrieved.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* outline */ js.Array[PDFTreeNode], Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String | js.Array[String] = null,
    onItemClick: /* hasPageNumber */ PageNumber => Unit = null,
    onLoadError: /* error */ Error => Unit = null,
    onLoadSuccess: /* outline */ js.Array[PDFTreeNode] => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    __obj.asInstanceOf[Props]
  }
}


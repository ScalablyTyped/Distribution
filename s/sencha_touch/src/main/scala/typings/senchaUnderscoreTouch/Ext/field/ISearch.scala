package typings.senchaUnderscoreTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearch extends IText

object ISearch {
  @scala.inline
  def apply(IText: IText = null): ISearch = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[ISearch]
  }
}


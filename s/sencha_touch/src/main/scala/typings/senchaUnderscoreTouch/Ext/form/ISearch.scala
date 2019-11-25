package typings.senchaUnderscoreTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearch
  extends typings.senchaUnderscoreTouch.Ext.field.IText

object ISearch {
  @scala.inline
  def apply(IText: typings.senchaUnderscoreTouch.Ext.field.IText = null): ISearch = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[ISearch]
  }
}


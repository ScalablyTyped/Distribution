package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearch
  extends typings.senchaTouch.Ext.field.IText

object ISearch {
  @scala.inline
  def apply(IText: typings.senchaTouch.Ext.field.IText = null): ISearch = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[ISearch]
  }
}


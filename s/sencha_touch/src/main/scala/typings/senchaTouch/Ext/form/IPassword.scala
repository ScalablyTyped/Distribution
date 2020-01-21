package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPassword
  extends typings.senchaTouch.Ext.field.IText

object IPassword {
  @scala.inline
  def apply(IText: typings.senchaTouch.Ext.field.IText = null): IPassword = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[IPassword]
  }
}


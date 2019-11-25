package typings.senchaUnderscoreTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPassword
  extends typings.senchaUnderscoreTouch.Ext.field.IText

object IPassword {
  @scala.inline
  def apply(IText: typings.senchaUnderscoreTouch.Ext.field.IText = null): IPassword = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[IPassword]
  }
}


package typings.senchaUnderscoreTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmail extends IText

object IEmail {
  @scala.inline
  def apply(IText: IText = null): IEmail = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    __obj.asInstanceOf[IEmail]
  }
}


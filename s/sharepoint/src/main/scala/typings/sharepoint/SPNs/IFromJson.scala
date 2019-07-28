package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IFromJson extends js.Object {
  def customFromJson(initValue: js.Any): Boolean
  def fromJson(initValue: js.Any): Unit
}

object IFromJson {
  @scala.inline
  def apply(customFromJson: js.Any => Boolean, fromJson: js.Any => Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
  
    __obj.asInstanceOf[IFromJson]
  }
}


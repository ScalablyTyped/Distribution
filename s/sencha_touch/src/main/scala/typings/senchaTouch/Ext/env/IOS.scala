package typings.senchaTouch.Ext.env

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOS extends IBase {
  /** [Method] A hybrid property can be either accessed as a method call i e  if Ext os is Android
    * @param value String The OS name to check.
    * @returns Boolean
    */
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Boolean]] = js.native
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.native
}

object IOS {
  @scala.inline
  def apply(): IOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOS]
  }
  @scala.inline
  implicit class IOSOps[Self <: IOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIs(value: /* value */ js.UndefOr[String] => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: IVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


package typings.senchaTouch.Ext.device.storage

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of databaseDisplayName
    * @returns String
    */
  var getDatabaseDisplayName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of databaseName
    * @returns String
    */
  var getDatabaseName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of databaseSize
    * @returns Object
    */
  var getDatabaseSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of databaseVersion
    * @returns String
    */
  var getDatabaseVersion: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of databaseDisplayName
    * @param databaseDisplayName String The new value.
    */
  var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of databaseName
    * @param databaseName String The new value.
    */
  var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of databaseSize
    * @param databaseSize Object The new value.
    */
  var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of databaseVersion
    * @param databaseVersion String The new value.
    */
  var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[String], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetDatabaseDisplayName(value: () => String): Self = this.set("getDatabaseDisplayName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDatabaseDisplayName: Self = this.set("getDatabaseDisplayName", js.undefined)
    @scala.inline
    def setGetDatabaseName(value: () => String): Self = this.set("getDatabaseName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDatabaseName: Self = this.set("getDatabaseName", js.undefined)
    @scala.inline
    def setGetDatabaseSize(value: () => _): Self = this.set("getDatabaseSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDatabaseSize: Self = this.set("getDatabaseSize", js.undefined)
    @scala.inline
    def setGetDatabaseVersion(value: () => String): Self = this.set("getDatabaseVersion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDatabaseVersion: Self = this.set("getDatabaseVersion", js.undefined)
    @scala.inline
    def setSetDatabaseDisplayName(value: /* databaseDisplayName */ js.UndefOr[String] => Unit): Self = this.set("setDatabaseDisplayName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDatabaseDisplayName: Self = this.set("setDatabaseDisplayName", js.undefined)
    @scala.inline
    def setSetDatabaseName(value: /* databaseName */ js.UndefOr[String] => Unit): Self = this.set("setDatabaseName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDatabaseName: Self = this.set("setDatabaseName", js.undefined)
    @scala.inline
    def setSetDatabaseSize(value: /* databaseSize */ js.UndefOr[js.Any] => Unit): Self = this.set("setDatabaseSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDatabaseSize: Self = this.set("setDatabaseSize", js.undefined)
    @scala.inline
    def setSetDatabaseVersion(value: /* databaseVersion */ js.UndefOr[String] => Unit): Self = this.set("setDatabaseVersion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDatabaseVersion: Self = this.set("setDatabaseVersion", js.undefined)
  }
  
}


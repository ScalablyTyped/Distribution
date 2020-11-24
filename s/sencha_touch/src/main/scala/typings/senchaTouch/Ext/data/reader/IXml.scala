package typings.senchaTouch.Ext.data.reader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXml extends IReader {
  
  /** [Method] Normalizes the data object
    * @param data Object The raw data object.
    * @returns Object Returns the documentElement property of the data object if present, or the same object if not.
    */
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
}
object IXml {
  
  @scala.inline
  def apply(): IXml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXml]
  }
  
  @scala.inline
  implicit class IXmlOps[Self <: IXml] (val x: Self) extends AnyVal {
    
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
    def setGetData(value: /* data */ js.UndefOr[js.Any] => _): Self = this.set("getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetRecord(value: () => String): Self = this.set("getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = this.set("setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
  }
}

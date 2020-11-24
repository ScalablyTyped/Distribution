package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IField extends IBase {
  
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of allowNull
    * @returns Boolean
    */
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String
    */
  var getBubbleEvents: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of convert
    * @returns Function
    */
  var getConvert: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of decode
    * @returns Object
    */
  var getDecode: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of defaultValue
    * @returns Object
    */
  var getDefaultValue: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of encode
    * @returns Object
    */
  var getEncode: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of mapping
    * @returns String/Number
    */
  var getMapping: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of persist
    * @returns Boolean
    */
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of sortDir
    * @returns String
    */
  var getSortDir: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of sortType
    * @returns Function
    */
  var getSortType: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of type
    * @returns String/Object
    */
  var getType: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of allowNull
    * @param allowNull Boolean The new value.
    */
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String The new value.
    */
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of convert
    * @param convert Function The new value.
    */
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of decode
    * @param decode Object The new value.
    */
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Object The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of encode
    * @param encode Object The new value.
    */
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of mapping
    * @param mapping String/Number The new value.
    */
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of persist
    * @param persist Boolean The new value.
    */
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of sortDir
    * @param sortDir String The new value.
    */
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of sortType
    * @param sortType Function The new value.
    */
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of type
    * @param type String/Object The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.native
  
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.native
}
object IField {
  
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    
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
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
    
    @scala.inline
    def setConvert(value: js.Any): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGetAllowNull(value: () => Boolean): Self = this.set("getAllowNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllowNull: Self = this.set("getAllowNull", js.undefined)
    
    @scala.inline
    def setGetBubbleEvents(value: () => String): Self = this.set("getBubbleEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBubbleEvents: Self = this.set("getBubbleEvents", js.undefined)
    
    @scala.inline
    def setGetConvert(value: () => _): Self = this.set("getConvert", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetConvert: Self = this.set("getConvert", js.undefined)
    
    @scala.inline
    def setGetDateFormat(value: () => String): Self = this.set("getDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDateFormat: Self = this.set("getDateFormat", js.undefined)
    
    @scala.inline
    def setGetDecode(value: () => _): Self = this.set("getDecode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDecode: Self = this.set("getDecode", js.undefined)
    
    @scala.inline
    def setGetDefaultValue(value: () => _): Self = this.set("getDefaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultValue: Self = this.set("getDefaultValue", js.undefined)
    
    @scala.inline
    def setGetEncode(value: () => _): Self = this.set("getEncode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEncode: Self = this.set("getEncode", js.undefined)
    
    @scala.inline
    def setGetMapping(value: () => _): Self = this.set("getMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMapping: Self = this.set("getMapping", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetPersist(value: () => Boolean): Self = this.set("getPersist", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPersist: Self = this.set("getPersist", js.undefined)
    
    @scala.inline
    def setGetSortDir(value: () => String): Self = this.set("getSortDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSortDir: Self = this.set("getSortDir", js.undefined)
    
    @scala.inline
    def setGetSortType(value: () => _): Self = this.set("getSortType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSortType: Self = this.set("getSortType", js.undefined)
    
    @scala.inline
    def setGetType(value: () => _): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetType: Self = this.set("getType", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Any): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setSetAllowNull(value: /* allowNull */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAllowNull: Self = this.set("setAllowNull", js.undefined)
    
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[String] => Unit): Self = this.set("setBubbleEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBubbleEvents: Self = this.set("setBubbleEvents", js.undefined)
    
    @scala.inline
    def setSetConvert(value: /* convert */ js.UndefOr[js.Any] => Unit): Self = this.set("setConvert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetConvert: Self = this.set("setConvert", js.undefined)
    
    @scala.inline
    def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = this.set("setDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDateFormat: Self = this.set("setDateFormat", js.undefined)
    
    @scala.inline
    def setSetDecode(value: /* decode */ js.UndefOr[js.Any] => Unit): Self = this.set("setDecode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDecode: Self = this.set("setDecode", js.undefined)
    
    @scala.inline
    def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaultValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultValue: Self = this.set("setDefaultValue", js.undefined)
    
    @scala.inline
    def setSetEncode(value: /* encode */ js.UndefOr[js.Any] => Unit): Self = this.set("setEncode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEncode: Self = this.set("setEncode", js.undefined)
    
    @scala.inline
    def setSetMapping(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = this.set("setMapping", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMapping: Self = this.set("setMapping", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setSetPersist(value: /* persist */ js.UndefOr[Boolean] => Unit): Self = this.set("setPersist", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPersist: Self = this.set("setPersist", js.undefined)
    
    @scala.inline
    def setSetSortDir(value: /* sortDir */ js.UndefOr[String] => Unit): Self = this.set("setSortDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSortDir: Self = this.set("setSortDir", js.undefined)
    
    @scala.inline
    def setSetSortType(value: /* sortType */ js.UndefOr[js.Any] => Unit): Self = this.set("setSortType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSortType: Self = this.set("setSortType", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[js.Any] => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetType: Self = this.set("setType", js.undefined)
    
    @scala.inline
    def setSortDir(value: String): Self = this.set("sortDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDir: Self = this.set("sortDir", js.undefined)
    
    @scala.inline
    def setSortType(value: js.Any): Self = this.set("sortType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortType: Self = this.set("sortType", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseNull(value: Boolean): Self = this.set("useNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNull: Self = this.set("useNull", js.undefined)
  }
}

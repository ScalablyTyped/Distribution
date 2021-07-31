package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of allowNull
    * @returns Boolean
    */
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String
    */
  var getBubbleEvents: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of convert
    * @returns Function
    */
  var getConvert: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of decode
    * @returns Object
    */
  var getDecode: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of defaultValue
    * @returns Object
    */
  var getDefaultValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of encode
    * @returns Object
    */
  var getEncode: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of mapping
    * @returns String/Number
    */
  var getMapping: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of persist
    * @returns Boolean
    */
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of sortDir
    * @returns String
    */
  var getSortDir: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of sortType
    * @returns Function
    */
  var getSortType: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of type
    * @returns String/Object
    */
  var getType: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the value of allowNull
    * @param allowNull Boolean The new value.
    */
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String The new value.
    */
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of convert
    * @param convert Function The new value.
    */
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of decode
    * @param decode Object The new value.
    */
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Object The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of encode
    * @param encode Object The new value.
    */
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of mapping
    * @param mapping String/Number The new value.
    */
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of persist
    * @param persist Boolean The new value.
    */
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortDir
    * @param sortDir String The new value.
    */
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortType
    * @param sortType Function The new value.
    */
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of type
    * @param type String/Object The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}
object IField {
  
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    @scala.inline
    def setConvert(value: js.Any): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setGetAllowNull(value: () => Boolean): Self = StObject.set(x, "getAllowNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowNullUndefined: Self = StObject.set(x, "getAllowNull", js.undefined)
    
    @scala.inline
    def setGetBubbleEvents(value: () => String): Self = StObject.set(x, "getBubbleEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
    
    @scala.inline
    def setGetConvert(value: () => js.Any): Self = StObject.set(x, "getConvert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConvertUndefined: Self = StObject.set(x, "getConvert", js.undefined)
    
    @scala.inline
    def setGetDateFormat(value: () => String): Self = StObject.set(x, "getDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
    
    @scala.inline
    def setGetDecode(value: () => js.Any): Self = StObject.set(x, "getDecode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDecodeUndefined: Self = StObject.set(x, "getDecode", js.undefined)
    
    @scala.inline
    def setGetDefaultValue(value: () => js.Any): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultValueUndefined: Self = StObject.set(x, "getDefaultValue", js.undefined)
    
    @scala.inline
    def setGetEncode(value: () => js.Any): Self = StObject.set(x, "getEncode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncodeUndefined: Self = StObject.set(x, "getEncode", js.undefined)
    
    @scala.inline
    def setGetMapping(value: () => js.Any): Self = StObject.set(x, "getMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMappingUndefined: Self = StObject.set(x, "getMapping", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    @scala.inline
    def setGetPersist(value: () => Boolean): Self = StObject.set(x, "getPersist", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPersistUndefined: Self = StObject.set(x, "getPersist", js.undefined)
    
    @scala.inline
    def setGetSortDir(value: () => String): Self = StObject.set(x, "getSortDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortDirUndefined: Self = StObject.set(x, "getSortDir", js.undefined)
    
    @scala.inline
    def setGetSortType(value: () => js.Any): Self = StObject.set(x, "getSortType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortTypeUndefined: Self = StObject.set(x, "getSortType", js.undefined)
    
    @scala.inline
    def setGetType(value: () => js.Any): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setSetAllowNull(value: /* allowNull */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowNullUndefined: Self = StObject.set(x, "setAllowNull", js.undefined)
    
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
    
    @scala.inline
    def setSetConvert(value: /* convert */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setConvert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetConvertUndefined: Self = StObject.set(x, "setConvert", js.undefined)
    
    @scala.inline
    def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
    
    @scala.inline
    def setSetDecode(value: /* decode */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDecode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDecodeUndefined: Self = StObject.set(x, "setDecode", js.undefined)
    
    @scala.inline
    def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaultValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultValueUndefined: Self = StObject.set(x, "setDefaultValue", js.undefined)
    
    @scala.inline
    def setSetEncode(value: /* encode */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEncode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEncodeUndefined: Self = StObject.set(x, "setEncode", js.undefined)
    
    @scala.inline
    def setSetMapping(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMapping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMappingUndefined: Self = StObject.set(x, "setMapping", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    @scala.inline
    def setSetPersist(value: /* persist */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPersist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPersistUndefined: Self = StObject.set(x, "setPersist", js.undefined)
    
    @scala.inline
    def setSetSortDir(value: /* sortDir */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortDirUndefined: Self = StObject.set(x, "setSortDir", js.undefined)
    
    @scala.inline
    def setSetSortType(value: /* sortType */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSortType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortTypeUndefined: Self = StObject.set(x, "setSortType", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    @scala.inline
    def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
    
    @scala.inline
    def setSortType(value: js.Any): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseNull(value: Boolean): Self = StObject.set(x, "useNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNullUndefined: Self = StObject.set(x, "useNull", js.undefined)
  }
}

package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssociation extends IBase {
  
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of associatedModel
    * @returns String
    */
  var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of associatedName
    * @returns String
    */
  var getAssociatedName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of associationKey
    * @returns String
    */
  var getAssociationKey: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of name
    * @returns Object
    */
  var getName: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of ownerModel
    * @returns Ext.data.Model/String
    */
  var getOwnerModel: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of ownerName
    * @returns String
    */
  var getOwnerName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of primaryKey
    * @returns String
    */
  var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of reader
    * @returns Ext.data.reader.Reader
    */
  var getReader: js.UndefOr[js.Function0[typings.senchaTouch.Ext.data.reader.IReader]] = js.native
  
  /** [Method] Returns the value of type
    * @returns String
    */
  var getType: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] = js.native
  
  /** [Method] Sets the value of associatedModel
    * @param associatedModel String The new value.
    */
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of associatedName
    * @param associatedName String The new value.
    */
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of associationKey
    * @param associationKey String The new value.
    */
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of ownerModel
    * @param ownerModel Ext.data.Model/String The new value.
    */
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of ownerName
    * @param ownerName String The new value.
    */
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of primaryKey
    * @param primaryKey String The new value.
    */
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of reader
    * @param reader Ext.data.reader.Reader The new value.
    */
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader], Unit]
  ] = js.native
  
  /** [Method] Sets the value of type
    * @param type String The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}
object IAssociation {
  
  @scala.inline
  def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  
  @scala.inline
  implicit class IAssociationMutableBuilder[Self <: IAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedModel(value: String): Self = StObject.set(x, "associatedModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedModelUndefined: Self = StObject.set(x, "associatedModel", js.undefined)
    
    @scala.inline
    def setAssociatedName(value: String): Self = StObject.set(x, "associatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedNameUndefined: Self = StObject.set(x, "associatedName", js.undefined)
    
    @scala.inline
    def setAssociationKey(value: String): Self = StObject.set(x, "associationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationKeyUndefined: Self = StObject.set(x, "associationKey", js.undefined)
    
    @scala.inline
    def setGetAssociatedModel(value: () => String): Self = StObject.set(x, "getAssociatedModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociatedModelUndefined: Self = StObject.set(x, "getAssociatedModel", js.undefined)
    
    @scala.inline
    def setGetAssociatedName(value: () => String): Self = StObject.set(x, "getAssociatedName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociatedNameUndefined: Self = StObject.set(x, "getAssociatedName", js.undefined)
    
    @scala.inline
    def setGetAssociationKey(value: () => String): Self = StObject.set(x, "getAssociationKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociationKeyUndefined: Self = StObject.set(x, "getAssociationKey", js.undefined)
    
    @scala.inline
    def setGetName(value: () => _): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    @scala.inline
    def setGetOwnerModel(value: () => _): Self = StObject.set(x, "getOwnerModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerModelUndefined: Self = StObject.set(x, "getOwnerModel", js.undefined)
    
    @scala.inline
    def setGetOwnerName(value: () => String): Self = StObject.set(x, "getOwnerName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerNameUndefined: Self = StObject.set(x, "getOwnerName", js.undefined)
    
    @scala.inline
    def setGetPrimaryKey(value: () => String): Self = StObject.set(x, "getPrimaryKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrimaryKeyUndefined: Self = StObject.set(x, "getPrimaryKey", js.undefined)
    
    @scala.inline
    def setGetReader(value: () => typings.senchaTouch.Ext.data.reader.IReader): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    @scala.inline
    def setOwnerModel(value: js.Any): Self = StObject.set(x, "ownerModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerModelUndefined: Self = StObject.set(x, "ownerModel", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setReader(value: typings.senchaTouch.Ext.data.reader.IReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    @scala.inline
    def setSetAssociatedModel(value: /* associatedModel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAssociatedModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAssociatedModelUndefined: Self = StObject.set(x, "setAssociatedModel", js.undefined)
    
    @scala.inline
    def setSetAssociatedName(value: /* associatedName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAssociatedName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAssociatedNameUndefined: Self = StObject.set(x, "setAssociatedName", js.undefined)
    
    @scala.inline
    def setSetAssociationKey(value: /* associationKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAssociationKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAssociationKeyUndefined: Self = StObject.set(x, "setAssociationKey", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    @scala.inline
    def setSetOwnerModel(value: /* ownerModel */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOwnerModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOwnerModelUndefined: Self = StObject.set(x, "setOwnerModel", js.undefined)
    
    @scala.inline
    def setSetOwnerName(value: /* ownerName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setOwnerName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOwnerNameUndefined: Self = StObject.set(x, "setOwnerName", js.undefined)
    
    @scala.inline
    def setSetPrimaryKey(value: /* primaryKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPrimaryKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrimaryKeyUndefined: Self = StObject.set(x, "setPrimaryKey", js.undefined)
    
    @scala.inline
    def setSetReader(value: /* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] => Unit): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

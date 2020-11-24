package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
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
  implicit class IAssociationOps[Self <: IAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociatedModel(value: String): Self = this.set("associatedModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedModel: Self = this.set("associatedModel", js.undefined)
    
    @scala.inline
    def setAssociatedName(value: String): Self = this.set("associatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedName: Self = this.set("associatedName", js.undefined)
    
    @scala.inline
    def setAssociationKey(value: String): Self = this.set("associationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationKey: Self = this.set("associationKey", js.undefined)
    
    @scala.inline
    def setGetAssociatedModel(value: () => String): Self = this.set("getAssociatedModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAssociatedModel: Self = this.set("getAssociatedModel", js.undefined)
    
    @scala.inline
    def setGetAssociatedName(value: () => String): Self = this.set("getAssociatedName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAssociatedName: Self = this.set("getAssociatedName", js.undefined)
    
    @scala.inline
    def setGetAssociationKey(value: () => String): Self = this.set("getAssociationKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAssociationKey: Self = this.set("getAssociationKey", js.undefined)
    
    @scala.inline
    def setGetName(value: () => _): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetOwnerModel(value: () => _): Self = this.set("getOwnerModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOwnerModel: Self = this.set("getOwnerModel", js.undefined)
    
    @scala.inline
    def setGetOwnerName(value: () => String): Self = this.set("getOwnerName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOwnerName: Self = this.set("getOwnerName", js.undefined)
    
    @scala.inline
    def setGetPrimaryKey(value: () => String): Self = this.set("getPrimaryKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPrimaryKey: Self = this.set("getPrimaryKey", js.undefined)
    
    @scala.inline
    def setGetReader(value: () => typings.senchaTouch.Ext.data.reader.IReader): Self = this.set("getReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetReader: Self = this.set("getReader", js.undefined)
    
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetType: Self = this.set("getType", js.undefined)
    
    @scala.inline
    def setOwnerModel(value: js.Any): Self = this.set("ownerModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerModel: Self = this.set("ownerModel", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReader(value: typings.senchaTouch.Ext.data.reader.IReader): Self = this.set("reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReader: Self = this.set("reader", js.undefined)
    
    @scala.inline
    def setSetAssociatedModel(value: /* associatedModel */ js.UndefOr[String] => Unit): Self = this.set("setAssociatedModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAssociatedModel: Self = this.set("setAssociatedModel", js.undefined)
    
    @scala.inline
    def setSetAssociatedName(value: /* associatedName */ js.UndefOr[String] => Unit): Self = this.set("setAssociatedName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAssociatedName: Self = this.set("setAssociatedName", js.undefined)
    
    @scala.inline
    def setSetAssociationKey(value: /* associationKey */ js.UndefOr[String] => Unit): Self = this.set("setAssociationKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAssociationKey: Self = this.set("setAssociationKey", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setSetOwnerModel(value: /* ownerModel */ js.UndefOr[js.Any] => Unit): Self = this.set("setOwnerModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOwnerModel: Self = this.set("setOwnerModel", js.undefined)
    
    @scala.inline
    def setSetOwnerName(value: /* ownerName */ js.UndefOr[String] => Unit): Self = this.set("setOwnerName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOwnerName: Self = this.set("setOwnerName", js.undefined)
    
    @scala.inline
    def setSetPrimaryKey(value: /* primaryKey */ js.UndefOr[String] => Unit): Self = this.set("setPrimaryKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPrimaryKey: Self = this.set("setPrimaryKey", js.undefined)
    
    @scala.inline
    def setSetReader(value: /* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] => Unit): Self = this.set("setReader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReader: Self = this.set("setReader", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[String] => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetType: Self = this.set("setType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

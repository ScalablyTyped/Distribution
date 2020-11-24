package typings.senchaTouch.Ext.picker

import typings.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlot extends IDataView {
  
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  
  /** [Method] Looks at the data configuration and turns it into store
    * @param data Object
    * @returns Object
    */
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Sets the title for this dataview by creating element
    * @param title String
    * @returns String
    */
  var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], String]] = js.native
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of align
    * @returns String
    */
  var getAlign: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of displayField
    * @returns String
    */
  var getDisplayField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of valueField
    * @returns String
    */
  var getValueField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  @JSName("itemTpl")
  var itemTpl_ISlot: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of align
    * @param align String The new value.
    */
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of displayField
    * @param displayField String The new value.
    */
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of itemTpl
    * @param itemTpl String The new value.
    */
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of valueField
    * @param valueField String The new value.
    */
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  
  /** [Method] Updates the align configuration
    * @param newAlign Object
    * @param oldAlign Object
    */
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
}
object ISlot {
  
  @scala.inline
  def apply(): ISlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlot]
  }
  
  @scala.inline
  implicit class ISlotOps[Self <: ISlot] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setApplyData(value: /* data */ js.UndefOr[js.Any] => _): Self = this.set("applyData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyData: Self = this.set("applyData", js.undefined)
    
    @scala.inline
    def setApplyTitle(value: /* title */ js.UndefOr[String] => String): Self = this.set("applyTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyTitle: Self = this.set("applyTitle", js.undefined)
    
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
    @scala.inline
    def setGetAlign(value: () => String): Self = this.set("getAlign", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAlign: Self = this.set("getAlign", js.undefined)
    
    @scala.inline
    def setGetDisplayField(value: () => String): Self = this.set("getDisplayField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisplayField: Self = this.set("getDisplayField", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    
    @scala.inline
    def setGetValueField(value: () => String): Self = this.set("getValueField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValueField: Self = this.set("getValueField", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSetAlign(value: /* align */ js.UndefOr[String] => Unit): Self = this.set("setAlign", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAlign: Self = this.set("setAlign", js.undefined)
    
    @scala.inline
    def setSetDisplayField(value: /* displayField */ js.UndefOr[String] => Unit): Self = this.set("setDisplayField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisplayField: Self = this.set("setDisplayField", js.undefined)
    
    @scala.inline
    def setSetItemTpl(value: /* itemTpl */ js.UndefOr[String] => Unit): Self = this.set("setItemTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemTpl: Self = this.set("setItemTpl", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    
    @scala.inline
    def setSetValueField(value: /* valueField */ js.UndefOr[String] => Unit): Self = this.set("setValueField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValueField: Self = this.set("setValueField", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdateAlign(value: (/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateAlign: Self = this.set("updateAlign", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}

package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISorter extends IBase {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of id
    * @returns Mixed
    */
  var getId: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of property
    * @returns String
    */
  var getProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of root
    * @returns String
    */
  var getRoot: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of sorterFn
    * @returns Function
    */
  var getSorterFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of transform
    * @returns Function
    */
  var getTransform: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Mixed) */
  var id: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of id
    * @param id Mixed The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of property
    * @param property String The new value.
    */
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of root
    * @param root String The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of sorterFn
    * @param sorterFn Function The new value.
    */
  var setSorterFn: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of transform
    * @param transform Function The new value.
    */
  var setTransform: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Toggles the direction of this Sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.native
}
object ISorter {
  
  @scala.inline
  def apply(): ISorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISorter]
  }
  
  @scala.inline
  implicit class ISorterOps[Self <: ISorter] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetId(value: () => _): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    
    @scala.inline
    def setGetProperty(value: () => String): Self = this.set("getProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProperty: Self = this.set("getProperty", js.undefined)
    
    @scala.inline
    def setGetRoot(value: () => String): Self = this.set("getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRoot: Self = this.set("getRoot", js.undefined)
    
    @scala.inline
    def setGetSorterFn(value: () => _): Self = this.set("getSorterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSorterFn: Self = this.set("getSorterFn", js.undefined)
    
    @scala.inline
    def setGetTransform(value: () => _): Self = this.set("getTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTransform: Self = this.set("getTransform", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    
    @scala.inline
    def setSetProperty(value: /* property */ js.UndefOr[String] => Unit): Self = this.set("setProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProperty: Self = this.set("setProperty", js.undefined)
    
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[String] => Unit): Self = this.set("setRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRoot: Self = this.set("setRoot", js.undefined)
    
    @scala.inline
    def setSetSorterFn(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setSorterFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSorterFn: Self = this.set("setSorterFn", js.undefined)
    
    @scala.inline
    def setSetTransform(value: /* transform */ js.UndefOr[js.Any] => Unit): Self = this.set("setTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTransform: Self = this.set("setTransform", js.undefined)
    
    @scala.inline
    def setSorterFn(value: js.Any): Self = this.set("sorterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorterFn: Self = this.set("sorterFn", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}

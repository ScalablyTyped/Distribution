package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
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
  implicit class ISorterMutableBuilder[Self <: ISorter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    @scala.inline
    def setGetId(value: () => _): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    @scala.inline
    def setGetProperty(value: () => String): Self = StObject.set(x, "getProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyUndefined: Self = StObject.set(x, "getProperty", js.undefined)
    
    @scala.inline
    def setGetRoot(value: () => String): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    
    @scala.inline
    def setGetSorterFn(value: () => _): Self = StObject.set(x, "getSorterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSorterFnUndefined: Self = StObject.set(x, "getSorterFn", js.undefined)
    
    @scala.inline
    def setGetTransform(value: () => _): Self = StObject.set(x, "getTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformUndefined: Self = StObject.set(x, "getTransform", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    @scala.inline
    def setSetProperty(value: /* property */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
    
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
    
    @scala.inline
    def setSetSorterFn(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSorterFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSorterFnUndefined: Self = StObject.set(x, "setSorterFn", js.undefined)
    
    @scala.inline
    def setSetTransform(value: /* transform */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransformUndefined: Self = StObject.set(x, "setTransform", js.undefined)
    
    @scala.inline
    def setSorterFn(value: js.Any): Self = StObject.set(x, "sorterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorterFnUndefined: Self = StObject.set(x, "sorterFn", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}

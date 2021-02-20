package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndexBar extends IComponent {
  
  /** [Config Option] (Boolean) */
  var alphabet: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of letters
    * @returns Array
    */
  var getLetters: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of listPrefix
    * @returns String
    */
  var getListPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns true when direction is horizontal  */
  var isHorizontal: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true when direction is vertical  */
  var isVertical: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Array) */
  var letters: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var listPrefix: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of letters
    * @param letters Array The new value.
    */
  var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of listPrefix
    * @param listPrefix String The new value.
    */
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[Boolean] = js.native
}
object IIndexBar {
  
  @scala.inline
  def apply(): IIndexBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndexBar]
  }
  
  @scala.inline
  implicit class IIndexBarMutableBuilder[Self <: IIndexBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphabet(value: Boolean): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
    
    @scala.inline
    def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    @scala.inline
    def setGetLetters(value: () => Array): Self = StObject.set(x, "getLetters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLettersUndefined: Self = StObject.set(x, "getLetters", js.undefined)
    
    @scala.inline
    def setGetListPrefix(value: () => java.lang.String): Self = StObject.set(x, "getListPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListPrefixUndefined: Self = StObject.set(x, "getListPrefix", js.undefined)
    
    @scala.inline
    def setIsHorizontal(value: () => Unit): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
    
    @scala.inline
    def setIsVertical(value: () => Unit): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    @scala.inline
    def setItemSelector(value: Boolean): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    @scala.inline
    def setLetters(value: Array): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLettersUndefined: Self = StObject.set(x, "letters", js.undefined)
    
    @scala.inline
    def setListPrefix(value: java.lang.String): Self = StObject.set(x, "listPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPrefixUndefined: Self = StObject.set(x, "listPrefix", js.undefined)
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    @scala.inline
    def setSetLetters(value: /* letters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setLetters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLettersUndefined: Self = StObject.set(x, "setLetters", js.undefined)
    
    @scala.inline
    def setSetListPrefix(value: /* listPrefix */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setListPrefix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListPrefixUndefined: Self = StObject.set(x, "setListPrefix", js.undefined)
    
    @scala.inline
    def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}

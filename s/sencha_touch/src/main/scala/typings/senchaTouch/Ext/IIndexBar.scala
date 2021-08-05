package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndexBar
  extends StObject
     with IComponent {
  
  /** [Config Option] (Boolean) */
  var alphabet: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of letters
    * @returns Array
    */
  var getLetters: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of listPrefix
    * @returns String
    */
  var getListPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns true when direction is horizontal  */
  var isHorizontal: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns true when direction is vertical  */
  var isVertical: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Array) */
  var letters: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var listPrefix: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of letters
    * @param letters Array The new value.
    */
  var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of listPrefix
    * @param listPrefix String The new value.
    */
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[Boolean] = js.undefined
}
object IIndexBar {
  
  inline def apply(): IIndexBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndexBar]
  }
  
  extension [Self <: IIndexBar](x: Self) {
    
    inline def setAlphabet(value: Boolean): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
    
    inline def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
    
    inline def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    inline def setGetLetters(value: () => Array): Self = StObject.set(x, "getLetters", js.Any.fromFunction0(value))
    
    inline def setGetLettersUndefined: Self = StObject.set(x, "getLetters", js.undefined)
    
    inline def setGetListPrefix(value: () => java.lang.String): Self = StObject.set(x, "getListPrefix", js.Any.fromFunction0(value))
    
    inline def setGetListPrefixUndefined: Self = StObject.set(x, "getListPrefix", js.undefined)
    
    inline def setIsHorizontal(value: () => Unit): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
    
    inline def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
    
    inline def setIsVertical(value: () => Unit): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    inline def setItemSelector(value: Boolean): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    inline def setLetters(value: Array): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
    
    inline def setLettersUndefined: Self = StObject.set(x, "letters", js.undefined)
    
    inline def setListPrefix(value: java.lang.String): Self = StObject.set(x, "listPrefix", value.asInstanceOf[js.Any])
    
    inline def setListPrefixUndefined: Self = StObject.set(x, "listPrefix", js.undefined)
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    inline def setSetLetters(value: /* letters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setLetters", js.Any.fromFunction1(value))
    
    inline def setSetLettersUndefined: Self = StObject.set(x, "setLetters", js.undefined)
    
    inline def setSetListPrefix(value: /* listPrefix */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setListPrefix", js.Any.fromFunction1(value))
    
    inline def setSetListPrefixUndefined: Self = StObject.set(x, "setListPrefix", js.undefined)
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}

package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purchases {
  
  trait IProduct
    extends StObject
       with IModel {
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    @JSName("getFields")
    var getFields_IProduct: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Will attempt to purchase this product
      * @param config Object
      */
    var purchase: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    @JSName("setFields")
    var setFields_IProduct: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object IProduct {
    
    inline def apply(): IProduct = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProduct]
    }
    
    extension [Self <: IProduct](x: Self) {
      
      inline def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      inline def setPurchase(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "purchase", js.Any.fromFunction1(value))
      
      inline def setPurchaseUndefined: Self = StObject.set(x, "purchase", js.undefined)
      
      inline def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      inline def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    }
  }
  
  trait IPurchase
    extends StObject
       with IModel {
    
    /** [Method] Attempts to mark this purchase as complete
      * @param config Object
      */
    var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    @JSName("getFields")
    var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    @JSName("setFields")
    var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object IPurchase {
    
    inline def apply(): IPurchase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPurchase]
    }
    
    extension [Self <: IPurchase](x: Self) {
      
      inline def setComplete(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      inline def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      inline def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IBase {
    
    /** [Method] Checks if the current user is able to make payments
      * @param config Object
      */
    var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
      * @param config Object
      */
    var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns a Ext data Store instance of all products available to purchase
      * @param config Object
      */
    var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
      * @param config Object
      */
    var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    extension [Self <: ISencha](x: Self) {
      
      inline def setCanMakePayments(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "canMakePayments", js.Any.fromFunction1(value))
      
      inline def setCanMakePaymentsUndefined: Self = StObject.set(x, "canMakePayments", js.undefined)
      
      inline def setGetCompletedPurchases(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getCompletedPurchases", js.Any.fromFunction1(value))
      
      inline def setGetCompletedPurchasesUndefined: Self = StObject.set(x, "getCompletedPurchases", js.undefined)
      
      inline def setGetProducts(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getProducts", js.Any.fromFunction1(value))
      
      inline def setGetProductsUndefined: Self = StObject.set(x, "getProducts", js.undefined)
      
      inline def setGetPurchases(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getPurchases", js.Any.fromFunction1(value))
      
      inline def setGetPurchasesUndefined: Self = StObject.set(x, "getPurchases", js.undefined)
    }
  }
}

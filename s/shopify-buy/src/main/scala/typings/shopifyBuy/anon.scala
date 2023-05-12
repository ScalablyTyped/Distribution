package typings.shopifyBuy

import typings.shopifyBuy.mod.AttributeInput
import typings.shopifyBuy.mod.CheckoutLineItemInput
import typings.shopifyBuy.mod.CollectionSortKeys
import typings.shopifyBuy.mod.CurrencyCode
import typings.shopifyBuy.mod.Image
import typings.shopifyBuy.mod.MailingAddressInput
import typings.shopifyBuy.mod.ProductSortKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowPartialAddresses extends StObject {
    
    var allowPartialAddresses: js.UndefOr[Boolean] = js.undefined
    
    var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
    
    var note: js.UndefOr[String] = js.undefined
  }
  object AllowPartialAddresses {
    
    inline def apply(): AllowPartialAddresses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowPartialAddresses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowPartialAddresses] (val x: Self) extends AnyVal {
      
      inline def setAllowPartialAddresses(value: Boolean): Self = StObject.set(x, "allowPartialAddresses", value.asInstanceOf[js.Any])
      
      inline def setAllowPartialAddressesUndefined: Self = StObject.set(x, "allowPartialAddresses", js.undefined)
      
      inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    }
  }
  
  trait CustomAttributes extends StObject {
    
    var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var lineItems: js.UndefOr[js.Array[CheckoutLineItemInput]] = js.undefined
    
    var presentmentCurrencyCode: js.UndefOr[CurrencyCode] = js.undefined
    
    var shippingAddress: js.UndefOr[MailingAddressInput] = js.undefined
  }
  object CustomAttributes {
    
    inline def apply(): CustomAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttributes] (val x: Self) extends AnyVal {
      
      inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setLineItems(value: js.Array[CheckoutLineItemInput]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
      
      inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
      
      inline def setLineItemsVarargs(value: CheckoutLineItemInput*): Self = StObject.set(x, "lineItems", js.Array(value*))
      
      inline def setPresentmentCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "presentmentCurrencyCode", value.asInstanceOf[js.Any])
      
      inline def setPresentmentCurrencyCodeUndefined: Self = StObject.set(x, "presentmentCurrencyCode", js.undefined)
      
      inline def setShippingAddress(value: MailingAddressInput): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    }
  }
  
  trait First extends StObject {
    
    var first: js.UndefOr[Double] = js.undefined
    
    var productsFirst: js.UndefOr[Double] = js.undefined
  }
  object First {
    
    inline def apply(): First = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[First]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: First] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setProductsFirst(value: Double): Self = StObject.set(x, "productsFirst", value.asInstanceOf[js.Any])
      
      inline def setProductsFirstUndefined: Self = StObject.set(x, "productsFirst", js.undefined)
    }
  }
  
  trait ImageForSize extends StObject {
    
    /**
      * Generates the image src for a resized image with maximum dimensions `maxWidth` and `maxHeight`.
      * Images do not scale up.
      */
    def imageForSize(image: Image, options: MaxHeight): String
  }
  object ImageForSize {
    
    inline def apply(imageForSize: (Image, MaxHeight) => String): ImageForSize = {
      val __obj = js.Dynamic.literal(imageForSize = js.Any.fromFunction2(imageForSize))
      __obj.asInstanceOf[ImageForSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageForSize] (val x: Self) extends AnyVal {
      
      inline def setImageForSize(value: (Image, MaxHeight) => String): Self = StObject.set(x, "imageForSize", js.Any.fromFunction2(value))
    }
  }
  
  trait MaxHeight extends StObject {
    
    var maxHeight: Double
    
    var maxWidth: Double
  }
  object MaxHeight {
    
    inline def apply(maxHeight: Double, maxWidth: Double): MaxHeight = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProductsFirst extends StObject {
    
    var productsFirst: js.UndefOr[Double] = js.undefined
  }
  object ProductsFirst {
    
    inline def apply(): ProductsFirst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductsFirst]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductsFirst] (val x: Self) extends AnyVal {
      
      inline def setProductsFirst(value: Double): Self = StObject.set(x, "productsFirst", value.asInstanceOf[js.Any])
      
      inline def setProductsFirstUndefined: Self = StObject.set(x, "productsFirst", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    var first: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var sortKey: js.UndefOr[CollectionSortKeys] = js.undefined
  }
  object Query {
    
    inline def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSortKey(value: CollectionSortKeys): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    }
  }
  
  trait Reverse extends StObject {
    
    var first: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var sortKey: js.UndefOr[ProductSortKeys] = js.undefined
  }
  object Reverse {
    
    inline def apply(): Reverse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reverse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reverse] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSortKey(value: ProductSortKeys): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    }
  }
}

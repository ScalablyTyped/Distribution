package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Location
import typings.storefrontUiVue.storefrontUiVueStrings.`Add to wishlist`
import typings.storefrontUiVue.storefrontUiVueStrings.`Remove from wishlist`
import typings.storefrontUiVue.storefrontUiVueStrings.`sf-product-card-horizontal__wishlist-icon sf-product-card-horizontal--on-wishlist`
import typings.storefrontUiVue.storefrontUiVueStrings.`sf-product-card-horizontal__wishlist-icon`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfProductCardHorizontal extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfProductCardHorizontal")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var ariaLabel: (`Remove from wishlist`) | (`Add to wishlist`)
    
    var currentWishlistIcon: Icon
    
    var linkComponentTag: String
    
    var wishlistIconClasses: `sf-product-card-horizontal__wishlist-icon` | (`sf-product-card-horizontal__wishlist-icon sf-product-card-horizontal--on-wishlist`)
  }
  object Computed {
    
    inline def apply(
      ariaLabel: (`Remove from wishlist`) | (`Add to wishlist`),
      currentWishlistIcon: Icon,
      linkComponentTag: String,
      wishlistIconClasses: `sf-product-card-horizontal__wishlist-icon` | (`sf-product-card-horizontal__wishlist-icon sf-product-card-horizontal--on-wishlist`)
    ): Computed = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], currentWishlistIcon = currentWishlistIcon.asInstanceOf[js.Any], linkComponentTag = linkComponentTag.asInstanceOf[js.Any], wishlistIconClasses = wishlistIconClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setAriaLabel(value: (`Remove from wishlist`) | (`Add to wishlist`)): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setCurrentWishlistIcon(value: Icon): Self = StObject.set(x, "currentWishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setLinkComponentTag(value: String): Self = StObject.set(x, "linkComponentTag", value.asInstanceOf[js.Any])
      
      inline def setWishlistIconClasses(
        value: `sf-product-card-horizontal__wishlist-icon` | (`sf-product-card-horizontal__wishlist-icon sf-product-card-horizontal--on-wishlist`)
      ): Self = StObject.set(x, "wishlistIconClasses", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def toggleIsOnWishlist(): Unit
  }
  object Methods {
    
    inline def apply(toggleIsOnWishlist: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(toggleIsOnWishlist = js.Any.fromFunction0(toggleIsOnWishlist))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setToggleIsOnWishlist(value: () => Unit): Self = StObject.set(x, "toggleIsOnWishlist", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var addToCartDisabled: Boolean
    
    var description: String
    
    var image: String | Source | (js.Array[String | Source])
    
    var imageHeight: String | Double
    
    var imageWidth: String | Double
    
    var isAddedToCart: Boolean
    
    var isOnWishlist: Boolean
    
    var isOnWishlistIcon: Icon | js.Array[Icon]
    
    var link: String | Location
    
    var linkTag: js.UndefOr[String] = js.undefined
    
    var maxRating: Double | String
    
    var qty: String | Double
    
    var regularPrice: Double | String | Null
    
    var reviewsCount: Double | Boolean
    
    var scoreRating: Double | Boolean
    
    var specialPrice: Double | String | Null
    
    var title: String
    
    var wishlistIcon: Icon | js.Array[Icon] | Boolean
  }
  object Props {
    
    inline def apply(
      addToCartDisabled: Boolean,
      description: String,
      image: String | Source | (js.Array[String | Source]),
      imageHeight: String | Double,
      imageWidth: String | Double,
      isAddedToCart: Boolean,
      isOnWishlist: Boolean,
      isOnWishlistIcon: Icon | js.Array[Icon],
      link: String | Location,
      maxRating: Double | String,
      qty: String | Double,
      reviewsCount: Double | Boolean,
      scoreRating: Double | Boolean,
      title: String,
      wishlistIcon: Icon | js.Array[Icon] | Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(addToCartDisabled = addToCartDisabled.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], isAddedToCart = isAddedToCart.asInstanceOf[js.Any], isOnWishlist = isOnWishlist.asInstanceOf[js.Any], isOnWishlistIcon = isOnWishlistIcon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], maxRating = maxRating.asInstanceOf[js.Any], qty = qty.asInstanceOf[js.Any], reviewsCount = reviewsCount.asInstanceOf[js.Any], scoreRating = scoreRating.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wishlistIcon = wishlistIcon.asInstanceOf[js.Any], regularPrice = null, specialPrice = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAddToCartDisabled(value: Boolean): Self = StObject.set(x, "addToCartDisabled", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String | Source | (js.Array[String | Source])): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: String | Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageVarargs(value: (String | Source)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageWidth(value: String | Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setIsAddedToCart(value: Boolean): Self = StObject.set(x, "isAddedToCart", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlist(value: Boolean): Self = StObject.set(x, "isOnWishlist", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlistIcon(value: Icon | js.Array[Icon]): Self = StObject.set(x, "isOnWishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlistIconVarargs(value: Icon*): Self = StObject.set(x, "isOnWishlistIcon", js.Array(value*))
      
      inline def setLink(value: String | Location): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkTag(value: String): Self = StObject.set(x, "linkTag", value.asInstanceOf[js.Any])
      
      inline def setLinkTagUndefined: Self = StObject.set(x, "linkTag", js.undefined)
      
      inline def setMaxRating(value: Double | String): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setQty(value: String | Double): Self = StObject.set(x, "qty", value.asInstanceOf[js.Any])
      
      inline def setRegularPrice(value: Double | String): Self = StObject.set(x, "regularPrice", value.asInstanceOf[js.Any])
      
      inline def setRegularPriceNull: Self = StObject.set(x, "regularPrice", null)
      
      inline def setReviewsCount(value: Double | Boolean): Self = StObject.set(x, "reviewsCount", value.asInstanceOf[js.Any])
      
      inline def setScoreRating(value: Double | Boolean): Self = StObject.set(x, "scoreRating", value.asInstanceOf[js.Any])
      
      inline def setSpecialPrice(value: Double | String): Self = StObject.set(x, "specialPrice", value.asInstanceOf[js.Any])
      
      inline def setSpecialPriceNull: Self = StObject.set(x, "specialPrice", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWishlistIcon(value: Icon | js.Array[Icon] | Boolean): Self = StObject.set(x, "wishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setWishlistIconVarargs(value: Icon*): Self = StObject.set(x, "wishlistIcon", js.Array(value*))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfProductCardHorizontal.foo` */
  override def _to: Constructor = ^
}

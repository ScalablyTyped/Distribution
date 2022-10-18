package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.std.Location
import typings.storefrontUiVue.storefrontUiVueStrings.`Add to wishlist`
import typings.storefrontUiVue.storefrontUiVueStrings.`Remove from wishlist`
import typings.storefrontUiVue.storefrontUiVueStrings.`sf-button--pure sf-product-card__wishlist-icon`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfProductCard extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfProductCard")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var ariaLabel: (`Remove from wishlist`) | (`Add to wishlist`)
    
    var badgeColorClass: String
    
    var currentWishlistIcon: Icon
    
    var isSFColors: Boolean
    
    var linkComponentTag: String
    
    var showAddedToCartBadge: Boolean
    
    var wishlistIconClasses: (`sf-button--pure sf-product-card__wishlist-icon`) | (/* sf-button--pure sf-product-card__wishlist-icon sf-product-card--on-wishlist */ String)
  }
  object Computed {
    
    inline def apply(
      ariaLabel: (`Remove from wishlist`) | (`Add to wishlist`),
      badgeColorClass: String,
      currentWishlistIcon: Icon,
      isSFColors: Boolean,
      linkComponentTag: String,
      showAddedToCartBadge: Boolean,
      wishlistIconClasses: (`sf-button--pure sf-product-card__wishlist-icon`) | (/* sf-button--pure sf-product-card__wishlist-icon sf-product-card--on-wishlist */ String)
    ): Computed = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], badgeColorClass = badgeColorClass.asInstanceOf[js.Any], currentWishlistIcon = currentWishlistIcon.asInstanceOf[js.Any], isSFColors = isSFColors.asInstanceOf[js.Any], linkComponentTag = linkComponentTag.asInstanceOf[js.Any], showAddedToCartBadge = showAddedToCartBadge.asInstanceOf[js.Any], wishlistIconClasses = wishlistIconClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setAriaLabel(value: (`Remove from wishlist`) | (`Add to wishlist`)): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setBadgeColorClass(value: String): Self = StObject.set(x, "badgeColorClass", value.asInstanceOf[js.Any])
      
      inline def setCurrentWishlistIcon(value: Icon): Self = StObject.set(x, "currentWishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setIsSFColors(value: Boolean): Self = StObject.set(x, "isSFColors", value.asInstanceOf[js.Any])
      
      inline def setLinkComponentTag(value: String): Self = StObject.set(x, "linkComponentTag", value.asInstanceOf[js.Any])
      
      inline def setShowAddedToCartBadge(value: Boolean): Self = StObject.set(x, "showAddedToCartBadge", value.asInstanceOf[js.Any])
      
      inline def setWishlistIconClasses(
        value: (`sf-button--pure sf-product-card__wishlist-icon`) | (/* sf-button--pure sf-product-card__wishlist-icon sf-product-card--on-wishlist */ String)
      ): Self = StObject.set(x, "wishlistIconClasses", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var isAddingToCart: Boolean
  }
  object Data {
    
    inline def apply(isAddingToCart: Boolean): Data = {
      val __obj = js.Dynamic.literal(isAddingToCart = isAddingToCart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setIsAddingToCart(value: Boolean): Self = StObject.set(x, "isAddingToCart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def onAddToCart(event: Event): Unit
    
    def toggleIsOnWishlist(): Unit
  }
  object Methods {
    
    inline def apply(onAddToCart: Event => Unit, toggleIsOnWishlist: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(onAddToCart = js.Any.fromFunction1(onAddToCart), toggleIsOnWishlist = js.Any.fromFunction0(toggleIsOnWishlist))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setOnAddToCart(value: Event => Unit): Self = StObject.set(x, "onAddToCart", js.Any.fromFunction1(value))
      
      inline def setToggleIsOnWishlist(value: () => Unit): Self = StObject.set(x, "toggleIsOnWishlist", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var addToCartDisabled: Boolean
    
    var badgeColor: Color | String
    
    var badgeLabel: String
    
    var image: String | Source | (js.Array[String | Source])
    
    var imageHeight: String | Double
    
    var imageWidth: String | Double
    
    var isOnWishlist: Boolean
    
    var isOnWishlistIcon: Icon | js.Array[Icon]
    
    var link: String | Location
    
    var linkTag: String
    
    var maxRating: String | Double
    
    var regularPrice: String | Double | Null
    
    var reviewsCount: String | Double
    
    var scoreRating: Double | Boolean
    
    var showAddToCartButton: Boolean
    
    var specialPrice: String | Double | Null
    
    var title: String
    
    var wishlistIcon: Icon | js.Array[Icon] | Boolean
  }
  object Props {
    
    inline def apply(
      addToCartDisabled: Boolean,
      badgeColor: Color | String,
      badgeLabel: String,
      image: String | Source | (js.Array[String | Source]),
      imageHeight: String | Double,
      imageWidth: String | Double,
      isOnWishlist: Boolean,
      isOnWishlistIcon: Icon | js.Array[Icon],
      link: String | Location,
      linkTag: String,
      maxRating: String | Double,
      reviewsCount: String | Double,
      scoreRating: Double | Boolean,
      showAddToCartButton: Boolean,
      title: String,
      wishlistIcon: Icon | js.Array[Icon] | Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(addToCartDisabled = addToCartDisabled.asInstanceOf[js.Any], badgeColor = badgeColor.asInstanceOf[js.Any], badgeLabel = badgeLabel.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], isOnWishlist = isOnWishlist.asInstanceOf[js.Any], isOnWishlistIcon = isOnWishlistIcon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkTag = linkTag.asInstanceOf[js.Any], maxRating = maxRating.asInstanceOf[js.Any], reviewsCount = reviewsCount.asInstanceOf[js.Any], scoreRating = scoreRating.asInstanceOf[js.Any], showAddToCartButton = showAddToCartButton.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wishlistIcon = wishlistIcon.asInstanceOf[js.Any], regularPrice = null, specialPrice = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAddToCartDisabled(value: Boolean): Self = StObject.set(x, "addToCartDisabled", value.asInstanceOf[js.Any])
      
      inline def setBadgeColor(value: Color | String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      inline def setBadgeLabel(value: String): Self = StObject.set(x, "badgeLabel", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String | Source | (js.Array[String | Source])): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: String | Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageVarargs(value: (String | Source)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageWidth(value: String | Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlist(value: Boolean): Self = StObject.set(x, "isOnWishlist", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlistIcon(value: Icon | js.Array[Icon]): Self = StObject.set(x, "isOnWishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setIsOnWishlistIconVarargs(value: Icon*): Self = StObject.set(x, "isOnWishlistIcon", js.Array(value*))
      
      inline def setLink(value: String | Location): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkTag(value: String): Self = StObject.set(x, "linkTag", value.asInstanceOf[js.Any])
      
      inline def setMaxRating(value: String | Double): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setRegularPrice(value: String | Double): Self = StObject.set(x, "regularPrice", value.asInstanceOf[js.Any])
      
      inline def setRegularPriceNull: Self = StObject.set(x, "regularPrice", null)
      
      inline def setReviewsCount(value: String | Double): Self = StObject.set(x, "reviewsCount", value.asInstanceOf[js.Any])
      
      inline def setScoreRating(value: Double | Boolean): Self = StObject.set(x, "scoreRating", value.asInstanceOf[js.Any])
      
      inline def setShowAddToCartButton(value: Boolean): Self = StObject.set(x, "showAddToCartButton", value.asInstanceOf[js.Any])
      
      inline def setSpecialPrice(value: String | Double): Self = StObject.set(x, "specialPrice", value.asInstanceOf[js.Any])
      
      inline def setSpecialPriceNull: Self = StObject.set(x, "specialPrice", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWishlistIcon(value: Icon | js.Array[Icon] | Boolean): Self = StObject.set(x, "wishlistIcon", value.asInstanceOf[js.Any])
      
      inline def setWishlistIconVarargs(value: Icon*): Self = StObject.set(x, "wishlistIcon", js.Array(value*))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfProductCard.foo` */
  override def _to: Constructor = ^
}

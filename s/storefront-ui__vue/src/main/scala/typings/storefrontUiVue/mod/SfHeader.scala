package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.anon.Headerheight
import typings.storefrontUiVue.storefrontUiVueStrings._empty
import typings.storefrontUiVue.storefrontUiVueStrings.account
import typings.storefrontUiVue.storefrontUiVueStrings.cart
import typings.storefrontUiVue.storefrontUiVueStrings.wishlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfHeader extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfHeader")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var cartHasProducts: Boolean
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
    
    var stickyHeight: Headerheight
  }
  object Computed {
    
    inline def apply(
      cartHasProducts: Boolean,
      isMobile: Boolean,
      mobileObserverClients: Double,
      mobileObserverIsInitialized: Boolean,
      stickyHeight: Headerheight
    ): Computed = {
      val __obj = js.Dynamic.literal(cartHasProducts = cartHasProducts.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any], stickyHeight = stickyHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setCartHasProducts(value: Boolean): Self = StObject.set(x, "cartHasProducts", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverClients(value: Double): Self = StObject.set(x, "mobileObserverClients", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverIsInitialized(value: Boolean): Self = StObject.set(x, "mobileObserverIsInitialized", value.asInstanceOf[js.Any])
      
      inline def setStickyHeight(value: Headerheight): Self = StObject.set(x, "stickyHeight", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var animationDuration: Double
    
    var animationLong: Any
    
    var animationStart: Any
    
    var height: Double
    
    var hidden: Boolean
    
    var icons: js.Array[Icon]
    
    var lastScrollPosition: Double
    
    var scrollDirection: Any
    
    var sticky: Boolean
  }
  object Data {
    
    inline def apply(
      animationDuration: Double,
      animationLong: Any,
      animationStart: Any,
      height: Double,
      hidden: Boolean,
      icons: js.Array[Icon],
      lastScrollPosition: Double,
      scrollDirection: Any,
      sticky: Boolean
    ): Data = {
      val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationLong = animationLong.asInstanceOf[js.Any], animationStart = animationStart.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationLong(value: Any): Self = StObject.set(x, "animationLong", value.asInstanceOf[js.Any])
      
      inline def setAnimationStart(value: Any): Self = StObject.set(x, "animationStart", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcons(value: js.Array[Icon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsVarargs(value: Icon*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setLastScrollPosition(value: Double): Self = StObject.set(x, "lastScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setScrollDirection(value: Any): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def animationhandler(timestamp: Double): Unit
    
    def scrollHandler(): Unit
  }
  object Methods {
    
    inline def apply(animationhandler: Double => Unit, scrollHandler: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(animationhandler = js.Any.fromFunction1(animationhandler), scrollHandler = js.Any.fromFunction0(scrollHandler))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setAnimationhandler(value: Double => Unit): Self = StObject.set(x, "animationhandler", js.Any.fromFunction1(value))
      
      inline def setScrollHandler(value: () => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var accountIcon: Icon | Boolean
    
    var activeIcon: _empty | account | wishlist | cart
    
    var cartIcon: Icon | Boolean
    
    var cartItemsQty: String | Double
    
    var isSticky: Boolean
    
    var logo: String | Source
    
    var searchPlaceholder: String
    
    var searchValue: String
    
    var title: String
    
    var wishlistIcon: Icon | Boolean
  }
  object Props {
    
    inline def apply(
      accountIcon: Icon | Boolean,
      activeIcon: _empty | account | wishlist | cart,
      cartIcon: Icon | Boolean,
      cartItemsQty: String | Double,
      isSticky: Boolean,
      logo: String | Source,
      searchPlaceholder: String,
      searchValue: String,
      title: String,
      wishlistIcon: Icon | Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(accountIcon = accountIcon.asInstanceOf[js.Any], activeIcon = activeIcon.asInstanceOf[js.Any], cartIcon = cartIcon.asInstanceOf[js.Any], cartItemsQty = cartItemsQty.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wishlistIcon = wishlistIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAccountIcon(value: Icon | Boolean): Self = StObject.set(x, "accountIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIcon(value: _empty | account | wishlist | cart): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setCartIcon(value: Icon | Boolean): Self = StObject.set(x, "cartIcon", value.asInstanceOf[js.Any])
      
      inline def setCartItemsQty(value: String | Double): Self = StObject.set(x, "cartItemsQty", value.asInstanceOf[js.Any])
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String | Source): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWishlistIcon(value: Icon | Boolean): Self = StObject.set(x, "wishlistIcon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfHeader.foo` */
  override def _to: Constructor = ^
}

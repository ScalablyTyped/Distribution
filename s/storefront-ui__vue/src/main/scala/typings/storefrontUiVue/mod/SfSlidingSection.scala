package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSlidingSection extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSlidingSection")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
  }
  object Computed {
    
    inline def apply(isMobile: Boolean, mobileObserverClients: Double, mobileObserverIsInitialized: Boolean): Computed = {
      val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverClients(value: Double): Self = StObject.set(x, "mobileObserverClients", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverIsInitialized(value: Boolean): Self = StObject.set(x, "mobileObserverIsInitialized", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, methods: Methods): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var hammer: Any
    
    var hasScrollLock: Boolean
    
    var hasStaticHeight: Boolean
    
    var isActive: Boolean
  }
  object Data {
    
    inline def apply(hammer: Any, hasScrollLock: Boolean, hasStaticHeight: Boolean, isActive: Boolean): Data = {
      val __obj = js.Dynamic.literal(hammer = hammer.asInstanceOf[js.Any], hasScrollLock = hasScrollLock.asInstanceOf[js.Any], hasStaticHeight = hasStaticHeight.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setHammer(value: Any): Self = StObject.set(x, "hammer", value.asInstanceOf[js.Any])
      
      inline def setHasScrollLock(value: Boolean): Self = StObject.set(x, "hasScrollLock", value.asInstanceOf[js.Any])
      
      inline def setHasStaticHeight(value: Boolean): Self = StObject.set(x, "hasStaticHeight", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def closeHandler(): Unit
    
    def scrollLock(): Unit
    
    def scrollUnlock(): Unit
    
    def touchHandler(event: Event): Unit
    
    def touchPreventDefault(e: Event): Unit
  }
  object Methods {
    
    inline def apply(
      closeHandler: () => Unit,
      scrollLock: () => Unit,
      scrollUnlock: () => Unit,
      touchHandler: Event => Unit,
      touchPreventDefault: Event => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(closeHandler = js.Any.fromFunction0(closeHandler), scrollLock = js.Any.fromFunction0(scrollLock), scrollUnlock = js.Any.fromFunction0(scrollUnlock), touchHandler = js.Any.fromFunction1(touchHandler), touchPreventDefault = js.Any.fromFunction1(touchPreventDefault))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setCloseHandler(value: () => Unit): Self = StObject.set(x, "closeHandler", js.Any.fromFunction0(value))
      
      inline def setScrollLock(value: () => Unit): Self = StObject.set(x, "scrollLock", js.Any.fromFunction0(value))
      
      inline def setScrollUnlock(value: () => Unit): Self = StObject.set(x, "scrollUnlock", js.Any.fromFunction0(value))
      
      inline def setTouchHandler(value: Event => Unit): Self = StObject.set(x, "touchHandler", js.Any.fromFunction1(value))
      
      inline def setTouchPreventDefault(value: Event => Unit): Self = StObject.set(x, "touchPreventDefault", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSlidingSection.foo` */
  override def _to: Constructor = ^
}

package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSticky extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSticky")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isIE: Boolean
    
    var maxWidth: Double
    
    var scrollBegin: Double
    
    var scrollEnd: Double
  }
  object Computed {
    
    inline def apply(isIE: Boolean, maxWidth: Double, scrollBegin: Double, scrollEnd: Double): Computed = {
      val __obj = js.Dynamic.literal(isIE = isIE.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], scrollBegin = scrollBegin.asInstanceOf[js.Any], scrollEnd = scrollEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollBegin(value: Double): Self = StObject.set(x, "scrollBegin", value.asInstanceOf[js.Any])
      
      inline def setScrollEnd(value: Double): Self = StObject.set(x, "scrollEnd", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var height: Double
    
    var isBound: Boolean
    
    var isSticky: Boolean
    
    var padding: Bottom
    
    var parentHeight: Double
    
    var parentTop: Double
    
    var scrollY: Double
    
    var top: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(
      height: Double,
      isBound: Boolean,
      isSticky: Boolean,
      padding: Bottom,
      parentHeight: Double,
      parentTop: Double,
      scrollY: Double,
      top: Double,
      width: Double
    ): Data = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isBound = isBound.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], parentTop = parentTop.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsBound(value: Boolean): Self = StObject.set(x, "isBound", value.asInstanceOf[js.Any])
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setParentHeight(value: Double): Self = StObject.set(x, "parentHeight", value.asInstanceOf[js.Any])
      
      inline def setParentTop(value: Double): Self = StObject.set(x, "parentTop", value.asInstanceOf[js.Any])
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def computedPadding(): Bottom
    
    def resizeHandler(): Unit
    
    def scrollHandler(): Unit
    
    def toggleBound(): Unit
    
    def toggleSticky(): Unit
  }
  object Methods {
    
    inline def apply(
      computedPadding: () => Bottom,
      resizeHandler: () => Unit,
      scrollHandler: () => Unit,
      toggleBound: () => Unit,
      toggleSticky: () => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(computedPadding = js.Any.fromFunction0(computedPadding), resizeHandler = js.Any.fromFunction0(resizeHandler), scrollHandler = js.Any.fromFunction0(scrollHandler), toggleBound = js.Any.fromFunction0(toggleBound), toggleSticky = js.Any.fromFunction0(toggleSticky))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setComputedPadding(value: () => Bottom): Self = StObject.set(x, "computedPadding", js.Any.fromFunction0(value))
      
      inline def setResizeHandler(value: () => Unit): Self = StObject.set(x, "resizeHandler", js.Any.fromFunction0(value))
      
      inline def setScrollHandler(value: () => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction0(value))
      
      inline def setToggleBound(value: () => Unit): Self = StObject.set(x, "toggleBound", js.Any.fromFunction0(value))
      
      inline def setToggleSticky(value: () => Unit): Self = StObject.set(x, "toggleSticky", js.Any.fromFunction0(value))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSticky.foo` */
  override def _to: Constructor = ^
}

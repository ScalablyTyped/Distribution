package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.storefrontUiVueStrings.`sf-button`
import typings.storefrontUiVue.storefrontUiVueStrings.`sf-link`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfPagination extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfPagination")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var canGoPrev: Double
    
    var compoenntIs: `sf-link` | `sf-button`
    
    var currentPage: Double
    
    var getNext: Double
    
    var getPrev: Double
    
    var hasRouter: Boolean
    
    var limitedPageNumbers: js.Array[Double]
    
    var listOfPageNumbers: js.Array[Double]
    
    var showFirst: Boolean
    
    var showLast: Boolean
  }
  object Computed {
    
    inline def apply(
      canGoPrev: Double,
      compoenntIs: `sf-link` | `sf-button`,
      currentPage: Double,
      getNext: Double,
      getPrev: Double,
      hasRouter: Boolean,
      limitedPageNumbers: js.Array[Double],
      listOfPageNumbers: js.Array[Double],
      showFirst: Boolean,
      showLast: Boolean
    ): Computed = {
      val __obj = js.Dynamic.literal(canGoPrev = canGoPrev.asInstanceOf[js.Any], compoenntIs = compoenntIs.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], getNext = getNext.asInstanceOf[js.Any], getPrev = getPrev.asInstanceOf[js.Any], hasRouter = hasRouter.asInstanceOf[js.Any], limitedPageNumbers = limitedPageNumbers.asInstanceOf[js.Any], listOfPageNumbers = listOfPageNumbers.asInstanceOf[js.Any], showFirst = showFirst.asInstanceOf[js.Any], showLast = showLast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setCanGoPrev(value: Double): Self = StObject.set(x, "canGoPrev", value.asInstanceOf[js.Any])
      
      inline def setCompoenntIs(value: `sf-link` | `sf-button`): Self = StObject.set(x, "compoenntIs", value.asInstanceOf[js.Any])
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setGetNext(value: Double): Self = StObject.set(x, "getNext", value.asInstanceOf[js.Any])
      
      inline def setGetPrev(value: Double): Self = StObject.set(x, "getPrev", value.asInstanceOf[js.Any])
      
      inline def setHasRouter(value: Boolean): Self = StObject.set(x, "hasRouter", value.asInstanceOf[js.Any])
      
      inline def setLimitedPageNumbers(value: js.Array[Double]): Self = StObject.set(x, "limitedPageNumbers", value.asInstanceOf[js.Any])
      
      inline def setLimitedPageNumbersVarargs(value: Double*): Self = StObject.set(x, "limitedPageNumbers", js.Array(value*))
      
      inline def setListOfPageNumbers(value: js.Array[Double]): Self = StObject.set(x, "listOfPageNumbers", value.asInstanceOf[js.Any])
      
      inline def setListOfPageNumbersVarargs(value: Double*): Self = StObject.set(x, "listOfPageNumbers", js.Array(value*))
      
      inline def setShowFirst(value: Boolean): Self = StObject.set(x, "showFirst", value.asInstanceOf[js.Any])
      
      inline def setShowLast(value: Boolean): Self = StObject.set(x, "showLast", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def getLinkTo(page: Any): Unit
    
    def go(page: Any): Unit
  }
  object Methods {
    
    inline def apply(getLinkTo: Any => Unit, go: Any => Unit): Methods = {
      val __obj = js.Dynamic.literal(getLinkTo = js.Any.fromFunction1(getLinkTo), go = js.Any.fromFunction1(go))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setGetLinkTo(value: Any => Unit): Self = StObject.set(x, "getLinkTo", js.Any.fromFunction1(value))
      
      inline def setGo(value: Any => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var current: Double
    
    var hasArrows: Boolean
    
    var pageParamName: String
    
    var total: Double
    
    var visible: Double
  }
  object Props {
    
    inline def apply(current: Double, hasArrows: Boolean, pageParamName: String, total: Double, visible: Double): Props = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], hasArrows = hasArrows.asInstanceOf[js.Any], pageParamName = pageParamName.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setHasArrows(value: Boolean): Self = StObject.set(x, "hasArrows", value.asInstanceOf[js.Any])
      
      inline def setPageParamName(value: String): Self = StObject.set(x, "pageParamName", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Double): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfPagination.foo` */
  override def _to: Constructor = ^
}

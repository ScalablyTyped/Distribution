package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yContextMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/A11yContext", "A11yContext")
  @js.native
  val A11yContext: Context[A11yContextStore] = js.native
  
  @JSImport("@storybook/addon-a11y/dist/components/A11yContext", "A11yContextProvider")
  @js.native
  val A11yContextProvider: FC[A11yContextProviderProps] = js.native
  
  @JSImport("@storybook/addon-a11y/dist/components/A11yContext", "useA11yContext")
  @js.native
  def useA11yContext(): A11yContextStore = js.native
  
  @js.native
  trait A11yContextProviderProps extends StObject {
    
    var active: Boolean = js.native
  }
  object A11yContextProviderProps {
    
    @scala.inline
    def apply(active: Boolean): A11yContextProviderProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[A11yContextProviderProps]
    }
    
    @scala.inline
    implicit class A11yContextProviderPropsMutableBuilder[Self <: A11yContextProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait A11yContextStore extends StObject {
    
    def clearHighlights(): Unit = js.native
    
    var highlighted: js.Array[String] = js.native
    
    var results: Results = js.native
    
    def setResults(results: Results): Unit = js.native
    
    def setTab(index: Double): Unit = js.native
    
    var tab: Double = js.native
    
    def toggleHighlight(target: js.Array[String], highlight: Boolean): Unit = js.native
  }
  object A11yContextStore {
    
    @scala.inline
    def apply(
      clearHighlights: () => Unit,
      highlighted: js.Array[String],
      results: Results,
      setResults: Results => Unit,
      setTab: Double => Unit,
      tab: Double,
      toggleHighlight: (js.Array[String], Boolean) => Unit
    ): A11yContextStore = {
      val __obj = js.Dynamic.literal(clearHighlights = js.Any.fromFunction0(clearHighlights), highlighted = highlighted.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], setResults = js.Any.fromFunction1(setResults), setTab = js.Any.fromFunction1(setTab), tab = tab.asInstanceOf[js.Any], toggleHighlight = js.Any.fromFunction2(toggleHighlight))
      __obj.asInstanceOf[A11yContextStore]
    }
    
    @scala.inline
    implicit class A11yContextStoreMutableBuilder[Self <: A11yContextStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearHighlights(value: () => Unit): Self = StObject.set(x, "clearHighlights", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHighlighted(value: js.Array[String]): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedVarargs(value: String*): Self = StObject.set(x, "highlighted", js.Array(value :_*))
      
      @scala.inline
      def setResults(value: Results): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetResults(value: Results => Unit): Self = StObject.set(x, "setResults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTab(value: Double => Unit): Self = StObject.set(x, "setTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTab(value: Double): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleHighlight(value: (js.Array[String], Boolean) => Unit): Self = StObject.set(x, "toggleHighlight", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    var incomplete: js.Array[Result] = js.native
    
    var passes: js.Array[Result] = js.native
    
    var violations: js.Array[Result] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(incomplete: js.Array[Result], passes: js.Array[Result], violations: js.Array[Result]): Results = {
      val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value :_*))
      
      @scala.inline
      def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value :_*))
      
      @scala.inline
      def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value :_*))
    }
  }
}

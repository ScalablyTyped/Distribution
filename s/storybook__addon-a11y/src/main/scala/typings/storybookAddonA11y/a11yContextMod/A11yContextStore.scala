package typings.storybookAddonA11y.a11yContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yContextStore extends js.Object {
  
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
  implicit class A11yContextStoreOps[Self <: A11yContextStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearHighlights(value: () => Unit): Self = this.set("clearHighlights", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHighlightedVarargs(value: String*): Self = this.set("highlighted", js.Array(value :_*))
    
    @scala.inline
    def setHighlighted(value: js.Array[String]): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: Results): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetResults(value: Results => Unit): Self = this.set("setResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTab(value: Double => Unit): Self = this.set("setTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTab(value: Double): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleHighlight(value: (js.Array[String], Boolean) => Unit): Self = this.set("toggleHighlight", js.Any.fromFunction2(value))
  }
}

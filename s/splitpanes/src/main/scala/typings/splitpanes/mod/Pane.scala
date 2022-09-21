package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Pane extends StObject {
  
  def beforeDestroy(): Unit
  
  def beforeUpdate(): Unit
  
  var computed: PaneComputed
  
  def data(): PaneData
  
  var methods: PaneMethods
  
  def mounted(): Unit
  
  var props: PaneProps
  
  def render(createEl: Any): Any
  
  var watch: PaneWatch
}
object Pane {
  
  @JSImport("splitpanes", "Pane")
  @js.native
  val ^ : Pane = js.native
  
  extension [Self <: Pane](x: Self) {
    
    inline def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
    
    inline def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
    
    inline def setComputed(value: PaneComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setData(value: () => PaneData): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    
    inline def setMethods(value: PaneMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
    
    inline def setProps(value: PaneProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Any => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setWatch(value: PaneWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}

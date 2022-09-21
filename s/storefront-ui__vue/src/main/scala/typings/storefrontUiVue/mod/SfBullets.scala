package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfBullets extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfBullets")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var inactiveLeft: Double
    
    var inactiveRight: Double
  }
  object Computed {
    
    inline def apply(inactiveLeft: Double, inactiveRight: Double): Computed = {
      val __obj = js.Dynamic.literal(inactiveLeft = inactiveLeft.asInstanceOf[js.Any], inactiveRight = inactiveRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setInactiveLeft(value: Double): Self = StObject.set(x, "inactiveLeft", value.asInstanceOf[js.Any])
      
      inline def setInactiveRight(value: Double): Self = StObject.set(x, "inactiveRight", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var current: Double
    
    var total: Double
  }
  object Props {
    
    inline def apply(current: Double, total: Double): Props = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfBullets.foo` */
  override def _to: Constructor = ^
}

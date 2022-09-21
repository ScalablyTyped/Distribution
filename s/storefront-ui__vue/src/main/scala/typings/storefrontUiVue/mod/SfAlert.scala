package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.storefrontUiVueStrings.added_to_cart
import typings.storefrontUiVue.storefrontUiVueStrings.danger
import typings.storefrontUiVue.storefrontUiVueStrings.info
import typings.storefrontUiVue.storefrontUiVueStrings.info_circle
import typings.storefrontUiVue.storefrontUiVueStrings.info_shield
import typings.storefrontUiVue.storefrontUiVueStrings.secondary
import typings.storefrontUiVue.storefrontUiVueStrings.success
import typings.storefrontUiVue.storefrontUiVueStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfAlert extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfAlert")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var icon: added_to_cart | info_shield | info_circle
  }
  object Computed {
    
    inline def apply(icon: added_to_cart | info_shield | info_circle): Computed = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIcon(value: added_to_cart | info_shield | info_circle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
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
    
    var message: String
    
    var `type`: secondary | info | success | warning | danger
  }
  object Props {
    
    inline def apply(message: String, `type`: secondary | info | success | warning | danger): Props = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: secondary | info | success | warning | danger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfAlert.foo` */
  override def _to: Constructor = ^
}

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

object SfNotification extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfNotification")
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: added_to_cart | info_shield | info_circle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
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
    
    def actionHandler(): Unit
    
    def closeHandler(): Unit
  }
  object Methods {
    
    inline def apply(actionHandler: () => Unit, closeHandler: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(actionHandler = js.Any.fromFunction0(actionHandler), closeHandler = js.Any.fromFunction0(closeHandler))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setActionHandler(value: () => Unit): Self = StObject.set(x, "actionHandler", js.Any.fromFunction0(value))
      
      inline def setCloseHandler(value: () => Unit): Self = StObject.set(x, "closeHandler", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var action: String
    
    var message: String
    
    var title: String
    
    var `type`: secondary | info | success | warning | danger
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      action: String,
      message: String,
      title: String,
      `type`: secondary | info | success | warning | danger,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: secondary | info | success | warning | danger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfNotification.foo` */
  override def _to: Constructor = ^
}

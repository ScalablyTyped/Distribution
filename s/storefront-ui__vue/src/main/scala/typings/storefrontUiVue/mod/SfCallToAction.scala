package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.anon.Calltoactionbackgroundcolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCallToAction extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCallToAction")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var style: Calltoactionbackgroundcolor
  }
  object Computed {
    
    inline def apply(style: Calltoactionbackgroundcolor): Computed = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setStyle(value: Calltoactionbackgroundcolor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
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
    
    var background: String
    
    var buttonText: String
    
    var description: String
    
    var image: String | Source
    
    var title: String
  }
  object Props {
    
    inline def apply(background: String, buttonText: String, description: String, image: String | Source, title: String): Props = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String | Source): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCallToAction.foo` */
  override def _to: Constructor = ^
}

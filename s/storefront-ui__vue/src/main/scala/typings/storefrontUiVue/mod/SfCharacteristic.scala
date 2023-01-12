package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCharacteristic extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCharacteristic")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(props: Props): Constructor = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var colorIcon: IconColor
    
    var description: String
    
    var icon: Icon | js.Array[Icon]
    
    var sizeIcon: IconSize
    
    var title: String
  }
  object Props {
    
    inline def apply(
      colorIcon: IconColor,
      description: String,
      icon: Icon | js.Array[Icon],
      sizeIcon: IconSize,
      title: String
    ): Props = {
      val __obj = js.Dynamic.literal(colorIcon = colorIcon.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], sizeIcon = sizeIcon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setColorIcon(value: IconColor): Self = StObject.set(x, "colorIcon", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon | js.Array[Icon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconVarargs(value: Icon*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setSizeIcon(value: IconSize): Self = StObject.set(x, "sizeIcon", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCharacteristic.foo` */
  override def _to: Constructor = ^
}

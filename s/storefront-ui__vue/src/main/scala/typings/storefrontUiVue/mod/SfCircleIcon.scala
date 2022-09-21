package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCircleIcon extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCircleIcon")
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
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var badgeLabel: String
    
    var disabled: Boolean
    
    var hasBadge: Boolean
    
    var icon: Icon | js.Array[Icon]
    
    var iconColor: IconColor
    
    var iconSize: IconSize
  }
  object Props {
    
    inline def apply(
      badgeLabel: String,
      disabled: Boolean,
      hasBadge: Boolean,
      icon: Icon | js.Array[Icon],
      iconColor: IconColor,
      iconSize: IconSize
    ): Props = {
      val __obj = js.Dynamic.literal(badgeLabel = badgeLabel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasBadge = hasBadge.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBadgeLabel(value: String): Self = StObject.set(x, "badgeLabel", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHasBadge(value: Boolean): Self = StObject.set(x, "hasBadge", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon | js.Array[Icon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconColor(value: IconColor): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconSize(value: IconSize): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconVarargs(value: Icon*): Self = StObject.set(x, "icon", js.Array(value*))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCircleIcon.foo` */
  override def _to: Constructor = ^
}

package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfIcon extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfIcon")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var iconColorClass: String
    
    var iconCustomStyle: Record[String, String]
    
    var iconPaths: String | js.Array[String]
    
    var iconSizeClass: String
    
    var iconViewBox: String
    
    var isSFColors: Boolean
    
    var isSFIcons: Boolean
    
    var isSFSizes: Boolean
  }
  object Computed {
    
    inline def apply(
      iconColorClass: String,
      iconCustomStyle: Record[String, String],
      iconPaths: String | js.Array[String],
      iconSizeClass: String,
      iconViewBox: String,
      isSFColors: Boolean,
      isSFIcons: Boolean,
      isSFSizes: Boolean
    ): Computed = {
      val __obj = js.Dynamic.literal(iconColorClass = iconColorClass.asInstanceOf[js.Any], iconCustomStyle = iconCustomStyle.asInstanceOf[js.Any], iconPaths = iconPaths.asInstanceOf[js.Any], iconSizeClass = iconSizeClass.asInstanceOf[js.Any], iconViewBox = iconViewBox.asInstanceOf[js.Any], isSFColors = isSFColors.asInstanceOf[js.Any], isSFIcons = isSFIcons.asInstanceOf[js.Any], isSFSizes = isSFSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setIconColorClass(value: String): Self = StObject.set(x, "iconColorClass", value.asInstanceOf[js.Any])
      
      inline def setIconCustomStyle(value: Record[String, String]): Self = StObject.set(x, "iconCustomStyle", value.asInstanceOf[js.Any])
      
      inline def setIconPaths(value: String | js.Array[String]): Self = StObject.set(x, "iconPaths", value.asInstanceOf[js.Any])
      
      inline def setIconPathsVarargs(value: String*): Self = StObject.set(x, "iconPaths", js.Array(value*))
      
      inline def setIconSizeClass(value: String): Self = StObject.set(x, "iconSizeClass", value.asInstanceOf[js.Any])
      
      inline def setIconViewBox(value: String): Self = StObject.set(x, "iconViewBox", value.asInstanceOf[js.Any])
      
      inline def setIsSFColors(value: Boolean): Self = StObject.set(x, "isSFColors", value.asInstanceOf[js.Any])
      
      inline def setIsSFIcons(value: Boolean): Self = StObject.set(x, "isSFIcons", value.asInstanceOf[js.Any])
      
      inline def setIsSFSizes(value: Boolean): Self = StObject.set(x, "isSFSizes", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var badgeLabel: String
    
    var color: IconColor
    
    var hasBadge: Boolean
    
    var icon: Icon | js.Array[Icon]
    
    var size: IconSize
    
    var viewBox: String
  }
  object Props {
    
    inline def apply(
      badgeLabel: String,
      color: IconColor,
      hasBadge: Boolean,
      icon: Icon | js.Array[Icon],
      size: IconSize,
      viewBox: String
    ): Props = {
      val __obj = js.Dynamic.literal(badgeLabel = badgeLabel.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], hasBadge = hasBadge.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setBadgeLabel(value: String): Self = StObject.set(x, "badgeLabel", value.asInstanceOf[js.Any])
      
      inline def setColor(value: IconColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHasBadge(value: Boolean): Self = StObject.set(x, "hasBadge", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon | js.Array[Icon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconVarargs(value: Icon*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setSize(value: IconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfIcon.foo` */
  override def _to: Constructor = ^
}

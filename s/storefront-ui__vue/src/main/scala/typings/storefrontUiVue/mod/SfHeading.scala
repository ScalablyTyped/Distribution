package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfHeading extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfHeading")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var hasSubtitle: Boolean
  }
  object Computed {
    
    inline def apply(hasSubtitle: Boolean): Computed = {
      val __obj = js.Dynamic.literal(hasSubtitle = hasSubtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setHasSubtitle(value: Boolean): Self = StObject.set(x, "hasSubtitle", value.asInstanceOf[js.Any])
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
    
    var level: Double
    
    var subTitle: String
    
    var title: String
  }
  object Props {
    
    inline def apply(level: Double, subTitle: String, title: String): Props = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfHeading.foo` */
  override def _to: Constructor = ^
}

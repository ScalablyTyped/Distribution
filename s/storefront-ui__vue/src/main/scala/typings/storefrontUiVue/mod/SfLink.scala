package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Location
import typings.storefrontUiVue.anon.Href
import typings.storefrontUiVue.anon.To
import typings.storefrontUiVue.storefrontUiVueStrings.`nuxt-link`
import typings.storefrontUiVue.storefrontUiVueStrings.`router-link`
import typings.storefrontUiVue.storefrontUiVueStrings.a
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfLink extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfLink")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isExternal: Boolean
    
    var isNativeLinkTag: Boolean
    
    var linkComponentTag: a | `nuxt-link` | `router-link`
    
    var urlTag: Href | To
  }
  object Computed {
    
    inline def apply(
      isExternal: Boolean,
      isNativeLinkTag: Boolean,
      linkComponentTag: a | `nuxt-link` | `router-link`,
      urlTag: Href | To
    ): Computed = {
      val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], isNativeLinkTag = isNativeLinkTag.asInstanceOf[js.Any], linkComponentTag = linkComponentTag.asInstanceOf[js.Any], urlTag = urlTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setIsNativeLinkTag(value: Boolean): Self = StObject.set(x, "isNativeLinkTag", value.asInstanceOf[js.Any])
      
      inline def setLinkComponentTag(value: a | `nuxt-link` | `router-link`): Self = StObject.set(x, "linkComponentTag", value.asInstanceOf[js.Any])
      
      inline def setUrlTag(value: Href | To): Self = StObject.set(x, "urlTag", value.asInstanceOf[js.Any])
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
    
    var link: String | Location
  }
  object Props {
    
    inline def apply(link: String | Location): Props = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setLink(value: String | Location): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfLink.foo` */
  override def _to: Constructor = ^
}

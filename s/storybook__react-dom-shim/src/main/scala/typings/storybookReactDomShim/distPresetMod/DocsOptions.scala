package typings.storybookReactDomShim.distPresetMod

import typings.storybookReactDomShim.storybookReactDomShimStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsOptions extends StObject {
  
  /**
    * Should we generate a docs entry per CSF file?
    * Set to 'tag' (the default) to generate an entry for every CSF file with the
    * 'autodocs' tag.
    */
  var autodocs: js.UndefOr[Boolean | tag] = js.undefined
  
  /**
    * What should we call the generated docs entries?
    */
  var defaultName: js.UndefOr[String] = js.undefined
  
  /**
    * Only show doc entries in the side bar (usually set with the `--docs` CLI flag)
    */
  var docsMode: js.UndefOr[Boolean] = js.undefined
}
object DocsOptions {
  
  inline def apply(): DocsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocsOptions] (val x: Self) extends AnyVal {
    
    inline def setAutodocs(value: Boolean | tag): Self = StObject.set(x, "autodocs", value.asInstanceOf[js.Any])
    
    inline def setAutodocsUndefined: Self = StObject.set(x, "autodocs", js.undefined)
    
    inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
    
    inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    
    inline def setDocsModeUndefined: Self = StObject.set(x, "docsMode", js.undefined)
  }
}

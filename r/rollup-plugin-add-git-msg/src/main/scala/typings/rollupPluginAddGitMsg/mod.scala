package typings.rollupPluginAddGitMsg

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: AddGitMsgPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-add-git-msg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AddGitMsgPluginOptions extends StObject {
    
    var copyright: js.UndefOr[String | Null] = js.undefined
    
    var showCommitID: js.UndefOr[Boolean] = js.undefined
    
    var showDate: js.UndefOr[Boolean] = js.undefined
    
    var showTag: js.UndefOr[Boolean] = js.undefined
  }
  object AddGitMsgPluginOptions {
    
    inline def apply(): AddGitMsgPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddGitMsgPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddGitMsgPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setShowCommitID(value: Boolean): Self = StObject.set(x, "showCommitID", value.asInstanceOf[js.Any])
      
      inline def setShowCommitIDUndefined: Self = StObject.set(x, "showCommitID", js.undefined)
      
      inline def setShowDate(value: Boolean): Self = StObject.set(x, "showDate", value.asInstanceOf[js.Any])
      
      inline def setShowDateUndefined: Self = StObject.set(x, "showDate", js.undefined)
      
      inline def setShowTag(value: Boolean): Self = StObject.set(x, "showTag", value.asInstanceOf[js.Any])
      
      inline def setShowTagUndefined: Self = StObject.set(x, "showTag", js.undefined)
    }
  }
}

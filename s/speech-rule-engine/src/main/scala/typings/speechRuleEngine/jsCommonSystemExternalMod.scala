package typings.speechRuleEngine

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonSystemExternalMod {
  
  @JSImport("speech-rule-engine/js/common/system_external", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SystemExternal
  /* static members */
  object default {
    
    @JSImport("speech-rule-engine/js/common/system_external", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.WGXpath")
    @js.native
    def WGXpath: String = js.native
    inline def WGXpath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGXpath")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.commander")
    @js.native
    def commander: Any = js.native
    inline def commander_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commander")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.document")
    @js.native
    def document: Document = js.native
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.documentSupported")
    @js.native
    def documentSupported: Boolean = js.native
    inline def documentSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentSupported")(x.asInstanceOf[js.Any])
    
    inline def document_=(x: Document): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    inline def extRequire(library: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extRequire")(library.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.fs")
    @js.native
    def fs: Any = js.native
    inline def fs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.jsonPath")
    @js.native
    def jsonPath: String = js.native
    inline def jsonPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.mathmapsIePath")
    @js.native
    def mathmapsIePath: String = js.native
    inline def mathmapsIePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mathmapsIePath")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.url")
    @js.native
    def url: String = js.native
    inline def url_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.wgxpath")
    @js.native
    def wgxpath: Any = js.native
    inline def wgxpath_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wgxpath")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.windowSupported")
    @js.native
    def windowSupported: Boolean = js.native
    inline def windowSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.xmldom")
    @js.native
    def xmldom: Any = js.native
    inline def xmldom_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xmldom")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/system_external", "default.xpath")
    @js.native
    def xpath: Any = js.native
    inline def xpath_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xpath")(x.asInstanceOf[js.Any])
  }
  
  trait SystemExternal extends StObject
}

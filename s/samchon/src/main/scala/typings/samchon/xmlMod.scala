package typings.samchon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("samchon/library/XML", "XML")
  @js.native
  class XML ()
    extends typings.sxml.mod.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.xmlMod.XML) = this()
  }
  /* static members */
  object XML {
    
    @JSImport("samchon/library/XML", "XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("samchon/library/XML", "XML._Compute_min_index")
    @js.native
    def _Compute_min_index: js.Any = js.native
    @scala.inline
    def _Compute_min_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon/library/XML", "XML._Repeat")
    @js.native
    def _Repeat: js.Any = js.native
    @scala.inline
    def _Repeat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    @JSImport("samchon/library/XML", "XML.decode_property")
    @js.native
    def decodeProperty(str: String): String = js.native
    
    @JSImport("samchon/library/XML", "XML.decode_value")
    @js.native
    def decodeValue(str: String): String = js.native
    
    @JSImport("samchon/library/XML", "XML.encode_property")
    @js.native
    def encodeProperty(str: String): String = js.native
    
    @JSImport("samchon/library/XML", "XML.encode_value")
    @js.native
    def encodeValue(str: String): String = js.native
    
    @JSImport("samchon/library/XML", "XML.head")
    @js.native
    def head(): String = js.native
    @JSImport("samchon/library/XML", "XML.head")
    @js.native
    def head(encoding: String): String = js.native
  }
  
  @JSImport("samchon/library/XML", "XMLList")
  @js.native
  class XMLList ()
    extends typings.sxml.mod.XMLList
}

package typings.samchon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryXmlMod {
  
  object default {
    
    @JSImport("samchon/library/XML", "default.XML")
    @js.native
    open class XML ()
      extends typings.sxml.mod.default.XML {
      def this(str: String) = this()
      def this(xml: typings.sxml.libModuleXmlMod.XML) = this()
    }
    /* static members */
    object XML {
      
      @JSImport("samchon/library/XML", "default.XML")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @hidden
        */
      @JSImport("samchon/library/XML", "default.XML._Compute_min_index")
      @js.native
      def _Compute_min_index: Any = js.native
      inline def _Compute_min_index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
      
      /**
        * @hidden
        */
      @JSImport("samchon/library/XML", "default.XML._Repeat")
      @js.native
      def _Repeat: Any = js.native
      inline def _Repeat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
      
      inline def decodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def decodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def encodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def encodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def head(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[String]
      inline def head(encoding: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(encoding.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSImport("samchon/library/XML", "default.XMLList")
    @js.native
    open class XMLList ()
      extends typings.sxml.mod.default.XMLList
  }
  
  @JSImport("samchon/library/XML", "XML")
  @js.native
  open class XML ()
    extends typings.sxml.mod.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.libModuleXmlMod.XML) = this()
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
    def _Compute_min_index: Any = js.native
    inline def _Compute_min_index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon/library/XML", "XML._Repeat")
    @js.native
    def _Repeat: Any = js.native
    inline def _Repeat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    inline def decodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def head(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[String]
    inline def head(encoding: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(encoding.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("samchon/library/XML", "XMLList")
  @js.native
  open class XMLList ()
    extends typings.sxml.mod.XMLList
}

package typings.rdflib

import typings.rdflib.namedNodeMod.default
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsJsMod {
  
  @JSImport("rdflib/lib/utils-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DOMParserFactory(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DOMParserFactory")().asInstanceOf[Any]
  
  inline def RDFArrayRemove(a: Any, x: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RDFArrayRemove")(a.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callbackify(obj: Any, callbacks: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(obj.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def domToString(node: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("domToString")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dtstamp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dtstamp")().asInstanceOf[String]
  
  inline def dumpNode(node: Any, options: Any, selfClosing: Any, skipAttributes: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dumpNode")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any], skipAttributes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def heavyCompare(x: Any, y: Any, g: Any, uriMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("heavyCompare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], g.asInstanceOf[js.Any], uriMap.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def heavyCompareSPO(x: Any, y: Any, g: Any, uriMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("heavyCompareSPO")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], g.asInstanceOf[js.Any], uriMap.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def linkRelationProperty(relation: Any): default = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRelationProperty")(relation.asInstanceOf[js.Any]).asInstanceOf[default]
  
  object log {
    
    @JSImport("rdflib/lib/utils-js", "log")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def msg(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def success(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def mediaTypeClass(mediaType: Any): default = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTypeClass")(mediaType.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def output(o: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseXML(str: Any, options: Any): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def stackString(e: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stackString")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringStartswith(str: Any, pref: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("string_startswith")(str.asInstanceOf[js.Any], pref.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object uri {
    
    @JSImport("rdflib/lib/utils-js", "uri")
    @js.native
    val ^ : js.Any = js.native
    
    inline def docpart(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("docpart")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def document(x: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(x.asInstanceOf[js.Any]).asInstanceOf[default]
    
    inline def hostpart(u: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostpart")(u.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def join(`given`: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(`given`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def protocol(uri: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("protocol")(uri.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def refTo(base: String, uri: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("refTo")(base.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}

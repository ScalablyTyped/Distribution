package typings.saxes

import typings.saxes.mod.EventName
import typings.saxes.mod.SaxesAttributeNSIncomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saxesStrings {
  
  @js.native
  sealed trait `1Dot0` extends StObject
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `1Dot1` extends StObject
  inline def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  
  @js.native
  sealed trait attribute
    extends StObject
       with EventName
  inline def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait cdata
    extends StObject
       with EventName
  inline def cdata: cdata = "cdata".asInstanceOf[cdata]
  
  @js.native
  sealed trait closetag
    extends StObject
       with EventName
  inline def closetag: closetag = "closetag".asInstanceOf[closetag]
  
  @js.native
  sealed trait comment
    extends StObject
       with EventName
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait doctype
    extends StObject
       with EventName
  inline def doctype: doctype = "doctype".asInstanceOf[doctype]
  
  @js.native
  sealed trait end
    extends StObject
       with EventName
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with EventName
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait local
    extends StObject
       with SaxesAttributeNSIncomplete
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait name
    extends StObject
       with SaxesAttributeNSIncomplete
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait opentag
    extends StObject
       with EventName
  inline def opentag: opentag = "opentag".asInstanceOf[opentag]
  
  @js.native
  sealed trait opentagstart
    extends StObject
       with EventName
  inline def opentagstart: opentagstart = "opentagstart".asInstanceOf[opentagstart]
  
  @js.native
  sealed trait prefix
    extends StObject
       with SaxesAttributeNSIncomplete
  inline def prefix: prefix = "prefix".asInstanceOf[prefix]
  
  @js.native
  sealed trait processinginstruction
    extends StObject
       with EventName
  inline def processinginstruction: processinginstruction = "processinginstruction".asInstanceOf[processinginstruction]
  
  @js.native
  sealed trait ready
    extends StObject
       with EventName
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait text
    extends StObject
       with EventName
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait value
    extends StObject
       with SaxesAttributeNSIncomplete
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait xmldecl
    extends StObject
       with EventName
  inline def xmldecl: xmldecl = "xmldecl".asInstanceOf[xmldecl]
}

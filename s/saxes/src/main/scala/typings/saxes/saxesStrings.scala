package typings.saxes

import typings.saxes.mod.EventName
import typings.saxes.mod.SaxesAttributeNSIncomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saxesStrings {
  
  @js.native
  sealed trait `1Dot0` extends StObject
  @scala.inline
  def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `1Dot1` extends StObject
  @scala.inline
  def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  
  @js.native
  sealed trait attribute extends EventName
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait cdata extends EventName
  @scala.inline
  def cdata: cdata = "cdata".asInstanceOf[cdata]
  
  @js.native
  sealed trait closetag extends EventName
  @scala.inline
  def closetag: closetag = "closetag".asInstanceOf[closetag]
  
  @js.native
  sealed trait comment extends EventName
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait doctype extends EventName
  @scala.inline
  def doctype: doctype = "doctype".asInstanceOf[doctype]
  
  @js.native
  sealed trait end extends EventName
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends EventName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait local extends SaxesAttributeNSIncomplete
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait name extends SaxesAttributeNSIncomplete
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait opentag extends EventName
  @scala.inline
  def opentag: opentag = "opentag".asInstanceOf[opentag]
  
  @js.native
  sealed trait opentagstart extends EventName
  @scala.inline
  def opentagstart: opentagstart = "opentagstart".asInstanceOf[opentagstart]
  
  @js.native
  sealed trait prefix extends SaxesAttributeNSIncomplete
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  
  @js.native
  sealed trait processinginstruction extends EventName
  @scala.inline
  def processinginstruction: processinginstruction = "processinginstruction".asInstanceOf[processinginstruction]
  
  @js.native
  sealed trait ready extends EventName
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait text extends EventName
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait value extends SaxesAttributeNSIncomplete
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait xmldecl extends EventName
  @scala.inline
  def xmldecl: xmldecl = "xmldecl".asInstanceOf[xmldecl]
}

package typings.saxes

import typings.saxes.mod.EventName
import typings.saxes.mod.SaxesAttributeNSIncomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object saxesStrings {
  @js.native
  sealed trait `1Dot0` extends js.Object
  
  @js.native
  sealed trait `1Dot1` extends js.Object
  
  @js.native
  sealed trait attribute extends EventName
  
  @js.native
  sealed trait cdata extends EventName
  
  @js.native
  sealed trait closetag extends EventName
  
  @js.native
  sealed trait comment extends EventName
  
  @js.native
  sealed trait doctype extends EventName
  
  @js.native
  sealed trait end extends EventName
  
  @js.native
  sealed trait error extends EventName
  
  @js.native
  sealed trait local extends SaxesAttributeNSIncomplete
  
  @js.native
  sealed trait name extends SaxesAttributeNSIncomplete
  
  @js.native
  sealed trait opentag extends EventName
  
  @js.native
  sealed trait opentagstart extends EventName
  
  @js.native
  sealed trait prefix extends SaxesAttributeNSIncomplete
  
  @js.native
  sealed trait processinginstruction extends EventName
  
  @js.native
  sealed trait ready extends EventName
  
  @js.native
  sealed trait text extends EventName
  
  @js.native
  sealed trait value extends SaxesAttributeNSIncomplete
  
  @js.native
  sealed trait xmldecl extends EventName
  
  @scala.inline
  def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  @scala.inline
  def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  @scala.inline
  def cdata: cdata = "cdata".asInstanceOf[cdata]
  @scala.inline
  def closetag: closetag = "closetag".asInstanceOf[closetag]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def doctype: doctype = "doctype".asInstanceOf[doctype]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def opentag: opentag = "opentag".asInstanceOf[opentag]
  @scala.inline
  def opentagstart: opentagstart = "opentagstart".asInstanceOf[opentagstart]
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  @scala.inline
  def processinginstruction: processinginstruction = "processinginstruction".asInstanceOf[processinginstruction]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def xmldecl: xmldecl = "xmldecl".asInstanceOf[xmldecl]
}


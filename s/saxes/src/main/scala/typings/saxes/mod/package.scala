package typings.saxes.mod

import typings.saxes.anon.Body
import typings.saxes.mod.^
import typings.saxes.saxesStrings.attribute
import typings.saxes.saxesStrings.cdata
import typings.saxes.saxesStrings.closetag
import typings.saxes.saxesStrings.comment
import typings.saxes.saxesStrings.doctype
import typings.saxes.saxesStrings.end
import typings.saxes.saxesStrings.error
import typings.saxes.saxesStrings.opentag
import typings.saxes.saxesStrings.opentagstart
import typings.saxes.saxesStrings.processinginstruction
import typings.saxes.saxesStrings.ready
import typings.saxes.saxesStrings.text
import typings.saxes.saxesStrings.xmldecl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EVENTS: js.Tuple13[
xmldecl, 
text, 
processinginstruction, 
doctype, 
comment, 
opentagstart, 
attribute, 
opentag, 
closetag, 
cdata, 
error, 
end, 
ready] = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENTS").asInstanceOf[js.Tuple13[
xmldecl, 
text, 
processinginstruction, 
doctype, 
comment, 
opentagstart, 
attribute, 
opentag, 
closetag, 
cdata, 
error, 
end, 
ready]]

type AttributeHandler[O] = js.Function1[/* attribute */ AttributeEventForOptions[O], Unit]

type CDataHandler = js.Function1[/* cdata */ String, Unit]

type CloseTagHandler[O] = js.Function1[/* tag */ TagForOptions[O], Unit]

type CommentHandler = js.Function1[/* comment */ String, Unit]

type DoctypeHandler = js.Function1[/* doctype */ String, Unit]

type EndHandler = js.Function0[Unit]

type ErrorHandler = js.Function1[/* err */ js.Error, Unit]

type EventNameToHandler[O, N /* <: EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: saxes.anon.Attribute<O>[N] */ js.Any

type OpenTagHandler[O] = js.Function1[/* tag */ TagForOptions[O], Unit]

type OpenTagStartHandler[O] = js.Function1[/* tag */ StartTagForOptions[O], Unit]

type PIHandler = js.Function1[/* data */ Body, Unit]

type ReadyHandler = js.Function0[Unit]

type ResolvePrefix = js.Function1[/* prefix */ String, js.UndefOr[String]]

type TextHandler = js.Function1[/* text */ String, Unit]

type XMLDeclHandler = js.Function1[/* decl */ XMLDecl, Unit]

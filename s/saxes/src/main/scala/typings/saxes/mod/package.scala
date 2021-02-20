package typings.saxes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributeHandler[O] = js.Function1[/* attribute */ typings.saxes.mod.AttributeEventForOptions[O], scala.Unit]
  
  type CDataHandler = js.Function1[/* cdata */ java.lang.String, scala.Unit]
  
  type CloseTagHandler[O] = js.Function1[/* tag */ typings.saxes.mod.TagForOptions[O], scala.Unit]
  
  type CommentHandler = js.Function1[/* comment */ java.lang.String, scala.Unit]
  
  type DoctypeHandler = js.Function1[/* doctype */ java.lang.String, scala.Unit]
  
  @scala.inline
  def EVENTS: js.Tuple13[
    typings.saxes.saxesStrings.xmldecl, 
    typings.saxes.saxesStrings.text, 
    typings.saxes.saxesStrings.processinginstruction, 
    typings.saxes.saxesStrings.doctype, 
    typings.saxes.saxesStrings.comment, 
    typings.saxes.saxesStrings.opentagstart, 
    typings.saxes.saxesStrings.attribute, 
    typings.saxes.saxesStrings.opentag, 
    typings.saxes.saxesStrings.closetag, 
    typings.saxes.saxesStrings.cdata, 
    typings.saxes.saxesStrings.error, 
    typings.saxes.saxesStrings.end, 
    typings.saxes.saxesStrings.ready
  ] = typings.saxes.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EVENTS").asInstanceOf[js.Tuple13[
    typings.saxes.saxesStrings.xmldecl, 
    typings.saxes.saxesStrings.text, 
    typings.saxes.saxesStrings.processinginstruction, 
    typings.saxes.saxesStrings.doctype, 
    typings.saxes.saxesStrings.comment, 
    typings.saxes.saxesStrings.opentagstart, 
    typings.saxes.saxesStrings.attribute, 
    typings.saxes.saxesStrings.opentag, 
    typings.saxes.saxesStrings.closetag, 
    typings.saxes.saxesStrings.cdata, 
    typings.saxes.saxesStrings.error, 
    typings.saxes.saxesStrings.end, 
    typings.saxes.saxesStrings.ready
  ]]
  
  type EndHandler = js.Function0[scala.Unit]
  
  type ErrorHandler = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type EventNameToHandler[O, N /* <: typings.saxes.mod.EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: saxes.anon.Attribute<O>[N] */ js.Any
  
  type OpenTagHandler[O] = js.Function1[/* tag */ typings.saxes.mod.TagForOptions[O], scala.Unit]
  
  type OpenTagStartHandler[O] = js.Function1[/* tag */ typings.saxes.mod.StartTagForOptions[O], scala.Unit]
  
  type PIHandler = js.Function1[/* data */ typings.saxes.anon.Body, scala.Unit]
  
  type ReadyHandler = js.Function0[scala.Unit]
  
  type ResolvePrefix = js.Function1[/* prefix */ java.lang.String, js.UndefOr[java.lang.String]]
  
  type SaxesOptions = typings.saxes.mod.CommonOptions with typings.saxes.mod.NSOptions with typings.saxes.mod.XMLVersionOptions
  
  type TextHandler = js.Function1[/* text */ java.lang.String, scala.Unit]
  
  type XMLDeclHandler = js.Function1[/* decl */ typings.saxes.mod.XMLDecl, scala.Unit]
}

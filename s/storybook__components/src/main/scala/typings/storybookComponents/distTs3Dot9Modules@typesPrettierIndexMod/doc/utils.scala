package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc

import typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "doc.utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanDoc(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanDoc")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def findInDoc[T](doc: Doc_, callback: js.Function1[/* doc */ Doc_, T], defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findInDoc")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getDocParts(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocParts")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def isConcat(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcat")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLineNext(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineNext")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mapDoc[T](doc: Doc_, callback: js.Function1[/* doc */ Doc_, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDoc")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def normalizeDoc(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDoc")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def normalizeParts(parts: js.Array[Doc_]): js.Array[Doc_] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeParts")(parts.asInstanceOf[js.Any]).asInstanceOf[js.Array[Doc_]]
  
  inline def propagateBreaks(doc: Doc_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateBreaks")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeLines(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLines")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def replaceNewlinesWithLiterallines(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceNewlinesWithLiterallines")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def stripTrailingHardline(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingHardline")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  inline def traverseDoc(doc: Doc_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def traverseDoc(doc: Doc_, onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: Unit,
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(doc: Doc_, onEnter: Unit, onExit: js.Function1[/* doc */ Doc_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(
    doc: Doc_,
    onEnter: Unit,
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDoc(doc: Doc_, onEnter: Unit, onExit: Unit, shouldTraverseConditionalGroups: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def willBreak(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("willBreak")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

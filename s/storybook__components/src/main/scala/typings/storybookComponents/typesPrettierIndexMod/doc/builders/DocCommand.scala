package typings.storybookComponents.typesPrettierIndexMod.doc.builders

import typings.storybookComponents.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Align_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.BreakParent_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Concat_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Cursor_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Fill_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Group_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.IfBreak_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Indent_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.IndentIfBreak_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Label_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Line_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffix_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffixBoundary_
  - typings.storybookComponents.typesPrettierIndexMod.doc.builders.Trim_
*/
trait DocCommand extends StObject
object DocCommand {
  
  inline def Align_(contents: Doc, n: Double | String | Type): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("align")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Align_]
  }
  
  inline def BreakParent_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.BreakParent_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("break-parent")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.BreakParent_]
  }
  
  inline def Concat_(parts: js.Array[Doc]): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Concat_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("concat")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Concat_]
  }
  
  inline def Cursor_(placeholder: js.Symbol): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Cursor_ = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Cursor_]
  }
  
  inline def Fill_(parts: js.Array[Doc]): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Fill_]
  }
  
  inline def Group_(break: Boolean, contents: Doc, expandedStates: js.Array[Doc]): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Group_]
  }
  
  inline def IfBreak_(breakContents: Doc, flatContents: Doc): typings.storybookComponents.typesPrettierIndexMod.doc.builders.IfBreak_ = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("if-break")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.IfBreak_]
  }
  
  inline def IndentIfBreak_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.IndentIfBreak_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("indent-if-break")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.IndentIfBreak_]
  }
  
  inline def Indent_(contents: Doc): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Indent_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("indent")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Indent_]
  }
  
  inline def Label_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Label_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Label_]
  }
  
  inline def LineSuffixBoundary_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffixBoundary_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line-suffix-boundary")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffixBoundary_]
  }
  
  inline def LineSuffix_(contents: Doc): typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffix_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line-suffix")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.LineSuffix_]
  }
  
  inline def Line_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Line_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Line_]
  }
  
  inline def Trim_(): typings.storybookComponents.typesPrettierIndexMod.doc.builders.Trim_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[typings.storybookComponents.typesPrettierIndexMod.doc.builders.Trim_]
  }
}

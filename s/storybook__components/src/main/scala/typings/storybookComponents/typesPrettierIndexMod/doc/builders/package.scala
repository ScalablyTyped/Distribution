package typings.storybookComponents.typesPrettierIndexMod.doc.builders

import typings.storybookComponents.anon.GroupId
import typings.storybookComponents.anon.Negate
import typings.storybookComponents.anon.Type
import typings.storybookComponents.typesPrettierIndexMod.doc.builders.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addAlignmentToDoc(doc: Doc, size: Double, tabWidth: Double): Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("addAlignmentToDoc")(doc.asInstanceOf[js.Any], size.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any])).asInstanceOf[Doc]

inline def align(widthOrString: String, doc: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(widthOrString.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Align_]
/** @see [align](https://github.com/prettier/prettier/blob/main/commands.md#align) */
inline def align(widthOrString: Double, doc: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(widthOrString.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Align_]
inline def align(widthOrString: Type, doc: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(widthOrString.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Align_]

/** @see [breakParent](https://github.com/prettier/prettier/blob/main/commands.md#breakparent) */
inline def breakParent: BreakParent_ = ^.asInstanceOf[js.Dynamic].selectDynamic("breakParent").asInstanceOf[BreakParent_]

/**
  * @see [concat](https://github.com/prettier/prettier/blob/main/commands.md#deprecated-concat)
  * @deprecated use `Doc[]` instead
  */
inline def concat(docs: js.Array[Doc]): Concat_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(docs.asInstanceOf[js.Any]).asInstanceOf[Concat_]

/** @see [conditionalGroup](https://github.com/prettier/prettier/blob/main/commands.md#conditionalgroup) */
inline def conditionalGroup(alternatives: js.Array[Doc]): Group_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalGroup")(alternatives.asInstanceOf[js.Any]).asInstanceOf[Group_]
inline def conditionalGroup(alternatives: js.Array[Doc], options: GroupOptions): Group_ = (^.asInstanceOf[js.Dynamic].applyDynamic("conditionalGroup")(alternatives.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Group_]

/** @see [cursor](https://github.com/prettier/prettier/blob/main/commands.md#cursor) */
inline def cursor: Cursor_ = ^.asInstanceOf[js.Dynamic].selectDynamic("cursor").asInstanceOf[Cursor_]

/** @see [dedent](https://github.com/prettier/prettier/blob/main/commands.md#dedent) */
inline def dedent(doc: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(doc.asInstanceOf[js.Any]).asInstanceOf[Align_]

/** @see [dedentToRoot](https://github.com/prettier/prettier/blob/main/commands.md#dedenttoroot) */
inline def dedentToRoot(doc: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dedentToRoot")(doc.asInstanceOf[js.Any]).asInstanceOf[Align_]

/** @see [fill](https://github.com/prettier/prettier/blob/main/commands.md#fill) */
inline def fill(docs: js.Array[Doc]): Fill_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(docs.asInstanceOf[js.Any]).asInstanceOf[Fill_]

/** @see [group](https://github.com/prettier/prettier/blob/main/commands.md#group) */
inline def group(doc: Doc): Group_ = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(doc.asInstanceOf[js.Any]).asInstanceOf[Group_]
inline def group(doc: Doc, opts: GroupOptions): Group_ = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(doc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group_]

/** @see [hardline](https://github.com/prettier/prettier/blob/main/commands.md#hardline) */
inline def hardline: Concat_ = ^.asInstanceOf[js.Dynamic].selectDynamic("hardline").asInstanceOf[Concat_]

/** @see [hardlineWithoutBreakParent](https://github.com/prettier/prettier/blob/main/commands.md#hardlinewithoutbreakparent-and-literallinewithoutbreakparent) */
inline def hardlineWithoutBreakParent: HardlineWithoutBreakParent_ = ^.asInstanceOf[js.Dynamic].selectDynamic("hardlineWithoutBreakParent").asInstanceOf[HardlineWithoutBreakParent_]

/** @see [ifBreak](https://github.com/prettier/prettier/blob/main/commands.md#ifbreak) */
inline def ifBreak(ifBreak: Doc): IfBreak_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ifBreak")(ifBreak.asInstanceOf[js.Any]).asInstanceOf[IfBreak_]
inline def ifBreak(ifBreak: Doc, noBreak: Unit, options: GroupId): IfBreak_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifBreak")(ifBreak.asInstanceOf[js.Any], noBreak.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IfBreak_]
inline def ifBreak(ifBreak: Doc, noBreak: Doc): IfBreak_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifBreak")(ifBreak.asInstanceOf[js.Any], noBreak.asInstanceOf[js.Any])).asInstanceOf[IfBreak_]
inline def ifBreak(ifBreak: Doc, noBreak: Doc, options: GroupId): IfBreak_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifBreak")(ifBreak.asInstanceOf[js.Any], noBreak.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IfBreak_]

/** @see [indent](https://github.com/prettier/prettier/blob/main/commands.md#indent) */
inline def indent(doc: Doc): Indent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(doc.asInstanceOf[js.Any]).asInstanceOf[Indent_]

/** @see [indentIfBreak](https://github.com/prettier/prettier/blob/main/commands.md#indentifbreak) */
inline def indentIfBreak(doc: Doc, opts: Negate): IndentIfBreak_ = (^.asInstanceOf[js.Dynamic].applyDynamic("indentIfBreak")(doc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IndentIfBreak_]

/** @see [join](https://github.com/prettier/prettier/blob/main/commands.md#join) */
inline def join(sep: Doc, docs: js.Array[Doc]): Concat_ = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(sep.asInstanceOf[js.Any], docs.asInstanceOf[js.Any])).asInstanceOf[Concat_]

/** @see [label](https://github.com/prettier/prettier/blob/main/commands.md#label) */
inline def label(label: String, doc: Doc): Label_ = (^.asInstanceOf[js.Dynamic].applyDynamic("label")(label.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Label_]

/** @see [line](https://github.com/prettier/prettier/blob/main/commands.md#line) */
inline def line: Line_ = ^.asInstanceOf[js.Dynamic].selectDynamic("line").asInstanceOf[Line_]

/** @see [lineSuffix](https://github.com/prettier/prettier/blob/main/commands.md#linesuffix) */
inline def lineSuffix(suffix: Doc): LineSuffix_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lineSuffix")(suffix.asInstanceOf[js.Any]).asInstanceOf[LineSuffix_]

/** @see [lineSuffixBoundary](https://github.com/prettier/prettier/blob/main/commands.md#linesuffixboundary) */
inline def lineSuffixBoundary: LineSuffixBoundary_ = ^.asInstanceOf[js.Dynamic].selectDynamic("lineSuffixBoundary").asInstanceOf[LineSuffixBoundary_]

/** @see [literalline](https://github.com/prettier/prettier/blob/main/commands.md#literalline) */
inline def literalline: Concat_ = ^.asInstanceOf[js.Dynamic].selectDynamic("literalline").asInstanceOf[Concat_]

/** @see [literallineWithoutBreakParent](https://github.com/prettier/prettier/blob/main/commands.md#hardlinewithoutbreakparent-and-literallinewithoutbreakparent) */
inline def literallineWithoutBreakParent: LiterallineWithoutBreakParent_ = ^.asInstanceOf[js.Dynamic].selectDynamic("literallineWithoutBreakParent").asInstanceOf[LiterallineWithoutBreakParent_]

/** @see [markAsRoot](https://github.com/prettier/prettier/blob/main/commands.md#markasroot) */
inline def markAsRoot(doc: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsRoot")(doc.asInstanceOf[js.Any]).asInstanceOf[Align_]

/** @see [softline](https://github.com/prettier/prettier/blob/main/commands.md#softline) */
inline def softline: Softline_ = ^.asInstanceOf[js.Dynamic].selectDynamic("softline").asInstanceOf[Softline_]

/** @see [trim](https://github.com/prettier/prettier/blob/main/commands.md#trim) */
inline def trim: Trim_ = ^.asInstanceOf[js.Dynamic].selectDynamic("trim").asInstanceOf[Trim_]

type Doc = String | js.Array[Any] | DocCommand

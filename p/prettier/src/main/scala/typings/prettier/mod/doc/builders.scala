package typings.prettier.mod.doc

import typings.prettier.anon.ShouldBreak
import typings.prettier.anon.Type
import typings.prettier.prettierStrings.`break-parent`
import typings.prettier.prettierStrings.`if-break`
import typings.prettier.prettierStrings.`line-suffix-boundary`
import typings.prettier.prettierStrings.`line-suffix`
import typings.prettier.prettierStrings.align
import typings.prettier.prettierStrings.concat
import typings.prettier.prettierStrings.fill
import typings.prettier.prettierStrings.group
import typings.prettier.prettierStrings.indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builders {
  
  @JSImport("prettier", "doc.builders")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addAlignmentToDoc(doc: Doc, size: Double, tabWidth: Double): Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("addAlignmentToDoc")(doc.asInstanceOf[js.Any], size.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any])).asInstanceOf[Doc]
  
  @scala.inline
  def align(n: String, contents: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(n.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[Align_]
  @scala.inline
  def align(n: Double, contents: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(n.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[Align_]
  @scala.inline
  def align(n: Type, contents: Doc): Align_ = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(n.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[Align_]
  
  @JSImport("prettier", "doc.builders.breakParent")
  @js.native
  val breakParent: BreakParent_ = js.native
  
  @scala.inline
  def concat(contents: js.Array[Doc]): Concat_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(contents.asInstanceOf[js.Any]).asInstanceOf[Concat_]
  
  @scala.inline
  def conditionalGroup(states: js.Array[Doc]): Group_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionalGroup")(states.asInstanceOf[js.Any]).asInstanceOf[Group_]
  @scala.inline
  def conditionalGroup(states: js.Array[Doc], opts: ShouldBreak): Group_ = (^.asInstanceOf[js.Dynamic].applyDynamic("conditionalGroup")(states.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group_]
  
  @JSImport("prettier", "doc.builders.cursor")
  @js.native
  val cursor: Cursor_ = js.native
  
  @scala.inline
  def dedent(contents: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(contents.asInstanceOf[js.Any]).asInstanceOf[Align_]
  
  @scala.inline
  def dedentToRoot(contents: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dedentToRoot")(contents.asInstanceOf[js.Any]).asInstanceOf[Align_]
  
  @scala.inline
  def fill(parts: js.Array[Doc]): Fill_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(parts.asInstanceOf[js.Any]).asInstanceOf[Fill_]
  
  @scala.inline
  def group(contents: Doc): Group_ = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(contents.asInstanceOf[js.Any]).asInstanceOf[Group_]
  @scala.inline
  def group(contents: Doc, opts: ShouldBreak): Group_ = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(contents.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group_]
  
  @JSImport("prettier", "doc.builders.hardline")
  @js.native
  val hardline: Concat_ = js.native
  
  @scala.inline
  def ifBreak(breakContents: Doc, flatContents: Doc): IfBreak_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifBreak")(breakContents.asInstanceOf[js.Any], flatContents.asInstanceOf[js.Any])).asInstanceOf[IfBreak_]
  
  @scala.inline
  def indent(contents: Doc): Indent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(contents.asInstanceOf[js.Any]).asInstanceOf[Indent_]
  
  @scala.inline
  def join(separator: Doc, parts: js.Array[Doc]): Concat_ = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Concat_]
  
  @JSImport("prettier", "doc.builders.line")
  @js.native
  val line: Line_ = js.native
  
  @scala.inline
  def lineSuffix(contents: Doc): LineSuffix_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lineSuffix")(contents.asInstanceOf[js.Any]).asInstanceOf[LineSuffix_]
  
  @JSImport("prettier", "doc.builders.lineSuffixBoundary")
  @js.native
  val lineSuffixBoundary: LineSuffixBoundary_ = js.native
  
  @JSImport("prettier", "doc.builders.literalline")
  @js.native
  val literalline: Concat_ = js.native
  
  @scala.inline
  def markAsRoot(contents: Doc): Align_ = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsRoot")(contents.asInstanceOf[js.Any]).asInstanceOf[Align_]
  
  @JSImport("prettier", "doc.builders.softline")
  @js.native
  val softline: Line_ = js.native
  
  @JSImport("prettier", "doc.builders.trim")
  @js.native
  val trim: Trim_ = js.native
  
  trait Align_
    extends StObject
       with _Doc {
    
    var contents: Doc
    
    var n: Double | String | Type
    
    var `type`: align
  }
  object Align_ {
    
    @scala.inline
    def apply(contents: Doc, n: Double | String | Type): Align_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("align")
      __obj.asInstanceOf[Align_]
    }
    
    @scala.inline
    implicit class Align_MutableBuilder[Self <: Align_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double | String | Type): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: align): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreakParent_
    extends StObject
       with _Doc {
    
    var `type`: `break-parent`
  }
  object BreakParent_ {
    
    @scala.inline
    def apply(): BreakParent_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("break-parent")
      __obj.asInstanceOf[BreakParent_]
    }
    
    @scala.inline
    implicit class BreakParent_MutableBuilder[Self <: BreakParent_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `break-parent`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Concat_
    extends StObject
       with _Doc {
    
    var parts: js.Array[Doc]
    
    var `type`: concat
  }
  object Concat_ {
    
    @scala.inline
    def apply(parts: js.Array[Doc]): Concat_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("concat")
      __obj.asInstanceOf[Concat_]
    }
    
    @scala.inline
    implicit class Concat_MutableBuilder[Self <: Concat_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[Doc]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: Doc*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setType(value: concat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cursor_
    extends StObject
       with _Doc {
    
    var placeholder: js.Symbol
    
    var `type`: typings.prettier.prettierStrings.cursor
  }
  object Cursor_ {
    
    @scala.inline
    def apply(placeholder: js.Symbol): Cursor_ = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cursor")
      __obj.asInstanceOf[Cursor_]
    }
    
    @scala.inline
    implicit class Cursor_MutableBuilder[Self <: Cursor_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: js.Symbol): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typings.prettier.prettierStrings.cursor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.prettier.mod.doc.builders.Align_
    - typings.prettier.mod.doc.builders.BreakParent_
    - typings.prettier.mod.doc.builders.Concat_
    - typings.prettier.mod.doc.builders.Fill_
    - typings.prettier.mod.doc.builders.Group_
    - typings.prettier.mod.doc.builders.IfBreak_
    - typings.prettier.mod.doc.builders.Indent_
    - typings.prettier.mod.doc.builders.Line_
    - typings.prettier.mod.doc.builders.LineSuffix_
    - typings.prettier.mod.doc.builders.LineSuffixBoundary_
    - typings.prettier.mod.doc.builders.Trim_
    - typings.prettier.mod.doc.builders.Cursor_
  */
  type Doc = _Doc | String
  
  trait Fill_
    extends StObject
       with _Doc {
    
    var parts: js.Array[Doc]
    
    var `type`: fill
  }
  object Fill_ {
    
    @scala.inline
    def apply(parts: js.Array[Doc]): Fill_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fill")
      __obj.asInstanceOf[Fill_]
    }
    
    @scala.inline
    implicit class Fill_MutableBuilder[Self <: Fill_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[Doc]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: Doc*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setType(value: fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group_
    extends StObject
       with _Doc {
    
    var break: Boolean
    
    var contents: Doc
    
    var expandedStates: js.Array[Doc]
    
    var `type`: group
  }
  object Group_ {
    
    @scala.inline
    def apply(break: Boolean, contents: Doc, expandedStates: js.Array[Doc]): Group_ = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[Group_]
    }
    
    @scala.inline
    implicit class Group_MutableBuilder[Self <: Group_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedStates(value: js.Array[Doc]): Self = StObject.set(x, "expandedStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedStatesVarargs(value: Doc*): Self = StObject.set(x, "expandedStates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IfBreak_
    extends StObject
       with _Doc {
    
    var breakContents: Doc
    
    var flatContents: Doc
    
    var `type`: `if-break`
  }
  object IfBreak_ {
    
    @scala.inline
    def apply(breakContents: Doc, flatContents: Doc): IfBreak_ = {
      val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("if-break")
      __obj.asInstanceOf[IfBreak_]
    }
    
    @scala.inline
    implicit class IfBreak_MutableBuilder[Self <: IfBreak_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakContents(value: Doc): Self = StObject.set(x, "breakContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatContents(value: Doc): Self = StObject.set(x, "flatContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `if-break`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Indent_
    extends StObject
       with _Doc {
    
    var contents: Doc
    
    var `type`: indent
  }
  object Indent_ {
    
    @scala.inline
    def apply(contents: Doc): Indent_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("indent")
      __obj.asInstanceOf[Indent_]
    }
    
    @scala.inline
    implicit class Indent_MutableBuilder[Self <: Indent_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: indent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineSuffixBoundary_
    extends StObject
       with _Doc {
    
    var `type`: `line-suffix-boundary`
  }
  object LineSuffixBoundary_ {
    
    @scala.inline
    def apply(): LineSuffixBoundary_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("line-suffix-boundary")
      __obj.asInstanceOf[LineSuffixBoundary_]
    }
    
    @scala.inline
    implicit class LineSuffixBoundary_MutableBuilder[Self <: LineSuffixBoundary_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `line-suffix-boundary`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineSuffix_
    extends StObject
       with _Doc {
    
    var contents: Doc
    
    var `type`: `line-suffix`
  }
  object LineSuffix_ {
    
    @scala.inline
    def apply(contents: Doc): LineSuffix_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line-suffix")
      __obj.asInstanceOf[LineSuffix_]
    }
    
    @scala.inline
    implicit class LineSuffix_MutableBuilder[Self <: LineSuffix_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `line-suffix`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Line_
    extends StObject
       with _Doc {
    
    var hard: js.UndefOr[Boolean] = js.undefined
    
    var literal: js.UndefOr[Boolean] = js.undefined
    
    var soft: js.UndefOr[Boolean] = js.undefined
    
    var `type`: typings.prettier.prettierStrings.line
  }
  object Line_ {
    
    @scala.inline
    def apply(): Line_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[Line_]
    }
    
    @scala.inline
    implicit class Line_MutableBuilder[Self <: Line_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
      
      @scala.inline
      def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      @scala.inline
      def setSoft(value: Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
      
      @scala.inline
      def setType(value: typings.prettier.prettierStrings.line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Trim_
    extends StObject
       with _Doc {
    
    var `type`: typings.prettier.prettierStrings.trim
  }
  object Trim_ {
    
    @scala.inline
    def apply(): Trim_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("trim")
      __obj.asInstanceOf[Trim_]
    }
    
    @scala.inline
    implicit class Trim_MutableBuilder[Self <: Trim_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.prettier.prettierStrings.trim): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Doc extends StObject
  object _Doc {
    
    @scala.inline
    def Align_(contents: Doc, n: Double | String | Type): typings.prettier.mod.doc.builders.Align_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("align")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Align_]
    }
    
    @scala.inline
    def BreakParent_(): typings.prettier.mod.doc.builders.BreakParent_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("break-parent")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.BreakParent_]
    }
    
    @scala.inline
    def Concat_(parts: js.Array[Doc]): typings.prettier.mod.doc.builders.Concat_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("concat")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Concat_]
    }
    
    @scala.inline
    def Cursor_(placeholder: js.Symbol): typings.prettier.mod.doc.builders.Cursor_ = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cursor")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Cursor_]
    }
    
    @scala.inline
    def Fill_(parts: js.Array[Doc]): typings.prettier.mod.doc.builders.Fill_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fill")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Fill_]
    }
    
    @scala.inline
    def Group_(break: Boolean, contents: Doc, expandedStates: js.Array[Doc]): typings.prettier.mod.doc.builders.Group_ = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Group_]
    }
    
    @scala.inline
    def IfBreak_(breakContents: Doc, flatContents: Doc): typings.prettier.mod.doc.builders.IfBreak_ = {
      val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("if-break")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.IfBreak_]
    }
    
    @scala.inline
    def Indent_(contents: Doc): typings.prettier.mod.doc.builders.Indent_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("indent")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Indent_]
    }
    
    @scala.inline
    def LineSuffixBoundary_(): typings.prettier.mod.doc.builders.LineSuffixBoundary_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("line-suffix-boundary")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.LineSuffixBoundary_]
    }
    
    @scala.inline
    def LineSuffix_(contents: Doc): typings.prettier.mod.doc.builders.LineSuffix_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line-suffix")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.LineSuffix_]
    }
    
    @scala.inline
    def Line_(): typings.prettier.mod.doc.builders.Line_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Line_]
    }
    
    @scala.inline
    def Trim_(): typings.prettier.mod.doc.builders.Trim_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("trim")
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Trim_]
    }
  }
}

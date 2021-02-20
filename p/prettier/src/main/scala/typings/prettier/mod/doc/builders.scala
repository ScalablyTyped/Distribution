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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builders {
  
  @JSImport("prettier", "doc.builders.addAlignmentToDoc")
  @js.native
  def addAlignmentToDoc(doc: Doc, size: Double, tabWidth: Double): Doc = js.native
  
  @JSImport("prettier", "doc.builders.align")
  @js.native
  def align(n: String, contents: Doc): Align_ = js.native
  @JSImport("prettier", "doc.builders.align")
  @js.native
  def align(n: Double, contents: Doc): Align_ = js.native
  @JSImport("prettier", "doc.builders.align")
  @js.native
  def align(n: Type, contents: Doc): Align_ = js.native
  
  @JSImport("prettier", "doc.builders.breakParent")
  @js.native
  val breakParent: BreakParent_ = js.native
  
  @JSImport("prettier", "doc.builders.concat")
  @js.native
  def concat(contents: js.Array[Doc]): Concat_ = js.native
  
  @JSImport("prettier", "doc.builders.conditionalGroup")
  @js.native
  def conditionalGroup(states: js.Array[Doc]): Group_ = js.native
  @JSImport("prettier", "doc.builders.conditionalGroup")
  @js.native
  def conditionalGroup(states: js.Array[Doc], opts: ShouldBreak): Group_ = js.native
  
  @JSImport("prettier", "doc.builders.cursor")
  @js.native
  val cursor: Cursor_ = js.native
  
  @JSImport("prettier", "doc.builders.dedent")
  @js.native
  def dedent(contents: Doc): Align_ = js.native
  
  @JSImport("prettier", "doc.builders.dedentToRoot")
  @js.native
  def dedentToRoot(contents: Doc): Align_ = js.native
  
  @JSImport("prettier", "doc.builders.fill")
  @js.native
  def fill(parts: js.Array[Doc]): Fill_ = js.native
  
  @JSImport("prettier", "doc.builders.group")
  @js.native
  def group(contents: Doc): Group_ = js.native
  @JSImport("prettier", "doc.builders.group")
  @js.native
  def group(contents: Doc, opts: ShouldBreak): Group_ = js.native
  
  @JSImport("prettier", "doc.builders.hardline")
  @js.native
  val hardline: Concat_ = js.native
  
  @JSImport("prettier", "doc.builders.ifBreak")
  @js.native
  def ifBreak(breakContents: Doc, flatContents: Doc): IfBreak_ = js.native
  
  @JSImport("prettier", "doc.builders.indent")
  @js.native
  def indent(contents: Doc): Indent_ = js.native
  
  @JSImport("prettier", "doc.builders.join")
  @js.native
  def join(separator: Doc, parts: js.Array[Doc]): Concat_ = js.native
  
  @JSImport("prettier", "doc.builders.line")
  @js.native
  val line: Line_ = js.native
  
  @JSImport("prettier", "doc.builders.lineSuffix")
  @js.native
  def lineSuffix(contents: Doc): LineSuffix_ = js.native
  
  @JSImport("prettier", "doc.builders.lineSuffixBoundary")
  @js.native
  val lineSuffixBoundary: LineSuffixBoundary_ = js.native
  
  @JSImport("prettier", "doc.builders.literalline")
  @js.native
  val literalline: Concat_ = js.native
  
  @JSImport("prettier", "doc.builders.markAsRoot")
  @js.native
  def markAsRoot(contents: Doc): Align_ = js.native
  
  @JSImport("prettier", "doc.builders.softline")
  @js.native
  val softline: Line_ = js.native
  
  @JSImport("prettier", "doc.builders.trim")
  @js.native
  val trim: Trim_ = js.native
  
  @js.native
  trait Align_ extends _Doc {
    
    var contents: Doc = js.native
    
    var n: Double | String | Type = js.native
    
    var `type`: align = js.native
  }
  object Align_ {
    
    @scala.inline
    def apply(contents: Doc, n: Double | String | Type, `type`: align): Align_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait BreakParent_ extends _Doc {
    
    var `type`: `break-parent` = js.native
  }
  object BreakParent_ {
    
    @scala.inline
    def apply(`type`: `break-parent`): BreakParent_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakParent_]
    }
    
    @scala.inline
    implicit class BreakParent_MutableBuilder[Self <: BreakParent_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `break-parent`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Concat_ extends _Doc {
    
    var parts: js.Array[Doc] = js.native
    
    var `type`: concat = js.native
  }
  object Concat_ {
    
    @scala.inline
    def apply(parts: js.Array[Doc], `type`: concat): Concat_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Cursor_ extends _Doc {
    
    var placeholder: js.Symbol = js.native
    
    var `type`: typings.prettier.prettierStrings.cursor = js.native
  }
  object Cursor_ {
    
    @scala.inline
    def apply(placeholder: js.Symbol, `type`: typings.prettier.prettierStrings.cursor): Cursor_ = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Fill_ extends _Doc {
    
    var parts: js.Array[Doc] = js.native
    
    var `type`: fill = js.native
  }
  object Fill_ {
    
    @scala.inline
    def apply(parts: js.Array[Doc], `type`: fill): Fill_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Group_ extends _Doc {
    
    var break: Boolean = js.native
    
    var contents: Doc = js.native
    
    var expandedStates: js.Array[Doc] = js.native
    
    var `type`: group = js.native
  }
  object Group_ {
    
    @scala.inline
    def apply(break: Boolean, contents: Doc, expandedStates: js.Array[Doc], `type`: group): Group_ = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait IfBreak_ extends _Doc {
    
    var breakContents: Doc = js.native
    
    var flatContents: Doc = js.native
    
    var `type`: `if-break` = js.native
  }
  object IfBreak_ {
    
    @scala.inline
    def apply(breakContents: Doc, flatContents: Doc, `type`: `if-break`): IfBreak_ = {
      val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Indent_ extends _Doc {
    
    var contents: Doc = js.native
    
    var `type`: indent = js.native
  }
  object Indent_ {
    
    @scala.inline
    def apply(contents: Doc, `type`: indent): Indent_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait LineSuffixBoundary_ extends _Doc {
    
    var `type`: `line-suffix-boundary` = js.native
  }
  object LineSuffixBoundary_ {
    
    @scala.inline
    def apply(`type`: `line-suffix-boundary`): LineSuffixBoundary_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineSuffixBoundary_]
    }
    
    @scala.inline
    implicit class LineSuffixBoundary_MutableBuilder[Self <: LineSuffixBoundary_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `line-suffix-boundary`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LineSuffix_ extends _Doc {
    
    var contents: Doc = js.native
    
    var `type`: `line-suffix` = js.native
  }
  object LineSuffix_ {
    
    @scala.inline
    def apply(contents: Doc, `type`: `line-suffix`): LineSuffix_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Line_ extends _Doc {
    
    var hard: js.UndefOr[Boolean] = js.native
    
    var literal: js.UndefOr[Boolean] = js.native
    
    var soft: js.UndefOr[Boolean] = js.native
    
    var `type`: typings.prettier.prettierStrings.line = js.native
  }
  object Line_ {
    
    @scala.inline
    def apply(`type`: typings.prettier.prettierStrings.line): Line_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Trim_ extends _Doc {
    
    var `type`: typings.prettier.prettierStrings.trim = js.native
  }
  object Trim_ {
    
    @scala.inline
    def apply(`type`: typings.prettier.prettierStrings.trim): Trim_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def Align_(contents: Doc, n: Double | String | Type, `type`: align): typings.prettier.mod.doc.builders.Align_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Align_]
    }
    
    @scala.inline
    def BreakParent_(`type`: `break-parent`): typings.prettier.mod.doc.builders.BreakParent_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.BreakParent_]
    }
    
    @scala.inline
    def Concat_(parts: js.Array[Doc], `type`: concat): typings.prettier.mod.doc.builders.Concat_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Concat_]
    }
    
    @scala.inline
    def Cursor_(placeholder: js.Symbol, `type`: typings.prettier.prettierStrings.cursor): typings.prettier.mod.doc.builders.Cursor_ = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Cursor_]
    }
    
    @scala.inline
    def Fill_(parts: js.Array[Doc], `type`: fill): typings.prettier.mod.doc.builders.Fill_ = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Fill_]
    }
    
    @scala.inline
    def Group_(break: Boolean, contents: Doc, expandedStates: js.Array[Doc], `type`: group): typings.prettier.mod.doc.builders.Group_ = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Group_]
    }
    
    @scala.inline
    def IfBreak_(breakContents: Doc, flatContents: Doc, `type`: `if-break`): typings.prettier.mod.doc.builders.IfBreak_ = {
      val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.IfBreak_]
    }
    
    @scala.inline
    def Indent_(contents: Doc, `type`: indent): typings.prettier.mod.doc.builders.Indent_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Indent_]
    }
    
    @scala.inline
    def LineSuffixBoundary_(`type`: `line-suffix-boundary`): typings.prettier.mod.doc.builders.LineSuffixBoundary_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.LineSuffixBoundary_]
    }
    
    @scala.inline
    def LineSuffix_(contents: Doc, `type`: `line-suffix`): typings.prettier.mod.doc.builders.LineSuffix_ = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.LineSuffix_]
    }
    
    @scala.inline
    def Line_(`type`: typings.prettier.prettierStrings.line): typings.prettier.mod.doc.builders.Line_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Line_]
    }
    
    @scala.inline
    def Trim_(`type`: typings.prettier.prettierStrings.trim): typings.prettier.mod.doc.builders.Trim_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prettier.mod.doc.builders.Trim_]
    }
  }
}

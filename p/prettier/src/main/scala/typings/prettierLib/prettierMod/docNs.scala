package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "doc")
@js.native
object docNs extends js.Object {
  @JSName("builders")
  @js.native
  object buildersNs extends js.Object {
    trait Align extends js.Object {
      var contents: Doc
      var n: scala.Double | java.lang.String | prettierLib.Anon_Root
      var `type`: prettierLib.prettierLibStrings.align
    }
    
    trait BreakParent extends js.Object {
      var `type`: prettierLib.prettierLibStrings.`break-parent`
    }
    
    trait Concat extends js.Object {
      var parts: js.Array[Doc]
      var `type`: prettierLib.prettierLibStrings.concat
    }
    
    trait Fill extends js.Object {
      var parts: js.Array[Doc]
      var `type`: prettierLib.prettierLibStrings.fill
    }
    
    trait Group extends js.Object {
      var break: scala.Boolean
      var contents: Doc
      var expandedStates: js.Array[Doc]
      var `type`: prettierLib.prettierLibStrings.group
    }
    
    trait IfBreak extends js.Object {
      var breakContents: Doc
      var flatContents: Doc
      var `type`: prettierLib.prettierLibStrings.`if-break`
    }
    
    trait Indent extends js.Object {
      var contents: Doc
      var `type`: prettierLib.prettierLibStrings.indent
    }
    
    trait Line extends js.Object {
      var hard: js.UndefOr[scala.Boolean] = js.undefined
      var literal: js.UndefOr[scala.Boolean] = js.undefined
      var soft: js.UndefOr[scala.Boolean] = js.undefined
      var `type`: prettierLib.prettierLibStrings.line
    }
    
    trait LineSuffix extends js.Object {
      var contents: Doc
      var `type`: prettierLib.prettierLibStrings.`line-suffix`
    }
    
    trait LineSuffixBoundary extends js.Object {
      var `type`: prettierLib.prettierLibStrings.`line-suffix-boundary`
    }
    
    val breakParent: BreakParent = js.native
    val hardline: Concat = js.native
    val line: Line = js.native
    val lineSuffixBoundary: LineSuffixBoundary = js.native
    val literalline: Concat = js.native
    val softline: Line = js.native
    def addAlignmentToDoc(doc: Doc, size: scala.Double, tabWidth: scala.Double): Doc = js.native
    def align(n: java.lang.String, contents: Doc): Align = js.native
    def align(n: prettierLib.Anon_Root, contents: Doc): Align = js.native
    def align(n: scala.Double, contents: Doc): Align = js.native
    def concat(contents: js.Array[Doc]): Concat = js.native
    def conditionalGroup(states: js.Array[Doc]): Group = js.native
    def conditionalGroup(states: js.Array[Doc], opts: prettierLib.Anon_ShouldBreak): Group = js.native
    def dedent(contents: Doc): Align = js.native
    def dedentToRoot(contents: Doc): Align = js.native
    def fill(parts: js.Array[Doc]): Fill = js.native
    def group(contents: Doc): Group = js.native
    def group(contents: Doc, opts: prettierLib.Anon_ShouldBreak): Group = js.native
    def ifBreak(breakContents: Doc, flatContents: Doc): IfBreak = js.native
    def indent(contents: Doc): Indent = js.native
    def join(separator: Doc, parts: js.Array[Doc]): Concat = js.native
    def lineSuffix(contents: Doc): LineSuffix = js.native
    def markAsRoot(contents: Doc): Align = js.native
    type Doc = java.lang.String | Align | BreakParent | Concat | Fill | Group | IfBreak | Indent | Line | LineSuffix | LineSuffixBoundary
  }
  
  @JSName("debug")
  @js.native
  object debugNs extends js.Object {
    def printDocToDebug(doc: prettierLib.prettierMod.Doc): java.lang.String = js.native
  }
  
  @JSName("printer")
  @js.native
  object printerNs extends js.Object {
    trait Options extends js.Object {
      /**
        * Specify the line length that the printer will wrap on.
        */
      var printWidth: scala.Double
      /**
        * Specify the number of spaces per indentation-level.
        */
      var tabWidth: scala.Double
      /**
        * Indent lines with tabs instead of spaces
        */
      var useTabs: scala.Boolean
    }
    
    def printDocToString(doc: prettierLib.prettierMod.Doc, options: Options): prettierLib.Anon_CursorNodeStart = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    def isEmpty(doc: prettierLib.prettierMod.Doc): scala.Boolean = js.native
    def isLineNext(doc: prettierLib.prettierMod.Doc): scala.Boolean = js.native
    def mapDoc[T](doc: prettierLib.prettierMod.Doc, callback: js.Function1[/* doc */ prettierLib.prettierMod.Doc, T]): T = js.native
    def propagateBreaks(doc: prettierLib.prettierMod.Doc): scala.Unit = js.native
    def removeLines(doc: prettierLib.prettierMod.Doc): prettierLib.prettierMod.Doc = js.native
    def stripTrailingHardline(doc: prettierLib.prettierMod.Doc): prettierLib.prettierMod.Doc = js.native
    def traverseDoc(doc: prettierLib.prettierMod.Doc): scala.Unit = js.native
    def traverseDoc(
      doc: prettierLib.prettierMod.Doc,
      onEnter: js.Function1[/* doc */ prettierLib.prettierMod.Doc, scala.Unit | scala.Boolean]
    ): scala.Unit = js.native
    def traverseDoc(
      doc: prettierLib.prettierMod.Doc,
      onEnter: js.Function1[/* doc */ prettierLib.prettierMod.Doc, scala.Unit | scala.Boolean],
      onExit: js.Function1[/* doc */ prettierLib.prettierMod.Doc, scala.Unit]
    ): scala.Unit = js.native
    def traverseDoc(
      doc: prettierLib.prettierMod.Doc,
      onEnter: js.Function1[/* doc */ prettierLib.prettierMod.Doc, scala.Unit | scala.Boolean],
      onExit: js.Function1[/* doc */ prettierLib.prettierMod.Doc, scala.Unit],
      shouldTraverseConditionalGroups: scala.Boolean
    ): scala.Unit = js.native
    def willBreak(doc: prettierLib.prettierMod.Doc): scala.Boolean = js.native
  }
  
}


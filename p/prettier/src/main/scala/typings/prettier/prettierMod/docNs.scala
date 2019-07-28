package typings.prettier.prettierMod

import typings.prettier.Anon_CursorNodeStart
import typings.prettier.Anon_Root
import typings.prettier.Anon_ShouldBreak
import typings.prettier.prettierMod.docNs.buildersNs.Align
import typings.prettier.prettierMod.docNs.buildersNs.BreakParent
import typings.prettier.prettierMod.docNs.buildersNs.Concat
import typings.prettier.prettierMod.docNs.buildersNs.Fill
import typings.prettier.prettierMod.docNs.buildersNs.Group
import typings.prettier.prettierMod.docNs.buildersNs.IfBreak
import typings.prettier.prettierMod.docNs.buildersNs.Indent
import typings.prettier.prettierMod.docNs.buildersNs.Line
import typings.prettier.prettierMod.docNs.buildersNs.LineSuffix
import typings.prettier.prettierMod.docNs.buildersNs.LineSuffixBoundary
import typings.prettier.prettierMod.docNs.buildersNs._Doc
import typings.prettier.prettierStrings.`break-parent`
import typings.prettier.prettierStrings.`if-break`
import typings.prettier.prettierStrings.`line-suffix-boundary`
import typings.prettier.prettierStrings.`line-suffix`
import typings.prettier.prettierStrings.align
import typings.prettier.prettierStrings.concat
import typings.prettier.prettierStrings.fill
import typings.prettier.prettierStrings.group
import typings.prettier.prettierStrings.indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "doc")
@js.native
object docNs extends js.Object {
  @JSName("builders")
  @js.native
  object buildersNs extends js.Object {
    trait Align extends _Doc {
      var contents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var n: Double | String | Anon_Root
      var `type`: align
    }
    
    trait BreakParent extends _Doc {
      var `type`: `break-parent`
    }
    
    trait Concat extends _Doc {
      var parts: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]
      var `type`: concat
    }
    
    trait Fill extends _Doc {
      var parts: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]
      var `type`: fill
    }
    
    trait Group extends _Doc {
      var break: Boolean
      var contents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var expandedStates: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]
      var `type`: group
    }
    
    trait IfBreak extends _Doc {
      var breakContents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var flatContents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var `type`: `if-break`
    }
    
    trait Indent extends _Doc {
      var contents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var `type`: indent
    }
    
    trait Line extends _Doc {
      var hard: js.UndefOr[Boolean] = js.undefined
      var literal: js.UndefOr[Boolean] = js.undefined
      var soft: js.UndefOr[Boolean] = js.undefined
      var `type`: typings.prettier.prettierStrings.line
    }
    
    trait LineSuffix extends _Doc {
      var contents: typings.prettier.prettierMod.docNs.buildersNs.Doc
      var `type`: `line-suffix`
    }
    
    trait LineSuffixBoundary extends _Doc {
      var `type`: `line-suffix-boundary`
    }
    
    trait _Doc extends js.Object
    
    val breakParent: BreakParent = js.native
    val hardline: Concat = js.native
    val line: Line = js.native
    val lineSuffixBoundary: LineSuffixBoundary = js.native
    val literalline: Concat = js.native
    val softline: Line = js.native
    def addAlignmentToDoc(doc: typings.prettier.prettierMod.docNs.buildersNs.Doc, size: Double, tabWidth: Double): typings.prettier.prettierMod.docNs.buildersNs.Doc = js.native
    def align(n: String, contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    def align(n: Double, contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    def align(n: Anon_Root, contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    def concat(contents: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]): Concat = js.native
    def conditionalGroup(states: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]): Group = js.native
    def conditionalGroup(states: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc], opts: Anon_ShouldBreak): Group = js.native
    def dedent(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    def dedentToRoot(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    def fill(parts: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]): Fill = js.native
    def group(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Group = js.native
    def group(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc, opts: Anon_ShouldBreak): Group = js.native
    def ifBreak(
      breakContents: typings.prettier.prettierMod.docNs.buildersNs.Doc,
      flatContents: typings.prettier.prettierMod.docNs.buildersNs.Doc
    ): IfBreak = js.native
    def indent(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Indent = js.native
    def join(
      separator: typings.prettier.prettierMod.docNs.buildersNs.Doc,
      parts: js.Array[typings.prettier.prettierMod.docNs.buildersNs.Doc]
    ): Concat = js.native
    def lineSuffix(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): LineSuffix = js.native
    def markAsRoot(contents: typings.prettier.prettierMod.docNs.buildersNs.Doc): Align = js.native
    /* Rewritten from type alias, can be one of: 
      - java.lang.String
      - typings.prettier.prettierMod.docNs.buildersNs.Align
      - typings.prettier.prettierMod.docNs.buildersNs.BreakParent
      - typings.prettier.prettierMod.docNs.buildersNs.Concat
      - typings.prettier.prettierMod.docNs.buildersNs.Fill
      - typings.prettier.prettierMod.docNs.buildersNs.Group
      - typings.prettier.prettierMod.docNs.buildersNs.IfBreak
      - typings.prettier.prettierMod.docNs.buildersNs.Indent
      - typings.prettier.prettierMod.docNs.buildersNs.Line
      - typings.prettier.prettierMod.docNs.buildersNs.LineSuffix
      - typings.prettier.prettierMod.docNs.buildersNs.LineSuffixBoundary
    */
    type Doc = _Doc | String
  }
  
  @JSName("debug")
  @js.native
  object debugNs extends js.Object {
    def printDocToDebug(doc: Doc): String = js.native
  }
  
  @JSName("printer")
  @js.native
  object printerNs extends js.Object {
    trait Options extends js.Object {
      /**
        * Specify the line length that the printer will wrap on.
        */
      var printWidth: Double
      /**
        * Specify the number of spaces per indentation-level.
        */
      var tabWidth: Double
      /**
        * Indent lines with tabs instead of spaces
        */
      var useTabs: Boolean
    }
    
    def printDocToString(doc: Doc, options: typings.prettier.prettierMod.docNs.printerNs.Options): Anon_CursorNodeStart = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    def isEmpty(doc: Doc): Boolean = js.native
    def isLineNext(doc: Doc): Boolean = js.native
    def mapDoc[T](doc: Doc, callback: js.Function1[/* doc */ Doc, T]): T = js.native
    def propagateBreaks(doc: Doc): Unit = js.native
    def removeLines(doc: Doc): Doc = js.native
    def stripTrailingHardline(doc: Doc): Doc = js.native
    def traverseDoc(doc: Doc): Unit = js.native
    def traverseDoc(doc: Doc, onEnter: js.Function1[/* doc */ Doc, Unit | Boolean]): Unit = js.native
    def traverseDoc(
      doc: Doc,
      onEnter: js.Function1[/* doc */ Doc, Unit | Boolean],
      onExit: js.Function1[/* doc */ Doc, Unit]
    ): Unit = js.native
    def traverseDoc(
      doc: Doc,
      onEnter: js.Function1[/* doc */ Doc, Unit | Boolean],
      onExit: js.Function1[/* doc */ Doc, Unit],
      shouldTraverseConditionalGroups: Boolean
    ): Unit = js.native
    def willBreak(doc: Doc): Boolean = js.native
  }
  
}


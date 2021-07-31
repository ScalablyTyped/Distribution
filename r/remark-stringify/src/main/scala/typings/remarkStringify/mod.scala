package typings.remarkStringify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.remarkStringify.remarkStringifyStrings.Asterisk
import typings.remarkStringify.remarkStringifyStrings.Graveaccent
import typings.remarkStringify.remarkStringifyStrings.Plussign
import typings.remarkStringify.remarkStringifyStrings.Tilde
import typings.remarkStringify.remarkStringifyStrings._underscore
import typings.remarkStringify.remarkStringifyStrings.`-_`
import typings.remarkStringify.remarkStringifyStrings.`1`
import typings.remarkStringify.remarkStringifyStrings.escape
import typings.remarkStringify.remarkStringifyStrings.mixed
import typings.remarkStringify.remarkStringifyStrings.numbers
import typings.remarkStringify.remarkStringifyStrings.tab
import typings.unified.mod.Attacher
import typings.unified.mod.Settings
import typings.unist.mod.Node
import typings.unist.mod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-stringify", JSImport.Namespace)
  @js.native
  val ^ : Stringify = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("remark-stringify", "Compiler")
  @js.native
  class CompilerCls () extends StObject
  
  type Compiler = RemarkCompiler
  
  /* Inlined std.Partial<remark-stringify.remark-stringify.RemarkStringifyOptions> */
  trait PartialRemarkStringifyOptions extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var closeAtx: js.UndefOr[Boolean] = js.undefined
    
    var commonmark: js.UndefOr[Boolean] = js.undefined
    
    var emphasis: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var entities: js.UndefOr[Boolean | numbers | escape] = js.undefined
    
    var fence: js.UndefOr[Tilde | Graveaccent] = js.undefined
    
    var fences: js.UndefOr[Boolean] = js.undefined
    
    var gfm: js.UndefOr[Boolean] = js.undefined
    
    var incrementListMarker: js.UndefOr[Boolean] = js.undefined
    
    var listItemIndent: js.UndefOr[tab | `1` | mixed] = js.undefined
    
    var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.undefined
    
    var ruleRepetition: js.UndefOr[Double] = js.undefined
    
    var ruleSpaces: js.UndefOr[Boolean] = js.undefined
    
    var setext: js.UndefOr[Boolean] = js.undefined
    
    var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.undefined
    
    var strong: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var tableCellPadding: js.UndefOr[Boolean] = js.undefined
    
    var tablePipeAlign: js.UndefOr[Boolean] = js.undefined
    
    var tightDefinitions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRemarkStringifyOptions {
    
    @scala.inline
    def apply(): PartialRemarkStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRemarkStringifyOptions]
    }
    
    @scala.inline
    implicit class PartialRemarkStringifyOptionsMutableBuilder[Self <: PartialRemarkStringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      @scala.inline
      def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      @scala.inline
      def setCommonmark(value: Boolean): Self = StObject.set(x, "commonmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonmarkUndefined: Self = StObject.set(x, "commonmark", js.undefined)
      
      @scala.inline
      def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      @scala.inline
      def setEntities(value: Boolean | numbers | escape): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      @scala.inline
      def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      @scala.inline
      def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      @scala.inline
      def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      @scala.inline
      def setListItemIndent(value: tab | `1` | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      @scala.inline
      def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleRepetitionUndefined: Self = StObject.set(x, "ruleRepetition", js.undefined)
      
      @scala.inline
      def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      @scala.inline
      def setStringLength(value: /* s */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
      
      @scala.inline
      def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTableCellPadding(value: Boolean): Self = StObject.set(x, "tableCellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCellPaddingUndefined: Self = StObject.set(x, "tableCellPadding", js.undefined)
      
      @scala.inline
      def setTablePipeAlign(value: Boolean): Self = StObject.set(x, "tablePipeAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePipeAlignUndefined: Self = StObject.set(x, "tablePipeAlign", js.undefined)
      
      @scala.inline
      def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
    }
  }
  
  trait RemarkCompiler extends StObject {
    
    def compile(): String
    
    var visitors: StringDictionary[Visitor]
  }
  object RemarkCompiler {
    
    @scala.inline
    def apply(compile: () => String, visitors: StringDictionary[Visitor]): RemarkCompiler = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), visitors = visitors.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemarkCompiler]
    }
    
    @scala.inline
    implicit class RemarkCompilerMutableBuilder[Self <: RemarkCompiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompile(value: () => String): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisitors(value: StringDictionary[Visitor]): Self = StObject.set(x, "visitors", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemarkStringifyOptions extends StObject {
    
    var bullet: `-_` | Asterisk | Plussign
    
    var closeAtx: Boolean
    
    var commonmark: Boolean
    
    var emphasis: _underscore | Asterisk
    
    var entities: Boolean | numbers | escape
    
    var fence: Tilde | Graveaccent
    
    var fences: Boolean
    
    var gfm: Boolean
    
    var incrementListMarker: Boolean
    
    var listItemIndent: tab | `1` | mixed
    
    var rule: `-_` | _underscore | Asterisk
    
    var ruleRepetition: Double
    
    var ruleSpaces: Boolean
    
    var setext: Boolean
    
    def stringLength(s: String): Double
    
    var strong: _underscore | Asterisk
    
    var tableCellPadding: Boolean
    
    var tablePipeAlign: Boolean
    
    var tightDefinitions: Boolean
  }
  object RemarkStringifyOptions {
    
    @scala.inline
    def apply(
      bullet: `-_` | Asterisk | Plussign,
      closeAtx: Boolean,
      commonmark: Boolean,
      emphasis: _underscore | Asterisk,
      entities: Boolean | numbers | escape,
      fence: Tilde | Graveaccent,
      fences: Boolean,
      gfm: Boolean,
      incrementListMarker: Boolean,
      listItemIndent: tab | `1` | mixed,
      rule: `-_` | _underscore | Asterisk,
      ruleRepetition: Double,
      ruleSpaces: Boolean,
      setext: Boolean,
      stringLength: String => Double,
      strong: _underscore | Asterisk,
      tableCellPadding: Boolean,
      tablePipeAlign: Boolean,
      tightDefinitions: Boolean
    ): RemarkStringifyOptions = {
      val __obj = js.Dynamic.literal(bullet = bullet.asInstanceOf[js.Any], closeAtx = closeAtx.asInstanceOf[js.Any], commonmark = commonmark.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], fences = fences.asInstanceOf[js.Any], gfm = gfm.asInstanceOf[js.Any], incrementListMarker = incrementListMarker.asInstanceOf[js.Any], listItemIndent = listItemIndent.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], ruleRepetition = ruleRepetition.asInstanceOf[js.Any], ruleSpaces = ruleSpaces.asInstanceOf[js.Any], setext = setext.asInstanceOf[js.Any], stringLength = js.Any.fromFunction1(stringLength), strong = strong.asInstanceOf[js.Any], tableCellPadding = tableCellPadding.asInstanceOf[js.Any], tablePipeAlign = tablePipeAlign.asInstanceOf[js.Any], tightDefinitions = tightDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemarkStringifyOptions]
    }
    
    @scala.inline
    implicit class RemarkStringifyOptionsMutableBuilder[Self <: RemarkStringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonmark(value: Boolean): Self = StObject.set(x, "commonmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntities(value: Boolean | numbers | escape): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemIndent(value: tab | `1` | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringLength(value: String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCellPadding(value: Boolean): Self = StObject.set(x, "tableCellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePipeAlign(value: Boolean): Self = StObject.set(x, "tablePipeAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stringify
    extends Attacher[js.Array[js.UndefOr[PartialRemarkStringifyOptions]], Settings] {
    
    def apply(): Unit = js.native
    def apply(options: PartialRemarkStringifyOptions): Unit = js.native
    
    var Compiler: Instantiable0[RemarkCompiler] = js.native
  }
  
  type Visitor = js.Function2[/* node */ Node, /* parent */ js.UndefOr[Parent], String]
  
  type _To = Stringify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Stringify = ^
}

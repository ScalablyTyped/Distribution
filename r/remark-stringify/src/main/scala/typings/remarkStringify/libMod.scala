package typings.remarkStringify

import typings.mdast.mod.Content
import typings.mdast.mod.Root
import typings.mdastUtilToMarkdown.libTypesMod.Handlers
import typings.mdastUtilToMarkdown.libTypesMod.Join
import typings.mdastUtilToMarkdown.libTypesMod.Unsafe
import typings.remarkStringify.remarkStringifyStrings.Asterisk
import typings.remarkStringify.remarkStringifyStrings.Dot
import typings.remarkStringify.remarkStringifyStrings.Graveaccent
import typings.remarkStringify.remarkStringifyStrings.Plussign
import typings.remarkStringify.remarkStringifyStrings.Quotationmark
import typings.remarkStringify.remarkStringifyStrings.Tilde
import typings.remarkStringify.remarkStringifyStrings._underscore
import typings.remarkStringify.remarkStringifyStrings.`-_`
import typings.remarkStringify.remarkStringifyStrings.mixed
import typings.remarkStringify.remarkStringifyStrings.one
import typings.remarkStringify.remarkStringifyStrings.tab
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("remark-stringify/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Node = Root | Content
  
  /* Inlined std.Omit<remark-stringify.remark-stringify/lib.ToMarkdownOptions, 'extensions'> */
  trait Options extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign | Null] = js.undefined
    
    var bulletOrdered: js.UndefOr[Dot | (/* ) */ String) | Null] = js.undefined
    
    var bulletOrderedOther: js.UndefOr[Dot | (/* ) */ String) | Null] = js.undefined
    
    var bulletOther: js.UndefOr[`-_` | Asterisk | Plussign | Null] = js.undefined
    
    var closeAtx: js.UndefOr[Boolean | Null] = js.undefined
    
    var emphasis: js.UndefOr[_underscore | Asterisk | Null] = js.undefined
    
    var fence: js.UndefOr[Tilde | Graveaccent | Null] = js.undefined
    
    var fences: js.UndefOr[Boolean | Null] = js.undefined
    
    var handlers: js.UndefOr[Partial[Handlers] | Null] = js.undefined
    
    var incrementListMarker: js.UndefOr[Boolean | Null] = js.undefined
    
    var join: js.UndefOr[js.Array[Join] | Null] = js.undefined
    
    var listItemIndent: js.UndefOr[tab | one | mixed | Null] = js.undefined
    
    var quote: js.UndefOr[Quotationmark | (/* ' */ String) | Null] = js.undefined
    
    var resourceLink: js.UndefOr[Boolean | Null] = js.undefined
    
    var rule: js.UndefOr[`-_` | _underscore | Asterisk | Null] = js.undefined
    
    var ruleRepetition: js.UndefOr[Double | Null] = js.undefined
    
    var ruleSpaces: js.UndefOr[Boolean | Null] = js.undefined
    
    var setext: js.UndefOr[Boolean | Null] = js.undefined
    
    var strong: js.UndefOr[_underscore | Asterisk | Null] = js.undefined
    
    var tightDefinitions: js.UndefOr[Boolean | Null] = js.undefined
    
    var unsafe: js.UndefOr[js.Array[Unsafe] | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletNull: Self = StObject.set(x, "bullet", null)
      
      inline def setBulletOrdered(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrdered", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedNull: Self = StObject.set(x, "bulletOrdered", null)
      
      inline def setBulletOrderedOther(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrderedOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOtherNull: Self = StObject.set(x, "bulletOrderedOther", null)
      
      inline def setBulletOrderedOtherUndefined: Self = StObject.set(x, "bulletOrderedOther", js.undefined)
      
      inline def setBulletOrderedUndefined: Self = StObject.set(x, "bulletOrdered", js.undefined)
      
      inline def setBulletOther(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bulletOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOtherNull: Self = StObject.set(x, "bulletOther", null)
      
      inline def setBulletOtherUndefined: Self = StObject.set(x, "bulletOther", js.undefined)
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      inline def setCloseAtxNull: Self = StObject.set(x, "closeAtx", null)
      
      inline def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      inline def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisNull: Self = StObject.set(x, "emphasis", null)
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceNull: Self = StObject.set(x, "fence", null)
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      inline def setFencesNull: Self = StObject.set(x, "fences", null)
      
      inline def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      inline def setHandlers(value: Partial[Handlers]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersNull: Self = StObject.set(x, "handlers", null)
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      inline def setIncrementListMarkerNull: Self = StObject.set(x, "incrementListMarker", null)
      
      inline def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinNull: Self = StObject.set(x, "join", null)
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      inline def setListItemIndentNull: Self = StObject.set(x, "listItemIndent", null)
      
      inline def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setResourceLink(value: Boolean): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
      
      inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
      
      inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
      
      inline def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleNull: Self = StObject.set(x, "rule", null)
      
      inline def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetitionNull: Self = StObject.set(x, "ruleRepetition", null)
      
      inline def setRuleRepetitionUndefined: Self = StObject.set(x, "ruleRepetition", js.undefined)
      
      inline def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      inline def setRuleSpacesNull: Self = StObject.set(x, "ruleSpaces", null)
      
      inline def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      inline def setSetextNull: Self = StObject.set(x, "setext", null)
      
      inline def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      inline def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "strong", null)
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      inline def setTightDefinitionsNull: Self = StObject.set(x, "tightDefinitions", null)
      
      inline def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeNull: Self = StObject.set(x, "unsafe", null)
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  type ToMarkdownOptions = typings.mdastUtilToMarkdown.libTypesMod.Options
}

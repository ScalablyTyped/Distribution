package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.anon.Browser
import typings.speechRuleEngine.jsHighlighterColorPickerMod.Color
import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHighlighterHighlighterFactoryMod {
  
  @JSImport("speech-rule-engine/js/highlighter/highlighter_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEvents(node: HTMLElement, events: StringDictionary[EventListener], rendererInfo: Browser): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(node.asInstanceOf[js.Any], events.asInstanceOf[js.Any], rendererInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def highlighter(back: Color, fore: Color, rendererInfo: Browser): Highlighter = (^.asInstanceOf[js.Dynamic].applyDynamic("highlighter")(back.asInstanceOf[js.Any], fore.asInstanceOf[js.Any], rendererInfo.asInstanceOf[js.Any])).asInstanceOf[Highlighter]
  
  inline def update(back: Color, fore: Color, highlighter: Highlighter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(back.asInstanceOf[js.Any], fore.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

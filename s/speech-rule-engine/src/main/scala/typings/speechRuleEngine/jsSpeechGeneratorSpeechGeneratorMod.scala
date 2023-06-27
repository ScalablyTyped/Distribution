package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisMap
import typings.speechRuleEngine.jsWalkerRebuildStreeMod.RebuildStree
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechGeneratorSpeechGeneratorMod {
  
  @js.native
  trait SpeechGenerator extends StObject {
    
    def end(): Unit = js.native
    
    def generateSpeech(node: Node, xml: Element): String = js.native
    
    def getOptions(): AxisMap = js.native
    
    def getRebuilt(): RebuildStree = js.native
    
    def getSpeech(node: Element, xml: Element): String = js.native
    def getSpeech(node: Element, xml: Element, root: Element): String = js.native
    
    var modality: Attribute = js.native
    
    def setOptions(options: AxisMap): Unit = js.native
    
    def setRebuilt(rebuilt: RebuildStree): Unit = js.native
    
    def start(): Unit = js.native
  }
}

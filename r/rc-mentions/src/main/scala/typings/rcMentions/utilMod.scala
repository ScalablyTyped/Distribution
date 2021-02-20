package typings.rcMentions

import org.scalablytyped.runtime.TopLevel
import typings.rcMentions.anon.SelectionLocation
import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.optionMod.OptionProps
import typings.std.Exclude
import typings.std.HTMLTextAreaElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-mentions/es/util", "filterOption")
  @js.native
  def filterOption(input: String, hasValue: OptionProps): Boolean = js.native
  
  @JSImport("rc-mentions/es/util", "getBeforeSelectionText")
  @js.native
  def getBeforeSelectionText(input: HTMLTextAreaElement): String = js.native
  
  @JSImport("rc-mentions/es/util", "getLastMeasureIndex")
  @js.native
  def getLastMeasureIndex(text: String): MeasureIndex = js.native
  @JSImport("rc-mentions/es/util", "getLastMeasureIndex")
  @js.native
  def getLastMeasureIndex(text: String, prefix: String): MeasureIndex = js.native
  @JSImport("rc-mentions/es/util", "getLastMeasureIndex")
  @js.native
  def getLastMeasureIndex(text: String, prefix: js.Array[String]): MeasureIndex = js.native
  
  @JSImport("rc-mentions/es/util", "omit")
  @js.native
  val omit: OmitFunc = js.native
  
  @JSImport("rc-mentions/es/util", "replaceWithMeasure")
  @js.native
  def replaceWithMeasure(text: String, measureConfig: MeasureConfig): SelectionLocation = js.native
  
  @JSImport("rc-mentions/es/util", "setInputSelection")
  @js.native
  def setInputSelection(input: HTMLTextAreaElement, location: Double): Unit = js.native
  
  @JSImport("rc-mentions/es/util", "validateSearch")
  @js.native
  def validateSearch(text: String, props: MentionsProps): Boolean = js.native
  
  @js.native
  trait MeasureConfig extends StObject {
    
    var measureLocation: Double = js.native
    
    var prefix: String = js.native
    
    var selectionStart: Double = js.native
    
    var split: String = js.native
    
    var targetText: String = js.native
  }
  object MeasureConfig {
    
    @scala.inline
    def apply(measureLocation: Double, prefix: String, selectionStart: Double, split: String, targetText: String): MeasureConfig = {
      val __obj = js.Dynamic.literal(measureLocation = measureLocation.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], targetText = targetText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureConfig]
    }
    
    @scala.inline
    implicit class MeasureConfigMutableBuilder[Self <: MeasureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeasureLocation(value: Double): Self = StObject.set(x, "measureLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetText(value: String): Self = StObject.set(x, "targetText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MeasureIndex extends StObject {
    
    var location: Double = js.native
    
    var prefix: String = js.native
  }
  object MeasureIndex {
    
    @scala.inline
    def apply(location: Double, prefix: String): MeasureIndex = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureIndex]
    }
    
    @scala.inline
    implicit class MeasureIndexMutableBuilder[Self <: MeasureIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ Array[/* keyof object */ String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...std.Array<keyof object>][number]> ]: object[K2]}
    */ typings.rcMentions.rcMentionsStrings.OmitFunc with TopLevel[js.Object]
  ]
  
  type Omit_[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}

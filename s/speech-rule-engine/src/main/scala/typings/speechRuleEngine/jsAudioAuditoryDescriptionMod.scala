package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAuditoryDescriptionMod {
  
  @JSImport("speech-rule-engine/js/audio/auditory_description", "AuditoryDescription")
  @js.native
  open class AuditoryDescription protected () extends StObject {
    def this(param0: AudioDescr) = this()
    
    var annotation: String = js.native
    
    var attributes: StringDictionary[String] = js.native
    
    var context: String = js.native
    
    def descriptionSpan(): Span = js.native
    
    def descriptionString(): String = js.native
    
    def equals(that: AuditoryDescription): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    var layout: String = js.native
    
    var personality: StringDictionary[String] = js.native
    
    var text: String = js.native
    
    var userValue: String = js.native
  }
  /* static members */
  object AuditoryDescription {
    
    @JSImport("speech-rule-engine/js/audio/auditory_description", "AuditoryDescription")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(args: AudioDescr): AuditoryDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[AuditoryDescription]
    inline def create(args: AudioDescr, flags: AudioFlags): AuditoryDescription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[AuditoryDescription]
  }
  
  @JSImport("speech-rule-engine/js/audio/auditory_description", "AuditoryItem")
  @js.native
  open class AuditoryItem () extends StObject {
    def this(data: AuditoryDescription) = this()
    
    var data: AuditoryDescription = js.native
    
    var next: AuditoryItem = js.native
    
    var prev: AuditoryItem = js.native
  }
  
  @JSImport("speech-rule-engine/js/audio/auditory_description", "AuditoryList")
  @js.native
  open class AuditoryList protected ()
    extends StObject
       with Set[AuditoryItem] {
    def this(descrs: js.Array[AuditoryDescription]) = this()
    
    /* private */ var anchor: Any = js.native
    
    var annotations: js.Array[AuditoryItem] = js.native
    
    def empty(): Boolean = js.native
    
    def first(): AuditoryItem = js.native
    
    def insertAfter(descr: AuditoryDescription, item: AuditoryItem): Unit = js.native
    
    def insertBefore(descr: AuditoryDescription, item: AuditoryItem): Unit = js.native
    
    def last(): AuditoryItem = js.native
    
    def nextText(item: AuditoryItem): AuditoryItem = js.native
    
    def pop(): AuditoryItem = js.native
    
    def prevText(item: AuditoryItem): AuditoryItem = js.native
    
    def push(item: AuditoryItem): Unit = js.native
    
    def toList(): js.Array[AuditoryDescription] = js.native
  }
  
  trait AudioDescr extends StObject {
    
    var annotation: js.UndefOr[String] = js.undefined
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    var personality: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var text: String
    
    var userValue: js.UndefOr[String] = js.undefined
  }
  object AudioDescr {
    
    inline def apply(text: String): AudioDescr = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioDescr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioDescr] (val x: Self) extends AnyVal {
      
      inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setPersonality(value: StringDictionary[String]): Self = StObject.set(x, "personality", value.asInstanceOf[js.Any])
      
      inline def setPersonalityUndefined: Self = StObject.set(x, "personality", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUserValue(value: String): Self = StObject.set(x, "userValue", value.asInstanceOf[js.Any])
      
      inline def setUserValueUndefined: Self = StObject.set(x, "userValue", js.undefined)
    }
  }
  
  trait AudioFlags extends StObject {
    
    var adjust: js.UndefOr[Boolean] = js.undefined
    
    var correct: js.UndefOr[Boolean] = js.undefined
    
    var preprocess: js.UndefOr[Boolean] = js.undefined
    
    var translate: js.UndefOr[Boolean] = js.undefined
  }
  object AudioFlags {
    
    inline def apply(): AudioFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AudioFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioFlags] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: Boolean): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setCorrect(value: Boolean): Self = StObject.set(x, "correct", value.asInstanceOf[js.Any])
      
      inline def setCorrectUndefined: Self = StObject.set(x, "correct", js.undefined)
      
      inline def setPreprocess(value: Boolean): Self = StObject.set(x, "preprocess", value.asInstanceOf[js.Any])
      
      inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      inline def setTranslate(value: Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
}

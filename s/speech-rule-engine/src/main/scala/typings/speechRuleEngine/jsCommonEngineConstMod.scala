package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonEngineConstMod {
  
  @js.native
  sealed trait Markup extends StObject
  @JSImport("speech-rule-engine/js/common/engine_const", "Markup")
  @js.native
  object Markup extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Markup & String] = js.native
    
    @js.native
    sealed trait ACSS
      extends StObject
         with Markup
    /* "acss" */ val ACSS: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.ACSS & String = js.native
    
    @js.native
    sealed trait COUNTING
      extends StObject
         with Markup
    /* "counting" */ val COUNTING: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.COUNTING & String = js.native
    
    @js.native
    sealed trait LAYOUT
      extends StObject
         with Markup
    /* "layout" */ val LAYOUT: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.LAYOUT & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Markup
    /* "none" */ val NONE: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.NONE & String = js.native
    
    @js.native
    sealed trait PUNCTUATION
      extends StObject
         with Markup
    /* "punctuation" */ val PUNCTUATION: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.PUNCTUATION & String = js.native
    
    @js.native
    sealed trait SABLE
      extends StObject
         with Markup
    /* "sable" */ val SABLE: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.SABLE & String = js.native
    
    @js.native
    sealed trait SSML
      extends StObject
         with Markup
    /* "ssml" */ val SSML: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.SSML & String = js.native
    
    @js.native
    sealed trait VOICEXML
      extends StObject
         with Markup
    /* "voicexml" */ val VOICEXML: typings.speechRuleEngine.jsCommonEngineConstMod.Markup.VOICEXML & String = js.native
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("speech-rule-engine/js/common/engine_const", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode & String] = js.native
    
    @js.native
    sealed trait ASYNC
      extends StObject
         with Mode
    /* "async" */ val ASYNC: typings.speechRuleEngine.jsCommonEngineConstMod.Mode.ASYNC & String = js.native
    
    @js.native
    sealed trait HTTP
      extends StObject
         with Mode
    /* "http" */ val HTTP: typings.speechRuleEngine.jsCommonEngineConstMod.Mode.HTTP & String = js.native
    
    @js.native
    sealed trait SYNC
      extends StObject
         with Mode
    /* "sync" */ val SYNC: typings.speechRuleEngine.jsCommonEngineConstMod.Mode.SYNC & String = js.native
  }
  
  @js.native
  sealed trait Speech extends StObject
  @JSImport("speech-rule-engine/js/common/engine_const", "Speech")
  @js.native
  object Speech extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Speech & String] = js.native
    
    @js.native
    sealed trait DEEP
      extends StObject
         with Speech
    /* "deep" */ val DEEP: typings.speechRuleEngine.jsCommonEngineConstMod.Speech.DEEP & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Speech
    /* "none" */ val NONE: typings.speechRuleEngine.jsCommonEngineConstMod.Speech.NONE & String = js.native
    
    @js.native
    sealed trait SHALLOW
      extends StObject
         with Speech
    /* "shallow" */ val SHALLOW: typings.speechRuleEngine.jsCommonEngineConstMod.Speech.SHALLOW & String = js.native
  }
  
  @JSImport("speech-rule-engine/js/common/engine_const", "personalityPropList")
  @js.native
  val personalityPropList: js.Array[personalityProps] = js.native
  
  @js.native
  sealed trait personalityProps extends StObject
  @JSImport("speech-rule-engine/js/common/engine_const", "personalityProps")
  @js.native
  object personalityProps extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[personalityProps & String] = js.native
    
    @js.native
    sealed trait JOIN
      extends StObject
         with personalityProps
    /* "join" */ val JOIN: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.JOIN & String = js.native
    
    @js.native
    sealed trait LAYOUT
      extends StObject
         with personalityProps
    /* "layout" */ val LAYOUT: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.LAYOUT & String = js.native
    
    @js.native
    sealed trait PAUSE
      extends StObject
         with personalityProps
    /* "pause" */ val PAUSE: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.PAUSE & String = js.native
    
    @js.native
    sealed trait PITCH
      extends StObject
         with personalityProps
    /* "pitch" */ val PITCH: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.PITCH & String = js.native
    
    @js.native
    sealed trait RATE
      extends StObject
         with personalityProps
    /* "rate" */ val RATE: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.RATE & String = js.native
    
    @js.native
    sealed trait VOLUME
      extends StObject
         with personalityProps
    /* "volume" */ val VOLUME: typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps.VOLUME & String = js.native
  }
}

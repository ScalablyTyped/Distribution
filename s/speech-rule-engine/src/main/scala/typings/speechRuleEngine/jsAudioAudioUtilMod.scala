package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAudioUtilMod {
  
  @JSImport("speech-rule-engine/js/audio/audio_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMarkupElement(element: Markup): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkupElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPauseElement(element: Markup): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPauseElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeMarkup(oldPers: Tags, newPers: Tags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMarkup")(oldPers.asInstanceOf[js.Any], newPers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergePause(oldPause: Null, newPause: Pause): Pause = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePause")(oldPause.asInstanceOf[js.Any], newPause.asInstanceOf[js.Any])).asInstanceOf[Pause]
  inline def mergePause(
    oldPause: Null,
    newPause: Pause,
    opt_merge: js.Function2[/* p1 */ PauseValue, /* p2 */ PauseValue, PauseValue]
  ): Pause = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePause")(oldPause.asInstanceOf[js.Any], newPause.asInstanceOf[js.Any], opt_merge.asInstanceOf[js.Any])).asInstanceOf[Pause]
  inline def mergePause(oldPause: Pause, newPause: Pause): Pause = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePause")(oldPause.asInstanceOf[js.Any], newPause.asInstanceOf[js.Any])).asInstanceOf[Pause]
  inline def mergePause(
    oldPause: Pause,
    newPause: Pause,
    opt_merge: js.Function2[/* p1 */ PauseValue, /* p2 */ PauseValue, PauseValue]
  ): Pause = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePause")(oldPause.asInstanceOf[js.Any], newPause.asInstanceOf[js.Any], opt_merge.asInstanceOf[js.Any])).asInstanceOf[Pause]
  
  inline def personalityMarkup(descrs: js.Array[AuditoryDescription]): js.Array[Markup] = ^.asInstanceOf[js.Dynamic].applyDynamic("personalityMarkup")(descrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Markup]]
  
  inline def sortClose(open: js.Array[personalityProps], descrs: js.Array[Tags]): js.Array[personalityProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortClose")(open.asInstanceOf[js.Any], descrs.asInstanceOf[js.Any])).asInstanceOf[js.Array[personalityProps]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.speechRuleEngine.jsAudioAudioUtilMod.Pause
    - typings.speechRuleEngine.jsAudioAudioUtilMod.Tags
  */
  trait Markup extends StObject
  object Markup {
    
    inline def Pause(pause: PauseValue): typings.speechRuleEngine.jsAudioAudioUtilMod.Pause = {
      val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.speechRuleEngine.jsAudioAudioUtilMod.Pause]
    }
    
    inline def Tags(): typings.speechRuleEngine.jsAudioAudioUtilMod.Tags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.speechRuleEngine.jsAudioAudioUtilMod.Tags]
    }
  }
  
  trait Pause
    extends StObject
       with /* personality */ StringDictionary[Any]
       with Markup {
    
    var pause: PauseValue
  }
  object Pause {
    
    inline def apply(pause: PauseValue): Pause = {
      val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pause]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pause] (val x: Self) extends AnyVal {
      
      inline def setPause(value: PauseValue): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    }
  }
  
  type PauseValue = Double | String
  
  trait Tags
    extends StObject
       with /* personality */ StringDictionary[Any]
       with Markup {
    
    var close: js.UndefOr[js.Array[personalityProps]] = js.undefined
    
    var open: js.UndefOr[js.Array[personalityProps]] = js.undefined
  }
  object Tags {
    
    inline def apply(): Tags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
      
      inline def setClose(value: js.Array[personalityProps]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCloseVarargs(value: personalityProps*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setOpen(value: js.Array[personalityProps]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpenVarargs(value: personalityProps*): Self = StObject.set(x, "open", js.Array(value*))
    }
  }
}

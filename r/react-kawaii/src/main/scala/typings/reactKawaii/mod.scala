package typings.reactKawaii

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-kawaii", "Backpack")
  @js.native
  val Backpack: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Browser")
  @js.native
  val Browser: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Cat")
  @js.native
  val Cat: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "CreditCard")
  @js.native
  val CreditCard: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "File")
  @js.native
  val File: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Ghost")
  @js.native
  val Ghost: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "IceCream")
  @js.native
  val IceCream: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Mug")
  @js.native
  val Mug: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Planet")
  @js.native
  val Planet: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "SpeechBubble")
  @js.native
  val SpeechBubble: ComponentType[KawaiiProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactKawaii.reactKawaiiStrings.sad
    - typings.reactKawaii.reactKawaiiStrings.shocked
    - typings.reactKawaii.reactKawaiiStrings.happy
    - typings.reactKawaii.reactKawaiiStrings.blissful
    - typings.reactKawaii.reactKawaiiStrings.lovestruck
    - typings.reactKawaii.reactKawaiiStrings.excited
    - typings.reactKawaii.reactKawaiiStrings.ko
  */
  trait KawaiiMood extends StObject
  object KawaiiMood {
    
    @scala.inline
    def blissful: typings.reactKawaii.reactKawaiiStrings.blissful = "blissful".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.blissful]
    
    @scala.inline
    def excited: typings.reactKawaii.reactKawaiiStrings.excited = "excited".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.excited]
    
    @scala.inline
    def happy: typings.reactKawaii.reactKawaiiStrings.happy = "happy".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.happy]
    
    @scala.inline
    def ko: typings.reactKawaii.reactKawaiiStrings.ko = "ko".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.ko]
    
    @scala.inline
    def lovestruck: typings.reactKawaii.reactKawaiiStrings.lovestruck = "lovestruck".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.lovestruck]
    
    @scala.inline
    def sad: typings.reactKawaii.reactKawaiiStrings.sad = "sad".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.sad]
    
    @scala.inline
    def shocked: typings.reactKawaii.reactKawaiiStrings.shocked = "shocked".asInstanceOf[typings.reactKawaii.reactKawaiiStrings.shocked]
  }
  
  trait KawaiiProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var mood: js.UndefOr[KawaiiMood] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object KawaiiProps {
    
    @scala.inline
    def apply(): KawaiiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KawaiiProps]
    }
    
    @scala.inline
    implicit class KawaiiPropsMutableBuilder[Self <: KawaiiProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMood(value: KawaiiMood): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoodUndefined: Self = StObject.set(x, "mood", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

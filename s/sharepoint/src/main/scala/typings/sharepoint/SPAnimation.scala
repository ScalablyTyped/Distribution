package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPAnimation {
  
  @js.native
  sealed trait Attribute extends StObject
  @JSGlobal("SPAnimation.Attribute")
  @js.native
  object Attribute extends StObject {
    
    @js.native
    sealed trait Height extends Attribute
    
    @js.native
    sealed trait Opacity extends Attribute
    
    @js.native
    sealed trait PositionX extends Attribute
    
    @js.native
    sealed trait PositionY extends Attribute
    
    @js.native
    sealed trait Width extends Attribute
  }
  
  @js.native
  sealed trait ID extends StObject
  @JSGlobal("SPAnimation.ID")
  @js.native
  object ID extends StObject {
    
    @js.native
    sealed trait Basic_Fade extends ID
    
    @js.native
    sealed trait Basic_Move extends ID
    
    @js.native
    sealed trait Basic_Opacity extends ID
    
    @js.native
    sealed trait Basic_QuickFade extends ID
    
    @js.native
    sealed trait Basic_QuickShow extends ID
    
    @js.native
    sealed trait Basic_QuickSize extends ID
    
    @js.native
    sealed trait Basic_Show extends ID
    
    @js.native
    sealed trait Basic_Size extends ID
    
    @js.native
    sealed trait Basic_SlowShow extends ID
    
    @js.native
    sealed trait Basic_StrikeThrough extends ID
    
    @js.native
    sealed trait Content_SlideInFadeInGeneric extends ID
    
    @js.native
    sealed trait Content_SlideInFadeInLeft extends ID
    
    @js.native
    sealed trait Content_SlideInFadeInLeftInc extends ID
    
    @js.native
    sealed trait Content_SlideInFadeInRight extends ID
    
    @js.native
    sealed trait Content_SlideInFadeInRightInc extends ID
    
    @js.native
    sealed trait Content_SlideOutFadeOutRight extends ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInBottom extends ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInLeft extends ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInTop extends ID
    
    @js.native
    sealed trait SmallObject_SlideOutFadeOutBottom extends ID
    
    @js.native
    sealed trait Test_Hold extends ID
    
    @js.native
    sealed trait Test_Instant extends ID
  }
  
  @js.native
  trait Object extends StObject {
    
    def RunAnimation(): Unit = js.native
  }
  object Object {
    
    @scala.inline
    def apply(RunAnimation: () => Unit): Object = {
      val __obj = js.Dynamic.literal(RunAnimation = js.Any.fromFunction0(RunAnimation))
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRunAnimation(value: () => Unit): Self = StObject.set(x, "RunAnimation", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Settings extends StObject
  
  @js.native
  trait State extends StObject {
    
    def GetAttribute(attributeId: Attribute): Double = js.native
    
    def GetDataIndex(attributeId: Attribute): Double = js.native
    
    def SetAttribute(attributeId: Attribute, value: Double): Unit = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      GetAttribute: Attribute => Double,
      GetDataIndex: Attribute => Double,
      SetAttribute: (Attribute, Double) => Unit
    ): State = {
      val __obj = js.Dynamic.literal(GetAttribute = js.Any.fromFunction1(GetAttribute), GetDataIndex = js.Any.fromFunction1(GetDataIndex), SetAttribute = js.Any.fromFunction2(SetAttribute))
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAttribute(value: Attribute => Double): Self = StObject.set(x, "GetAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataIndex(value: Attribute => Double): Self = StObject.set(x, "GetDataIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttribute(value: (Attribute, Double) => Unit): Self = StObject.set(x, "SetAttribute", js.Any.fromFunction2(value))
    }
  }
}

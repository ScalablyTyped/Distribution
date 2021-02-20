package typings.reactCountup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait PauseResume extends StObject {
    
    def pauseResume(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object PauseResume {
    
    @scala.inline
    def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit, update: () => Unit): PauseResume = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PauseResume]
    }
    
    @scala.inline
    implicit class PauseResumeMutableBuilder[Self <: PauseResume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PauseResumeReset extends StObject {
    
    def pauseResume(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(): Unit = js.native
  }
  object PauseResumeReset {
    
    @scala.inline
    def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): PauseResumeReset = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[PauseResumeReset]
    }
    
    @scala.inline
    implicit class PauseResumeResetMutableBuilder[Self <: PauseResumeReset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Reset extends StObject {
    
    def pauseResume(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object Reset {
    
    @scala.inline
    def apply(pauseResume: () => Unit, reset: () => Unit, update: () => Unit): Reset = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Start extends StObject {
    
    def reset(): Unit = js.native
    
    def start(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object Start {
    
    @scala.inline
    def apply(reset: () => Unit, start: () => Unit, update: () => Unit): Start = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Update extends StObject {
    
    def pauseResume(): Unit = js.native
    
    def start(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object Update {
    
    @scala.inline
    def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): Update = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Update]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}

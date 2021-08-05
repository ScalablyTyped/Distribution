package typings.reactCountup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PauseResume extends StObject {
    
    def pauseResume(): Unit
    
    def reset(): Unit
    
    def start(): Unit
    
    def update(): Unit
  }
  object PauseResume {
    
    inline def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit, update: () => Unit): PauseResume = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PauseResume]
    }
    
    extension [Self <: PauseResume](x: Self) {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait PauseResumeReset extends StObject {
    
    def pauseResume(): Unit
    
    def reset(): Unit
    
    def start(): Unit
  }
  object PauseResumeReset {
    
    inline def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): PauseResumeReset = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[PauseResumeReset]
    }
    
    extension [Self <: PauseResumeReset](x: Self) {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait Reset extends StObject {
    
    def pauseResume(): Unit
    
    def reset(): Unit
    
    def update(): Unit
  }
  object Reset {
    
    inline def apply(pauseResume: () => Unit, reset: () => Unit, update: () => Unit): Reset = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Start extends StObject {
    
    def reset(): Unit
    
    def start(): Unit
    
    def update(): Unit
  }
  object Start {
    
    inline def apply(reset: () => Unit, start: () => Unit, update: () => Unit): Start = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Update extends StObject {
    
    def pauseResume(): Unit
    
    def start(): Unit
    
    def update(): Unit
  }
  object Update {
    
    inline def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): Update = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}

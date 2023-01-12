package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncProps
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationResolver
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pause[T /* <: AnimationTarget[Any] */] extends StObject {
  
  def pause(): Unit
  
  def resume(): Unit
  
  def start(props: RunAsyncProps[T], resolve: AnimationResolver[T]): Unit
}
object Pause {
  
  inline def apply[T /* <: AnimationTarget[Any] */](pause: () => Unit, resume: () => Unit, start: (RunAsyncProps[T], AnimationResolver[T]) => Unit): Pause[T] = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[Pause[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pause[?], T /* <: AnimationTarget[Any] */] (val x: Self & Pause[T]) extends AnyVal {
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setStart(value: (RunAsyncProps[T], AnimationResolver[T]) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
  }
}

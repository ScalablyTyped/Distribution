package typings.reactMdUtils

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseDropzoneMod {
  
  @JSImport("@react-md/utils/types/useDropzone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDropzone[E /* <: HTMLElement */](options: DropzoneHandlers[E]): DropzoneHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")(options.asInstanceOf[js.Any]).asInstanceOf[DropzoneHookReturnValue[E]]
  
  /* Inlined @react-md/utils.@react-md/utils/types/useDropzone.DropzoneHandlers<E> */
  trait DropzoneHanders[E /* <: HTMLElement */] extends StObject {
    
    var onDragEnter: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[E]] = js.undefined
  }
  object DropzoneHanders {
    
    inline def apply[E /* <: HTMLElement */](): DropzoneHanders[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneHanders[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneHanders[?], E /* <: HTMLElement */] (val x: Self & DropzoneHanders[E]) extends AnyVal {
      
      inline def setOnDragEnter(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDrop(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<E>, 'onDragEnter' | 'onDragOver' | 'onDrop' | 'onDragLeave'> */
  trait DropzoneHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onDragEnter: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[E]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[E]] = js.undefined
  }
  object DropzoneHandlers {
    
    inline def apply[E /* <: HTMLElement */](): DropzoneHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneHandlers[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropzoneHandlers[?], E /* <: HTMLElement */] (val x: Self & DropzoneHandlers[E]) extends AnyVal {
      
      inline def setOnDragEnter(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDrop(value: DragEvent[E] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    }
  }
  
  type DropzoneHookReturnValue[E /* <: HTMLElement */] = js.Tuple2[Boolean, DropzoneHandlers[E]]
}

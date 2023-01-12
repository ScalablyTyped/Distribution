package typings.reactMdUtils

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirMod {
  
  @JSImport("@react-md/utils/types/Dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_DIR(): WritingDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_DIR")().asInstanceOf[WritingDirection]
  
  inline def Dir(param0: DirProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Dir")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useDir(): WritingDirectionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useDir")().asInstanceOf[WritingDirectionContext]
  
  trait DirProps extends StObject {
    
    /**
      * A single ReactElement child. If the `Dir` has a parent `Dir`, the child
      * will have the `dir` prop cloned into this element.
      */
    var children: ReactElement
    
    /**
      * The default writing direction for your app or a subtree. To change the
      * current writing direction, use the `useDir` hook to get access to the
      * current `dir` and the `toggleDir` function.
      */
    var defaultDir: js.UndefOr[WritingDirection | js.Function0[WritingDirection]] = js.undefined
  }
  object DirProps {
    
    inline def apply(children: ReactElement): DirProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDefaultDir(value: WritingDirection | js.Function0[WritingDirection]): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirFunction0(value: () => WritingDirection): Self = StObject.set(x, "defaultDir", js.Any.fromFunction0(value))
      
      inline def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.ltr
    - typings.reactMdUtils.reactMdUtilsStrings.rtl
  */
  trait WritingDirection extends StObject
  object WritingDirection {
    
    inline def ltr: typings.reactMdUtils.reactMdUtilsStrings.ltr = "ltr".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.ltr]
    
    inline def rtl: typings.reactMdUtils.reactMdUtilsStrings.rtl = "rtl".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.rtl]
  }
  
  trait WritingDirectionContext extends StObject {
    
    /**
      * The current writing direction that is being inherited.
      */
    var dir: WritingDirection
    
    /**
      * Toggles the current writing direction for the first parent `Dir` component.
      */
    def toggleDir(): Unit
  }
  object WritingDirectionContext {
    
    inline def apply(dir: WritingDirection, toggleDir: () => Unit): WritingDirectionContext = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], toggleDir = js.Any.fromFunction0(toggleDir))
      __obj.asInstanceOf[WritingDirectionContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritingDirectionContext] (val x: Self) extends AnyVal {
      
      inline def setDir(value: WritingDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setToggleDir(value: () => Unit): Self = StObject.set(x, "toggleDir", js.Any.fromFunction0(value))
    }
  }
}

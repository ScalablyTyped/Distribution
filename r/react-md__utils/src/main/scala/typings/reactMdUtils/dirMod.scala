package typings.reactMdUtils

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirMod {
  
  @JSImport("@react-md/utils/types/Dir", "DEFAULT_DIR")
  @js.native
  def DEFAULT_DIR(): WritingDirection = js.native
  
  object Dir {
    
    @JSImport("@react-md/utils/types/Dir", "Dir")
    @js.native
    def apply(hasChildrenDefaultDir: DirProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/Dir", "Dir.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/Dir", "Dir.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/Dir", "Dir.propTypes.defaultDir")
      @js.native
      def defaultDir: js.Any = js.native
      @scala.inline
      def defaultDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDir")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/Dir", "useDir")
  @js.native
  def useDir(): WritingDirectionContext = js.native
  
  @js.native
  trait DirProps extends StObject {
    
    /**
      * A single ReactElement child. If the `Dir` has a parent `Dir`, the child
      * will have the `dir` prop cloned into this element.
      */
    var children: ReactElement = js.native
    
    /**
      * The default writing direction for your app or a subtree. To change the
      * current writing direction, use the `useDir` hook to get access to the
      * current `dir` and the `toggleDir` function.
      */
    var defaultDir: js.UndefOr[WritingDirection | js.Function0[WritingDirection]] = js.native
  }
  object DirProps {
    
    @scala.inline
    def apply(children: ReactElement): DirProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirProps]
    }
    
    @scala.inline
    implicit class DirPropsMutableBuilder[Self <: DirProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDir(value: WritingDirection | js.Function0[WritingDirection]): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDirFunction0(value: () => WritingDirection): Self = StObject.set(x, "defaultDir", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.ltr
    - typings.reactMdUtils.reactMdUtilsStrings.rtl
  */
  trait WritingDirection extends StObject
  object WritingDirection {
    
    @scala.inline
    def ltr: typings.reactMdUtils.reactMdUtilsStrings.ltr = "ltr".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.ltr]
    
    @scala.inline
    def rtl: typings.reactMdUtils.reactMdUtilsStrings.rtl = "rtl".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.rtl]
  }
  
  @js.native
  trait WritingDirectionContext extends StObject {
    
    /**
      * The current writing direction that is being inherited.
      */
    var dir: WritingDirection = js.native
    
    /**
      * Toggles the current writing direction for the first parent `Dir` component.
      */
    def toggleDir(): Unit = js.native
  }
  object WritingDirectionContext {
    
    @scala.inline
    def apply(dir: WritingDirection, toggleDir: () => Unit): WritingDirectionContext = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], toggleDir = js.Any.fromFunction0(toggleDir))
      __obj.asInstanceOf[WritingDirectionContext]
    }
    
    @scala.inline
    implicit class WritingDirectionContextMutableBuilder[Self <: WritingDirectionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: WritingDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleDir(value: () => Unit): Self = StObject.set(x, "toggleDir", js.Any.fromFunction0(value))
    }
  }
}

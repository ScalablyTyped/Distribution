package typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentMemoChildrenMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content/MemoChildren", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, ReactElement]] = js.native
  
  trait MemoChildrenProps extends StObject {
    
    var children: ReactNode
    
    var shouldUpdate: Boolean
  }
  object MemoChildrenProps {
    
    inline def apply(shouldUpdate: Boolean): MemoChildrenProps = {
      val __obj = js.Dynamic.literal(shouldUpdate = shouldUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoChildrenProps]
    }
    
    extension [Self <: MemoChildrenProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentMemoChildrenMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, ReactElement]] = default
}

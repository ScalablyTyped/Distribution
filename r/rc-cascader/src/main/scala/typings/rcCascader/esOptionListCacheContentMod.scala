package typings.rcCascader

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListCacheContentMod extends Shortcut {
  
  @JSImport("rc-cascader/es/OptionList/CacheContent", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* param0 */ CacheContentProps, ReactElement]] = js.native
  
  trait CacheContentProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object CacheContentProps {
    
    inline def apply(): CacheContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheContentProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* param0 */ CacheContentProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListCacheContentMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* param0 */ CacheContentProps, ReactElement]] = default
}

package typings.rcOverflow

import org.scalablytyped.runtime.Shortcut
import typings.rcOverflow.esOverflowMod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esItemMod extends Shortcut {
  
  @JSImport("rc-overflow/es/Item", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ItemProps[Any] & RefAttributes[Any]] = js.native
  
  @js.native
  trait ItemProps[ItemType]
    extends StObject
       with HTMLAttributes[Any] {
    
    var component: js.UndefOr[ComponentType] = js.native
    
    var display: Boolean = js.native
    
    var invalidate: js.UndefOr[Boolean] = js.native
    
    var item: js.UndefOr[ItemType] = js.native
    
    var itemKey: js.UndefOr[Key] = js.native
    
    var order: Double = js.native
    
    var prefixCls: String = js.native
    
    def registerSize(key: Key): Unit = js.native
    def registerSize(key: Key, width: Double): Unit = js.native
    
    var renderItem: js.UndefOr[js.Function1[/* item */ ItemType, ReactNode]] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    /**
      * @private To make node structure stable. We need keep wrap with ResizeObserver.
      * But disable it when it's no need to real measure.
      */
    var responsiveDisabled: js.UndefOr[Boolean] = js.native
  }
  
  type _To = ForwardRefExoticComponent[ItemProps[Any] & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esItemMod.foo` */
  override def _to: ForwardRefExoticComponent[ItemProps[Any] & RefAttributes[Any]] = default
}

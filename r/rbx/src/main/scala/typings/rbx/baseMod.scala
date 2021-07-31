package typings.rbx

import typings.rbx.anon.AsReactType
import typings.rbx.anon.PreferHelpersPropsOverrid
import typings.rbx.anon.`0`
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.typesMod.Prefer
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactType
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("rbx/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rbx/base", "Generic")
  @js.native
  val Generic: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  
  @scala.inline
  def forwardRefAs[TOwnProps, TDefaultComponent /* <: ReactType[js.Any] */](
    factory: RefForwardingComponent[HTMLElement | SVGElement | ComponentType[js.Object], TOwnProps & AsReactType],
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps & `0`[TDefaultComponent]]) & RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardRefAs")(factory.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent]]
}

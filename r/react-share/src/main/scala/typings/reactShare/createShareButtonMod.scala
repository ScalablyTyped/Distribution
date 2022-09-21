package typings.reactShare

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactShare.shareButtonMod.Props
import typings.std.HTMLButtonElement
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createShareButtonMod {
  
  @JSImport("react-share/lib/hocs/createShareButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionProps /* <: Record[String, Any] */, LinkOptions](
    networkName: String,
    link: js.Function2[/* url */ String, /* options */ LinkOptions, String],
    optsMap: js.Function1[/* props */ OptionProps, LinkOptions],
    defaultProps: Partial[Props[LinkOptions] & OptionProps]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Pick[
        Props[LinkOptions], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 274 */ Any
      ]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(networkName.asInstanceOf[js.Any], link.asInstanceOf[js.Any], optsMap.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Pick[
        Props[LinkOptions], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 274 */ Any
      ]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ]]
}

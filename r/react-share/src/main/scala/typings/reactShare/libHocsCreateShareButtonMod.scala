package typings.reactShare

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactShare.libShareButtonMod.Props
import typings.reactShare.reactShareStrings.forwardedRef
import typings.reactShare.reactShareStrings.networkLink
import typings.reactShare.reactShareStrings.networkName
import typings.reactShare.reactShareStrings.opts
import typings.std.HTMLButtonElement
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHocsCreateShareButtonMod {
  
  @JSImport("react-share/lib/hocs/createShareButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionProps /* <: Record[String, Any] */, LinkOptions /* <: Record[String, Any] */](
    networkName: String,
    link: js.Function2[/* url */ String, /* options */ LinkOptions, String],
    optsMap: js.Function1[/* props */ OptionProps, LinkOptions],
    defaultProps: Partial[Props[LinkOptions] & OptionProps]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Omit[Props[LinkOptions], forwardedRef | networkName | networkLink | opts]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(networkName.asInstanceOf[js.Any], link.asInstanceOf[js.Any], optsMap.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Omit[Props[LinkOptions], forwardedRef | networkName | networkLink | opts]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ]]
}

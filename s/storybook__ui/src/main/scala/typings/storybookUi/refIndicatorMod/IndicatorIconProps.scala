package typings.storybookUi.refIndicatorMod

import typings.std.ReturnType
import typings.storybookUi.storybookUiStrings.auth
import typings.storybookUi.storybookUiStrings.empty
import typings.storybookUi.storybookUiStrings.error
import typings.storybookUi.storybookUiStrings.loading
import typings.storybookUi.storybookUiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicatorIconProps extends js.Object {
  
  var `type`: ReturnType[
    js.Function4[
      /* isLoading */ Boolean, 
      /* isAuthRequired */ Boolean, 
      /* isError */ Boolean, 
      /* isEmpty */ Boolean, 
      auth | error | loading | empty | ready
    ]
  ] = js.native
}
object IndicatorIconProps {
  
  @scala.inline
  def apply(
    `type`: ReturnType[
      js.Function4[
        /* isLoading */ Boolean, 
        /* isAuthRequired */ Boolean, 
        /* isError */ Boolean, 
        /* isEmpty */ Boolean, 
        auth | error | loading | empty | ready
      ]
    ]
  ): IndicatorIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorIconProps]
  }
  
  @scala.inline
  implicit class IndicatorIconPropsOps[Self <: IndicatorIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(
      value: ReturnType[
          js.Function4[
            /* isLoading */ Boolean, 
            /* isAuthRequired */ Boolean, 
            /* isError */ Boolean, 
            /* isEmpty */ Boolean, 
            auth | error | loading | empty | ready
          ]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

package typings.storybookUi.containerMod

import typings.storybookUi.anon.BasePanelRenderPropsalign
import typings.storybookUi.anon.BasePanelRenderPropsdocsO
import typings.storybookUi.anon.BasePanelRenderPropshidde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutRenderProps extends js.Object {
  
  var mainProps: BasePanelRenderProps = js.native
  
  var navProps: BasePanelRenderPropshidde = js.native
  
  var panelProps: BasePanelRenderPropsalign = js.native
  
  var previewProps: BasePanelRenderPropsdocsO = js.native
}
object LayoutRenderProps {
  
  @scala.inline
  def apply(
    mainProps: BasePanelRenderProps,
    navProps: BasePanelRenderPropshidde,
    panelProps: BasePanelRenderPropsalign,
    previewProps: BasePanelRenderPropsdocsO
  ): LayoutRenderProps = {
    val __obj = js.Dynamic.literal(mainProps = mainProps.asInstanceOf[js.Any], navProps = navProps.asInstanceOf[js.Any], panelProps = panelProps.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutRenderProps]
  }
  
  @scala.inline
  implicit class LayoutRenderPropsOps[Self <: LayoutRenderProps] (val x: Self) extends AnyVal {
    
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
    def setMainProps(value: BasePanelRenderProps): Self = this.set("mainProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavProps(value: BasePanelRenderPropshidde): Self = this.set("navProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelProps(value: BasePanelRenderPropsalign): Self = this.set("panelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewProps(value: BasePanelRenderPropsdocsO): Self = this.set("previewProps", value.asInstanceOf[js.Any])
  }
}

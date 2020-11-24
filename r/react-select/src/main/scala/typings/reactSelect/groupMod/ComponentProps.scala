package typings.reactSelect.groupMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProps extends js.Object {
  
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ComponentType[_] = js.native
  
  /** The children to be rendered. */
  var children: ReactNode = js.native
  
  /** Props to pass to Heading. */
  var headingProps: js.Any = js.native
  
  /** Label to be displayed in the heading component. */
  var label: ReactNode = js.native
}
object ComponentProps {
  
  @scala.inline
  def apply(Heading: ComponentType[_], headingProps: js.Any): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  @scala.inline
  implicit class ComponentPropsOps[Self <: ComponentProps] (val x: Self) extends AnyVal {
    
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
    def setHeading(value: ComponentType[_]): Self = this.set("Heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingProps(value: js.Any): Self = this.set("headingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
